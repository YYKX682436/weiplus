package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.service.c0 implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x {
    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String data) {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d dVar = getRuntime().f85669p3;
        dVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w wVar = dVar.f85578b;
        if (wVar != null) {
            wVar.c(this, i17, data);
        } else {
            kotlin.jvm.internal.o.o("invokeProcess");
            throw null;
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public final boolean h1() {
        return false;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsruntime.t i0() {
        return new com.tencent.mm.plugin.appbrand.jsruntime.g();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public void i1() {
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    public com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t getRuntime() {
        return (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) super.t3();
    }
}
