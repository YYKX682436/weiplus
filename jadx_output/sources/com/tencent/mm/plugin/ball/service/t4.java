package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class t4 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s4 f93254d;

    public t4(com.tencent.mm.plugin.ball.service.s4 s4Var) {
        this.f93254d = s4Var;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        a(animator);
        this.f93254d.f93239n.q(true);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b(animator);
        this.f93254d.f93239n.q(false);
    }
}
