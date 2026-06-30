package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes5.dex */
public class d extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f92281d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f92282e;

    public d(android.content.Context context) {
        super(context);
        this.f92281d = new android.graphics.Rect();
        this.f92282e = new android.graphics.Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            android.view.View childAt = getChildAt(i28);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f92281d.set(i17, i18, i19, i27);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f92281d, layoutParams.x, layoutParams.y, this.f92282e);
            android.graphics.Rect rect = this.f92282e;
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
