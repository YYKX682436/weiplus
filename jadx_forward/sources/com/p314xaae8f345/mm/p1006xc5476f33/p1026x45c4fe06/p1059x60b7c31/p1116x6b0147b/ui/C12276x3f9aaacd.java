package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator */
/* loaded from: classes5.dex */
public class C12276x3f9aaacd extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f165186d;

    /* renamed from: e, reason: collision with root package name */
    public int f165187e;

    public C12276x3f9aaacd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165186d = android.view.LayoutInflater.from(context);
    }

    /* renamed from: setDotsNum */
    public void m51445x1f2fbc1a(int i17) {
        if (i17 <= 1) {
            i17 = 8;
        }
        this.f165187e = i17;
        removeAllViews();
        for (int i18 = 0; i18 < this.f165187e; i18++) {
            addView((android.widget.ImageView) this.f165186d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569555en, (android.view.ViewGroup) this, false));
        }
    }

    /* renamed from: setPercent */
    public void m51446x88c6ed83(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int rint = (int) java.lang.Math.rint(f17 * this.f165187e);
        int i17 = 0;
        while (i17 < rint && i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562314cf);
            i17++;
        }
        while (i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562313ce);
            i17++;
        }
    }

    public C12276x3f9aaacd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165186d = android.view.LayoutInflater.from(context);
    }
}
