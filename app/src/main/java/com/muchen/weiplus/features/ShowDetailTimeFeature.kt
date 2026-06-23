package com.muchen.weiplus.features

import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
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
    private val wrapperMap = WeakHashMap<View, LinearLayout>()

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
                if (tag != null && tag.javaClass.name == "com.tencent.mm.ui.chatting.viewitems.ao") {
                    val f9 = tryGetF9(tag)
                    if (f9 != null) {
                        mainHandler.postDelayed({ processTag(view, f9) }, 300)
                    }
                }
                null
            }
            module.log(Log.INFO, TAG, "setTag Hook OK (ao only)")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }

    private fun tryGetF9(tag: Any): Any? {
        try { return tag.javaClass.getMethod("c").invoke(tag) }
        catch (_: Throwable) { return null }
    }

    private fun processTag(view: View, f9: Any) {
        val root = findMessageRoot(view) ?: return
        val avatar = findMaskLayout(root) ?: return
        if (wrapperMap.containsKey(avatar)) {
            updateTimeLabel(avatar, f9)
            return
        }
        addTimeBelow(avatar, root, f9)
    }

    private fun findMessageRoot(view: View): ViewGroup? {
        var current: View? = view
        while (current != null) {
            if (current is ViewGroup && findMaskLayout(current) != null) return current
            current = current.parent as? View
        }
        return null
    }

    private fun addTimeBelow(avatar: View, root: ViewGroup, f9: Any) {
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

        val avatarIdx = parent.indexOfChild(avatar)
        val oldLp = avatar.layoutParams
        parent.removeView(avatar)

        val wrapper = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
        }

        val wrapperLp = when (oldLp) {
            is LinearLayout.LayoutParams -> LinearLayout.LayoutParams(oldLp).apply {
                height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
            else -> ViewGroup.LayoutParams(oldLp).apply {
                height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
        }

        wrapper.addView(avatar, ViewGroup.LayoutParams(oldLp.width, oldLp.height))
        wrapper.addView(timeView, ViewGroup.LayoutParams(
            oldLp.width,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ))
        parent.addView(wrapper, avatarIdx, wrapperLp)

        timeViewMap[avatar] = timeView
        wrapperMap[avatar] = wrapper
        module.log(Log.INFO, TAG, "Time: $timeStr (raw=$f9)")
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
            // Auto-detect: if > 1e12 treat as ms, else as seconds
            val adjusted = if (createTime > 1000000000000L) createTime else createTime * 1000
            val date = Date(adjusted)
            val cal = Calendar.getInstance()
            val msgCal = Calendar.getInstance().apply { time = date }
            val fmt = if (cal.get(Calendar.DAY_OF_YEAR) == msgCal.get(Calendar.DAY_OF_YEAR)
                && cal.get(Calendar.YEAR) == msgCal.get(Calendar.YEAR))
                SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            else
                SimpleDateFormat("MM-dd HH:mm", Locale.getDefault())
            fmt.format(date)
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