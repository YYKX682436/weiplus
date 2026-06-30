package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 f239818d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var) {
        this.f239818d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = this.f239818d;
        g0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Update CLog ratio from server.");
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.d().f152297d;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportManagerKvCheck", "dispatcher is null, just return.");
        } else {
            new lx3.k(g0Var.f239714n, g0Var.f239715o).mo807x6c193ac1(sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q0(g0Var));
        }
    }
}
