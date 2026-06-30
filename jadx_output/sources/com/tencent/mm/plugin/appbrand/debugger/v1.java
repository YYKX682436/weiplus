package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class v1 extends com.tencent.luggage.sdk.jsapi.component.service.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.appbrand.service.c0 service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        com.tencent.mm.plugin.appbrand.jsapi.l F = F();
        kotlin.jvm.internal.o.d(F);
        G(com.tencent.luggage.sdk.jsapi.component.service.z.class, new com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl((com.tencent.luggage.sdk.jsapi.component.service.y) F));
        gf.q0.f271165a = new com.tencent.mm.plugin.appbrand.debugger.u1();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.util.Map p() {
        com.tencent.mm.plugin.appbrand.jsapi.p0 p0Var = new com.tencent.mm.plugin.appbrand.jsapi.p0();
        p0Var.g();
        java.util.Map map = p0Var.f82482c;
        kotlin.jvm.internal.o.f(map, "getServiceApiPool(...)");
        return map;
    }
}
