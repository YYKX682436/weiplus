package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class v1 implements com.tencent.mm.plugin.appbrand.app.y1 {
    @Override // com.tencent.mm.plugin.appbrand.app.y1
    public boolean a(android.app.ActivityManager.AppTask appTask) {
        boolean z17;
        kotlin.jvm.internal.o.g(appTask, "appTask");
        com.tencent.mm.plugin.appbrand.app.y1 y1Var = (android.os.Build.VERSION.SDK_INT < 29 || !com.tencent.mm.plugin.appbrand.app.g2.f75093h) ? com.tencent.mm.plugin.appbrand.app.g2.f75092g ? com.tencent.mm.plugin.appbrand.app.z1.f75357b : com.tencent.mm.plugin.appbrand.app.g2.f75091f ? com.tencent.mm.plugin.appbrand.app.b2.f75021b : com.tencent.mm.plugin.appbrand.app.c2.f75030b : com.tencent.mm.plugin.appbrand.app.a2.f75006b;
        java.lang.Integer Ai = com.tencent.mm.plugin.appbrand.app.g2.Ai(com.tencent.mm.plugin.appbrand.app.g2.f75089d, appTask);
        if (Ai != null) {
            int intValue = Ai.intValue();
            x.d dVar = com.tencent.mm.plugin.appbrand.app.g2.f75100r;
            synchronized (dVar) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "zombieTask ignored Task Ids " + kz5.n0.g0(dVar, null, null, null, 0, null, null, 63, null) + " -> " + intValue);
                if (dVar.contains(java.lang.Integer.valueOf(intValue))) {
                    return false;
                }
                z17 = false;
            }
        } else {
            z17 = false;
        }
        if (y1Var.a(appTask) || com.tencent.mm.plugin.appbrand.app.d2.f75049b.a(appTask)) {
            return true;
        }
        return z17;
    }
}
