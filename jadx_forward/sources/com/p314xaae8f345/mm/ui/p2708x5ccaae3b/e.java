package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f290264d;

    /* renamed from: e, reason: collision with root package name */
    public int f290265e;

    public e(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar, android.content.Context context) {
        super(context);
    }

    /* renamed from: getHeaderId */
    public int m80675x3960b9fe() {
        return this.f290264d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view = (android.view.View) getTag();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(generateDefaultLayoutParams());
        }
        if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f290265e, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), view.getMeasuredHeight());
    }

    /* renamed from: setHeaderId */
    public void m80676x34191b0a(int i17) {
        this.f290264d = i17;
    }

    /* renamed from: setHeaderWidth */
    public void m80677xb65aa577(int i17) {
        this.f290265e = i17;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }
}
