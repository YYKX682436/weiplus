package s74;

/* loaded from: classes4.dex */
public final class v1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486102e;

    public v1(s74.f3 f3Var, java.lang.String str) {
        this.f486101d = f3Var;
        this.f486102e = str;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        java.lang.String str2 = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        i64.y yVar = i64.y.f370890d;
        yVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        s74.f3 f3Var = this.f486101d;
        if (f3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
        } else {
            java.lang.String str3 = this.f486102e;
            if (str3 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
            } else {
                if (str2 == null || str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.d(), "handleProductChange, snsId=" + str3 + ", resp=" + str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                } else {
                    try {
                        concurrentHashMap = i64.y.f370892f;
                        i64.x xVar = (i64.x) concurrentHashMap.get(str3);
                        if (xVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRespString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRespString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
                            str = xVar.f370885a;
                        } else {
                            str = null;
                        }
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c("handleLivingProductChange", th6);
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(yVar.d(), "handleProductChange, snsId=" + str3 + ", product not changed");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 11);
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("influentData");
                        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                        if (optJSONArray == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(yVar.d(), "handleProductChange, influentData-layout is null, snsId=".concat(str3));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                        } else {
                            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("adFinderLiveProductInfo");
                            java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString("finderLiveProductId") : null;
                            if (optString == null) {
                                optString = "";
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.d(), "handleProductChange, snsId=" + str3 + ", component.size=" + optJSONArray.length() + ", productId=" + optString);
                            yVar.k(f3Var, optJSONArray);
                            concurrentHashMap.put(str3, new i64.x(str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(optString, 0L), optJSONArray));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleProductChange", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager");
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4$1");
        return f0Var;
    }
}
