package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class s2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetLiteAppPackageInfo", "Invoke getLiteAppPackageInfo");
        java.lang.String optString = jSONObject.optString("appId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("invalid appId");
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Cj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Cj(optString);
        if (Cj == null) {
            this.f224976f.a("cannot find app");
            return;
        }
        java.lang.String Ej = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ej(Cj.f14369x346425, optString, Cj.f14372xa8503287);
        java.lang.String m65339x5d154995 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65339x5d154995(Cj.f14369x346425, Cj.f14359x58b7f1c, Cj.f14372xa8503287);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("appId", optString);
            jSONObject2.put("patchId", Cj.f14368xd0d13783);
            jSONObject2.put("type", Cj.f14373x368f3a);
            jSONObject2.put(dm.i4.f66874x4c6b1f55, Cj.f14374xee5c7336);
            jSONObject2.put("version", Ej);
            jSONObject2.put("versionType", m65339x5d154995);
        } catch (org.json.JSONException unused) {
        }
        this.f224976f.c(jSONObject2, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
