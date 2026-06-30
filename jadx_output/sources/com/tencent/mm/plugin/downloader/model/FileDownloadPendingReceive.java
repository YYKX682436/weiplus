package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class FileDownloadPendingReceive extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadPendingReceive", "onReceive()");
        intent.setComponent(new android.content.ComponentName(intent.getComponent().getPackageName(), com.tencent.mm.plugin.downloader.model.FileDownloadService.class.getName()));
        j45.l.A(intent);
    }
}
