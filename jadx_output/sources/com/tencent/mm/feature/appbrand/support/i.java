package com.tencent.mm.feature.appbrand.support;

@j95.b
/* loaded from: classes7.dex */
public final class i extends i95.w implements ft.e {
    static {
        new com.tencent.mm.feature.appbrand.support.c(null);
    }

    @Override // ft.e
    public java.util.List R6() {
        java.util.List list;
        boolean o17 = com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b);
        kz5.p0 p0Var = kz5.p0.f313996d;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (o17) {
            com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap) uk0.a.d(iPCVoid, com.tencent.mm.feature.appbrand.support.g.f65073a);
            if (appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap != null && (list = appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcessListWrap.f65043d) != null) {
                return list;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "getAllProcesses(), by mm, ipc failed");
            return p0Var;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.sdk.platformtools.z7 b17 = m45.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String[] strArr = gm0.j1.f273205l;
        boolean z17 = false;
        int i17 = 0;
        while (i17 < 5) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i17];
            if ((str != null && b17.f193137a.indexOfKey(str.hashCode()) >= 0) ? true : z17) {
                com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess) com.tencent.mm.ipcinvoker.f.b(str, iPCVoid, com.tencent.mm.feature.appbrand.support.h.f65074a);
                if (appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess != null) {
                    linkedList.add(appBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessManagerServiceAnyProcess", "getAllProcesses(), by each process, ipc ready process:" + str + " failed");
                }
            } else {
                linkedList.add(new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(str, p0Var, r26.i0.o(str, ":appbrand1", z17, 2, null) ? ft.d.WAGAME : ft.d.WASERVICE, false, 0, 16, null));
            }
            i17++;
            z17 = false;
        }
        return linkedList;
    }

    @Override // ft.e
    public void Rc(com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // ft.e
    public void V4() {
        throw new jz5.k("An operation is not implemented: Not support");
    }

    @Override // ft.e
    public void g5(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
    }

    @Override // ft.e
    public void m7(com.tencent.mm.sdk.event.IEvent iEvent) {
    }

    @Override // ft.e
    public void v6() {
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.appbrand.app.r0.f75243h;
            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.app.r0$$a(), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }
}
