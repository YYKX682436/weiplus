package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class k9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f216469f;

    public k9(in5.s0 s0Var, android.view.View view, android.view.View view2) {
        this.f216467d = s0Var;
        this.f216468e = view;
        this.f216469f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.f216467d.f3639x46306858.getLocationInWindow(iArr);
        android.view.View view = this.f216468e;
        view.getLocationInWindow(r2);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.view.View view2 = this.f216469f;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin + (view.getHeight() / 2);
        view2.requestLayout();
    }
}
