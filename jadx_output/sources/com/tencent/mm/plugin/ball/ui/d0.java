package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes3.dex */
public class d0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.v f93284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.n2 f93285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mp1.b f93286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dp1.x f93287g;

    public d0(gp1.v vVar, rp1.n2 n2Var, mp1.b bVar, dp1.x xVar) {
        this.f93284d = vVar;
        this.f93285e = n2Var;
        this.f93286f = bVar;
        this.f93287g = xVar;
    }

    public final void a() {
        gp1.v vVar = this.f93284d;
        vVar.j0(false);
        vVar.W(1.0f);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.b0(this));
        this.f93286f.onAnimationEnd();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.ball.ui.c0(this), 300L);
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
        gp1.v vVar = this.f93284d;
        vVar.j0(true);
        vVar.q(true);
        vVar.W(0.0f);
    }
}
