package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class MaxHeightRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public int f89496b2;

    public MaxHeightRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getMaxHeight() {
        return this.f89496b2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f89496b2;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    public void setMaxHeight(int i17) {
        this.f89496b2 = i17;
        invalidate();
        requestLayout();
    }

    public MaxHeightRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
