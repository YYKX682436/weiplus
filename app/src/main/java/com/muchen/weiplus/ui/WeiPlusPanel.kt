package com.muchen.weiplus.ui

import android.animation.ValueAnimator
import android.app.Dialog
import android.content.Context
import android.graphics.*
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.animation.DecelerateInterpolator
import android.widget.*

class WeiPlusPanel(context: Context) : Dialog(context) {

    private var antiRecall = false
    private var chatEnhance = false
    private var automation = false
    private var timedTask = false
    private var momentEnhance = false
    private var cleaner = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.apply {
            setBackgroundDrawableResource(android.R.color.transparent)
            setGravity(Gravity.BOTTOM)
            attributes = attributes.apply {
                width = WindowManager.LayoutParams.MATCH_PARENT
                height = WindowManager.LayoutParams.WRAP_CONTENT
                dimAmount = 0.3f
            }
            addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        }
        setContentView(buildPanel())
    }

    private fun buildPanel(): LinearLayout {
        val root = LinearLayout(context)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(0, 0, 0, dip(40))

        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(24), dpf(24), dpf(24), dpf(24), 0f, 0f, 0f, 0f)
        bg.setColor(Color.argb(0xEE, 0xFA, 0xFA, 0xFC))
        root.background = bg

        val handle = View(context)
        handle.setBackgroundColor(Color.argb(0x25, 0x00, 0x00, 0x00))
        val hl = LinearLayout.LayoutParams(dip(32), dip(4))
        hl.topMargin = dip(10); hl.bottomMargin = dip(8)
        hl.gravity = Gravity.CENTER_HORIZONTAL
        root.addView(handle, hl)

        root.addView(titleRow("微+", "微信增强"))
        root.addView(space(12))

        root.addView(categoryHeader("聊天增强"))
        root.addView(buildCard(
            toggleRow("防撤回", "防止好友撤回消息", { antiRecall }, { antiRecall = it }),
            toggleRow("聊天增强", "多选转发、长截图等", { chatEnhance }, { chatEnhance = it })
        ))
        root.addView(space(12))

        root.addView(categoryHeader("自动化"))
        root.addView(buildCard(
            toggleRow("自动任务", "定时消息、自动回复", { automation }, { automation = it }),
            toggleRow("定时任务", "定时发送消息、朋友圈", { timedTask }, { timedTask = it })
        ))
        root.addView(space(12))

        root.addView(categoryHeader("朋友圈"))
        root.addView(buildCard(
            toggleRow("朋友圈增强", "无水印保存、强制显示", { momentEnhance }, { momentEnhance = it })
        ))
        root.addView(space(12))

        root.addView(categoryHeader("工具"))
        root.addView(buildCard(
            toggleRow("清理工具", "深度清理缓存和文件", { cleaner }, { cleaner = it })
        ))
        root.addView(space(20))

        val ver = TextView(context)
        ver.text = "微+ v1.0.0"
        ver.setTextColor(Color.argb(0xFF, 0xA0, 0xA0, 0xB0))
        ver.textSize = 12f
        ver.gravity = Gravity.CENTER
        ver.setPadding(0, dip(12), 0, 0)
        root.addView(ver, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        ))
        return root
    }

    private fun buildCard(vararg rows: View): LinearLayout {
        val card = LinearLayout(context)
        card.orientation = LinearLayout.VERTICAL
        card.setPadding(dip(2), dip(2), dip(2), dip(2))
        val m = dip(16)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.setMargins(m, 0, m, 0)
        card.layoutParams = lp
        val cardBg = GradientDrawable()
        cardBg.cornerRadius = dpf(16)
        cardBg.setColor(Color.argb(0x99, 0xFF, 0xFF, 0xFF))
        cardBg.setStroke(dip(1), Color.argb(0x20, 0x00, 0x00, 0x00))
        card.background = cardBg
        card.elevation = dpf(2)
        rows.forEachIndexed { i, row ->
            if (i > 0) card.addView(divider())
            card.addView(row)
        }
        return card
    }

    private fun titleRow(title: String, subtitle: String): LinearLayout {
        val row = LinearLayout(context)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(24), dip(8), dip(24), dip(8))
        val tv = TextView(context)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 26f
        row.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val st = TextView(context)
        st.text = subtitle; st.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        st.textSize = 13f
        row.addView(st)
        return row
    }

    private fun categoryHeader(title: String): TextView {
        val tv = TextView(context)
        tv.text = title.uppercase()
        tv.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        tv.textSize = 11f
        tv.setPadding(dip(20), dip(6), dip(20), dip(6))
        return tv
    }

    private fun divider(): View {
        val v = View(context)
        v.setBackgroundColor(Color.argb(0x0F, 0x00, 0x00, 0x00))
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        lp.setMargins(dip(16), 0, dip(16), 0)
        v.layoutParams = lp
        return v
    }

    private fun toggleRow(
        title: String, subtitle: String,
        getter: () -> Boolean, setter: (Boolean) -> Unit
    ): LinearLayout {
        val row = LinearLayout(context)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(16), dip(12), dip(12), dip(12))
        row.gravity = Gravity.CENTER_VERTICAL

        val textCol = LinearLayout(context)
        textCol.orientation = LinearLayout.VERTICAL
        row.addView(textCol, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(context)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
        tv.textSize = 16f
        textCol.addView(tv)

        val ts = TextView(context)
        ts.text = subtitle; ts.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        ts.textSize = 12f
        textCol.addView(ts)

        val iosSwitch = IosSwitch(context)
        iosSwitch.setChecked(getter(), false)
        row.addView(iosSwitch, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        ))

        row.setOnClickListener {
            val nv = !iosSwitch.isChecked
            iosSwitch.setChecked(nv, true)
            setter(nv)
        }
        iosSwitch.onToggle = setter

        return row
    }

    private fun space(h: Int): View {
        val v = View(context)
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(h))
        return v
    }

    private fun dip(v: Int): Int = (v * context.resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * context.resources.displayMetrics.density

    companion object {
        private val COLOR_TRACK_OFF = Color.argb(0xFF, 0xE5, 0xE5, 0xEA)
        private val COLOR_TRACK_ON = Color.argb(0xFF, 0x34, 0xC7, 0x59)
    }
}

// iOS 风格开关 (独立类，避免inner class限制)
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

        val trackR = Color.red(COLOR_TRACK_OFF) + ((Color.red(COLOR_TRACK_ON) - Color.red(COLOR_TRACK_OFF)) * animProgress).toInt()
        val trackG = Color.green(COLOR_TRACK_OFF) + ((Color.green(COLOR_TRACK_ON) - Color.green(COLOR_TRACK_OFF)) * animProgress).toInt()
        val trackB = Color.blue(COLOR_TRACK_OFF) + ((Color.blue(COLOR_TRACK_ON) - Color.blue(COLOR_TRACK_OFF)) * animProgress).toInt()
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

    private fun dip(v: Int): Int = (v * density + 0.5f).toInt()

    companion object {
        private val COLOR_TRACK_OFF = Color.argb(0xFF, 0xE5, 0xE5, 0xEA)
        private val COLOR_TRACK_ON = Color.argb(0xFF, 0x34, 0xC7, 0x59)
    }
}
