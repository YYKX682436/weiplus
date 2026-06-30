package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class e5 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f93155d;

    public e5(com.tencent.mm.plugin.ball.service.d5 d5Var, android.view.View view) {
        this.f93155d = view;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a(animation);
        android.view.KeyEvent.Callback callback = this.f93155d;
        if (callback instanceof pv.f0) {
            ((com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView) ((pv.f0) callback)).a();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
        android.view.KeyEvent.Callback callback = this.f93155d;
        if (callback instanceof pv.f0) {
            ((com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView) ((pv.f0) callback)).a();
        }
    }
}
