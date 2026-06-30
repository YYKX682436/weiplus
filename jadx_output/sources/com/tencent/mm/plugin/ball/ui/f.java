package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.g f93289d;

    public f(com.tencent.mm.plugin.ball.ui.g gVar) {
        this.f93289d = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f93289d.f93292b.m(131072);
    }
}
