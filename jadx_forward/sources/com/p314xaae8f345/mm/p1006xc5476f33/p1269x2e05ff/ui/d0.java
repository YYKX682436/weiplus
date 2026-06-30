package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes3.dex */
public class d0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.v f174817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.n2 f174818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mp1.b f174819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dp1.x f174820g;

    public d0(gp1.v vVar, rp1.n2 n2Var, mp1.b bVar, dp1.x xVar) {
        this.f174817d = vVar;
        this.f174818e = n2Var;
        this.f174819f = bVar;
        this.f174820g = xVar;
    }

    public final void a() {
        gp1.v vVar = this.f174817d;
        vVar.j0(false);
        vVar.W(1.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.b0(this));
        this.f174819f.mo50325xbb3aa236();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.c0(this), 300L);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        gp1.v vVar = this.f174817d;
        vVar.j0(true);
        vVar.q(true);
        vVar.W(0.0f);
    }
}
