package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class FileDownloadService extends com.tencent.mm.service.MMIntentService {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f96956m = "FileDownloadService_extra_" + dm.i4.COL_ID;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f96957n = "FileDownloadService_extra_action_type";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f96958o = "FileDownloadService_extra_file_path";

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f96959p = "FileDownloadService_extra_md5";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f96960q = "FileDownloadService_extra_change_url";

    public FileDownloadService() {
        super("FileDownloadService");
    }

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.FileDownloadService";
    }

    @Override // com.tencent.mm.service.MMIntentService
    public void i(android.content.Intent intent) {
        h02.a c17;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        boolean b17;
        long c18;
        h02.a d17;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(f96957n, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "handle intent type : %d", java.lang.Integer.valueOf(intExtra));
        if (intExtra != 1) {
            java.lang.String str3 = f96958o;
            if (intExtra == 3) {
                java.lang.String stringExtra = intent.getStringExtra(str3);
                long longExtra = intent.getLongExtra("downloadId", -1L);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.vfs.w6.j(stringExtra)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
                    return;
                }
                h02.a c19 = com.tencent.mm.plugin.downloader.model.m0.c(longExtra);
                if (c19 != null) {
                    k02.l.a(c19.field_downloadId, false, null);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "installApk, path = " + stringExtra);
                if (com.tencent.mm.vfs.w6.j(stringExtra)) {
                    com.tencent.mm.pluginsdk.model.app.n1.d(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra, null, true);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
                    return;
                }
            }
            if (intExtra == 4 && gm0.j1.b().m()) {
                gm0.j1.b();
                if (gm0.m.r()) {
                    return;
                }
                long longExtra2 = intent.getLongExtra("downloadId", -1L);
                h02.a c27 = com.tencent.mm.plugin.downloader.model.m0.c(longExtra2);
                if (c27 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "can not find info:, id = " + longExtra2);
                    return;
                }
                java.lang.String stringExtra2 = intent.getStringExtra(str3);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || !com.tencent.mm.vfs.w6.j(stringExtra2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
                    return;
                }
                try {
                    java.lang.String string = new org.json.JSONObject(c27.field_extInfo).getString("appId");
                    ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c27.field_extInfo, 11311002L, 1L, 2, "{\"status\":3}");
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317032k = 1378;
                    b1Var.f317014b = string;
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloadService", e17, "Exception:can not get appid", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        long longExtra3 = intent.getLongExtra(f96956m, -1L);
        if (longExtra3 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadService", "Invalid id");
            return;
        }
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (gm0.m.r() || (c17 = com.tencent.mm.plugin.downloader.model.m0.c(longExtra3)) == null) {
                return;
            }
            boolean z17 = intent.getBooleanExtra(f96960q, false) || c17.field_isSecondDownload;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "filePath = " + c17.field_filePath);
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_filePath) || !com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 5L, 1L, false);
                c17.field_status = 4;
                c17.field_errCode = 806;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
                i17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "onDownloadFailed, id = %d, errCode = %d", java.lang.Long.valueOf(longExtra3), 806);
                com.tencent.mm.plugin.downloader.model.l0 l0Var = i17.f97131f;
                if (l0Var != null) {
                    l0Var.c(longExtra3, 806, z17);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "file not exists, appid = " + c17.field_appId);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_md5)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
                c17.field_status = 3;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                com.tencent.mm.plugin.downloader.model.r0.i().n(longExtra3, z17);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17.field_appId)) {
                j17 = 0;
                str = "";
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    str = e02.k.a(new com.tencent.mm.vfs.r6(c17.field_filePath));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadService", "readChannelId exception : " + e18.getMessage());
                    str = "";
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadService", "readChannelId, channelId:%s, cost time: %d", str, java.lang.Long.valueOf(currentTimeMillis2));
                j17 = 0 + currentTimeMillis2;
            }
            java.lang.String str4 = c17.field_appId;
            g02.c cVar = new g02.c(str4, c17.field_downloadId, str, j17, c17.field_reserveInWifi ? 1 : 0);
            java.util.Set set = com.tencent.mm.plugin.downloader.model.n0.f97088a;
            if (c17.field_sectionMd5Byte == null) {
                java.lang.String str5 = c17.field_filePath;
                java.lang.String str6 = c17.field_md5;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str5));
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadMD5Manager", "MD5 Check: %s, File Exists: %b", str5, java.lang.Boolean.valueOf(r6Var.m()));
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
                long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadMD5Manager", "MD5 Check Time: %d", java.lang.Long.valueOf(currentTimeMillis4));
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadMD5Manager", "Original MD5: %s, Calculated MD5: %s", str6, p17);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || (d17 = com.tencent.mm.plugin.downloader.model.m0.d(str4)) == null) {
                    str2 = "MicroMsg.FileDownloadService";
                } else {
                    str2 = "MicroMsg.FileDownloadService";
                    g02.b.c(111, new g02.c(str4, d17.field_downloadId, "", currentTimeMillis4, d17.field_reserveInWifi ? 1 : 0));
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                    b17 = r6Var.m();
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadMD5Manager", "check from file failed, may caused by low memory while checking md5");
                    b17 = r6Var.m();
                } else {
                    b17 = str6.trim().equalsIgnoreCase(p17.trim());
                }
            } else {
                str2 = "MicroMsg.FileDownloadService";
                b17 = com.tencent.mm.plugin.downloader.model.n0.b(c17);
            }
            if (z17) {
                if (b17) {
                    g02.b.d(c17.field_appId, 21L, 1L);
                    g02.b.c(108, cVar);
                } else {
                    g02.b.d(c17.field_appId, 22L, 1L);
                    g02.b.c(109, cVar);
                }
            }
            if (!b17) {
                if (c17.field_downloadUrl.startsWith("https")) {
                    g02.b.d(c17.field_appId, 32L, 1L);
                } else {
                    g02.b.d(c17.field_appId, 31L, 1L);
                }
            }
            if (b17) {
                c17.field_status = 3;
                c17.field_channelId = str;
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
                com.tencent.mm.plugin.downloader.model.m0.m(c17.field_downloadUrl, 3);
                com.tencent.mm.plugin.downloader.model.r0.i().n(longExtra3, z17);
                return;
            }
            if (c17.field_downloaderType == 3) {
                if (c17.field_downloadUrl.startsWith("https")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 10L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 9L, 1L, false);
                }
            } else if (c17.field_downloadUrl.startsWith("https")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 7L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 6L, 1L, false);
            }
            c17.field_status = 4;
            c17.field_channelId = str;
            c17.field_errCode = 802;
            c17.field_downloadedSize = com.tencent.mm.vfs.w6.k(c17.field_filePath);
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            java.lang.String str7 = str2;
            com.tencent.mars.xlog.Log.i(str7, "ChannelId = %s, receivedSize = %d, fileSize = %d", str, java.lang.Long.valueOf(c17.field_downloadedSize), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(c17.field_filePath)));
            com.tencent.mars.xlog.Log.i(str7, "delete file: %s", c17.field_filePath);
            com.tencent.mm.vfs.w6.h(c17.field_filePath);
            com.tencent.mars.xlog.Log.i(str7, "checkMd5, isWifi: %b, hasChangeUrl: %b, hasHttpsUrl: %b", java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(c17.field_secondaryUrl)));
            if (!((!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || z17 || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_secondaryUrl)) ? false : true)) {
                com.tencent.mm.plugin.downloader.model.r0 i18 = com.tencent.mm.plugin.downloader.model.r0.i();
                i18.getClass();
                h02.a c28 = com.tencent.mm.plugin.downloader.model.m0.c(longExtra3);
                if (c28 == null) {
                    return;
                }
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (c28.field_showNotification && !com.tencent.mm.sdk.platformtools.t8.K0(c28.field_notificationTitle)) {
                    i18.y(c28.field_appId, c28.field_notificationTitle, context.getString(com.tencent.mm.R.string.cel), null);
                } else if (c28.field_showNotification && com.tencent.mm.sdk.platformtools.t8.K0(c28.field_fileName)) {
                    i18.y(c28.field_appId, context.getString(com.tencent.mm.R.string.cel), "", null);
                } else if (c28.field_showNotification && !com.tencent.mm.sdk.platformtools.t8.K0(c28.field_fileName)) {
                    i18.y(c28.field_appId, c28.field_fileName, context.getString(com.tencent.mm.R.string.cel), null);
                }
                i18.f97131f.c(longExtra3, 802, z17);
                return;
            }
            com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
            t0Var.f97150a = c17.field_secondaryUrl;
            t0Var.f97152c = c17.field_fileSize;
            t0Var.f97153d = c17.field_fileName;
            t0Var.A = c17.field_notificationTitle;
            t0Var.f97156g = c17.field_appId;
            t0Var.f97154e = c17.field_md5;
            t0Var.f97161l = c17.field_scene;
            t0Var.f97166q = c17.field_extInfo;
            t0Var.f97162m = true;
            t0Var.f97158i = true;
            t0Var.f97155f = 1;
            t0Var.f97157h = c17.field_packageName;
            t0Var.f97165p = true;
            if (c17.field_sectionMd5Byte != null) {
                d02.q qVar = new d02.q();
                try {
                    qVar.parseFrom(c17.field_sectionMd5Byte);
                    t0Var.f97172w = qVar.f225356d;
                } catch (java.io.IOException unused) {
                }
            }
            if (c17.field_downloaderType != 3) {
                c18 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 8L, 1L, false);
            } else {
                c18 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 11L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i(str7, "MD5 check failed, restart download, id = " + c18);
            g02.b.c(110, cVar);
            g02.b.d(c17.field_appId, 30L, 1L);
        }
    }
}
