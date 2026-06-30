package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class r8 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f217309d;

    public r8(v65.n nVar) {
        this.f217309d = nVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f217309d.a(java.lang.Boolean.FALSE);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f217309d.a(java.lang.Boolean.TRUE);
    }
}
