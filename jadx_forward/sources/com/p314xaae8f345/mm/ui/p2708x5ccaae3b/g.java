package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f290268d;

    /* renamed from: e, reason: collision with root package name */
    public int f290269e;

    /* renamed from: f, reason: collision with root package name */
    public int f290270f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View[] f290271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h f290272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar, android.content.Context context) {
        super(context);
        this.f290272h = hVar;
    }

    @Override // android.view.View
    public java.lang.Object getTag() {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag();
    }

    /* renamed from: getView */
    public android.view.View m80678xfb86a31b() {
        return getChildAt(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int i19 = this.f290269e;
        if (i19 == 1 || this.f290272h.f290280m == null) {
            return;
        }
        int i27 = this.f290270f % i19;
        if (i27 == 0 && !this.f290268d) {
            this.f290268d = true;
            for (android.view.View view : this.f290271g) {
                view.measure(i17, i18);
            }
            this.f290268d = false;
        }
        int measuredHeight = getMeasuredHeight();
        int i28 = measuredHeight;
        for (android.view.View view2 : this.f290271g) {
            if (view2 != null) {
                i28 = java.lang.Math.max(i28, view2.getMeasuredHeight());
            }
        }
        if (i28 == measuredHeight) {
            return;
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
    }

    /* renamed from: setNumColumns */
    public void m80679xadeea779(int i17) {
        this.f290269e = i17;
    }

    /* renamed from: setPosition */
    public void m80680xa32537ab(int i17) {
        this.f290270f = i17;
    }

    /* renamed from: setRowSiblings */
    public void m80681xa3891029(android.view.View[] viewArr) {
        this.f290271g = viewArr;
    }

    @Override // android.view.View
    public void setTag(int i17, java.lang.Object obj) {
        getChildAt(0).setTag(i17, obj);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.View
    public void setTag(java.lang.Object obj) {
        getChildAt(0).setTag(obj);
    }

    @Override // android.view.View
    public java.lang.Object getTag(int i17) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag(i17);
    }
}
