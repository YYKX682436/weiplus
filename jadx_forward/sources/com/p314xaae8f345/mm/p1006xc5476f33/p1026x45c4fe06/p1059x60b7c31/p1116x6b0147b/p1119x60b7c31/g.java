package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31;

/* loaded from: classes13.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34926x366c91de = 482;

    /* renamed from: NAME */
    public static final java.lang.String f34927x24728b = "loadVideoResource";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data nil"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLoadVideoResource", "data is null");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLoadVideoResource", "dataArr nil");
            lVar.a(i17, o("fail:dataArr nil"));
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
            java.lang.String optString = optJSONArray.optString(i19, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiLoadVideoResource", "videoUrl i nil");
            } else {
                oe1.r1 r1Var = (oe1.r1) i95.n0.c(oe1.r1.class);
                if (r1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.f(this, lVar, r1Var);
                    ((oe1.z1) r1Var).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb c12261x637f42fb = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12261x637f42fb.f165057d;
                    int b17 = c12261x637f42fb != null ? c12261x637f42fb.b(optString, fVar) : -3;
                    if (b17 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo genPreLoad fail ret = %s, videoUrl = %s", java.lang.Integer.valueOf(b17), optString);
                        C(lVar, optString, b17, 0);
                    }
                }
            }
            i18++;
        }
        if (i18 == 0 || i18 != optJSONArray.length()) {
            return;
        }
        lVar.a(i17, o("fail"));
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        if (i17 != -5) {
            str2 = i17 != -4 ? i17 != -3 ? i17 != -2 ? i17 != -1 ? "" : "args illegal" : "downloading" : "start download fail" : "create file fail";
        } else {
            str2 = "cdn download fail errCode:" + i18;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str2);
        hashMap.put("resource", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        xe1.l lVar2 = new xe1.l();
        lVar2.p(lVar);
        lVar2.r(jSONObject);
        lVar2.m();
    }
}
