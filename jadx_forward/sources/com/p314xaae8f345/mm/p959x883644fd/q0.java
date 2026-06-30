package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public class q0 implements l75.i0 {
    public q0(com.p314xaae8f345.mm.p959x883644fd.t0 t0Var) {
    }

    @Override // l75.i0
    public void d() {
    }

    @Override // l75.i0
    public void p() {
        com.p314xaae8f345.mm.p959x883644fd.a0 Ai;
        gm0.j1.i();
        if (!gm0.j1.a() || (Ai = com.p314xaae8f345.mm.p959x883644fd.t0.Ai()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreStat", "summer preCloseCallback netStatStg: " + Ai);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        Ai.f153024f.a(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetStat", "summer net appendAllToDisk end takes: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Override // l75.i0
    public void u() {
    }
}
