package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44383d;

    public g(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44383d = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = this.f44383d;
        com.google.android.material.bottomappbar.BottomAppBar.r(bottomAppBar, bottomAppBar.f44369z1);
        bottomAppBar.w(bottomAppBar.f44366x1, bottomAppBar.f44369z1);
    }
}
