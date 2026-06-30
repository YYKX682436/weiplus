package a62;

/* loaded from: classes13.dex */
public abstract class e {
    public static void a(java.lang.String str) {
        java.lang.String c17;
        int h17 = b52.b.h();
        if (h17 == 0) {
            c17 = "-1";
        } else {
            c17 = c52.c.c("mmkv_key_hellSenPageMegRptChe_" + h17);
            if (c17 == null || c17.isEmpty()) {
                c17 = null;
            }
        }
        java.lang.String a17 = x52.d.a(c17);
        if (a17 != null && !a17.isEmpty()) {
            if (str == null || str.isEmpty()) {
                str = a17;
            } else {
                str = a17 + "|" + str;
            }
        }
        if (str != null && !str.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionPageMergeReport", "FuzzyMergeReport, reportSessionPageMerge: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1394xc84c5534.C13493x9cb3cdf1.p(17647, str, 5120);
            q42.l lVar = g42.f.Bi().f350254d;
            lVar.getClass();
            if (g42.i.h()) {
                if (u46.l.e(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle data or sessionPageID isEmpty!");
                } else {
                    g42.i.a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageMerge data : ".concat(str));
                    lVar.f441614b.mo50293x3498a0(new q42.h(lVar, java.lang.System.currentTimeMillis(), str));
                }
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        int h18 = b52.b.h();
        if (h18 == 0) {
            return;
        }
        if (valueOf == null) {
            valueOf = "";
        }
        try {
            c52.c.e("mmkv_key_hellSenPageMegRptChe_" + h18, valueOf);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionReportCache", e17, "HellSessionReportCache.writeBackOfMerge", new java.lang.Object[0]);
        }
    }
}
