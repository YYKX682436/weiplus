package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class n0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93191e;

    public n0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93191e = sVar;
        this.f93190d = ballInfo;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f93191e.f93225k) {
            return;
        }
        this.f93191e.k(this.f93190d, 1.0f);
    }
}
