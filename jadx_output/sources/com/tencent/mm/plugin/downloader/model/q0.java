package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.r0 f97120f;

    public q0(com.tencent.mm.plugin.downloader.model.r0 r0Var, h02.a aVar, boolean z17) {
        this.f97120f = r0Var;
        this.f97118d = aVar;
        this.f97119e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.PendingIntent pendingIntent;
        h02.a aVar = this.f97118d;
        int i17 = aVar.field_fileType;
        com.tencent.mm.plugin.downloader.model.r0 r0Var = this.f97120f;
        if (i17 == 1) {
            java.lang.String str = aVar.field_filePath;
            r0Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            intent.setClass(context, com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive.class);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 3);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96958o, str);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96959p, aVar.field_md5);
            intent.putExtra("downloadId", aVar.field_downloadId);
            pendingIntent = android.app.PendingIntent.getBroadcast(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
        } else if (i17 == 5) {
            r0Var.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            intent2.setClass(context2, com.tencent.mm.plugin.downloader.model.FileDownloadPendingReceive.class);
            intent2.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 4);
            intent2.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96958o, aVar.field_filePath);
            intent2.putExtra("downloadId", aVar.field_downloadId);
            android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context2, (int) java.lang.System.currentTimeMillis(), intent2, fp.g0.a(0));
            try {
                java.lang.String appId = new org.json.JSONObject(aVar.field_extInfo).getString("appId");
                ((com.tencent.mm.minigame.x0) ((ft.m4) i95.n0.c(ft.m4.class))).getClass();
                kotlin.jvm.internal.o.g(appId, "appId");
                com.tencent.mm.minigame.j1.f69084a.a(appId);
                ((com.tencent.mm.minigame.x0) ((ft.m4) i95.n0.c(ft.m4.class))).wi("download");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDownloadManager", e17, "onDownloadSuccess preloadWVA Exception", new java.lang.Object[0]);
            }
            pendingIntent = broadcast;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "onDownloadSuccess field_fileType[%d]", java.lang.Integer.valueOf(i17));
            pendingIntent = null;
        }
        if (aVar.field_fileType == 5) {
            r0Var.g().j(aVar, 3, false);
            r0Var.y(aVar.field_appId, aVar.field_notificationTitle, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nhm), pendingIntent);
        } else if (aVar.field_showNotification && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_notificationTitle)) {
            r0Var.y(aVar.field_appId, aVar.field_notificationTitle, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cej), pendingIntent);
        } else if (aVar.field_showNotification && com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_fileName)) {
            r0Var.y(aVar.field_appId, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cej), "", pendingIntent);
        } else if (aVar.field_showNotification && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_fileName)) {
            r0Var.y(aVar.field_appId, aVar.field_fileName, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cej), pendingIntent);
        }
        if (aVar.field_autoInstall && aVar.field_fileType == 1 && !aVar.field_reserveInWifi) {
            r0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_filePath)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadManager", "installApk, path is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadManager", "APK File Path: %s", aVar.field_filePath);
                k02.l.a(aVar.field_downloadId, true, null);
            }
        }
        r0Var.f97131f.d(aVar.field_downloadId, aVar.field_filePath, this.f97119e);
    }
}
