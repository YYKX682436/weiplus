package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public class i4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 f241098d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22) {
        this.f241098d = activityC17318xa8131d22;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22 = this.f241098d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = activityC17318xa8131d22.f241011q;
        if (c21524xecd57b9a != null) {
            float f17 = 1.0f - floatValue;
            c21524xecd57b9a.setTranslationX(activityC17318xa8131d22.f241019y * f17);
            activityC17318xa8131d22.f241011q.setTranslationY(activityC17318xa8131d22.f241020z * f17);
            activityC17318xa8131d22.f241011q.setScaleX((activityC17318xa8131d22.f241017w * f17) + floatValue);
            activityC17318xa8131d22.f241011q.setScaleY((f17 * activityC17318xa8131d22.f241018x) + floatValue);
        }
    }
}
