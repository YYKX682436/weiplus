package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.downloader.model.i1 {
    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFailed, appId: %s, downloadInWifi: %b, isWifi: %b", c17.field_appId, java.lang.Boolean.valueOf(c17.field_downloadInWifi), java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)));
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                if (!c17.field_downloadInWifi || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    appBrandDownloadState.f78779d = "download_failed";
                } else {
                    appBrandDownloadState.f78779d = "download_wait_wifi";
                }
                appBrandDownloadState.f78780e = c17.field_downloadId;
                appBrandDownloadState.f78781f = c17.field_appId;
                appBrandDownloadState.f78783h = c17.field_totalSize;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskFinished, appId: " + c17.field_appId);
                if (c17.field_downloadInWifi) {
                    c17.field_downloadInWifi = false;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.m0.l(c17);
                }
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                appBrandDownloadState.f78779d = "download_succ";
                appBrandDownloadState.f78780e = c17.field_downloadId;
                appBrandDownloadState.f78781f = c17.field_appId;
                appBrandDownloadState.f78782g = 100L;
                appBrandDownloadState.f78783h = c17.field_totalSize;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
        gm0.j1.a();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                appBrandDownloadState.f78779d = "download_progress_changed";
                appBrandDownloadState.f78780e = c17.field_downloadId;
                java.lang.String str2 = c17.field_appId;
                appBrandDownloadState.f78781f = str2;
                long j27 = c17.field_totalSize;
                if (j27 != 0) {
                    long j28 = c17.field_downloadedSize;
                    appBrandDownloadState.f78782g = (((float) j28) / ((float) j27)) * 100.0f;
                    appBrandDownloadState.f78784i = (((float) j28) * 100.0f) / ((float) j27);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskProgressChanged, appId: %s, progress: %d", str2, java.lang.Long.valueOf(appBrandDownloadState.f78782g));
                appBrandDownloadState.f78783h = c17.field_totalSize;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        gm0.j1.a();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskPaused, appId: " + c17.field_appId);
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                if (!c17.field_downloadInWifi || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    appBrandDownloadState.f78779d = "download_paused";
                } else {
                    appBrandDownloadState.f78779d = "download_wait_wifi";
                }
                appBrandDownloadState.f78780e = c17.field_downloadId;
                appBrandDownloadState.f78781f = c17.field_appId;
                long j18 = c17.field_totalSize;
                appBrandDownloadState.f78783h = j18;
                if (j18 != 0) {
                    long j19 = c17.field_downloadedSize;
                    appBrandDownloadState.f78782g = (((float) j19) / ((float) j18)) * 100.0f;
                    appBrandDownloadState.f78784i = (((float) j19) * 100.0f) / ((float) j18);
                }
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskStarted, appId: " + c17.field_appId);
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                appBrandDownloadState.f78779d = "download_started";
                appBrandDownloadState.f78780e = c17.field_downloadId;
                appBrandDownloadState.f78781f = c17.field_appId;
                long j18 = c17.field_totalSize;
                if (j18 != 0) {
                    long j19 = c17.field_downloadedSize;
                    appBrandDownloadState.f78782g = (((float) j19) / ((float) j18)) * 100.0f;
                    appBrandDownloadState.f78784i = (((float) j19) * 100.0f) / ((float) j18);
                }
                appBrandDownloadState.f78783h = j18;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        if (gm0.j1.a()) {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandFileDownloadCallback", "onTaskRemoved, appId: " + c17.field_appId);
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState appBrandDownloadState = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState();
                appBrandDownloadState.f78779d = "download_removed";
                appBrandDownloadState.f78780e = c17.field_downloadId;
                appBrandDownloadState.f78781f = c17.field_appId;
                appBrandDownloadState.f78783h = c17.field_totalSize;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.i.z(appBrandDownloadState);
            }
        }
    }
}
