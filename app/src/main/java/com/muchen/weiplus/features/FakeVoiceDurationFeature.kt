package com.muchen.weiplus.features

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.github.libxposed.api.XposedModule

class FakeVoiceDurationFeature : BaseFeature() {

    companion object {
        private const val TAG = "FakeVoiceDur"
    }

    override val key = "fake_voice_duration"
    override val name = "Fake Voice Duration"

    private lateinit var module: XposedModule
    private val mainHandler = Handler(Looper.getMainLooper())

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m

        try {
            val yaClass = cl.loadClass("com.tencent.mm.ui.chatting.viewitems.ya")
            for (method in yaClass.declaredMethods) {
                if (method.name == "b" && method.parameterTypes.size == 4) {
                    module.hook(method).intercept { chain ->
                        chain.proceed()
                        if (!FeatureConfig.fakeVoiceDuration) return@intercept null
                        val tag = chain.thisObject
                        mainHandler.postDelayed({
                            try {
                                val view = tag.javaClass.getMethod("getMainContainerView").invoke(tag) as? ViewGroup
                                if (view != null) modifyDuration(view)
                            } catch (e: Throwable) {
                                module.log(Log.ERROR, TAG, "err: ${e.message}")
                            }
                        }, 300)
                        null
                    }
                    module.log(Log.INFO, TAG, "ya.b Hook OK")
                    return
                }
            }
            module.log(Log.WARN, TAG, "ya.b not found")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }

    private fun modifyDuration(root: ViewGroup) {
        val durViews = mutableListOf<TextView>()
        findDurationViews(root, durViews)
        for (tv in durViews) {
            val text = tv.text?.toString() ?: ""
            val num = text.replace(Regex("[^0-9]"), "").toIntOrNull()
            if (num != null && num > 0) {
                val fake = (num * 2.5).toInt().coerceAtLeast(1)
                tv.text = "${fake}″"
                module.log(Log.INFO, TAG, "Voice dur: $text -> ${fake}″")
            }
        }
    }

    private fun findDurationViews(view: View, result: MutableList<TextView>) {
        if (view is TextView) {
            val text = view.text?.toString() ?: ""
            // Voice duration text: short, contains digits + maybe quote symbol
            if (text.isNotEmpty() && text.length <= 6 && text.any { it.isDigit() }) {
                result.add(view)
            }
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                findDurationViews(view.getChildAt(i), result)
            }
        }
    }
}