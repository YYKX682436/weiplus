package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan */
/* loaded from: classes9.dex */
public class C19157x23598017 extends android.text.style.TextAppearanceSpan {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Typeface f262380d;

    /* renamed from: e, reason: collision with root package name */
    public int f262381e;

    public C19157x23598017(java.lang.String str, int i17, int i18, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        super(str, i17, i18, colorStateList, colorStateList2);
        this.f262380d = android.graphics.Typeface.DEFAULT;
        this.f262381e = 0;
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        int i17 = this.f262381e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        } else if (i17 != 3) {
            this.f262381e = 0;
        } else {
            this.f262381e = 1;
        }
        textPaint.setTypeface(android.graphics.Typeface.create(this.f262380d, this.f262381e));
    }
}
