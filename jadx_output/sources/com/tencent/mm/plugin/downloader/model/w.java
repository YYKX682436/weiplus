package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class w implements iv1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.b0 f97188a;

    public w(com.tencent.mm.plugin.downloader.model.b0 b0Var) {
        this.f97188a = b0Var;
    }

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        boolean z17;
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(710L, 18L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, info is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "onDownloadTaskStateChanged, url = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        boolean z18 = true;
        if (i17 == 1) {
            com.tencent.mm.plugin.downloader.model.m0.m(f17.field_downloadUrl, 1);
            return;
        }
        com.tencent.mm.plugin.downloader.model.b0 b0Var = this.f97188a;
        if (i17 == 3) {
            f17.field_finishTime = java.lang.System.currentTimeMillis();
            long j17 = f17.field_totalSize;
            f17.field_downloadedSize = j17;
            f17.field_status = 6;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "download succeed, downloadedSize = %d, startSize = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f17.field_startSize));
            com.tencent.mm.plugin.downloader.model.m0.l(f17);
            com.tencent.mm.plugin.downloader.model.m0.m(f17.field_downloadUrl, 6);
            b0Var.f97212a.b(f17.field_downloadId);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
            intent.setClass(b0Var.f96981c, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, f17.field_downloadId);
            try {
                j45.l.A(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", e17.getMessage());
            }
            b0Var.h(f17.field_downloadUrl);
            b0Var.f96986h.remove(f17.field_downloadUrl);
            b0Var.f96987i.remove(f17.field_downloadUrl);
            return;
        }
        if (i17 != 4) {
            return;
        }
        if ((i18 != 21009 && i18 != 21020) || com.tencent.mm.plugin.downloader.model.u0.a(f17.field_totalSize)) {
            z17 = false;
        } else {
            if (com.tencent.mm.plugin.downloader.model.u0.c(f17.field_totalSize)) {
                b0Var.e(f17);
                return;
            }
            z17 = true;
        }
        b0Var.getClass();
        if (f17.field_fileType == 5 && (i18 == -21 || (-109 <= i18 && i18 <= -100))) {
            iv1.f.f().g(f17.field_downloadUrl);
            b0Var.h(f17.field_downloadUrl);
            f17.field_finishTime = java.lang.System.currentTimeMillis();
            f17.field_status = 2;
            com.tencent.mm.plugin.downloader.model.m0.l(f17);
            java.util.HashMap hashMap = b0Var.f96987i;
            long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hashMap.get(f17.field_downloadUrl), f17.field_startTime);
            java.util.HashMap hashMap2 = b0Var.f96986h;
            long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hashMap2.get(f17.field_downloadUrl), f17.field_startSize);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - k17;
            if (currentTimeMillis > 0) {
                long j18 = f17.field_downloadedSize;
                k02.m.a(f17.field_downloadId, ((((float) (j18 - k18)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f, (int) ((((float) j18) / ((float) f17.field_totalSize)) * 100.0f));
                hashMap2.remove(f17.field_downloadUrl);
                hashMap.remove(f17.field_downloadUrl);
            }
            b0Var.f97212a.e(f17.field_downloadId);
        } else {
            z18 = false;
        }
        if (z18) {
            return;
        }
        f17.field_finishTime = java.lang.System.currentTimeMillis();
        f17.field_errCode = java.lang.Math.abs(i18);
        f17.field_status = 4;
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && f17.field_downloadInWifi) {
            f17.field_downloadInWifi = false;
            f17.field_reserveInWifi = false;
        }
        com.tencent.mm.plugin.downloader.model.m0.l(f17);
        b0Var.f97212a.c(f17.field_downloadId, java.lang.Math.abs(i18), false);
        this.f97188a.l(f17.field_downloadUrl, 4, 0, false, z17, false);
        b0Var.f96986h.remove(f17.field_downloadUrl);
        b0Var.f96987i.remove(f17.field_downloadUrl);
    }
}
