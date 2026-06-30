package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34701x366c91de = 1192;

    /* renamed from: NAME */
    private static final java.lang.String f34702x24728b = "operateWxappStarItem";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("actionType");
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            return;
        }
        int i18 = 1;
        if (optInt == 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isItemStared", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).m2(optString, 0)));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
            return;
        }
        if (optInt != 2 && optInt != 3) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str3, jSONObject2));
            return;
        }
        boolean m27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).m2(optString, 0);
        if (!m27) {
            if (!(!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() || ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 1)) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(lVar.mo50352x76847179() == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : lVar.mo50352x76847179());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.operateStarItem", "TeenMode forbid add");
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("actionType", java.lang.Integer.valueOf(optInt));
                hashMap2.put("errCode", java.lang.Integer.valueOf(i18));
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap2.put("errno", 0);
                lVar.a(i17, t("ok", hashMap2));
            }
        }
        if (!m27) {
            int Dc = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).Dc(optString, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.operateStarItem", "add collection");
            if (Dc != -3) {
                if (Dc != 0) {
                    i18 = 2;
                }
                i18 = 0;
            }
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).nh(optString, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.operateStarItem", "remove collection success");
            i18 = 0;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.operateStarItem", "remove collection fail");
        }
        java.util.HashMap hashMap22 = new java.util.HashMap();
        hashMap22.put("actionType", java.lang.Integer.valueOf(optInt));
        hashMap22.put("errCode", java.lang.Integer.valueOf(i18));
        java.lang.String str52 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap22.put("errno", 0);
        lVar.a(i17, t("ok", hashMap22));
    }
}
