package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        super(0);
        this.f89771d = appBrandCircleProgressView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = this.f89771d;
        paint.setStrokeWidth(appBrandCircleProgressView.getCircleStrokeWidth());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(appBrandCircleProgressView.getCircleColor());
        return paint;
    }
}
