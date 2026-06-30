package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes15.dex */
public final class l1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.lang.Object obj, com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        super(obj);
        this.f89841b = appBrandCircleProgressView;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Paint circlePaint;
        kotlin.jvm.internal.o.g(property, "property");
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj).intValue();
        circlePaint = this.f89841b.getCirclePaint();
        circlePaint.setColor(intValue);
    }
}
