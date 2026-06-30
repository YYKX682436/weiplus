package com.tencent.mm.plugin.auto.service;

/* loaded from: classes11.dex */
public class MMAutoMessageHeardReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "key_username");
        if (l17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "username %s heard", l17);
        if (!gm0.j1.i().f273218k || !gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.auto.MMAutoMessageHeardReceiver", "kernel or account not ready.");
            return;
        }
        if (gn1.a.f()) {
            if (!gn1.a.h()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not open car mode");
            } else if (!gn1.a.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not install auto app");
            } else {
                jx3.f.INSTANCE.idkeyStat(1496L, 2L, 1L, false);
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(l17);
            }
        }
    }
}
