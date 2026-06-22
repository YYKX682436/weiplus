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
        private const val SWIPE_PX = 150f
    }

    override val key = "swipe_quote"
    override val name = "左滑引用消息"

    private lateinit var module: XposedModule
    private var injected = false
    private var downX = 0f
    private var downY = 0f
    private var swiping = false

    override fun onEnable(m: XposedModule, classLoader: ClassLoader) {
        module = m
        try {
            val chattingUI = classLoader.loadClass("com.tencent.mm.ui.chatting.ChattingUI")
            val onResume = chattingUI.getDeclaredMethod("onResume")
            module.hook(onResume).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                // 多次重试，直到找到 RecyclerView
                for (delay in longArrayOf(800, 2000, 4000)) {
                    Handler(Looper.getMainLooper()).postDelayed({
                        if (!injected) tryInject(activity)
                    }, delay)
                }
                null
            }
            module.log(Log.INFO, TAG, "ChattingUI Hook 已安装")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook 失败", e)
        }
    }

    private fun tryInject(activity: Activity) {
        // 方式1: 反射 ChattingUI 字段找 RecyclerView
        val rv = findRecyclerViewByField(activity)
            ?: findRecyclerViewByWalk(activity.window.decorView)
        if (rv == null) {
            module.log(Log.DEBUG, TAG, "RecyclerView 未找到, 稍后重试")
            return
        }
        module.log(Log.INFO, TAG, "找到 RecyclerView: ${rv.javaClass.name}")

        // 直接设置 OnTouchListener
        rv.setOnTouchListener { _, event -> handleTouch(rv, event) }

        injected = true
        module.log(Log.INFO, TAG, "OnTouchListener 已注入")
    }

    /** 反射查找 ChattingUI 及其父类的 RecyclerView 类型字段 */
    private fun findRecyclerViewByField(activity: Activity): ViewGroup? {
        var clz: Class<*>? = activity.javaClass
        while (clz != null && clz.name.startsWith("com.tencent")) {
            for (f in clz.declaredFields) {
                f.isAccessible = true
                try {
                    val v = f.get(activity)
                    if (v is ViewGroup && v.javaClass.name.contains("RecyclerView")) {
                        return v
                    }
                } catch (_: Throwable) {}
            }
            clz = clz.superclass
        }
        return null
    }

    /** 视图树遍历找 RecyclerView */
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
                return false // 不消费，让 RecyclerView 正常滚动
            }
            MotionEvent.ACTION_MOVE -> {
                if (swiping) return true
                val dx = event.x - downX
                val dyAbs = Math.abs(event.y - downY)
                if (dx < -SWIPE_PX && dyAbs < Math.abs(dx) * 0.5f) {
                    swiping = true
                    val child = findChildAt(rv, downX, downY)
                    if (child != null) {
                        module.log(Log.DEBUG, TAG, "检测到左滑, 触发引用")
                        child.performLongClick()
                        child.postDelayed({ autoClickQuote(rv) }, 300)
                    }
                    return true // 消费事件
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
                x >= c.left.toFloat() && x <= c.right.toFloat() &&
                y >= c.top.toFloat() && y <= c.bottom.toFloat()
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