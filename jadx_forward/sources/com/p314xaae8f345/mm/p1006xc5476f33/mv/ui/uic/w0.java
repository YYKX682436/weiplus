package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w0 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 f233042d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var) {
        this.f233042d = y0Var;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var = this.f233042d;
        y0Var.f233075e = false;
        y0Var.m158354x19263085().finish();
        y0Var.m158354x19263085().overridePendingTransition(0, 0);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var = this.f233042d;
        y0Var.f233075e = false;
        y0Var.m158354x19263085().finish();
        y0Var.m158354x19263085().overridePendingTransition(0, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f233042d.f233075e = true;
    }
}
