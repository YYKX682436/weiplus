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
    private var logCount = 0

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m

        try {
            val viewClass = View::class.java
            val setTagMethod = viewClass.getDeclaredMethod("setTag", Any::class.java)
            module.hook(setTagMethod).intercept { chain ->
                chain.proceed()
                if (!FeatureConfig.fakeVoiceDuration) return@intercept null
                val tag = chain.args[0] ?: return@intercept null
                val tagClassName = tag.javaClass.name

                if (tagClassName.contains("viewitems.") && logCount < 30) {
                    logCount++
                    module.log(Log.INFO, TAG, "Tag class: " + tagClassName)
                }

                if (tagClassName == "com.tencent.mm.ui.chatting.viewitems.ya") {
                    processVoiceTag(tag, chain.thisObject as? View ?: return@intercept null)
                }
                null
            }
            module.log(Log.INFO, TAG, "setTag(all) Hook OK, multiplier=" + FeatureConfig.voiceDurationMultiplier)
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: " + (e.message ?: "unknown"))
        }
    }

    private fun processVoiceTag(tag: Any, view: View) {
        val now = System.currentTimeMillis()
        val last = processedViews[view] ?: 0L
        if (now - last < 1000) {
            module.log(Log.DEBUG, TAG, "skip: too soon")
            return
        }
        processedViews[view] = now
        module.log(Log.INFO, TAG, "processVoiceTag: view=" + view.javaClass.name)
        mainHandler.postDelayed({
            try {
                var root: ViewGroup? = null
                try {
                    val m = tag.javaClass.getMethod("getMainContainerView")
                    val mcv = m.invoke(tag)
                    module.log(Log.INFO, TAG, "getMainContainerView=" + (mcv?.javaClass?.name ?: "null"))
                    root = mcv as? ViewGroup
                } catch (e: Throwable) {
                    module.log(Log.ERROR, TAG, "getMCV fail: " + (e.message ?: ""))
                }
                if (root == null) {
                    root = view as? ViewGroup
                    module.log(Log.INFO, TAG, "fallback: view as ViewGroup, childCount=" + (root?.childCount ?: -1))
                }
                if (root != null) {
                    modifyDuration(root)
                } else {
                    module.log(Log.WARN, TAG, "root is null")
                }
            } catch (e: Throwable) {
                module.log(Log.ERROR, TAG, "err: " + (e.message ?: ""))
            }
        }, 150)
    }

    private fun modifyDuration(root: ViewGroup) {
        val durViews = mutableListOf<TextView>()
        findDurationViews(root, durViews)
        val multiplier = FeatureConfig.voiceDurationMultiplier
        module.log(Log.INFO, TAG, "modifyDuration: found " + durViews.size + " candidates, x" + multiplier)
        for (tv in durViews) {
            val text = tv.text?.toString() ?: ""
            module.log(Log.INFO, TAG, "  candidate: [" + text + "]")
            var totalSecs: Int? = null
            var wasMMSS = false
            if (text.contains(":")) {
                val parts = text.split(":")
                if (parts.size == 2) {
                    val min = parts[0].toIntOrNull()
                    val sec = parts[1].toIntOrNull()
                    if (min != null && sec != null) {
                        totalSecs = min * 60 + sec
                        wasMMSS = true
                    }
                }
            } else {
                totalSecs = text.replace(Regex("[^0-9]"), "").toIntOrNull()
            }
            if (totalSecs != null && totalSecs > 0) {
                val fake = (totalSecs * multiplier).toInt().coerceAtLeast(1)
                if (wasMMSS) {
                    val fm = fake / 60
                    val fs = fake % 60
                    tv.text = String.format("%02d:%02d", fm, fs)
                } else {
                    tv.text = fake.toString() + "\x27\x27"
                }
                module.log(Log.INFO, TAG, "Voice dur: " + text + " -> " + tv.text + " (x" + multiplier + ")")
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
