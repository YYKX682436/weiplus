package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44381d;

    public e(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44381d = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f44381d.f44367y0 = null;
    }
}
