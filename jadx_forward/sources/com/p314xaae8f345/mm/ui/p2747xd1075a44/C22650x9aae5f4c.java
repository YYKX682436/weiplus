package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/widget/TextVerticalAlignSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.TextVerticalAlignSpan */
/* loaded from: classes5.dex */
public final class C22650x9aae5f4c extends android.text.style.AbsoluteSizeSpan {
    public final void a(android.text.TextPaint textPaint, boolean z17) {
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        if (fontMetrics != null) {
            float f17 = fontMetrics.descent - fontMetrics.ascent;
            if (z17) {
                super.updateMeasureState(textPaint);
            } else {
                super.updateDrawState(textPaint);
            }
            textPaint.setColor(0);
            android.graphics.Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (fontMetrics2 != null) {
                textPaint.baselineShift = (int) ((((fontMetrics2.descent - fontMetrics2.ascent) - f17) / 2) / 0.0f);
            }
        }
    }

    @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        a(ds6, false);
    }

    @Override // android.text.style.AbsoluteSizeSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        a(ds6, true);
    }
}
