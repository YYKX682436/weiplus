package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6;

/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView */
/* loaded from: classes7.dex */
public final class C12501xc5d62fec extends android.view.View implements pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f168000d;

    /* renamed from: e, reason: collision with root package name */
    public int f168001e;

    public C12501xc5d62fec(android.content.Context context) {
        super(context);
        this.f168000d = -1;
        this.f168001e = -1;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (getVisibility() == 0) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(this.f168000d, 0), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(this.f168001e, 0), 1073741824));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    /* renamed from: setFixedHeight */
    public void m52133x9bf1b7f9(int i17) {
        int max = java.lang.Math.max(i17, 0);
        if (max != this.f168001e) {
            this.f168001e = max;
            if (max != getMeasuredHeight()) {
                requestLayout();
            }
        }
    }

    /* renamed from: setFixedWidth */
    public void m52134x81bbe4b4(int i17) {
        int max = java.lang.Math.max(i17, 0);
        if (max != this.f168000d) {
            this.f168000d = max;
            if (max != getMeasuredWidth()) {
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z17 = getLayoutParams() == null;
        super.setLayoutParams(layoutParams);
        if (z17) {
            this.f168000d = java.lang.Math.max(0, layoutParams.width);
            this.f168001e = java.lang.Math.max(0, layoutParams.height);
        }
    }

    public C12501xc5d62fec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f168000d = -1;
        this.f168001e = -1;
    }

    public C12501xc5d62fec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f168000d = -1;
        this.f168001e = -1;
    }

    public C12501xc5d62fec(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f168000d = -1;
        this.f168001e = -1;
    }
}
