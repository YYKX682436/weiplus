package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class kc extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f165608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f165609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f165610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc f165612h;

    public kc(android.animation.ObjectAnimator objectAnimator, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc mcVar) {
        this.f165608d = objectAnimator;
        this.f165609e = n7Var;
        this.f165610f = i17;
        this.f165611g = i18;
        this.f165612h = mcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        pm0.v.V(300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.jc(this.f165608d, this.f165609e, this.f165610f, this.f165611g, this.f165612h));
    }
}
