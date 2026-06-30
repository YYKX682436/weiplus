package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class cj implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f287825d;

    public cj(com.p314xaae8f345.mm.ui.dj djVar, android.widget.ImageView imageView) {
        this.f287825d = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f287825d.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
