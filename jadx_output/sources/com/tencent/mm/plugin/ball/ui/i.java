package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.j f93299d;

    public i(com.tencent.mm.plugin.ball.ui.j jVar) {
        this.f93299d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f93299d.f93302a.m(131072);
    }
}
