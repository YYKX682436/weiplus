package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class v4 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.u4 f93260d;

    public v4(com.tencent.mm.plugin.ball.service.u4 u4Var) {
        this.f93260d = u4Var;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        a(animator);
        com.tencent.mm.plugin.ball.service.u4 u4Var = this.f93260d;
        gp1.v vVar = u4Var.f93257b.f93136h;
        if (vVar != null) {
            vVar.u0(true);
        }
        u4Var.f93257b.f93239n.q(true);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b(animator);
        com.tencent.mm.plugin.ball.service.u4 u4Var = this.f93260d;
        gp1.v vVar = u4Var.f93257b.f93136h;
        if (vVar != null) {
            vVar.u0(true);
        }
        u4Var.f93257b.f93239n.q(false);
    }
}
