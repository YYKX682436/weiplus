package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes.dex */
public final class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m f156454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r f156456f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r rVar) {
        this.f156454d = mVar;
        this.f156455e = i17;
        this.f156456f = rVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76 c11549x40f34e76 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76) obj;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        boolean z17 = c11549x40f34e76.f156431e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.r rVar = this.f156456f;
        int i17 = this.f156455e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f156454d;
        if (!z17) {
            if (mVar != null) {
                rVar.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty("get msg error") ? "fail:internal error" : "get msg error";
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                mVar.a(i17, rVar.u(str, jSONObject));
                return;
            }
            return;
        }
        for (com.p314xaae8f345.mm.p617xd6d92827.p620x36f002.C4983x817cf557 c4983x817cf557 : c11549x40f34e76.f156430d) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("opcode", c4983x817cf557.f134716d);
            jSONObject2.put("aid", c4983x817cf557.f134717e);
            jSONObject2.put("slotid", c4983x817cf557.f134718f);
            jSONObject2.put("op_time", c4983x817cf557.f134719g);
            jSONObject2.put("traceid", c4983x817cf557.f134720h);
            jSONArray.put(jSONObject2);
        }
        if (mVar != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("msgData", jSONArray);
            rVar.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            mVar.a(i17, rVar.u(str3, jSONObject3));
        }
    }
}
