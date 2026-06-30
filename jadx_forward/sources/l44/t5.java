package l44;

/* loaded from: classes4.dex */
public class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f397898a = new java.util.LinkedList();

    public static l44.t5 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        l44.t5 t5Var = new l44.t5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        return t5Var;
    }

    public l44.t5 a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        try {
            r45.j3 j3Var = new r45.j3();
            j3Var.f459059d = 13298;
            j3Var.f459061f = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String str3 = (android.text.TextUtils.isEmpty(str) ? "" : java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)) + "," + i17 + "," + i18 + "," + str2;
            j3Var.f459060e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str3.getBytes());
            this.f397898a.add(j3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLogItemReportHelper", "add logItem:".concat(str3));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLogItemReportHelper", "appendDelLogItem, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendDelLogItem", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        return this;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
        l44.u5.a(this.f397898a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper$AdDelReqBuilder");
    }
}
