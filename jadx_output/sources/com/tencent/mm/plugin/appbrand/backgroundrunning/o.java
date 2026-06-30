package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class o implements u81.f {
    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        com.tencent.mm.plugin.appbrand.o6 b17;
        if (bVar == u81.b.DESTROYED) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "AppBrandRuntime state changed to destroyed");
            if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
                appBrandBackgroundRunningOperationParcel.f76932d = str;
                appBrandBackgroundRunningOperationParcel.f76934f = 65535;
                appBrandBackgroundRunningOperationParcel.f76935g = 2;
                if (com.tencent.mm.plugin.appbrand.l.b(str) != null && (b17 = com.tencent.mm.plugin.appbrand.l.b(str)) != null) {
                    appBrandBackgroundRunningOperationParcel.f76941p = b17.u0().X;
                    appBrandBackgroundRunningOperationParcel.f76933e = b17.f74805p.f77281g;
                    if (b17.r0() != null) {
                        appBrandBackgroundRunningOperationParcel.f76936h = b17.r0().getClass().getName();
                    }
                }
                ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel);
            }
            java.util.HashSet hashSet = (java.util.HashSet) com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76995d;
            if (!hashSet.remove(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, not start, return");
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            if (isEmpty) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationReceivedIfNeed");
                if (com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b != null) {
                    if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
                        com.tencent.mm.plugin.appbrand.backgroundrunning.t0 t0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b;
                        com.tencent.mm.plugin.appbrand.backgroundrunning.k kVar = (com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var;
                        if (t0Var == null) {
                            kVar.getClass();
                        } else {
                            synchronized (kVar.f76977e) {
                                kVar.f76977e.remove(t0Var);
                            }
                        }
                    }
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76993b = null;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "stopListeningOperationEvent, appId:%s, lastStop: %b", str, java.lang.Boolean.valueOf(isEmpty));
            com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a;
            if (l0Var != null) {
                com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(str, l0Var);
                if (isEmpty) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a = null;
                }
            }
            if (isEmpty) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "onRunningStateChanged, last stop, dead listener");
                com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76994c.dead();
            }
        }
    }
}
