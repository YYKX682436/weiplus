package com.tencent.mm.plugin.appbrand.jsapi.video.ui;

/* loaded from: classes5.dex */
public class AppBrandDotPercentIndicator extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.LayoutInflater f83653d;

    /* renamed from: e, reason: collision with root package name */
    public int f83654e;

    public AppBrandDotPercentIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83653d = android.view.LayoutInflater.from(context);
    }

    public void setDotsNum(int i17) {
        if (i17 <= 1) {
            i17 = 8;
        }
        this.f83654e = i17;
        removeAllViews();
        for (int i18 = 0; i18 < this.f83654e; i18++) {
            addView((android.widget.ImageView) this.f83653d.inflate(com.tencent.mm.R.layout.f488022en, (android.view.ViewGroup) this, false));
        }
    }

    public void setPercent(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int rint = (int) java.lang.Math.rint(f17 * this.f83654e);
        int i17 = 0;
        while (i17 < rint && i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.tencent.mm.R.drawable.f480781cf);
            i17++;
        }
        while (i17 < getChildCount()) {
            ((android.widget.ImageView) getChildAt(i17)).setImageResource(com.tencent.mm.R.drawable.f480780ce);
            i17++;
        }
    }

    public AppBrandDotPercentIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83653d = android.view.LayoutInflater.from(context);
    }
}
