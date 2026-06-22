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
        private const val SWIPE_THRESHOLD = 150f // px, ~50dp
    }

    override val key = "swipe_quote"
    override val name = "左滑引用消息"

    // 每个 RecyclerView 实例的触摸状态
    private val touchStates = java.util.WeakHashMap<Any, TouchState>()

    private class TouchState {
        var downX = 0f
        var downY = 0f
        var swiping = false
    }

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        try {
            // 类级别 Hook: RecyclerView.onInterceptTouchEvent
            // 不需要等视图渲染，所有 RecyclerView 的触摸都会被拦截
            val rvClass = classLoader.loadClass("androidx.recyclerview.widget.RecyclerView")
            val onInterceptMethod = rvClass.getDeclaredMethod(
                "onInterceptTouchEvent",
                classLoader.loadClass("android.view.MotionEvent")
            )
            module.hook(onInterceptMethod).intercept { chain ->
                val rv = chain.thisObject as? ViewGroup ?: return@intercept chain.proceed()
                val e = chain.args[0] as? MotionEvent ?: return@intercept chain.proceed()

                // 只处理聊天界面的 RecyclerView
                if (!isInChattingUI(rv)) return@intercept chain.proceed()

                handleTouch(rv, e)
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "类级 RecyclerView Hook 已安装")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "RecyclerView Hook 失败", e)
        }
    }

    /** 判断 RecyclerView 是否在 ChattingUI 中 */
    private fun isInChattingUI(view: View): Boolean {
        var ctx = view.context
        while (ctx is android.content.ContextWrapper) {
            if (ctx.javaClass.name == "com.tencent.mm.ui.chatting.ChattingUI") return true
            ctx = ctx.baseContext
        }
        return false
    }

    private fun handleTouch(rv: ViewGroup, e: MotionEvent) {
        val state = touchStates.getOrPut(rv) { TouchState() }
        when (e.action) {
            MotionEvent.ACTION_DOWN -> {
                state.downX = e.x
                state.downY = e.y
                state.swiping = false
            }
            MotionEvent.ACTION_MOVE -> {
                if (state.swiping) return
                val dx = e.x - state.downX
                val dyAbs = Math.abs(e.y - state.downY)
                if (dx < -SWIPE_THRESHOLD && dyAbs < Math.abs(dx) * 0.5f) {
                    state.swiping = true
                    // 找到触摸起始位置对应的 item
                    val child = findChildAt(rv, state.downX, state.downY)
                    if (child != null) {
                        child.performLongClick()
                        // 300ms 后自动点击"引用"
                        child.postDelayed({
                            autoClickQuote(rv)
                        }, 300)
                    }
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                state.swiping = false
            }
        }
    }

    /** 遍历子 View 找触摸坐标对应的 item */
    private fun findChildAt(parent: ViewGroup, x: Float, y: Float): View? {
        for (i in parent.childCount - 1 downTo 0) {
            val child = parent.getChildAt(i)
            if (child.visibility == View.VISIBLE &&
                x >= child.left && x <= child.right &&
                y >= child.top && y <= child.bottom
            ) {
                return child
            }
        }
        return null
    }

    /** 在 decorView 中找"引用"文字并点击 */
    private fun autoClickQuote(view: View) {
        try {
            val activity = view.context
            var ctx = activity
            while (ctx is android.content.ContextWrapper && ctx !is Activity) {
                ctx = ctx.baseContext
            }
            if (ctx is Activity) {
                val decor = ctx.window.decorView
                findAndClickText(decor, "引用")
            }
        } catch (_: Throwable) {}
    }

    private fun findAndClickText(view: View, text: String): Boolean {
        if (view is TextView && view.text == text && view.isShown && view.isEnabled) {
            view.performClick()
            return true
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                if (findAndClickText(view.getChildAt(i), text)) return true
            }
        }
        return false
    }
}