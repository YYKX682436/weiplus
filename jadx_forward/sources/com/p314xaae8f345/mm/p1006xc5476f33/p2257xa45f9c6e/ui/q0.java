package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f254219d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 f254222g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3, int i17, android.view.View view) {
        this.f254222g = viewOnTouchListenerC18555xc58183f3;
        this.f254220e = i17;
        this.f254221f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        if (num.intValue() / this.f254220e >= 0.87d && !this.f254219d) {
            this.f254219d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = this.f254222g;
            viewOnTouchListenerC18555xc58183f3.f254031e.s1();
            viewOnTouchListenerC18555xc58183f3.B = false;
        }
        android.view.View view = this.f254221f;
        view.getLayoutParams().width = num.intValue();
        view.requestLayout();
    }
}
