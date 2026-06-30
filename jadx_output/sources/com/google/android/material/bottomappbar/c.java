package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44375d;

    public c(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44375d = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f44375d.f44364p1 = null;
    }
}
