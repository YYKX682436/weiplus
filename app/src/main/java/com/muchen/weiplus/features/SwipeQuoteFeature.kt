package com.muchen.weiplus.features

import android.app.Activity
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
    private val trackedRVs = mutableMapOf<ViewGroup, TouchTracker>()
    private var triedHook = false

    private class TouchTracker {
        var downX = 0f; var downY = 0f; var swiping = false
    }

    override fun onEnable(m: XposedModule, classLoader: ClassLoader) {
        module = m
        // Hook RecyclerView.onAttachedToWindow — 任何 RecyclerView 挂载到窗口时触发
        try {
            val rvClass = classLoader.loadClass("androidx.recyclerview.widget.RecyclerView")
            val onAttached = rvClass.getDeclaredMethod("onAttachedToWindow")
            module.hook(onAttached).intercept { chain ->
                chain.proceed()
                val rv = chain.thisObject as? ViewGroup ?: return@intercept null
                if (!trackedRVs.containsKey(rv)) {
                    module.log(Log.INFO, TAG, "RecyclerView attached: ${rv.javaClass.name}")
                    rv.setOnTouchListener { _, event -> handleTouch(rv, event) }
                    trackedRVs[rv] = TouchTracker()
                }
                null
            }
            triedHook = true
            module.log(Log.INFO, TAG, "onAttachedToWindow Hook 已安装")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "onAttachedToWindow Hook 失败", e)
        }
    }

    private fun handleTouch(rv: ViewGroup, event: MotionEvent): Boolean {
        // 只处理聊天列表中的 RecyclerView（context 是 ChattingUI）
        if (!isChattingContext(rv.context)) return false

        val t = trackedRVs[rv] ?: return false
        when (event.action) {
            MotionEvent.ACTION_DOWN -> { t.downX = event.x; t.downY = event.y; t.swiping = false; return false }
            MotionEvent.ACTION_MOVE -> {
                if (t.swiping) return true
                val dx = event.x - t.downX
                if (dx < -SWIPE_PX && Math.abs(event.y - t.downY) < Math.abs(dx) * 0.5f) {
                    t.swiping = true
                    val child = findChildAt(rv, t.downX, t.downY)
                    if (child != null) {
                        module.log(Log.INFO, TAG, "左滑触发引用")
                        child.performLongClick()
                        child.postDelayed({ autoClickQuote(rv) }, 300)
                    }
                    return true
                }
                return false
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> { t.swiping = false; return false }
        }
        return false
    }

    private fun isChattingContext(ctx: android.content.Context): Boolean {
        var c: Any? = ctx
        while (c is android.content.ContextWrapper) {
            if (c.javaClass.name.contains("ChattingUI")) return true
            c = c.baseContext
        }
        return false
    }

    private fun findChildAt(parent: ViewGroup, x: Float, y: Float): View? {
        for (i in parent.childCount - 1 downTo 0) {
            val c = parent.getChildAt(i)
            if (c.visibility == View.VISIBLE && x >= c.left && x <= c.right && y >= c.top && y <= c.bottom) return c
        }
        return null
    }

    private fun autoClickQuote(view: View) {
        try {
            var ctx: Any? = view.context
            while (ctx is android.content.ContextWrapper && ctx !is Activity) ctx = ctx.baseContext
            (ctx as? Activity)?.window?.decorView?.let { decor -> findAndClick(decor, "引用") }
        } catch (_: Throwable) {}
    }

    private fun findAndClick(v: View, text: String): Boolean {
        if (v is TextView && v.text == text && v.isShown && v.isEnabled) { v.performClick(); return true }
        if (v is ViewGroup) for (i in 0 until v.childCount) if (findAndClick(v.getChildAt(i), text)) return true
        return false
    }
}