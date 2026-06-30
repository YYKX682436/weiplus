package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.f1 f97016f;

    public d1(com.tencent.mm.plugin.downloader.model.f1 f1Var, h02.a aVar, long j17) {
        this.f97016f = f1Var;
        this.f97014d = aVar;
        this.f97015e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        h02.a aVar = this.f97014d;
        int resumeHttpMultiSocketDownloadTask = cdnManager != null ? cdnManager.resumeHttpMultiSocketDownloadTask(aVar.field_downloadUrl) : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "resumeDownloadTask: " + resumeHttpMultiSocketDownloadTask);
        aVar.field_startTime = java.lang.System.currentTimeMillis();
        aVar.field_startState = 1;
        aVar.field_startSize = aVar.field_downloadedSize;
        long j17 = this.f97015e;
        com.tencent.mm.plugin.downloader.model.f1 f1Var = this.f97016f;
        if (resumeHttpMultiSocketDownloadTask != 0) {
            aVar.field_status = 4;
            aVar.field_errCode = 202;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar);
            f1Var.f97212a.c(j17, aVar.field_errCode, false);
            return;
        }
        aVar.field_status = 1;
        aVar.field_errCode = 0;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        f1Var.f97212a.h(j17, aVar.field_filePath);
        long j18 = aVar.field_totalSize;
        if (j18 != 0) {
            long j19 = aVar.field_downloadedSize / j18;
        }
    }
}
