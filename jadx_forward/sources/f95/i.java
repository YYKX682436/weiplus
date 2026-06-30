package f95;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f342096d;

    public i(l75.k0 k0Var) {
        this.f342096d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        boolean l17 = j62.e.g().l("clicfg_vacuum_midnight_2", false, true, true);
        boolean l18 = j62.e.g().l("clicfg_vacuum_midnight_3", false, true, true);
        boolean l19 = j62.e.g().l("clicfg_vacuum_midnight_4", false, true, true);
        java.util.Set set = f95.j.f342097a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "willVacuumOnMidnight, s1 = true, s2 = " + l17 + ", s3 = " + l18);
        long j17 = l17 ? 524288000L : 209715200L;
        if (l18) {
            j17 = 1073741824;
        }
        if (l19) {
            j17 = 2147483648L;
        }
        l75.k0 k0Var = this.f342096d;
        java.lang.String mo70515xfb83cc9b = k0Var.mo70515xfb83cc9b();
        if (mo70515xfb83cc9b != null) {
            java.lang.String mo70515xfb83cc9b2 = k0Var.mo70515xfb83cc9b();
            str = mo70515xfb83cc9b.substring((mo70515xfb83cc9b2 != null ? r26.n0.P(mo70515xfb83cc9b2, "/", 0, false, 6, null) : 0) + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        } else {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "checkVacuumRunnable, before get freelist_count");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long e17 = k0Var.e();
        java.util.Set set2 = f95.j.f342097a;
        long k17 = k0Var.k();
        long j18 = j17;
        long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1L);
        int i17 = j19 != -1 ? (int) ((((float) e17) / ((float) j19)) * 100) : -1;
        int i18 = (int) ((e17 / k17) * 100);
        switch (str.hashCode()) {
            case -1815729939:
                if (str.equals("UnEncryptNewBiz.db")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_NewBiz", e17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_NewBiz_db_file_ratio", i18);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_NewBiz", i17);
                    break;
                }
                break;
            case -1610039929:
                if (str.equals("FTS5IndexMicroMsg_encrypt.db")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_FTS", e17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_FTS_db_file_ratio", i18);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_FTS", i17);
                    break;
                }
                break;
            case -1526147738:
                if (str.equals("EnMicroMsg.db")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_EnMicroMsg", e17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_EnMicroMsg_db_file_ratio", i18);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_EnMicroMsg", i17);
                    break;
                }
                break;
            case 1421150807:
                if (str.equals("WxFileIndex.db")) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_WxFileIndex", e17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_WxFileIndex_db_file_ratio", i18);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_WxFileIndex", i17);
                    break;
                }
                break;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "checkVacuumRunnable, after get freelist_count, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        long h17 = k0Var.h(e17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "report vacuum, db.getPath() = " + k0Var.mo70515xfb83cc9b() + ", dbFileSize = " + k0Var.k());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "dbRealDataSize = " + h17 + ", freeListSize = " + e17);
        boolean z17 = h17 < j18 && e17 > 209715200;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "willVacuum = " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.va.f277822a.a(new f95.h(k0Var, str), "Vacuum-Task");
        }
    }
}
