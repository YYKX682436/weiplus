package s74;

/* loaded from: classes4.dex */
public final class x1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486121e;

    public x1(s74.f3 f3Var, java.lang.String str) {
        this.f486120d = f3Var;
        this.f486121e = str;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        i64.u uVar = i64.u.f370855d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        s74.f3 f3Var = this.f486120d;
        if (f3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
        } else {
            java.lang.String str2 = this.f486121e;
            if (str2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
            } else {
                boolean z17 = str == null || str.length() == 0;
                i64.u uVar2 = i64.u.f370855d;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(uVar2.d(), "handleDynamicItemChange, snsId=" + str2 + ", resp=" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else {
                    java.lang.String d17 = uVar2.d();
                    try {
                        concurrentHashMap = i64.u.f370857f;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concurrentHashMap.get(str2), str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar2.d(), "handleDynamicItemChange, snsId=" + str2 + ", not changed");
                        }
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("influentData");
                        optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                    } catch (java.lang.Throwable th6) {
                        ca4.q.c(d17, th6);
                    }
                    if (optJSONArray == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(uVar2.d(), "handleDynamicItemChange, influentData-layout is null, snsId=".concat(str2));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    } else {
                        uVar2.h(f3Var, optJSONArray);
                        concurrentHashMap.put(str2, str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDynamicItemChange", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5$1");
        return f0Var;
    }
}
