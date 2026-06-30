package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        super(0);
        this.f89748d = appBrandCircleProgressView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(-1.5707964f, 4.712389f);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(this.f89748d.getAnimDuration());
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        return ofFloat;
    }
}
