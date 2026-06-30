package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class m extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93312d;

    public m(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93312d = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f93312d.d();
    }
}
