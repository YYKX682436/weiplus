package i64;

/* loaded from: classes4.dex */
public final class y extends i64.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i64.y f370890d = new i64.y();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f370891e = "AdFinderLivingProductModelManager";

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f370892f = new java.util.concurrent.ConcurrentHashMap();

    public static final long h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        boolean z17 = true;
        boolean z18 = c17702x544f64e9 != null && c17702x544f64e9.f244115g0;
        long j17 = 0;
        i64.y yVar = f370890d;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.d(), "getLivingProductId, snsId=" + str + ", isFinderLiveShowProduct=false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return 0L;
        }
        yVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.d(), "getLivingProductId, snsId empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        } else {
            i64.x xVar = (i64.x) f370892f.get(str);
            if (xVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                j17 = xVar.f370886b;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.d(), "getLivingProductId, snsId=" + str + ", productId=" + j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return j17;
    }

    public static final boolean i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        s34.d0 d0Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38177xdf7a7848;
        if (d0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return false;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveProductInfo");
        java.lang.String str = d0Var.f484150a;
        boolean z17 = str == null || str.length() == 0;
        i64.y yVar = f370890d;
        if (!z17) {
            yVar.d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.d(), "isFinderLivingProductAd=false, no req params, snsId=" + T);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderLivingProductAd", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return false;
    }

    public static final boolean j(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        boolean z17 = j17 != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidProductId", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return z17;
    }

    @Override // i64.a0
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        return f370891e;
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_ad_enable_update_living_product, 1) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d(), "clear, isEnableUpdate=" + z17);
        ((java.util.LinkedHashMap) c()).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f370596b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        ((java.util.LinkedHashMap) map).clear();
        if (!z17) {
            f370892f.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
    }

    public final void k(s74.f3 f3Var, org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(dm.i4.f66865x76d1ec5a);
                if (optString == null || optString.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(d(), "updateViewNode, id empty");
                } else {
                    s74.j3 a17 = f3Var.a(optString);
                    if (a17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(d(), "updateViewNode, findViewNodeById==null, id=" + optString);
                    } else {
                        s74.y2 y2Var = s74.y2.f486142a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        org.json.JSONObject jSONObject = a17.f485901c;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
                        y2Var.d(jSONObject, optJSONObject);
                        f3Var.v(a17);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
    }
}
