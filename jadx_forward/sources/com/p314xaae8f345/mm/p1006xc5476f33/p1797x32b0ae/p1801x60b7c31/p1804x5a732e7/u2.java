package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes5.dex */
public class u2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long c17 = android.os.Looper.getMainLooper().isCurrentThread() ? c01.id.c() : c01.id.b();
        if (c17 == -1) {
            this.f224976f.a("getServerTime error");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverTime", java.lang.Long.valueOf(c17));
        this.f224976f.c(new org.json.JSONObject(hashMap), false);
    }
}
