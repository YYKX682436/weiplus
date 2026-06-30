package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        super(0);
        this.f89818d = appBrandCircleProgressView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = this.f89818d;
        paint.setStrokeWidth(appBrandCircleProgressView.getProgressWidth());
        paint.setColor(appBrandCircleProgressView.getProgressColor());
        return paint;
    }
}
