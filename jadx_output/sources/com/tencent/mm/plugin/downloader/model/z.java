package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.b0 f97210e;

    public z(com.tencent.mm.plugin.downloader.model.b0 b0Var, long j17) {
        this.f97210e = b0Var;
        this.f97209d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME);
        com.tencent.mm.plugin.downloader.model.b0 b0Var = this.f97210e;
        long j17 = this.f97209d;
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = b0Var.d(j17);
        if (d17 == null || d17.f96963f != 1) {
            return;
        }
        iv1.f.f().g(d17.f96962e);
        b0Var.h(d17.f96962e);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            c17.field_finishTime = java.lang.System.currentTimeMillis();
            c17.field_status = 2;
            c17.field_downloadedSize = d17.f96967m;
            com.tencent.mm.plugin.downloader.model.m0.l(c17);
            java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) b0Var.f96987i.get(d17.f96962e), c17.field_startTime));
            if (valueOf != null) {
                k02.m.a(c17.field_downloadId, ((((float) (c17.field_downloadedSize - java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) b0Var.f96986h.get(d17.f96962e), c17.field_startSize)).longValue())) * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - valueOf.longValue()))) / 1048576.0f, (int) ((((float) c17.field_downloadedSize) / ((float) c17.field_totalSize)) * 100.0f));
            }
        }
        b0Var.f96986h.remove(d17.f96962e);
        b0Var.f96987i.remove(d17.f96962e);
        b0Var.f97212a.e(j17);
    }
}
