package com.p314xaae8f345.mm.p1006xc5476f33.p1409x9e7e39d6.ui;

/* renamed from: com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout */
/* loaded from: classes14.dex */
public class C13539x6248de2f extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public double f181746d;

    public C13539x6248de2f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181746d = 1.3333333333333333d;
    }

    /* renamed from: getmAspectRatio */
    public double m55298x424d923c() {
        return this.f181746d;
    }

    /* renamed from: setAspectRatio */
    public void m55299xb154fcd1(double d17) {
        if (d17 <= 0.0d) {
            throw new java.lang.IllegalArgumentException();
        }
        if (this.f181746d != d17) {
            this.f181746d = d17;
            requestLayout();
        }
    }
}
