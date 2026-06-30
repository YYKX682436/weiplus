package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.d f93281e;

    public c(com.tencent.mm.plugin.ball.ui.d dVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93281e = dVar;
        this.f93280d = ballInfo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f93281e.f93283a.f93317b.h0(this.f93280d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f93281e.f93283a.f93317b.h0(this.f93280d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        com.tencent.mm.plugin.ball.ui.d dVar = this.f93281e;
        dVar.f93283a.f93318c.l0(false, null);
        dVar.f93283a.l(true);
    }
}
