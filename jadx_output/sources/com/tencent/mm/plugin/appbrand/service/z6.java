package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class z6 extends com.tencent.luggage.sdk.jsapi.component.service.y1 {
    @Override // com.tencent.luggage.sdk.jsapi.component.service.y1, com.tencent.mm.plugin.appbrand.jsapi.ag
    public void a(org.json.JSONObject config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.a(config);
        com.tencent.mm.plugin.appbrand.jsapi.bg bgVar = com.tencent.mm.plugin.appbrand.jsapi.cg.f80198a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        bgVar.a(jSONObject, "env", "WeChat");
        bgVar.a(config, "host", jSONObject);
    }
}
