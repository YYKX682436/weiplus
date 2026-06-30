package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class w extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z f256334d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar) {
        this.f256334d = zVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256334d;
        zVar.f256344n = false;
        zVar.T6();
        al4.b bVar = zVar.f256342i;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256334d;
        zVar.f256344n = false;
        zVar.T6();
        al4.b bVar = zVar.f256342i;
        if (bVar != null) {
            bVar.mo2271xbb3aa236();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256334d;
        zVar.f256344n = true;
        b66.g b17 = b66.i.f99700d.b(bw5.eq0.TingMusic);
        if (b17 != null) {
            ((b66.i) b17).e();
        }
        al4.b bVar = zVar.f256342i;
        if (bVar != null) {
            bVar.mo2272xd7e2f2fd();
        }
    }
}
