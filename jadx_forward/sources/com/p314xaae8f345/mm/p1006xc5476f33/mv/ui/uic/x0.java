package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x0 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 f233054d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var) {
        this.f233054d = y0Var;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var = this.f233054d;
        y0Var.f233074d = false;
        y0Var.O6();
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var = this.f233054d;
        y0Var.f233074d = false;
        y0Var.O6();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0 y0Var = this.f233054d;
        y0Var.f233074d = true;
        gp1.r P6 = y0Var.P6();
        if (P6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) P6).W(true);
        }
    }
}
