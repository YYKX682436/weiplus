package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class q0 implements l75.i0 {
    public q0(com.tencent.mm.modelstat.t0 t0Var) {
    }

    @Override // l75.i0
    public void d() {
    }

    @Override // l75.i0
    public void p() {
        com.tencent.mm.modelstat.a0 Ai;
        gm0.j1.i();
        if (!gm0.j1.a() || (Ai = com.tencent.mm.modelstat.t0.Ai()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreStat", "summer preCloseCallback netStatStg: " + Ai);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        Ai.f71491f.a(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetStat", "summer net appendAllToDisk end takes: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    @Override // l75.i0
    public void u() {
    }
}
