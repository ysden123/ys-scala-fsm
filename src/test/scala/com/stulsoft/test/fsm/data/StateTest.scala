/**
 * Copyright (c) 2016, Yuriy Stul. All rights reserved
 */
 
package com.stulsoft.test.fsm.data

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import com.stulsoft.fsm.data.State

/**
 * Unit tests for State class
 * 
 * @author Yuriy Stul
 *
 */
class StateTest extends FlatSpec with Matchers {
  "A State" should "support equals" in {
  	val s1 = new State("s1")
		val s2 = new State("s1")
  	s1 should equal(s2)

  	val s3 = new State("s3")
  	s1 should not equal(s3)
  }
  it should "support hashCode" in {
  	val s1 = new State("s1")
		val s2 = new State("s1")
  	s1.hashCode should equal(s2.hashCode)

  	val s3 = new State("s3")
  	s1.hashCode should not equal(s3.hashCode)
  }
}