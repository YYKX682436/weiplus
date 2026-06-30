package d95;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d95.f f309227d;

    public l(d95.f fVar) {
        this.f309227d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean l17 = j62.e.g().l("clicfg_vacuum_midnight_2", false, true, true);
        boolean l18 = j62.e.g().l("clicfg_vacuum_midnight_3", false, true, true);
        boolean l19 = j62.e.g().l("clicfg_vacuum_midnight_4", false, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "willVacuumOnMidnight, s1 = true, s2 = " + l17 + ", s3 = " + l18);
        long j17 = l17 ? 524288000L : 209715200L;
        if (l18) {
            j17 = 1073741824;
        }
        if (l19) {
            j17 = 2147483648L;
        }
        d95.f fVar = this.f309227d;
        java.lang.String substring = fVar.k().substring(fVar.k().lastIndexOf("/") + 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "checkVacuumRunnable, before get freelist_count");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long h17 = fVar.h();
        long g17 = fVar.g();
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1L);
        int i17 = j18 != -1 ? (int) ((((float) h17) / ((float) j18)) * 100.0f) : -1;
        int i18 = (int) ((h17 / g17) * 100.0d);
        if (substring.equals("EnMicroMsg.db")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_EnMicroMsg", h17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_EnMicroMsg_db_file_ratio", i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_EnMicroMsg", i17);
        } else if (substring.equals("WxFileIndex.db")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_WxFileIndex", h17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_WxFileIndex_db_file_ratio", i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_WxFileIndex", i17);
        } else if (substring.equals("FTS5IndexMicroMsg_encrypt.db")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_FTS", h17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_FTS_db_file_ratio", i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_FTS", i17);
        } else if (substring.equals("UnEncryptNewBiz.db")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_daily_NewBiz", h17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_NewBiz_db_file_ratio", i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("report_freelist_daily_ratio_NewBiz", i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "checkVacuumRunnable, after get freelist_count, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        long g18 = fVar.g() - h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "report vacuum, db.getPath() = " + fVar.k() + ", dbFileSize = " + fVar.g());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "dbRealDataSize = " + g18 + ", freeListSize = " + h17);
        boolean z17 = g18 < j17 && h17 > 209715200;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "willVacuum = " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.va.f277822a.a(new d95.k(this, substring), "Vacuum-Task");
        }
    }
}
