package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class p1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.Object obj, com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        super(obj);
        this.f89914b = appBrandCircleProgressView;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Paint dotPaint;
        kotlin.jvm.internal.o.g(property, "property");
        float floatValue = ((java.lang.Number) obj2).floatValue();
        ((java.lang.Number) obj).floatValue();
        dotPaint = this.f89914b.getDotPaint();
        dotPaint.setStrokeWidth(floatValue);
    }
}
