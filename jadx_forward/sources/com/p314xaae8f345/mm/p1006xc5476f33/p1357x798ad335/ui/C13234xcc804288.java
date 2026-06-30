package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui;

/* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadNotificationClickReceiver */
/* loaded from: classes8.dex */
public class C13234xcc804288 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.a(intent)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadNotificationClickReceiver", "checkIntentSafe error");
            return;
        }
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(intent.getLongExtra("extra_download_id", 0L));
        if (c17 != null) {
            int i17 = c17.f68441x10a0fed7;
            if (i17 == 1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.f68417x26b3182a, 11311002L, 1L, 2, "{\"status\":1}");
            } else if (i17 == 4) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.f68417x26b3182a, 11311002L, 1L, 2, "{\"status\":2}");
            }
        }
        if (intent.hasExtra("extra_download_id")) {
            android.os.Bundle extras = intent.getExtras();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13233xe6767370.class);
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
