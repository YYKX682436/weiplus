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
            // Hook g0.getMainContainerView - guaranteed to be called when view is accessed
            val g0Class = cl.loadClass("com.tencent.mm.ui.chatting.viewitems.g0")
            val mcvMethod = g0Class.getDeclaredMethod("getMainContainerView")
            module.hook(mcvMethod).intercept { chain ->
                val view = chain.proceed() as? View
                if (view != null && FeatureConfig.showDetailTime) {
                    val tag = chain.thisObject
                    try {
                        onViewReady(view, tag)
                    } catch (e: Throwable) {
                        module.log(Log.ERROR, TAG, "onViewReady err: ${e.message}")
                    }
                }
                view
            }
            module.log(Log.INFO, TAG, "getMainContainerView Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail: ${e.message}")
        }
    }

    private fun onViewReady(view: View, tag: Any) {
        mainHandler.postDelayed({
            try {
                // Get f9 from tag via getCurrentMsgInfo - try with context
                val f9 = getMsgInfo(tag, view) ?: return@postDelayed
                addTimeLabel(view, f9)
            } catch (e: Throwable) {
                module.log(Log.ERROR, TAG, "onViewReady inner: ${e.message}")
            }
        }, 200)
    }

    private fun getMsgInfo(tag: Any, view: View): Any? {
        // Try er.c() first
        try {
            val cMethod = tag.javaClass.getMethod("c")
            val f9 = cMethod.invoke(tag)
            if (f9 != null) { module.log(Log.INFO, TAG, "got f9 via er.c()"); return f9 }
        } catch (_: Throwable) {}

        // Try g0.getCurrentMsgInfo with context
        try {
            val ctx = view.context
            val gciMethod = tag.javaClass.getMethod("getCurrentMsgInfo", ctx.javaClass)
            val f9 = gciMethod.invoke(tag, ctx)
            if (f9 != null) { module.log(Log.INFO, TAG, "got f9 via getCurrentMsgInfo(ctx)"); return f9 }
        } catch (_: Throwable) {}
        try {
            val gciMethod = tag.javaClass.getMethod("getCurrentMsgInfo", Any::class.java)
            val f9 = gciMethod.invoke(tag, null)
            if (f9 != null) { module.log(Log.INFO, TAG, "got f9 via getCurrentMsgInfo(null)"); return f9 }
        } catch (_: Throwable) {}
        try {
            val gciMethod = tag.javaClass.getMethod("getCurrentMsgInfo")
            val f9 = gciMethod.invoke(tag)
            if (f9 != null) { module.log(Log.INFO, TAG, "got f9 via getCurrentMsgInfo()"); return f9 }
        } catch (_: Throwable) {}

        module.log(Log.WARN, TAG, "could not get f9 from tag ${tag.javaClass.name}")
        return null
    }

    private fun addTimeLabel(view: View, f9: Any) {
        val avatar = findMaskLayout(view as? ViewGroup ?: return) ?: return
        if (wrapperMap.containsKey(avatar)) {
            updateTimeLabel(avatar, f9)
            return
        }

        val timeStr = formatTime(f9) ?: return
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
        module.log(Log.INFO, TAG, "Time label: $timeStr")
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
            val date = Date(createTime * 1000)
            val cal = Calendar.getInstance()
            val msgCal = Calendar.getInstance().apply { time = date }
            val fmt = if (cal.get(Calendar.DAY_OF_YEAR) == msgCal.get(Calendar.DAY_OF_YEAR)
                && cal.get(Calendar.YEAR) == msgCal.get(Calendar.YEAR))
                SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            else
                SimpleDateFormat("MM-dd HH:mm", Locale.getDefault())
            fmt.format(date)
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "formatTime: ${e.message}")
            null
        }
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
        module.log(Log.WARN, TAG, "getCreateTime not found on ${f9.javaClass.name}")
        return null
    }
}