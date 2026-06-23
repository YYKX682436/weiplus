package com.muchen.weiplus.ui

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import com.muchen.weiplus.features.FeatureConfig

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FeatureConfig.load()

        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, dip(16), 0, dip(16))
        }

        addSection(panel, "娑堟伅澧炲己")
        addCard(panel) { card ->
            addToggle(card, "绂佹娑堟伅鎾ゅ洖", "闃绘濂藉弸鎾ゅ洖宸插彂娑堟伅",
                FeatureConfig.antiRecall
            ) { FeatureConfig.antiRecall = it; FeatureConfig.save() }
            addCardDivider(card)
            addToggle(card, "宸︽粦寮曠敤娑堟伅", "宸︽粦娑堟伅蹇€熷紩鐢ㄥ洖澶?,
                FeatureConfig.swipeQuote
            ) { FeatureConfig.swipeQuote = it; FeatureConfig.save() }
            addCardDivider(card)
            addToggle(card, "鏄剧ず璇︾粏鏃堕棿", "澶村儚涓嬫柟鏄剧ず娑堟伅鏃堕棿 HH:mm:ss",
                FeatureConfig.showDetailTime
            ) { FeatureConfig.showDetailTime = it; FeatureConfig.save() }
        }

        addSection(panel, "")
        addCard(panel) { card ->
            addInfoRow(card, "鐗堟湰", "1.0.0")
            addCardDivider(card)
            addInfoRow(card, "璇存槑", "闇€瑕佹縺娲?LSPosed 妯″潡鍚庨噸鍚井淇♀€?\n" +
                "鎵€鏈夊姛鑳藉潎闇€鏈夋晥鐨?LSPosed 鐜")
        }

        val scroll = ScrollView(this).apply { addView(panel) }
        setContentView(scroll)
        window.statusBarColor = Color.argb(0xF8, 0x1C, 0x1C, 0x1E)
    }

    private fun addSection(panel: LinearLayout, title: String) {
        if (title.isNotEmpty()) {
            panel.addView(TextView(this).apply {
                text = title
                setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
                textSize = 13f
                setPadding(dip(20), dip(8), dip(20), dip(6))
            })
        }
    }

    private fun addCard(panel: LinearLayout, block: (LinearLayout) -> Unit) {
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = GradientDrawable().apply {
                cornerRadius = dpf(12)
                setColor(Color.argb(0xFC, 0xFF, 0xFF, 0xFF))
            }
            val lp = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply { setMargins(dip(16), 0, dip(16), dip(12)) }
            layoutParams = lp
        }
        block(card)
        panel.addView(card)
    }

    private fun addToggle(card: LinearLayout, title: String, subtitle: String,
                          initial: Boolean, onToggle: (Boolean) -> Unit) {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dip(20), dip(14), dip(16), dip(14))
        }

        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, 0, dip(8), 0)
        }
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        col.addView(TextView(this).apply {
            text = title
            setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
            textSize = 16f
        })
        col.addView(TextView(this).apply {
            text = subtitle
            setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
            textSize = 12f
        })

        val sw = IosSwitch(this, 1.2f)
        sw.setChecked(initial, false)
        sw.onToggle = onToggle
        row.addView(sw)
        row.setOnClickListener { sw.setChecked(!sw.isChecked, true) }

        card.addView(row)
    }

    private fun addCardDivider(card: LinearLayout) {
        val div = View(this).apply {
            setBackgroundColor(Color.argb(0x0C, 0x00, 0x00, 0x00))
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dip(1)
            ).apply { setMargins(dip(20), 0, dip(20), 0) }
        }
        card.addView(div)
    }

    private fun addInfoRow(card: LinearLayout, label: String, value: String) {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dip(20), dip(14), dip(20), dip(14))
        }
        row.addView(TextView(this).apply {
            text = label
            setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E))
            textSize = 16f
        }, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        row.addView(TextView(this).apply {
            text = value
            setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
            textSize = 14f
        })
        card.addView(row)
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}
