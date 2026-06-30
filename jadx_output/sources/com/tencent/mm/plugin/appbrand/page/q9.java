package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87039d;

    public q9(com.tencent.mm.plugin.appbrand.page.w9 w9Var) {
        this.f87039d = w9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f87039d.getView().setScrollY(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
