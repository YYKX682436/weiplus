package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class n2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || "CN".equalsIgnoreCase(str2));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isRegInChina", valueOf);
        this.f224976f.c(new org.json.JSONObject(hashMap), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
