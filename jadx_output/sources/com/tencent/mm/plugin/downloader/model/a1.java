package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class a1 extends com.tencent.mm.plugin.downloader.model.z0 {
    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean a(long j17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97150a)) {
            return -1L;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(t0Var.f97150a));
        intent.addFlags(268435456);
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/model/FileDownloaderImplNormal", com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.NAME, "(Lcom/tencent/mm/plugin/downloader/model/FileDownloadRequest;)J", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/downloader/model/FileDownloaderImplNormal", com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.NAME, "(Lcom/tencent/mm/plugin/downloader/model/FileDownloadRequest;)J", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return 0L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplNormal", "Add download task failed: " + e17.toString());
            return -1L;
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean c(long j17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d(long j17) {
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        fileDownloadTaskInfo.f96961d = j17;
        fileDownloadTaskInfo.f96963f = -1;
        return fileDownloadTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long e(h02.a aVar) {
        return 0L;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public int removeDownloadTask(long j17) {
        return 1;
    }
}
