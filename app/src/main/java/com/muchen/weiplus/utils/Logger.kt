package com.muchen.weiplus.utils

import android.util.Log

/**
 * 模块日志工具
 */
object Logger {
    private const val TAG = "WeiPlus"

    fun i(msg: String) = Log.i(TAG, msg)
    fun d(msg: String) = Log.d(TAG, msg)
    fun w(msg: String) = Log.w(TAG, msg)
    fun e(msg: String, tr: Throwable? = null) = Log.e(TAG, msg, tr)
}
