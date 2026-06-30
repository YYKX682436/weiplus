package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.t0 f97182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f97183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.y0 f97184f;

    public v0(com.tencent.mm.plugin.downloader.model.y0 y0Var, com.tencent.mm.plugin.downloader.model.t0 t0Var, h02.a aVar) {
        this.f97184f = y0Var;
        this.f97182d = t0Var;
        this.f97183e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f97182d.getClass();
        com.tencent.mm.plugin.downloader.model.y0 y0Var = this.f97184f;
        h02.a aVar = this.f97183e;
        long h17 = y0Var.h(aVar);
        if (h17 <= 0) {
            aVar.field_status = 4;
            com.tencent.mm.plugin.downloader.model.m0.l(aVar);
            y0Var.f97212a.c(aVar.field_downloadId, 901, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImpl23", "addDownloadTask Failed: Invalid downloadId");
            return;
        }
        aVar.field_sysDownloadId = h17;
        aVar.field_status = 1;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        y0Var.f97212a.i(aVar.field_downloadId, aVar.field_filePath);
        if (com.tencent.mm.plugin.downloader.model.r0.i().m(aVar.field_downloadId)) {
            com.tencent.mm.plugin.downloader.model.r0 i17 = com.tencent.mm.plugin.downloader.model.r0.i();
            long j17 = aVar.field_downloadId;
            i17.getClass();
            ((java.util.HashMap) com.tencent.mm.plugin.downloader.model.r0.f97123h).put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(h17));
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("off_line_download_ids", 0).edit().putLong(j17 + "", h17).commit();
        }
        y0Var.f97203e.add(java.lang.Long.valueOf(aVar.field_downloadId));
        if (y0Var.f97204f.e()) {
            y0Var.f97204f.c(100L, 100L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImpl23", "addDownloadTask: id: %d, url: %s, path: %s", java.lang.Long.valueOf(aVar.field_downloadId), aVar.field_downloadUrl, aVar.field_filePath);
    }
}
