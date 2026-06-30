package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "sdk_navigateToMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g E(com.tencent.mm.plugin.appbrand.y service, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = service.t3();
        kotlin.jvm.internal.o.e(t37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalRuntime");
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) t37).f85670q3 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.n(service, i17, this);
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.o(data, service, i17, this);
    }
}
