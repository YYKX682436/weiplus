package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes3.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f80700d;

    public m(com.tencent.mm.plugin.appbrand.jsapi.coverview.n nVar, android.view.View view) {
        this.f80700d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        android.view.View view = this.f80700d;
        view.getLayoutParams().height = num.intValue();
        view.requestLayout();
    }
}
