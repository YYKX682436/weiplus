package com.muchen.weiplus.features

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.github.libxposed.api.XposedModule
import java.util.WeakHashMap

class FakeVoiceDurationFeature : BaseFeature() {

    companion object {
        private const val TAG = "FakeVoiceDur"
    }

    override val key = "fake_voice_duration"
    override val name = "Fake Voice Duration"

    private lateinit var module: XposedModule
    private val mainHandler = Handler(Looper.getMainLooper())
    private val processedViews = WeakHashMap<View, Long>()

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m

        try {
            val viewClass = View::class.java
            val setTagMethod = viewClass.getDeclaredMethod("setTag", Any::class.java)
            module.hook(setTagMethod).intercept { chain ->
                chain.proceed()
                if (!FeatureConfig.fakeVoiceDuration) return@intercept null
                val view = chain.thisObject as? View ?: return@intercept null
                val tag = chain.args[0]
                if (tag != null && tag.javaClass.name == "com.tencent.mm.ui.chatting.viewitems.ya") {
                    val now = System.currentTimeMillis()
                    val last = processedViews[view] ?: 0L
                    if (now - last < 1000) return@intercept null
                    processedViews[view] = now
                    mainHandler.postDelayed({
                        try {
                            val root = view.getMainContainerView() as? ViewGroup ?: view as? ViewGroup
                            if (root != null) modifyDuration(root)
                        } catch (e: Throwable) {
                            module.log(Log.ERROR, TAG, "err: ${e.message}")
                        }
                    }, 150)
                }
                null
            }
            module.log(Log.INFO, TAG, "setTag(ya) Hook OK, multiplier=${FeatureConfig.voiceDurationMultiplier}")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }

    private fun View.getMainContainerView(): View? {
        return try {
            javaClass.getMethod("getMainContainerView").invoke(this) as? View
        } catch (_: Throwable) { null }
    }

    private fun modifyDuration(root: ViewGroup) {
        val durViews = mutableListOf<TextView>()
        findDurationViews(root, durViews)
        val multiplier = FeatureConfig.voiceDurationMultiplier
        for (tv in durViews) {
            val text = tv.text?.toString() ?: ""
            val num = text.replace(Regex("[^0-9]"), "").toIntOrNull()
            if (num != null && num > 0 && num <= 120) {
                val fake = (num * multiplier).toInt().coerceAtLeast(1)
                tv.text = "${fake}''"
                module.log(Log.INFO, TAG, "Voice dur: $text -> ${fake}'' (x$multiplier)")
            }
        }
    }

    private fun findDurationViews(view: View, result: MutableList<TextView>) {
        if (view is TextView) {
            val text = view.text?.toString() ?: ""
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
