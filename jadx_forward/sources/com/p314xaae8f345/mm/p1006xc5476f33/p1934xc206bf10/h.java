package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u uVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String a17 = fo3.l.a(7);
            int max = java.lang.Math.max(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sensor_max_sampling_count_for_pay, 200), 0);
            jo3.b bVar = new jo3.b(a17, max);
            if (max > 0) {
                ot5.i iVar = io3.c.f375033d;
                java.lang.Object obj = iVar.f430411a;
                if (obj == null) {
                    synchronized (iVar) {
                        obj = iVar.f430411a;
                        if (obj == null) {
                            obj = iVar.a();
                            iVar.f430411a = obj;
                        }
                    }
                }
                io3.c cVar = (io3.c) obj;
                cVar.c(1, 7, bVar, 0L);
                cVar.c(3, 0, a17, bVar.f382426b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NormsgSourceImpl", th6, "run csd error", new java.lang.Object[0]);
        }
    }
}
