package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 92;
    public static final java.lang.String NAME = "enableAccelerometer";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var = new com.tencent.mm.plugin.appbrand.jsapi.sensor.m0(NAME);
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 a17 = m0Var.a(lVar, jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.sensor.b(this, lVar, m0Var), "JsApi#SensorAccelerometer" + lVar.hashCode(), new java.util.ArrayList(java.util.Arrays.asList(1)));
        lVar.a(i17, p(a17.f81320b, a17.f81319a));
    }
}
