package com.tencent.mm.plugin.appbrand.page.capsulebar;

/* loaded from: classes7.dex */
public final class AppBrandCapsuleBarPlaceHolderView extends android.view.View implements pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f86467d;

    /* renamed from: e, reason: collision with root package name */
    public int f86468e;

    public AppBrandCapsuleBarPlaceHolderView(android.content.Context context) {
        super(context);
        this.f86467d = -1;
        this.f86468e = -1;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (getVisibility() == 0) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(this.f86467d, 0), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(this.f86468e, 0), 1073741824));
        } else {
            super.onMeasure(i17, i18);
        }
    }

    public void setFixedHeight(int i17) {
        int max = java.lang.Math.max(i17, 0);
        if (max != this.f86468e) {
            this.f86468e = max;
            if (max != getMeasuredHeight()) {
                requestLayout();
            }
        }
    }

    public void setFixedWidth(int i17) {
        int max = java.lang.Math.max(i17, 0);
        if (max != this.f86467d) {
            this.f86467d = max;
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
            this.f86467d = java.lang.Math.max(0, layoutParams.width);
            this.f86468e = java.lang.Math.max(0, layoutParams.height);
        }
    }

    public AppBrandCapsuleBarPlaceHolderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86467d = -1;
        this.f86468e = -1;
    }

    public AppBrandCapsuleBarPlaceHolderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f86467d = -1;
        this.f86468e = -1;
    }

    public AppBrandCapsuleBarPlaceHolderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f86467d = -1;
        this.f86468e = -1;
    }
}
