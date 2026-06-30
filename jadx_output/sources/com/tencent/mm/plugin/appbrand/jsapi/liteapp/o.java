package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class o implements ft.p4 {
    public o(com.tencent.mm.plugin.appbrand.jsapi.liteapp.s sVar) {
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject2.getString("type");
            if (string.equals("liteapp")) {
                java.lang.String optString = jSONObject2.optString(dm.i4.COL_ID);
                java.lang.String[] split = optString.split("_");
                if (split.length == 2) {
                    long parseLong = java.lang.Long.parseLong(split[0]);
                    long parseLong2 = java.lang.Long.parseLong(split[1]);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("type", "waapp");
                    jSONObject3.put(dm.i4.COL_ID, str);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(ya.b.SOURCE, jSONObject3);
                    jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(parseLong, parseLong2, "app.postmessage", jSONObject4);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenLiteApp", "source id error. sourceId: %s", optString);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenLiteApp", "target type error. type: %s", string);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenLiteApp", "json exception: %s, data: %s", e17.toString(), str2);
        }
    }
}
