package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class g7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        try {
            java.lang.String string = jSONObject.has("url") ? jSONObject.getString("url") : null;
            if (string == null) {
                string = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
            }
            if (string != null && !string.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().v(string);
                if (v17 == null) {
                    this.f224976f.a("auth info is not existed");
                    return;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(v17.f37406x8de74e8a);
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                java.util.HashMap hashMap = new java.util.HashMap();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(v17.f37409x63953734);
                java.util.Iterator<java.lang.String> keys2 = jSONObject3.keys();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    hashMap2.put(next2, jSONObject3.getString(next2));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65459xcbec40f8(str, v17.f37408x29a0f908, hashMap, hashMap2, z17);
                jSONObject3.put(dm.i4.f66874x4c6b1f55, v17.f37410xa783a79b);
                this.f224976f.c(jSONObject3, false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiSession", "get authurl fail");
            this.f224976f.a("get authUrl fail, please make sure config authUrl in config file");
        } catch (java.lang.Exception unused) {
            this.f224976f.a("exception");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 0;
    }
}
