package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes9.dex */
public class h0 extends android.content.BroadcastReceiver {
    public h0(com.p314xaae8f345.mm.p959x883644fd.c0 c0Var) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, final android.content.Intent intent) {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.modelstat.h0$$a
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (gm0.j1.b().m()) {
                        gm0.j1.b();
                        if (!gm0.m.r()) {
                            android.content.Intent intent2 = intent;
                            if (intent2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent2.getAction())) {
                                java.lang.String action = intent2.getAction();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetTypeReporter", "onReceive action:%s foreground:%b", action, java.lang.Boolean.valueOf(z65.c.f551988a));
                                if (z65.c.f551988a && action.equals(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
                                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5693x3e790cd3().e();
                                }
                            }
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            objArr[0] = intent2 == null ? "intent is null" : "action is null";
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "onReceive %s  ", objArr);
                        }
                    }
                    gm0.j1.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "onReceive acc not ready .%b %b", java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.m.r()));
                } catch (java.lang.Throwable th6) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "onReceive : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
                }
            }
        }, "NetTypeReporter");
    }
}
