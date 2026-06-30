package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class z4 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f174800d;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var, java.lang.Runnable runnable) {
        this.f174800d = runnable;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        a(animator);
        java.lang.Runnable runnable = this.f174800d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b(animator);
        java.lang.Runnable runnable = this.f174800d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
