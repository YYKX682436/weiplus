package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class r extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al4.b f256320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z f256321e;

    public r(al4.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar) {
        this.f256320d = bVar;
        this.f256321e = zVar;
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256321e;
        zVar.f256345o = false;
        al4.b bVar = this.f256320d;
        if (bVar != null) {
            bVar.a();
        }
        al4.b bVar2 = zVar.f256343m;
        if (bVar2 != null) {
            bVar2.a();
        }
        zVar.U6();
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256321e;
        zVar.f256345o = false;
        al4.b bVar = this.f256320d;
        if (bVar != null) {
            bVar.mo2271xbb3aa236();
        }
        al4.b bVar2 = zVar.f256343m;
        if (bVar2 != null) {
            bVar2.mo2271xbb3aa236();
        }
        zVar.U6();
        zVar.R6(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        al4.b bVar = this.f256320d;
        if (bVar != null) {
            bVar.mo2272xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.z zVar = this.f256321e;
        al4.b bVar2 = zVar.f256343m;
        if (bVar2 != null) {
            bVar2.mo2272xd7e2f2fd();
        }
        zVar.f256345o = true;
    }
}
