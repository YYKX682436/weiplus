package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator */
/* loaded from: classes5.dex */
public class C19228x9c70cf17 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f263240d;

    /* renamed from: e, reason: collision with root package name */
    public int f263241e;

    public C19228x9c70cf17(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263240d = android.view.LayoutInflater.from(context);
    }

    /* renamed from: setDotsNum */
    public void m74116x1f2fbc1a(int i17) {
        if (i17 <= 1) {
            i17 = 8;
        }
        this.f263241e = i17;
        removeAllViews();
        for (int i18 = 0; i18 < this.f263241e; i18++) {
            addView((android.widget.ImageView) this.f263240d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bd9, (android.view.ViewGroup) this, false));
        }
    }

    /* renamed from: setPercent */
    public void m74117x88c6ed83(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int rint = (int) java.lang.Math.rint(f17 * this.f263241e);
        int i17 = 0;
        while (i17 < rint && i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ae6);
            i17++;
        }
        while (i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563390ae5);
            i17++;
        }
    }

    public C19228x9c70cf17(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f263240d = android.view.LayoutInflater.from(context);
    }
}
