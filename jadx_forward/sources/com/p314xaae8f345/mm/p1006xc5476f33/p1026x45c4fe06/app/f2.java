package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 f156613d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 t1Var) {
        this.f156613d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1 t1Var = this.f156613d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandZombieTaskKiller", "check with scene:" + t1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.wi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d, t1Var);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandZombieTaskKiller", "checkAndKillZombieTasks get exception:" + th6);
        }
    }
}
