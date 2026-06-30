package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class p7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.MarginLayoutParams f239408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f239409f;

    public p7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f239407d = c17147x9fa5370e;
        this.f239408e = marginLayoutParams;
        this.f239409f = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239407d;
        boolean c17 = com.p314xaae8f345.mm.ui.b4.c(c17147x9fa5370e.f239094d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f239409f;
        if (c17) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = this.f239408e;
            if (marginLayoutParams != null) {
                java.lang.Object animatedValue = anim.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.bottomMargin = ((java.lang.Integer) animatedValue).intValue();
            }
            java.lang.Object parent = z2Var.f293591g.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
        if (com.p314xaae8f345.mm.ui.w9.c(c17147x9fa5370e.f239094d) || com.p314xaae8f345.mm.ui.bk.g0() || com.p314xaae8f345.mm.ui.bk.f0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view2 = z2Var.f293591g;
        java.lang.Object animatedValue2 = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        view2.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue2).intValue());
    }
}
