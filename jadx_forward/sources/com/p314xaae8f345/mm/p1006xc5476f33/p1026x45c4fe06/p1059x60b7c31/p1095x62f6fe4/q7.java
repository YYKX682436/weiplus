package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public abstract class q7 {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, android.content.Intent intent, java.lang.String str) {
        sd1.a aVar = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ReferrerHelper", "mayPutReferrer, referrerHelper is null");
            return;
        }
        sd1.c c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5) aVar).c(jSONObject, lVar);
        if (c17 == null) {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5.f172063e;
        }
        if (sd1.c.f488210e == c17) {
            return;
        }
        intent.putExtra("IsFromWebViewReffer", str);
    }
}
