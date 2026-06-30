package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 f158244d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 p0Var) {
        this.f158244d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.p0 p0Var = this.f158244d;
        p0Var.f158261b.set(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "run PhoneInUseObservable.enable");
        p0Var.getClass();
        try {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.n0) ((jz5.n) p0Var.f158263d).mo141623x754a37bb());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AVDeviceUsageDatas", e17, "doListen, events: 32", new java.lang.Object[0]);
        }
    }
}
