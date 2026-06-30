package com.p314xaae8f345.mm.p1006xc5476f33.p1249x2dddaf.p1250x7643c6b5;

/* renamed from: com.tencent.mm.plugin.auto.service.MMAutoMessageHeardReceiver */
/* loaded from: classes11.dex */
public class C12830xc6590d8d extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "key_username");
        if (l17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "username %s heard", l17);
        if (!gm0.j1.i().f354751k || !gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.auto.MMAutoMessageHeardReceiver", "kernel or account not ready.");
            return;
        }
        if (gn1.a.f()) {
            if (!gn1.a.h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not open car mode");
            } else if (!gn1.a.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not install auto app");
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1496L, 2L, 1L, false);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).b0(l17);
            }
        }
    }
}
