package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f185933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f185934f;

    public qk(android.view.ViewGroup viewGroup, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f185932d = viewGroup;
        this.f185933e = h0Var;
        this.f185934f = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f185933e;
        this.f185932d.removeView((android.view.View) h0Var.f391656d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f185934f;
        ((android.widget.FrameLayout) h0Var2.f391656d).getLayoutParams().height = -2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        ((android.widget.FrameLayout) h0Var2.f391656d).addView((android.view.View) h0Var.f391656d, layoutParams);
    }
}
