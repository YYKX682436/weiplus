package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public final class q3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241149d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65) {
        this.f241149d = activityC17308x95e1b65;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65 = this.f241149d;
        if (floatValue <= 0.1f) {
            android.widget.ImageView imageView = activityC17308x95e1b65.f240912i;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                throw null;
            }
            imageView.setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            android.widget.ImageView imageView2 = activityC17308x95e1b65.f240912i;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                throw null;
            }
            imageView2.setAlpha((1.0f - floatValue) * 10);
        }
        android.widget.ImageView imageView3 = activityC17308x95e1b65.f240912i;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
        int i17 = activityC17308x95e1b65.f240923w;
        if (imageView3 != null) {
            imageView3.setTranslationY(floatValue * (i17 - imageView3.getHeight()));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
    }
}
