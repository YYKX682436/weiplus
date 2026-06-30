package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86831d;

    public k6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f86831d = v5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f86831d.f87165x0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f86831d.f87165x0.remove(animator);
    }
}
