package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93276d;

    public a(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93276d = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f93276d.g();
    }
}
