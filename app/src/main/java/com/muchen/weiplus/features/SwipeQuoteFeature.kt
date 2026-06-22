package com.muchen.weiplus.features

import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.github.libxposed.api.XposedModule

class SwipeQuoteFeature : BaseFeature() {

    companion object {
        private const val TAG = "SwipeQuote"
        private const val CHATTING_UI = "com.tencent.mm.ui.chatting.ChattingUI"
        private const val SWIPE_PX = 150f
    }

    override val key = "swipe_quote"
    override val name = "左滑引用消息"

    private lateinit var module: XposedModule
    private val injectedActivities = mutableSetOf<String>()
    private var downX = 0f
    private var downY = 0f
    private var swiping = false

    override fun onEnable(m: XposedModule, classLoader: ClassLoader) {
        module = m
        try {
            // Hook Activity.onResume — 最可靠，每个 Activity 必调用
            val activityClass = classLoader.loadClass("android.app.Activity")
            val onResume = activityClass.getDeclaredMethod("onResume")
            module.hook(onResume).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                if (activity.javaClass.name == CHATTING_UI) {
                    module.log(Log.INFO, TAG, "ChattingUI.onResume 触发")
                    for (delay in longArrayOf(800, 2000, 4000)) {
                        Handler(Looper.getMainLooper()).postDelayed({
                            tryInject(activity)
                        }, delay)
                    }
                }
                null
            }
            module.log(Log.INFO, TAG, "Activity.onResume Hook 已安装")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook 失败", e)
        }
    }

    private fun tryInject(activity: Activity) {
        val key = activity.hashCode().toString()
        if (injectedActivities.contains(key)) return

        val rv = findRecyclerViewByField(activity)
            ?: findRecyclerViewByWalk(activity.window.decorView)
        if (rv == null) {
            module.log(Log.INFO, TAG, "RecyclerView 未找到, 稍后重试")
            return
        }
        module.log(Log.INFO, TAG, "找到 RecyclerView: ${rv.javaClass.name}")

        rv.setOnTouchListener { _, event -> handleTouch(rv, event) }

        injectedActivities.add(key)
        module.log(Log.INFO, TAG, "OnTouchListener 已注入")
    }

    private fun findRecyclerViewByField(activity: Activity): ViewGroup? {
        var clz: Class<*>? = activity.javaClass
        while (clz != null && clz.name.startsWith("com.tencent")) {
            for (f in clz.declaredFields) {
                f.isAccessible = true
                try {
                    val v = f.get(activity)
                    if (v is ViewGroup && v.javaClass.name.contains("RecyclerView")) {
                        module.log(Log.INFO, TAG, "通过字段找到: ${f.name} -> ${v.javaClass.name}")
                        return v
                    }
                } catch (_: Throwable) {}
            }
            clz = clz.superclass
        }
        return null
    }

    private fun findRecyclerViewByWalk(view: View?): ViewGroup? {
        if (view == null) return null
        if (view is ViewGroup && view.javaClass.name.contains("RecyclerView")) return view
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val r = findRecyclerViewByWalk(view.getChildAt(i))
                if (r != null) return r
            }
        }
        return null
    }

    private fun handleTouch(rv: ViewGroup, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                downX = event.x
                downY = event.y
                swiping = false
                return false
            }
            MotionEvent.ACTION_MOVE -> {
                if (swiping) return true
                val dx = event.x - downX
                if (dx < -SWIPE_PX && Math.abs(event.y - downY) < Math.abs(dx) * 0.5f) {
                    swiping = true
                    val child = findChildAt(rv, downX, downY)
                    if (child != null) {
                        module.log(Log.INFO, TAG, "左滑触发引用")
                        child.performLongClick()
                        child.postDelayed({ autoClickQuote(rv) }, 300)
                    }
                    return true
                }
                return false
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                swiping = false
                return false
            }
        }
        return false
    }

    private fun findChildAt(parent: ViewGroup, x: Float, y: Float): View? {
        for (i in parent.childCount - 1 downTo 0) {
            val c = parent.getChildAt(i)
            if (c.visibility == View.VISIBLE &&
                x >= c.left && x <= c.right &&
                y >= c.top && y <= c.bottom
            ) return c
        }
        return null
    }

    private fun autoClickQuote(view: View) {
        try {
            var ctx: Any? = view.context
            while (ctx is android.content.ContextWrapper && ctx !is Activity) {
                ctx = ctx.baseContext
            }
            (ctx as? Activity)?.window?.decorView?.let { decor ->
                findAndClick(decor, "引用")
            }
        } catch (_: Throwable) {}
    }

    private fun findAndClick(v: View, text: String): Boolean {
        if (v is TextView && v.text == text && v.isShown && v.isEnabled) {
            v.performClick()
            return true
        }
        if (v is ViewGroup) {
            for (i in 0 until v.childCount) {
                if (findAndClick(v.getChildAt(i), text)) return true
            }
        }
        return false
    }
}