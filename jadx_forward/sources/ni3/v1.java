package ni3;

/* loaded from: classes12.dex */
public class v1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f419282e;

    public v1(ni3.g2 g2Var) {
        this.f419282e = g2Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "reportAllRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        ni3.g2 g2Var;
        long j17;
        long j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportAllRunnable run");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreBaseMonitor", "account has not initalized!");
            return;
        }
        synchronized (this.f419282e) {
            long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("vfs_daily_last_report_time", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j19 > 86400000) {
                com.p314xaae8f345.mm.vfs.c1.d();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("vfs_daily_last_report_time", currentTimeMillis);
            }
        }
        this.f419282e.Vi();
        synchronized (this.f419282e) {
            if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("report_duplicate_file_report_time", 0L) >= 259200000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "reportDuplicateFile");
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("DuplicateFileDailyReport", "");
                if (string != null && !string.isEmpty()) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        boolean has = jSONObject.has("v3");
                        long j27 = jSONObject.getLong("allFileSize");
                        long j28 = jSONObject.getLong("image2DuplicateFileDiskSpace");
                        long j29 = jSONObject.getLong("videoDuplicateFileDiskSpace");
                        long j37 = jSONObject.getLong("voice2DuplicateFileDiskSpace");
                        long j38 = jSONObject.getLong("recordDuplicateFileDiskSpace");
                        jx3.f.INSTANCE.d(25355, has ? "DuplicateFileDaily-v3" : "DuplicateFileDaily-v2", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedFileSize")), java.lang.Long.valueOf(jSONObject.getInt("fileSizeRatio")), java.lang.Long.valueOf(jSONObject.getLong("openapiDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("attachmentDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("emulatedDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("favoriteDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedDiskSpace")), java.lang.Long.valueOf(jSONObject.getInt("fileDiskSpaceRatio")), java.lang.Long.valueOf(jSONObject.getLong("downloadDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("otherDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("wechatTotalSize")), java.lang.Long.valueOf(jSONObject.getInt("fileDiskSpaceWechatRatio")), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedFileCount")), 0, java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(jSONObject.optLong("duplicateFileTotalSize", -1L)));
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreBaseMonitor", "duplicateFileString jsonArray Failed, e = " + e17.getMessage());
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_duplicate_file_report_time", java.lang.System.currentTimeMillis());
            }
        }
        ni3.g2 g2Var2 = this.f419282e;
        synchronized (g2Var2) {
            try {
                long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_report_time", 0L);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                if (currentTimeMillis2 - q17 >= 604800000) {
                    try {
                        if (currentTimeMillis2 % 100 != 0) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_report_time", java.lang.System.currentTimeMillis());
                        } else {
                            long q18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_EnMicroMsg", -10L);
                            long q19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_EnMicroMsg_db_file_ratio", -10L);
                            long o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("report_freelist_daily_ratio_EnMicroMsg", -10);
                            if (q18 >= 0) {
                                jx3.f.INSTANCE.d(25824, "EnMicroMsg.db", "", 0, 0, java.lang.Long.valueOf(q18), "daily", 0, 0, 0, java.lang.Long.valueOf(q19), 0, 0, java.lang.Long.valueOf(o17));
                            }
                            long q27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_WxFileIndex", -10L);
                            long q28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_WxFileIndex_db_file_ratio", -10L);
                            long o18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("report_freelist_daily_ratio_WxFileIndex", -10);
                            if (q27 >= 0) {
                                jx3.f.INSTANCE.d(25824, "WxFileIndex.db", "", 0, 0, java.lang.Long.valueOf(q27), "daily", 0, 0, 0, java.lang.Long.valueOf(q28), 0, 0, java.lang.Long.valueOf(o18));
                            }
                            g2Var = g2Var2;
                            try {
                                long q29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_FTS", -10L);
                                long q37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_FTS_db_file_ratio", -10L);
                                long o19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("report_freelist_daily_ratio_FTS", -10);
                                if (q29 >= 0) {
                                    j17 = q19;
                                    jx3.f.INSTANCE.d(25824, "FTS5IndexMicroMsg_encrypt.db", "", 0, 0, java.lang.Long.valueOf(q29), "daily", 0, 0, 0, java.lang.Long.valueOf(q37), 0, 0, java.lang.Long.valueOf(o19));
                                } else {
                                    j17 = q19;
                                }
                                long q38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_NewBiz", -10L);
                                long q39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("report_freelist_daily_NewBiz_db_file_ratio", -10L);
                                long o27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("report_freelist_daily_ratio_NewBiz", -10);
                                if (q38 >= 0) {
                                    j18 = o17;
                                    jx3.f.INSTANCE.d(25824, "UnEncryptNewBiz.db", "", 0, 0, java.lang.Long.valueOf(q38), "daily", 0, 0, 0, java.lang.Long.valueOf(q39), 0, 0, java.lang.Long.valueOf(o27));
                                } else {
                                    j18 = o17;
                                }
                                if (q18 >= 0 && q27 >= 0 && q29 >= 0 && q38 >= 0) {
                                    jx3.f.INSTANCE.d(25824, "Total", "", 0, 0, java.lang.Long.valueOf(q18 + q27 + q29 + q38), "daily", 0, 0, 0, java.lang.Long.valueOf((j17 < 0 || q28 < 0 || q37 < 0 || q39 < 0) ? -1L : q39 + j18 + q28 + q37), 0, 0, java.lang.Long.valueOf((j18 < 0 || o18 < 0 || o19 < 0 || o27 < 0) ? -1L : j18 + o18 + o19 + o27));
                                }
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("report_freelist_report_time", java.lang.System.currentTimeMillis());
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        g2Var = g2Var2;
                    }
                } else {
                    g2Var = g2Var2;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                g2Var = g2Var2;
            }
        }
        com.p314xaae8f345.mm.vfs.x3.a();
        ni3.g2 g2Var3 = this.f419282e;
        g2Var3.getClass();
        if (gm0.j1.a()) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_SD_STATUS_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis3 - longValue > 259200000 || longValue > currentTimeMillis3) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis3));
                ((ku5.t0) ku5.t0.f394148d).h(new ni3.s1(g2Var3), "reportSDStatus");
            }
        }
        ni3.g2 g2Var4 = this.f419282e;
        g2Var4.getClass();
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECHAT_DB_REPORT_LAST_TIME_LONG;
        long longValue2 = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue();
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis4 - longValue2 > g2Var4.f419125q * 60000 || longValue2 > currentTimeMillis4) {
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(currentTimeMillis4));
            ((ku5.t0) ku5.t0.f394148d).h(new ni3.p1(g2Var4, g2Var4.f419117f * 1024 * 1024, g2Var4.f419122n * 1024 * 1024, g2Var4.f419118g, g2Var4.f419119h, g2Var4.f419120i, g2Var4.f419121m), "reportDBInfo");
        }
        ni3.g2.Bi(this.f419282e);
        ni3.g2.Di(this.f419282e);
        ni3.g2.Ni(this.f419282e);
        dr0.m mVar = (dr0.m) ((lh.k) i95.n0.c(lh.k.class));
        mVar.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            throw new java.lang.UnsupportedOperationException("Call in main proc for now!");
        }
        ((ku5.t0) ku5.t0.f394148d).g(new dr0.f(mVar));
        yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        b1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "tryCreateSecondIndex");
        ((ku5.t0) ku5.t0.f394148d).h(new yv1.z0(b1Var), "MicroMsg.CleanService");
        yv1.b1 b1Var2 = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        b1Var2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "tryCreateThirdIndex");
        ((ku5.t0) ku5.t0.f394148d).h(new yv1.a1(b1Var2), "MicroMsg.CleanService");
        fp.r0 r0Var = fp.r0.f346765a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            w55.a aVar = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20281x8414f802.f273751a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            aVar.b(context);
        }
        this.f419282e.f419134z.b();
        ((ku5.t0) ku5.t0.f394148d).k(this.f419282e.f419134z, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }
}
