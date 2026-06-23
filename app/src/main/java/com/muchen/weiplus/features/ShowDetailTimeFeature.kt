package com.muchen.weiplus.features

import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import io.github.libxposed.api.XposedModule
import java.text.SimpleDateFormat
import java.util.*
import java.util.WeakHashMap

class ShowDetailTimeFeature : BaseFeature() {

    companion object {
        private const val TAG = "DetailTime"
    }

    override val key = "show_detail_time"
    override val name = "Show Detail Time"

    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private val timeViewMap = WeakHashMap<View, TextView>()
    private val lastF9Map = WeakHashMap<View, Any>()
    private val pendingRunnables = WeakHashMap<View, Runnable>()

    override fun onEnable(m: XposedModule, cl: ClassLoader) {
        module = m
        classLoader = cl

        try {
            val viewClass = View::class.java
            val setTagMethod = viewClass.getDeclaredMethod("setTag", Any::class.java)
            module.hook(setTagMethod).intercept { chain ->
                chain.proceed()
                if (!FeatureConfig.showDetailTime) return@intercept null
                val view = chain.thisObject as? View ?: return@intercept null
                val tag = chain.args[0]
                if (tag != null && tag.javaClass.name.contains("viewitems.")) {
                    val f9 = tryGetF9(tag)
                    if (f9 != null) {
                        val root = findMessageRoot(view)
                        val avatar = root?.let { findMaskLayout(it) }
                        if (avatar != null && timeViewMap.containsKey(avatar)) {
                            // Recycled view: update immediately, no flicker
                            updateTimeLabel(avatar, f9)
                        } else {
                            // New view: post delayed for layout
                            pendingRunnables[view]?.let { mainHandler.removeCallbacks(it) }
                            val runnable = Runnable { processTag(view, f9, tag) }
                            pendingRunnables[view] = runnable
                            mainHandler.postDelayed(runnable, 200)
                        }
                    }
                }
                null
            }
            module.log(Log.INFO, TAG, "setTag Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }

    private fun tryGetF9(tag: Any): Any? {
        try { return tag.javaClass.getMethod("c").invoke(tag) }
        catch (_: Throwable) { return null }
    }

    private fun processTag(view: View, f9: Any, tag: Any) {
        val root = findMessageRoot(view) ?: return
        val avatar = findMaskLayout(root) ?: return
        if (lastF9Map[avatar] === f9) return
        lastF9Map[avatar] = f9
        if (timeViewMap.containsKey(avatar)) {
            updateTimeLabel(avatar, f9)
            return
        }
        addTimeBelow(avatar, f9)
    }

    private fun findMessageRoot(view: View): ViewGroup? {
        var current: View? = view
        while (current != null) {
            if (current is ViewGroup && findMaskLayout(current) != null) return current
            current = current.parent as? View
        }
        return null
    }

    private fun addTimeBelow(avatar: View, f9: Any) {
        val timeStr = formatTime(f9) ?: return
        val parent = avatar.parent as? ViewGroup ?: return
        val ctx = parent.context
        val d = ctx.resources.displayMetrics.density

        val timeView = TextView(ctx).apply {
            text = timeStr
            setTextColor(0xFFAAAAAA.toInt())
            textSize = 9f
            gravity = Gravity.CENTER
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
            setPadding(0, (2 * d).toInt(), 0, (2 * d).toInt())
        }

        when {
            parent is RelativeLayout -> {
                val lp = RelativeLayout.LayoutParams(
                    avatar.layoutParams.width,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                lp.addRule(RelativeLayout.BELOW, avatar.id)
                lp.addRule(RelativeLayout.ALIGN_LEFT, avatar.id)
                parent.addView(timeView, lp)
            }
            parent is LinearLayout && (parent as LinearLayout).orientation == LinearLayout.VERTICAL -> {
                val avatarIdx = parent.indexOfChild(avatar)
                parent.addView(timeView, avatarIdx + 1, ViewGroup.LayoutParams(
                    avatar.layoutParams.width,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ))
            }
            else -> {
                val avatarIdx = parent.indexOfChild(avatar)
                val oldLp = avatar.layoutParams
                parent.removeView(avatar)

                val wrapper = LinearLayout(ctx).apply {
                    orientation = LinearLayout.VERTICAL
                    gravity = Gravity.CENTER_HORIZONTAL
                }
                wrapper.addView(avatar, ViewGroup.LayoutParams(oldLp.width, oldLp.height))
                wrapper.addView(timeView, ViewGroup.LayoutParams(
                    oldLp.width,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ))
                parent.addView(wrapper, avatarIdx, ViewGroup.LayoutParams(
                    oldLp.width,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ))
            }
        }

        timeViewMap[avatar] = timeView
        module.log(Log.INFO, TAG, "Time: $timeStr")
    }

    private fun updateTimeLabel(avatar: View, f9: Any) {
        val timeView = timeViewMap[avatar] ?: return
        val timeStr = formatTime(f9) ?: return
        timeView.text = timeStr
    }

    private fun findMaskLayout(vg: ViewGroup): View? {
        for (i in 0 until vg.childCount) {
            val c = vg.getChildAt(i)
            if (c.javaClass.name == "com.tencent.mm.ui.base.MaskLayout") return c
            if (c is ViewGroup) { findMaskLayout(c)?.let { return it } }
        }
        return null
    }

    private fun formatTime(f9: Any): String? {
        return try {
            val createTime = getCreateTime(f9) ?: return null
            if (createTime <= 0) return null
            val adjusted = if (createTime > 1000000000000L) createTime else createTime * 1000
            val date = Date(adjusted)
            SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(date)
        } catch (e: Throwable) { null }
    }

    private fun getCreateTime(f9: Any): Long? {
        try { return f9.javaClass.getMethod("getCreateTime").invoke(f9) as? Long }
        catch (_: Throwable) {}
        try { return f9.javaClass.getDeclaredMethod("getCreateTime").invoke(f9) as? Long }
        catch (_: Throwable) {}
        var clz: Class<*>? = f9.javaClass.superclass
        while (clz != null) {
            try { return clz.getDeclaredMethod("getCreateTime").invoke(f9) as? Long }
            catch (_: Throwable) { clz = clz.superclass }
        }
        return null
    }
}