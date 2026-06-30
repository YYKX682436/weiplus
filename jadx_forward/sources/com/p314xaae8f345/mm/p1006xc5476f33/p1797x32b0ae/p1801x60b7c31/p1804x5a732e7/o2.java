package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class o2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetBindPhoneState", "hasBind:" + c17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind", java.lang.Boolean.valueOf(c17));
        this.f224975e.e(hashMap);
    }
}
