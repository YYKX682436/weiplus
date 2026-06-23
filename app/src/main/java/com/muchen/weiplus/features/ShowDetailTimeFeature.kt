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
            // Hook tag classes that extend g0: their b(f9, ...) gets the message info directly
            val tagClasses = arrayOf("ao", "ya")
            for (name in tagClasses) {
                try {
                    val cls = cl.loadClass("com.tencent.mm.ui.chatting.viewitems.$name")
                    for (method in cls.declaredMethods) {
                        if (method.name == "b" && method.parameterTypes.size == 4) {
                            module.hook(method).intercept { chain ->
                                chain.proceed()
                                if (!FeatureConfig.showDetailTime) return@intercept null
                                val tag = chain.thisObject
                                val f9 = chain.args[0]
                                if (f9 != null) {
                                    onBind(tag, f9)
                                }
                                null
                            }
                            module.log(Log.INFO, TAG, "$name.b Hook OK")
                            break
                        }
                    }
                } catch (_: Throwable) {}
            }
            module.log(Log.INFO, TAG, "All g0-subclass hooks installed")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook fail", e)
        }

        // Also hook setTag for er-based tags (like go)
        try {
            val viewClass = View::class.java
            val setTagMethod = viewClass.getDeclaredMethod("setTag", Any::class.java)
            module.hook(setTagMethod).intercept { chain ->
                chain.proceed()
                if (!FeatureConfig.showDetailTime) return@intercept null
                val view = chain.thisObject as? View ?: return@intercept null
                val tag = chain.args[0]
                if (tag != null) {
                    val tagName = tag.javaClass.name
                    if (tagName.contains("viewitems") && !tagName.endsWith(".ao") && !tagName.endsWith(".ya")) {
                        // For er-based tags, try c() method
                        mainHandler.postDelayed({
                            try {
                                val f9 = tag.javaClass.getMethod("c").invoke(tag)
                                if (f9 != null) addTimeLabel(view, f9)
                            } catch (_: Throwable) {}
                        }, 150)
                    }
                }
                null
            }
            module.log(Log.INFO, TAG, "setTag fallback Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "setTag Hook fail", e)
        }
    }

    private fun onBind(tag: Any, f9: Any) {
        mainHandler.postDelayed({
            try {
                val view = tag.javaClass.getMethod("getMainContainerView").invoke(tag) as? View ?: return@postDelayed
                addTimeLabel(view, f9)
            } catch (_: Throwable) {}
        }, 150)
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
        module.log(Log.INFO, TAG, "Time label added: $timeStr")
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
            module.log(Log.WARN, TAG, "formatTime fail: ${e.message}")
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
        return null
    }
}
