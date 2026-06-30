package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232825d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        this.f232825d = z5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) ((jz5.n) this.f232825d.f233103f).mo141623x754a37bb()).setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) ((jz5.n) this.f232825d.f233103f).mo141623x754a37bb()).setAlpha(0.0f);
    }
}
