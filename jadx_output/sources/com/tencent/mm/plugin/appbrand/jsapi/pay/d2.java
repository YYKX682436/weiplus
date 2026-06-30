package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class d2 extends com.tencent.mm.plugin.appbrand.jsapi.pay.y1 {
    public static final int CTRL_INDEX = 1252;
    public static final java.lang.String NAME = "requestScanPOSPay";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.y1, com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f81014c;
        this.f81338e = false;
        if (jSONObject != null) {
            try {
                jSONObject.put("pay_scene", 84);
            } catch (org.json.JSONException e17) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiRequestScanPOSPay", e17, "", new java.lang.Object[0]);
            }
        }
        D(ffVar, 84);
    }
}
