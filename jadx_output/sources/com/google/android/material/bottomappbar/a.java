package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44373d;

    public a(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44373d = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f44373d.f44362l1 = null;
    }
}
