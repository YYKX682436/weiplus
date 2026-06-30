package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class a5 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn5.a f93124d;

    public a5(com.tencent.mm.plugin.ball.service.s4 s4Var, qn5.a aVar) {
        this.f93124d = aVar;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a(animation);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationCancel(animation);
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        super.onAnimationPause(animator);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationPause(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        super.onAnimationResume(animator);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationResume(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        qn5.a aVar = this.f93124d;
        if (aVar != null) {
            aVar.onAnimationStart(animator);
        }
    }
}
