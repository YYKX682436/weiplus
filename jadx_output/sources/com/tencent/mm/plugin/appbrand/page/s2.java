package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87074d;

    public s2(com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.Runnable runnable) {
        this.f87074d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        this.f87074d.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f87074d.run();
    }
}
