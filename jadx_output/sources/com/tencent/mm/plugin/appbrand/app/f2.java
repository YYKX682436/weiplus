package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.app.t1 f75080d;

    public f2(com.tencent.mm.plugin.appbrand.app.t1 t1Var) {
        this.f75080d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.app.t1 t1Var = this.f75080d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandZombieTaskKiller", "check with scene:" + t1Var);
            com.tencent.mm.plugin.appbrand.app.g2.wi(com.tencent.mm.plugin.appbrand.app.g2.f75089d, t1Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandZombieTaskKiller", "checkAndKillZombieTasks get exception:" + th6);
        }
    }
}
