package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes3.dex */
public class d0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f86509d;

    public d0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, android.view.ViewGroup viewGroup) {
        this.f86509d = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f86509d.setBackgroundColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
