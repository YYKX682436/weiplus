package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1192;
    private static final java.lang.String NAME = "operateWxappStarItem";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("actionType");
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            return;
        }
        int i18 = 1;
        if (optInt == 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isItemStared", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(optString, 0)));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
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
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str3, jSONObject2));
            return;
        }
        boolean m27 = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).m2(optString, 0);
        if (!m27) {
            if (!(!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() || ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 1)) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(lVar.getContext() == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : lVar.getContext());
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.operateStarItem", "TeenMode forbid add");
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("actionType", java.lang.Integer.valueOf(optInt));
                hashMap2.put("errCode", java.lang.Integer.valueOf(i18));
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                hashMap2.put("errno", 0);
                lVar.a(i17, t("ok", hashMap2));
            }
        }
        if (!m27) {
            int Dc = ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).Dc(optString, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.operateStarItem", "add collection");
            if (Dc != -3) {
                if (Dc != 0) {
                    i18 = 2;
                }
                i18 = 0;
            }
        } else if (((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).nh(optString, 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.operateStarItem", "remove collection success");
            i18 = 0;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.operateStarItem", "remove collection fail");
        }
        java.util.HashMap hashMap22 = new java.util.HashMap();
        hashMap22.put("actionType", java.lang.Integer.valueOf(optInt));
        hashMap22.put("errCode", java.lang.Integer.valueOf(i18));
        java.lang.String str52 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap22.put("errno", 0);
        lVar.a(i17, t("ok", hashMap22));
    }
}
