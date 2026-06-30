package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
class f implements com.tencent.mm.ipcinvoker.j {
    private f() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDispatchLiteAppAction", "dispatchLiteAppAction data: %s", iPCString.f68406d);
            java.lang.String optString = jSONObject.optString("actionName");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            java.lang.String optString2 = optJSONObject.optString("type");
            java.lang.String str = "";
            if (optString2.equals(ya.b.SOURCE)) {
                str = jSONObject.optString("sourceAppId");
            } else if (optString2.equals("other")) {
                str = optJSONObject.optString("appId");
            }
            if (str.isEmpty()) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("{\"type\": \"error\"}"));
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Di(new com.tencent.mm.plugin.appbrand.jsapi.liteapp.e(this, ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, optString, optJSONObject2), rVar));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "json exception. error: %s", e17.toString());
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("{\"type\": \"error\"}"));
        }
    }
}
