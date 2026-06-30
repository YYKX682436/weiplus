package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f91745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView f91746h;

    public k(com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView, int i17, int i18, int i19, int i27) {
        this.f91746h = appBrandPipContainerView;
        this.f91742d = i17;
        this.f91743e = i18;
        this.f91744f = i19;
        this.f91745g = i27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = this.f91742d;
        int i18 = i17 + ((int) (((this.f91743e * 1.0f) - i17) * floatValue));
        int i19 = this.f91744f;
        int i27 = i19 + ((int) (((this.f91745g * 1.0f) - i19) * floatValue));
        float f17 = i18;
        float f18 = i27;
        int i28 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.K;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f91746h;
        float x17 = appBrandPipContainerView.getX();
        float x18 = appBrandPipContainerView.getX();
        if (x17 == f17 && x18 == f18) {
            return;
        }
        appBrandPipContainerView.setX(f17);
        appBrandPipContainerView.setY(f18);
    }
}
