package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f97199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.b0 f97200e;

    public y(com.tencent.mm.plugin.downloader.model.b0 b0Var, long j17) {
        this.f97200e = b0Var;
        this.f97199d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        h02.a c17;
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = this.f97200e.d(this.f97199d);
        if (d17 == null) {
            return;
        }
        iv1.f f17 = iv1.f.f();
        java.lang.String str = d17.f96962e;
        synchronized (f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "removeDownloadTask: " + str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CDNDownloadClient", "removeDownloadTask, url invalid");
            } else {
                f17.i(new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo(str));
                fv1.c cVar = f17.f295111e;
                if (cVar != null) {
                    try {
                        cVar.Ba(str);
                    } catch (android.os.RemoteException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "removeDownloadTask, " + e17.getMessage());
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "removeDownloadTask false, service interface is null");
            }
        }
        this.f97200e.h(d17.f96962e);
        com.tencent.mm.vfs.w6.h(d17.f96964g);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "removeDownloadTask, delete file, path: %s", d17.f96964g);
        if (d17.f96963f == 5 || (c17 = com.tencent.mm.plugin.downloader.model.m0.c(this.f97199d)) == null) {
            return;
        }
        c17.field_finishTime = java.lang.System.currentTimeMillis();
        c17.field_downloadedSize = d17.f96967m;
        c17.field_status = 5;
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        com.tencent.mm.plugin.downloader.model.m0.m(c17.field_downloadUrl, 5);
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) this.f97200e.f96987i.get(d17.f96962e), c17.field_startTime));
        if (valueOf != null) {
            k02.m.a(this.f97199d, ((((float) (d17.f96967m - java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) this.f97200e.f96986h.get(d17.f96962e), c17.field_startSize)).longValue())) * 1000.0f) / ((float) (java.lang.System.currentTimeMillis() - valueOf.longValue()))) / 1048576.0f, (int) ((((float) d17.f96967m) / ((float) d17.f96968n)) * 100.0f));
        }
        this.f97200e.f96986h.remove(d17.f96962e);
        this.f97200e.f96987i.remove(d17.f96962e);
        this.f97200e.f97212a.g(this.f97199d);
    }
}
