package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class e8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34117x366c91de = 288;

    /* renamed from: NAME */
    public static final java.lang.String f34118x24728b = "navigateBackApplication";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) yVar.t3()).u0().D;
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(yVar.t3().f156336n).f167249i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateBackApplication", "navigate back Application, businessType:%s", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(yVar.mo48798x74292566()).f167253m = true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            if (optString2 == null) {
                optString2 = "{}";
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649(optString, optString2, str, 0), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d8.class, null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11812xa040dc98.f158856e) || !((i18 = c11812xa040dc98.f158855d) == 4 || i18 == 7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateBackApplication", "navigateBackApplication appid %s,launchScene %d", c11812xa040dc98.f158856e, java.lang.Integer.valueOf(c11812xa040dc98.f158855d));
            yVar.a(i17, o("fail:not from opensdk"));
            return;
        } else {
            java.lang.String str2 = c11812xa040dc98.f158856e;
            if (optString2 == null) {
                optString2 = "{}";
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649(str2, optString2, str, 0), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d8.class, null);
        }
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, u(str3, jSONObject2));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        yVar.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b8(this, yVar), 1000L);
    }
}
