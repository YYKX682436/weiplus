package com.tencent.mm.plugin.downloader.ui;

/* loaded from: classes8.dex */
public class FileDownloadNotificationClickReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
        if (!com.tencent.mm.sdk.platformtools.c2.a(intent)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadNotificationClickReceiver", "checkIntentSafe error");
            return;
        }
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(intent.getLongExtra("extra_download_id", 0L));
        if (c17 != null) {
            int i17 = c17.field_status;
            if (i17 == 1) {
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.field_extInfo, 11311002L, 1L, 2, "{\"status\":1}");
            } else if (i17 == 4) {
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.field_extInfo, 11311002L, 1L, 2, "{\"status\":2}");
            }
        }
        if (intent.hasExtra("extra_download_id")) {
            android.os.Bundle extras = intent.getExtras();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI.class);
            intent2.putExtras(extras);
            intent2.setFlags(268435456);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/ui/FileDownloadNotificationClickReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/downloader/ui/FileDownloadNotificationClickReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
