package ta4;

/* loaded from: classes4.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f498253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta4.c1 f498255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f498256g;

    public a1(int i17, java.lang.String str, ta4.c1 c1Var, int i18) {
        this.f498253d = i17;
        this.f498254e = str;
        this.f498255f = c1Var;
        this.f498256g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter$doReport$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReport >> localId: ");
        sb6.append(this.f498253d);
        sb6.append(" snsId: ");
        java.lang.String str2 = this.f498254e;
        sb6.append(str2);
        org.p3343x72743996.p3344x2e06d1.Log.i("MicroMsg.SnsPostMediaMetaDataReporter", sb6.toString());
        ta4.c1 c1Var = this.f498255f;
        c1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        c1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPathList", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPathList", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = c1Var.f498264a;
        java.util.List<java.lang.String> list = c1Var.f498265b;
        if (i17 == 4) {
            for (java.lang.String str3 : list) {
                if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                    org.json.JSONObject g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.g(str3);
                    if (g17 == null || (str = g17.toString()) == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
        }
        ta4.b1 b1Var = ta4.b1.f498258a;
        int size = list.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6902xf6463fbf c6902xf6463fbf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6902xf6463fbf();
        c6902xf6463fbf.f142221d = c6902xf6463fbf.b("SnsFeedId", str2, true);
        c6902xf6463fbf.f142222e = size;
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        byte[] bytes = jSONArray2.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        c6902xf6463fbf.f142223f = c6902xf6463fbf.b("MetaDataJsonArray", android.util.Base64.encodeToString(bytes, 2), true);
        c6902xf6463fbf.f142224g = this.f498256g;
        c6902xf6463fbf.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter$doReport$1$1");
    }
}
