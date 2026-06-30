package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class b0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f230826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 f230827e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f230827e = c16551xff789360;
        this.f230826d = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f230827e.f230735o = false;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f230826d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f230827e.f230735o = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f230826d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
