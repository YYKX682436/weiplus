package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class z4 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f93267d;

    public z4(com.tencent.mm.plugin.ball.service.s4 s4Var, java.lang.Runnable runnable) {
        this.f93267d = runnable;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        a(animator);
        java.lang.Runnable runnable = this.f93267d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b(animator);
        java.lang.Runnable runnable = this.f93267d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
