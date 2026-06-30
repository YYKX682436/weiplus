package com.tencent.mm.modelstat;

/* loaded from: classes9.dex */
public class h0 extends android.content.BroadcastReceiver {
    public h0(com.tencent.mm.modelstat.c0 c0Var) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, final android.content.Intent intent) {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.modelstat.h0$$a
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (gm0.j1.b().m()) {
                        gm0.j1.b();
                        if (!gm0.m.r()) {
                            android.content.Intent intent2 = intent;
                            if (intent2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(intent2.getAction())) {
                                java.lang.String action = intent2.getAction();
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetTypeReporter", "onReceive action:%s foreground:%b", action, java.lang.Boolean.valueOf(z65.c.f470455a));
                                if (z65.c.f470455a && action.equals(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
                                    new com.tencent.mm.autogen.events.MMConnectivityChangeEvent().e();
                                }
                            }
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            objArr[0] = intent2 == null ? "intent is null" : "action is null";
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "onReceive %s  ", objArr);
                        }
                    }
                    gm0.j1.b();
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "onReceive acc not ready .%b %b", java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(gm0.m.r()));
                } catch (java.lang.Throwable th6) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "onReceive : %s", com.tencent.mm.sdk.platformtools.z3.c(th6));
                }
            }
        }, "NetTypeReporter");
    }
}
