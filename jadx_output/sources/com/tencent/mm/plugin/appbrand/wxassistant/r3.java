package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class r3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.w3 f92302d;

    public r3(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        this.f92302d = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = this.f92302d;
        android.view.WindowManager.LayoutParams layoutParams = w3Var.f92334h;
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((java.lang.Integer) animatedValue).intValue();
        w3Var.f92335i.updateViewLayout(w3Var, w3Var.f92334h);
    }
}
