package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class y4 extends qn5.a {
    public y4(com.tencent.mm.plugin.ball.service.s4 s4Var) {
    }

    @Override // qn5.a
    public void a(android.animation.Animator animator) {
        super.a(animator);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
    }
}
