package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.o8 f86925d;

    public n8(com.tencent.mm.plugin.appbrand.page.o8 o8Var) {
        this.f86925d = o8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f86925d.e((int) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
