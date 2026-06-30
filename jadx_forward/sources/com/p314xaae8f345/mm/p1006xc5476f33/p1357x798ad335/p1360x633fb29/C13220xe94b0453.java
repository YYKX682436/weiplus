package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadReceiver */
/* loaded from: classes5.dex */
public class C13220xe94b0453 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadReceiver", action);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadReceiver", "action is null or nill, ignore");
        } else {
            action.equals("android.intent.action.DOWNLOAD_COMPLETE");
        }
    }
}
