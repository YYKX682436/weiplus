package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class r2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("src");
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            s75.d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q2(this, optString, optString2), java.lang.String.format(java.util.Locale.US, "JsApiGetImageInfo[%s]", optString), 10);
        } else {
            this.f224976f.a("invalid param");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetAccountInfo", "invalid param");
        }
    }
}
