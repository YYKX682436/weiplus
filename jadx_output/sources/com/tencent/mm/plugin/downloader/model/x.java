package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.b0 f97193e;

    public x(com.tencent.mm.plugin.downloader.model.b0 b0Var, h02.a aVar) {
        this.f97193e = b0Var;
        this.f97192d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        h02.a aVar = this.f97192d;
        com.tencent.mm.plugin.downloader.api.f.c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
        zo3.p.Ui().d(this.f97192d.field_appId);
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo g17 = com.tencent.mm.plugin.downloader.model.b0.g(this.f97193e, this.f97192d);
        iv1.f f17 = iv1.f.f();
        synchronized (f17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17.f95499e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
                i17 = -1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", g17.f95501g, g17.f95499e);
                if (((java.util.HashSet) f17.f295113g).contains(g17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
                    i17 = -2;
                } else {
                    com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState h17 = f17.h(g17.f95499e);
                    if (h17 != null && h17.f95511d == 104 && com.tencent.mm.vfs.w6.j(g17.f95501g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "addDownloadTask, has download success");
                        i17 = 1;
                    } else {
                        fv1.c cVar = f17.f295111e;
                        if (cVar != null) {
                            try {
                                int y27 = cVar.y2(g17);
                                ((iv1.d) f17.f295117n).L2(g17.f95500f, 1, 0, "");
                                if (y27 == 0 || y27 == -2) {
                                    f17.c(g17);
                                }
                                i17 = y27;
                            } catch (android.os.RemoteException e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadClient", "addDownloadTask, " + e17.getMessage());
                            }
                        }
                        f17.c(g17);
                        f17.d();
                        i17 = 0;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileCDNDownloader", "addDownloadTask: ret = %d, downloadId = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f97192d.field_downloadId));
        if (i17 == 0) {
            h02.a aVar2 = this.f97192d;
            aVar2.field_status = 1;
            aVar2.field_startTime = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.downloader.model.m0.a(this.f97192d);
            com.tencent.mm.plugin.downloader.model.l0 l0Var = this.f97193e.f97212a;
            h02.a aVar3 = this.f97192d;
            l0Var.i(aVar3.field_downloadId, aVar3.field_filePath);
            this.f97193e.l(this.f97192d.field_downloadUrl, 1, 0, true, false, false);
            return;
        }
        if (i17 == -2) {
            h02.a aVar4 = this.f97192d;
            aVar4.field_status = 1;
            aVar4.field_startTime = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.downloader.model.m0.a(this.f97192d);
            return;
        }
        if (i17 != 1) {
            h02.a aVar5 = this.f97192d;
            aVar5.field_status = 4;
            aVar5.field_errCode = 201;
            com.tencent.mm.plugin.downloader.model.m0.a(aVar5);
            com.tencent.mm.plugin.downloader.model.l0 l0Var2 = this.f97193e.f97212a;
            h02.a aVar6 = this.f97192d;
            l0Var2.c(aVar6.field_downloadId, aVar6.field_errCode, false);
            return;
        }
        h02.a aVar7 = this.f97192d;
        aVar7.field_status = 6;
        long k17 = com.tencent.mm.vfs.w6.k(aVar7.field_filePath);
        aVar7.field_totalSize = k17;
        aVar7.field_downloadedSize = k17;
        aVar7.field_startSize = k17;
        h02.a aVar8 = this.f97192d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        aVar8.field_finishTime = currentTimeMillis;
        aVar8.field_startTime = currentTimeMillis;
        com.tencent.mm.plugin.downloader.model.m0.a(this.f97192d);
        this.f97193e.f97212a.b(this.f97192d.field_downloadId);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
        intent.setClass(this.f97193e.f96981c, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
        intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, this.f97192d.field_downloadId);
        try {
            j45.l.A(intent);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileCDNDownloader", e18.getMessage());
        }
    }
}
