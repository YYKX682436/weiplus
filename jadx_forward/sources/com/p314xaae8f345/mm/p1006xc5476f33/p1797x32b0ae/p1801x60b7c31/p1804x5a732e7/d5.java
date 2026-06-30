package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class d5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        android.os.Bundle mo28566xf04ce124 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f224975e.f380557a).mo28566xf04ce124();
        int intValue = mo28566xf04ce124.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984) != null ? ((java.lang.Integer) mo28566xf04ce124.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)).intValue() : 0;
        int intValue2 = mo28566xf04ce124.get("lastGetA8KeyRequestId") != null ? ((java.lang.Integer) mo28566xf04ce124.get("lastGetA8KeyRequestId")).intValue() : 0;
        hashMap.put("currentRequestId", java.lang.Integer.valueOf(intValue));
        hashMap.put("lastRequestId", java.lang.Integer.valueOf(intValue2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiPrivateGetContext", "ret: " + hashMap);
        this.f224976f.b(hashMap);
    }
}
