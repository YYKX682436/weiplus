package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class o implements u81.f {
    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17;
        if (bVar == u81.b.DESTROYED) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "AppBrandRuntime state changed to destroyed");
            if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
                c11738x6e2c0d85.f158465d = str;
                c11738x6e2c0d85.f158467f = 65535;
                c11738x6e2c0d85.f158468g = 2;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str) != null && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str)) != null) {
                    c11738x6e2c0d85.f158474p = b17.u0().X;
                    c11738x6e2c0d85.f158466e = b17.f156338p.f158814g;
                    if (b17.r0() != null) {
                        c11738x6e2c0d85.f158469h = b17.r0().getClass().getName();
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d85);
            }
            java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158528d;
            if (!hashSet.remove(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, not start, return");
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            if (isEmpty) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationReceivedIfNeed");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b != null) {
                    if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 t0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var;
                        if (t0Var == null) {
                            kVar.getClass();
                        } else {
                            synchronized (kVar.f158510e) {
                                kVar.f158510e.remove(t0Var);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158526b = null;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationEvent, appId:%s, lastStop: %b", str, java.lang.Boolean.valueOf(isEmpty));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a;
            if (l0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(str, l0Var);
                if (isEmpty) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158525a = null;
                }
            }
            if (isEmpty) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, last stop, dead listener");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.f158527c.mo48814x2efc64();
            }
        }
    }
}
