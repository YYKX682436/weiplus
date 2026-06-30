package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class p extends android.content.BroadcastReceiver {
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.o oVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
            return;
        }
        if (intent == null) {
            return;
        }
        boolean equals = "android.intent.action.BATTERY_OKAY".equals(intent.getAction());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.c0 c0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.b0.f221979a;
        if (equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_OKAY, checkDownload");
            m43.c.b().a("game_silent_download", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.x(c0Var, true));
        } else if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_LOW, pauseDownload");
            c0Var.c();
        }
    }
}
