package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93129d;

    public c0(com.tencent.mm.plugin.ball.service.s sVar) {
        this.f93129d = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f93129d.k(null, 1.0f);
    }
}
