package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class pr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217127e;

    public pr(android.view.View view, in5.s0 s0Var) {
        this.f217126d = view;
        this.f217127e = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f217126d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((java.lang.Integer) animatedValue).intValue();
        view.requestLayout();
        in5.s0 s0Var = this.f217127e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = s0Var.o();
        if (o17 == null || (mo7946xf939df19 = o17.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(s0Var.m8183xf806b362(), new jz5.l(47, null));
    }
}
