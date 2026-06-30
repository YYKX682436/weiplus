package com.tencent.mm.plugin.downloader.model;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class FileDownloadReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadReceiver", action);
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadReceiver", "action is null or nill, ignore");
        } else {
            action.equals("android.intent.action.DOWNLOAD_COMPLETE");
        }
    }
}
