package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class j3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289306e;

    public j3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226, android.view.View view) {
        this.f289306e = viewOnTouchListenerC22366xcd5c2226;
        this.f289305d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289306e;
        this.f289305d.getGlobalVisibleRect(viewOnTouchListenerC22366xcd5c2226.K);
        viewOnTouchListenerC22366xcd5c2226.L.setAlpha((int) (((java.lang.Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        viewOnTouchListenerC22366xcd5c2226.postInvalidate();
    }
}
