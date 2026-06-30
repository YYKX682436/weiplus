package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class c9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.GradientDrawable f86464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h9 f86465e;

    public c9(android.graphics.drawable.GradientDrawable gradientDrawable, com.tencent.mm.plugin.appbrand.page.h9 h9Var) {
        this.f86464d = gradientDrawable;
        this.f86465e = h9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float[] fArr = {floatValue, floatValue, floatValue, floatValue, 0.0f, 0.0f, 0.0f, 0.0f};
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f86464d;
        gradientDrawable.setCornerRadii(fArr);
        this.f86465e.f86680e.f352879e.setBackground(gradientDrawable);
    }
}
