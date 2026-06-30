package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public abstract class a {
    public static final java.lang.String a(java.lang.String str, int i17, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errMsg", str);
            jSONObject2.put("errCode", i17);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject2.toString();
    }
}
