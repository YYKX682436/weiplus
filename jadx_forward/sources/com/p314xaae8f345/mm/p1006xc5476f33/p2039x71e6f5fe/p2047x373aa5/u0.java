package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class u0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 f241532d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 c17347xc7989089) {
        this.f241532d = c17347xc7989089;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f241532d.f241444e.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 c17347xc7989089 = this.f241532d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17347xc7989089.f241444e.getLayoutParams();
        layoutParams.topMargin = c17347xc7989089.f241445f.m68905xfb84c25a().top;
        c17347xc7989089.f241444e.setLayoutParams(layoutParams);
        c17347xc7989089.f241444e.setVisibility(0);
    }
}
