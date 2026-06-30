package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class c9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.GradientDrawable f167997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 f167998e;

    public c9(android.graphics.drawable.GradientDrawable gradientDrawable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var) {
        this.f167997d = gradientDrawable;
        this.f167998e = h9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float[] fArr = {floatValue, floatValue, floatValue, floatValue, 0.0f, 0.0f, 0.0f, 0.0f};
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f167997d;
        gradientDrawable.setCornerRadii(fArr);
        this.f167998e.f168213e.f434412e.setBackground(gradientDrawable);
    }
}
