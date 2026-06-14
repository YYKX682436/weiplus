package com.muchen.weiplus.ui

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.view.animation.DecelerateInterpolator

/**
 * iOS 风格滑动开关
 * 绿色/灰色轨迹 + 白色圆形滑块 + 阴影 + 动画
 */
class IosSwitch(context: Context) : View(context) {
    var isChecked = false
        private set

    var onToggle: ((Boolean) -> Unit)? = null

    private var animProgress = 0f
    private val trackPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val thumbPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val density = context.resources.displayMetrics.density

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(dip(30), dip(18))
    }

    override fun onDraw(canvas: Canvas) {
        val w = width.toFloat()
        val h = height.toFloat()
        val r = h / 2f
        val thumbR = r - 2f * density

        val trackR = lerp(Color.red(COLOR_TRACK_OFF), Color.red(COLOR_TRACK_ON), animProgress)
        val trackG = lerp(Color.green(COLOR_TRACK_OFF), Color.green(COLOR_TRACK_ON), animProgress)
        val trackB = lerp(Color.blue(COLOR_TRACK_OFF), Color.blue(COLOR_TRACK_ON), animProgress)
        trackPaint.color = Color.rgb(trackR, trackG, trackB)
        trackPaint.style = Paint.Style.FILL
        canvas.drawRoundRect(0f, 0f, w, h, r, r, trackPaint)

        val thumbX = r + (w - 2f * r) * animProgress
        thumbPaint.color = Color.WHITE
        thumbPaint.style = Paint.Style.FILL
        thumbPaint.setShadowLayer(2f * density, 0f, 1f * density, Color.argb(0x30, 0, 0, 0))
        canvas.drawCircle(thumbX, h / 2f, thumbR, thumbPaint)
        thumbPaint.clearShadowLayer()
    }

    fun setChecked(checked: Boolean, animate: Boolean) {
        if (this.isChecked == checked && animProgress == (if (checked) 1f else 0f)) return
        this.isChecked = checked
        val target = if (checked) 1f else 0f

        if (animate) {
            ValueAnimator.ofFloat(animProgress, target).apply {
                duration = 200
                interpolator = DecelerateInterpolator()
                addUpdateListener { a ->
                    animProgress = a.animatedValue as Float
                    invalidate()
                }
                start()
            }
        } else {
            animProgress = target
            invalidate()
        }
        onToggle?.invoke(checked)
    }

    private fun lerp(a: Int, b: Int, t: Float): Int = (a + (b - a) * t).toInt()
    private fun dip(v: Int): Int = (v * density + 0.5f).toInt()

    companion object {
        private val COLOR_TRACK_OFF = Color.argb(0xFF, 0xE5, 0xE5, 0xEA)
        private val COLOR_TRACK_ON = Color.argb(0xFF, 0x34, 0xC7, 0x59)
    }
}
