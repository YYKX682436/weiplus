package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class v0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 f241534d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 c17347xc7989089) {
        this.f241534d = c17347xc7989089;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 c17347xc7989089 = this.f241534d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17347xc7989089.f241444e.getLayoutParams();
        layoutParams.topMargin = c17347xc7989089.f241445f.m68905xfb84c25a().top + ((int) ((c17347xc7989089.f241448i - c17347xc7989089.f241444e.getHeight()) * floatValue));
        c17347xc7989089.f241444e.setLayoutParams(layoutParams);
        float f17 = c17347xc7989089.f241449m;
        if (floatValue <= f17) {
            c17347xc7989089.f241444e.setAlpha(1.0f - ((f17 - floatValue) / f17));
        } else if (floatValue < 1.0f - f17) {
            c17347xc7989089.f241444e.setAlpha(1.0f);
        } else {
            c17347xc7989089.f241444e.setAlpha(1.0f - ((floatValue - (1.0f - f17)) / f17));
        }
    }
}
