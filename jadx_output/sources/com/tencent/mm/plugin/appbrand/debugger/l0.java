package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class l0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "remoteDebugInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.e9 b17 = com.tencent.mm.plugin.appbrand.jsapi.gg.b((com.tencent.mm.plugin.appbrand.y) lVar);
        com.tencent.mm.plugin.appbrand.debugger.v0 v0Var = b17 instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.mm.plugin.appbrand.debugger.v0) ((com.tencent.luggage.sdk.jsapi.component.service.y) b17).z1(com.tencent.mm.plugin.appbrand.debugger.v0.class) : null;
        if (v0Var == null) {
            return o("fail:not debug");
        }
        v0Var.B(jSONObject.toString());
        return o("ok");
    }
}
