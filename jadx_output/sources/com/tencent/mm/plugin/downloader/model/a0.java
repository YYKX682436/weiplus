package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f96974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f96975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f96976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.b0 f96977g;

    public a0(com.tencent.mm.plugin.downloader.model.b0 b0Var, h02.a aVar, boolean z17, long j17) {
        this.f96977g = b0Var;
        this.f96974d = aVar;
        this.f96975e = z17;
        this.f96976f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        h02.a aVar = this.f96974d;
        com.tencent.mm.plugin.downloader.api.f.c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
        zo3.p.Ui().d(this.f96974d.field_appId);
        iv1.f f17 = iv1.f.f();
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo g17 = com.tencent.mm.plugin.downloader.model.b0.g(this.f96977g, this.f96974d);
        synchronized (f17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17.f95499e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
                i17 = -1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask: " + g17.f95499e);
                if (((java.util.HashSet) f17.f295113g).contains(g17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, already in running");
                    i17 = -2;
                } else {
                    com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState h17 = f17.h(g17.f95499e);
                    if (h17 != null && h17.f95511d == 104 && com.tencent.mm.vfs.w6.j(g17.f95501g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask, has download success");
                        i17 = 1;
                    } else {
                        g17.f95508q = true;
                        fv1.c cVar = f17.f295111e;
                        if (cVar != null) {
                            try {
                                int aa6 = cVar.aa(g17);
                                ((iv1.d) f17.f295117n).L2(g17.f95500f, 1, 0, "");
                                if (aa6 == 0 || aa6 == -2) {
                                    f17.c(g17);
                                }
                                i17 = aa6;
                            } catch (android.os.RemoteException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "resumeDownloadTask, " + e17.getMessage());
                            }
                        }
                        f17.c(g17);
                        f17.d();
                        i17 = 0;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "resumeDownloadTask: " + i17);
        this.f96974d.field_startTime = java.lang.System.currentTimeMillis();
        h02.a aVar2 = this.f96974d;
        aVar2.field_startSize = aVar2.field_downloadedSize;
        aVar2.field_startState = 1;
        if (i17 == 0) {
            aVar2.field_status = 1;
            aVar2.field_errCode = 0;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar2);
            if (this.f96975e) {
                this.f96977g.f97212a.h(this.f96976f, this.f96974d.field_filePath);
            }
            h02.a aVar3 = this.f96974d;
            long j17 = aVar3.field_totalSize;
            long j18 = j17 != 0 ? (aVar3.field_downloadedSize * 100) / j17 : 0L;
            long j19 = this.f96974d.field_downloadedSize;
            long j27 = this.f96974d.field_totalSize;
            this.f96977g.l(this.f96974d.field_downloadUrl, 1, (int) j18, true, false, true);
            return;
        }
        if (i17 == -2) {
            aVar2.field_status = 1;
            aVar2.field_errCode = 0;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar2);
            return;
        }
        if (i17 != 1) {
            aVar2.field_status = 4;
            aVar2.field_errCode = 202;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar2);
            this.f96977g.f97212a.c(this.f96976f, this.f96974d.field_errCode, false);
            return;
        }
        int i18 = aVar2.field_status;
        if (i18 == 6 || i18 == 3) {
            return;
        }
        aVar2.field_status = 6;
        long j28 = aVar2.field_totalSize;
        aVar2.field_downloadedSize = j28;
        aVar2.field_startSize = j28;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        aVar2.field_finishTime = currentTimeMillis;
        aVar2.field_startTime = currentTimeMillis;
        com.tencent.mm.plugin.downloader.model.m0.l(this.f96974d);
        this.f96977g.f97212a.b(this.f96974d.field_downloadId);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
        intent.setClass(this.f96977g.f96981c, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, this.f96974d.field_downloadId);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", e18.getMessage());
        }
    }
}
