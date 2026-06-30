package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class re implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 f185997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186000h;

    public re(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379, android.view.View view, android.view.ViewGroup viewGroup, android.view.View view2) {
        this.f185996d = s0Var;
        this.f185997e = abstractC15229x2dc379;
        this.f185998f = view;
        this.f185999g = viewGroup;
        this.f186000h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        android.view.ViewGroup viewGroup = this.f185999g;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                view = this.f186000h;
                break;
            }
            view = viewGroup.getChildAt(i17);
            if (view.getVisibility() == 0) {
                if (!(view.getAlpha() == 0.0f)) {
                    break;
                }
            }
            i17++;
        }
        int[] iArr = new int[2];
        this.f185996d.f3639x46306858.getLocationInWindow(iArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = this.f185997e;
        abstractC15229x2dc379.getLocationInWindow(r3);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        view.getLocationInWindow(r0);
        int[] iArr3 = {iArr3[0] - iArr[0], iArr3[1] - iArr[1]};
        android.view.View view2 = this.f185998f;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int i18 = layoutParams2.topMargin;
        int height = iArr2[1] + abstractC15229x2dc379.getHeight() + view2.getHeight();
        int i19 = iArr3[1];
        if (height >= i19) {
            layoutParams2.topMargin = i19 - view2.getHeight();
        } else {
            layoutParams2.topMargin = iArr2[1] + abstractC15229x2dc379.getHeight();
        }
        if (layoutParams2.topMargin != i18) {
            view2.requestLayout();
        }
    }
}
