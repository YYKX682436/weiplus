package com.google.android.material.textfield;

/* loaded from: classes15.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.TextInputLayout f44621d;

    public f(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.f44621d = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f44621d.f44589z1.m(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
