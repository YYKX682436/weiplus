package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask f69041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask) {
        super(1);
        this.f69041d = jsApiAddDownloadTaskForWVA$AddDownloadTask;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        long j18;
        long j19;
        com.tencent.mm.plugin.appbrand.launching.nc downloadInfo = (com.tencent.mm.plugin.appbrand.launching.nc) obj;
        kotlin.jvm.internal.o.g(downloadInfo, "downloadInfo");
        java.lang.String str = downloadInfo.f84820a;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask jsApiAddDownloadTaskForWVA$AddDownloadTask = this.f69041d;
        if (!z17) {
            long j27 = downloadInfo.f84823d;
            if (j27 > 0) {
                jsApiAddDownloadTaskForWVA$AddDownloadTask.f69017p = j27;
            }
        }
        j17 = jsApiAddDownloadTaskForWVA$AddDownloadTask.f69017p;
        if (j17 > 0) {
            j18 = jsApiAddDownloadTaskForWVA$AddDownloadTask.f69017p;
            if (!fp.i.a(j18)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Storage insufficient for download: needSize=");
                j19 = jsApiAddDownloadTaskForWVA$AddDownloadTask.f69017p;
                sb6.append(j19);
                com.tencent.mars.xlog.Log.w("MicroMsg.WVA.addDownloadTaskForWVA", sb6.toString());
                jsApiAddDownloadTaskForWVA$AddDownloadTask.D = true;
                jsApiAddDownloadTaskForWVA$AddDownloadTask.E = "fail_storage_insufficient";
                jsApiAddDownloadTaskForWVA$AddDownloadTask.c();
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.minigame.download.mmdownloader.JsApiAddDownloadTaskForWVA$AddDownloadTask.D(jsApiAddDownloadTaskForWVA$AddDownloadTask, downloadInfo);
        return jz5.f0.f302826a;
    }
}
