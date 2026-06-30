package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes4.dex */
public final class m implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f255595d;

    public m(int i17) {
        this.f255595d = i17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fm6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        int i28 = fm6.descent;
        int i29 = i28 - fm6.ascent;
        if (i29 <= 0) {
            return;
        }
        int i37 = this.f255595d;
        int round = java.lang.Math.round(i28 * ((i37 * 1.0f) / i29));
        fm6.descent = round;
        fm6.ascent = round - i37;
    }
}
