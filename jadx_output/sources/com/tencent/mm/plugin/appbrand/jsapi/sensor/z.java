package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class z extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 488;
    public static final java.lang.String NAME = "enableGyroscope";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var = new com.tencent.mm.plugin.appbrand.jsapi.sensor.m0(NAME);
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 a17 = m0Var.a(lVar, jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.sensor.v(this, lVar, lVar, m0Var), "JsApi#SensorGyroscope" + lVar.hashCode(), new java.util.ArrayList(java.util.Arrays.asList(4)));
        lVar.a(i17, p(a17.f81320b, a17.f81319a));
    }
}
