package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class t5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282936e;

    public t5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, int i17) {
        this.f282936e = viewOnClickListenerC21748xb3d38e6b;
        this.f282935d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282936e;
        if (floatValue <= 0.1f) {
            viewOnClickListenerC21748xb3d38e6b.R2.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            viewOnClickListenerC21748xb3d38e6b.R2.setAlpha((1.0f - floatValue) * 10.0f);
        }
        viewOnClickListenerC21748xb3d38e6b.R2.setTranslationY(floatValue * (this.f282935d - r0.getHeight()));
    }
}
