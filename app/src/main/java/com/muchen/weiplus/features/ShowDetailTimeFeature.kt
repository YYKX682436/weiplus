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
    private val processed = Collections.newSetFromMap(WeakHashMap<View, Boolean>())
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
                val view = chain.thisObject as? View ?: return@intercept null
                val tag = chain.args[0]
                if (tag != null && tag.javaClass.name.contains("viewitems")) {
                    onChatTagSet(view, tag)
                }
                null
            }
            module.log(Log.INFO, TAG, "View.setTag Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail", e)
        }
    }

    private fun onChatTagSet(view: View, tag: Any) {
        if (!FeatureConfig.showDetailTime) return
        if (processed.contains(view)) return
        processed.add(view)

        mainHandler.postDelayed({
            try { addTimeLabel(view, tag) } catch (_: Throwable) {}
        }, 150)
    }

    private fun addTimeLabel(root: View, tag: Any) {
        val avatar = findMaskLayout(root as? ViewGroup ?: return) ?: return
        if (wrapperMap.containsKey(avatar)) {
            updateTimeLabel(avatar, tag)
            return
        }

        val timeStr = getMsgTime(tag) ?: return
        val parent = avatar.parent as? ViewGroup ?: return
        val ctx = parent.context
        val d = ctx.resources.displayMetrics.density

        val timeView = TextView(ctx).apply {
            text = timeStr
            setTextColor(0xFF999999.toInt())
            textSize = 10f
            gravity = Gravity.CENTER
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
            setPadding(0, (2 * d).toInt(), 0, 0)
        }

        val avatarIdx = parent.indexOfChild(avatar)
        val oldLp = avatar.layoutParams
        parent.removeView(avatar)

        val wrapper = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            layoutParams = oldLp
        }
        wrapper.addView(avatar, LinearLayout.LayoutParams(oldLp.width, oldLp.height))
        wrapper.addView(timeView, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ))
        parent.addView(wrapper, avatarIdx)

        timeViewMap[avatar] = timeView
        wrapperMap[avatar] = wrapper
        module.log(Log.INFO, TAG, "Time label added: $timeStr")
    }

    private fun updateTimeLabel(avatar: View, tag: Any) {
        val timeView = timeViewMap[avatar] ?: return
        val timeStr = getMsgTime(tag) ?: return
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

    private fun getCreateTimeFromMsg(f9: Any): Long? {
        // Try getCreateTime method
        try { return f9.javaClass.getMethod("getCreateTime").invoke(f9) as? Long }
        catch (_: Throwable) {}
        try { return f9.javaClass.getDeclaredMethod("getCreateTime").invoke(f9) as? Long }
        catch (_: Throwable) {}
        // Try superclass chain
        var clz: Class<*>? = f9.javaClass.superclass
        while (clz != null) {
            try { return clz.getDeclaredMethod("getCreateTime").invoke(f9) as? Long }
            catch (_: Throwable) { clz = clz.superclass }
        }
        return null
    }

    private fun getMsgTime(tag: Any): String? {
        return try {
            val f9 = tag.javaClass.getMethod("c").invoke(tag) ?: return null
            val createTime = getCreateTimeFromMsg(f9) ?: return null
            if (createTime <= 0) return null

            val date = Date(createTime * 1000)
            val today = Calendar.getInstance()
            val msgDay = Calendar.getInstance().apply { time = date }
            val fmt = if (today.get(Calendar.DAY_OF_YEAR) == msgDay.get(Calendar.DAY_OF_YEAR)
                && today.get(Calendar.YEAR) == msgDay.get(Calendar.YEAR))
                SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            else
                SimpleDateFormat("MM-dd HH:mm", Locale.getDefault())
            fmt.format(date)
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "getMsgTime fail: ${e.message}")
            null
        }
    }
}
