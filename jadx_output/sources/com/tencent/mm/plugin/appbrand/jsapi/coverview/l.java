package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes3.dex */
public class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f80699d;

    public l(com.tencent.mm.plugin.appbrand.jsapi.coverview.n nVar, android.view.View view) {
        this.f80699d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        android.view.View view = this.f80699d;
        view.getLayoutParams().width = num.intValue();
        view.requestLayout();
    }
}
