package i64;

/* loaded from: classes4.dex */
public final class u extends i64.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i64.u f370855d = new i64.u();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f370856e = "AdDynamicUpdateModelManager";

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f370857f = new java.util.concurrent.ConcurrentHashMap();

    @Override // i64.a0
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        return f370856e;
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        ((java.util.LinkedHashMap) c()).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f370596b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        ((java.util.LinkedHashMap) map).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
    }

    public final void h(s74.f3 f3Var, org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateViewNode", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
    }
}
