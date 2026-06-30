package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView f91751f;

    public l(com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView, int i17, int i18) {
        this.f91751f = appBrandPipContainerView;
        this.f91749d = i17;
        this.f91750e = i18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f91751f;
        appBrandPipContainerView.s(appBrandPipContainerView.getY(), true);
        appBrandPipContainerView.f90997r = this.f91749d;
        appBrandPipContainerView.f90998s = this.f91750e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "startStickyAnimation, mStablePosX: " + appBrandPipContainerView.f90997r + ", mStablePosY: " + appBrandPipContainerView.f90998s);
        appBrandPipContainerView.d(appBrandPipContainerView.f90997r, appBrandPipContainerView.f90998s);
    }
}
