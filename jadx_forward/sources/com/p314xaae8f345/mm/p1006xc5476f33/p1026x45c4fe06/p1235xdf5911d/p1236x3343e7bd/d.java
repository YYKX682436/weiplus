package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* loaded from: classes5.dex */
public class d extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f173814d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f173815e;

    public d(android.content.Context context) {
        super(context);
        this.f173814d = new android.graphics.Rect();
        this.f173815e = new android.graphics.Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            android.view.View childAt = getChildAt(i28);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f173814d.set(i17, i18, i19, i27);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f173814d, layoutParams.x, layoutParams.y, this.f173815e);
            android.graphics.Rect rect = this.f173815e;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            getChildAt(i19).measure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i17), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i18), Integer.MIN_VALUE));
        }
        super.onMeasure(i17, i18);
    }
}
