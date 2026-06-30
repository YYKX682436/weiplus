package l44;

/* loaded from: classes4.dex */
public abstract class u5 {
    public static void a(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        if (linkedList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLogItemReportHelper", "report, logList.size=" + linkedList.size());
            try {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j2(linkedList));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLogItemReportHelper", "report, exp=" + th6.toString());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLogItemReportHelper", "report, logList.size=0");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }

    public static void b(java.lang.String str, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1941, i17);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.j3 j3Var = new r45.j3();
            j3Var.f459059d = 13298;
            j3Var.f459061f = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String t07 = ca4.z0.t0(j17);
            j3Var.f459060e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(((android.text.TextUtils.isEmpty(str) ? "" : java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)) + ",5," + i17 + "," + t07).getBytes());
            linkedList.add(j3Var);
            a(linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdLogItemReportHelper", "reportAdLiftLog() called with: uxinfo = [" + str + "], code = [" + i17 + "], snsId = [" + j17 + "]");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdLogItemReportHelper", "reportAdLiftLog, error" + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdLiftLog", "com.tencent.mm.plugin.sns.ad.helper.SnsAdLogItemReportHelper");
    }
}
