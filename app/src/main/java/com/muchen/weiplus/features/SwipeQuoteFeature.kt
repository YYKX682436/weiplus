package com.muchen.weiplus.features

import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.libxposed.api.XposedModule

class SwipeQuoteFeature : BaseFeature() {

    companion object { private const val TAG = "SwipeQuote" }

    override val key = "swipe_quote"
    override val name = "左滑引用消息"

    private var downX = 0f
    private var downY = 0f
    private var swiping = false
    private var injected = false
    private lateinit var module: XposedModule

    override fun onEnable(m: XposedModule, classLoader: ClassLoader) {
        module = m
        try {
            val chattingUI = classLoader.loadClass("com.tencent.mm.ui.chatting.ChattingUI")
            val onResume = chattingUI.getDeclaredMethod("onResume")
            module.hook(onResume).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                Handler(Looper.getMainLooper()).postDelayed({
                    injectSwipeListener(activity)
                }, 1500)
                null
            }
            module.log(Log.INFO, TAG, "Hook 已安装")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook 失败", e)
        }
    }

    private fun injectSwipeListener(activity: Activity) {
        if (injected) return
        try {
            val root = activity.window.decorView
                .findViewById<ViewGroup>(android.R.id.content) ?: return
            val rv = findRecyclerView(root) ?: return

            val threshold = (50 * activity.resources.displayMetrics.density)

            rv.addOnItemTouchListener(object : RecyclerView.OnItemTouchListener {
                override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                    when (e.action) {
                        MotionEvent.ACTION_DOWN -> {
                            downX = e.x; downY = e.y; swiping = false
                        }
                        MotionEvent.ACTION_MOVE -> {
                            if (swiping) return true
                            val dx = e.x - downX
                            val dyAbs = Math.abs(e.y - downY)
                            if (dx < -threshold && dyAbs < Math.abs(dx) * 0.6f) {
                                swiping = true
                                val child = rv.findChildViewUnder(downX, downY)
                                if (child != null) {
                                    // 长按弹出菜单，然后自动点击"引用"
                                    child.performLongClick()
                                    child.postDelayed({
                                        autoClickQuote(activity)
                                    }, 300)
                                }
                                return true
                            }
                        }
                        MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                            swiping = false
                        }
                    }
                    return false
                }

                override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {}
                override fun onRequestDisallowInterceptTouchEvent(disallow: Boolean) {}
            })

            injected = true
            module.log(Log.INFO, TAG, "滑动监听已注入 (直接引用)")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "注入滑动监听失败", e)
        }
    }

    /** 在弹出菜单中查找并点击"引用" */
    private fun autoClickQuote(activity: Activity) {
        try {
            val decor = activity.window.decorView
            findAndClickText(decor, "引用")
        } catch (_: Throwable) {}
    }

    private fun findAndClickText(view: View, text: String): Boolean {
        if (view is TextView && view.text == text && view.isShown && view.isEnabled) {
            view.performClick()
            return true
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val child = view.getChildAt(i)
                if (findAndClickText(child, text)) return true
            }
        }
        return false
    }

    private fun findRecyclerView(view: View): RecyclerView? {
        if (view is RecyclerView) return view
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val rv = findRecyclerView(view.getChildAt(i))
                if (rv != null) return rv
            }
        }
        return null
    }
}