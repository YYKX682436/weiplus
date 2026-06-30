package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 491;
    public static final java.lang.String NAME = "enableDeviceMotionChangeListening";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var = new com.tencent.mm.plugin.appbrand.jsapi.sensor.m0(NAME);
        com.tencent.mm.plugin.appbrand.jsapi.sensor.m mVar = new com.tencent.mm.plugin.appbrand.jsapi.sensor.m(this, lVar, lVar, m0Var);
        if (com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.n6()) {
            com.tencent.mm.plugin.appbrand.jsapi.file.b0 a17 = m0Var.a(lVar, jSONObject, mVar, "JsApi#SensorDeviceMotion" + lVar.hashCode(), new java.util.ArrayList(java.util.Arrays.asList(11)));
            lVar.a(i17, p(a17.f81320b, a17.f81319a));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 a18 = m0Var.a(lVar, jSONObject, mVar, "JsApi#SensorDeviceMotion" + lVar.hashCode(), new java.util.ArrayList(java.util.Arrays.asList(3)));
        lVar.a(i17, p(a18.f81320b, a18.f81319a));
    }
}
