package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.task.u0 a() {
        boolean z17 = false;
        if (com.tencent.mm.plugin.appbrand.task.u0.f89200i == null) {
            synchronized (com.tencent.luggage.sdk.processes.r.f47681e) {
                if (com.tencent.mm.plugin.appbrand.task.u0.f89200i == null) {
                    com.tencent.mm.plugin.appbrand.task.u0 b17 = com.tencent.mm.plugin.appbrand.task.v0.b();
                    com.tencent.mm.plugin.appbrand.task.u0.f89200i = b17;
                    if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                        throw new java.lang.IllegalAccessError("ProcessManager can only used by main process");
                    }
                    if (com.tencent.luggage.sdk.processes.r.f47682f == null) {
                        com.tencent.luggage.sdk.processes.r.f47682f = b17;
                        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.luggage.sdk.processes.i());
                    }
                    com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
                    com.tencent.mm.plugin.appbrand.task.u0 u0Var = com.tencent.mm.plugin.appbrand.task.u0.f89200i;
                    if (u0Var == null) {
                        kotlin.jvm.internal.o.o("INSTANCE_");
                        throw null;
                    }
                    wVar.a(u0Var);
                    z17 = true;
                }
            }
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).a(com.tencent.mm.plugin.appbrand.task.g0.f89027d);
        }
        com.tencent.mm.plugin.appbrand.task.u0 u0Var2 = com.tencent.mm.plugin.appbrand.task.u0.f89200i;
        if (u0Var2 != null) {
            return u0Var2;
        }
        kotlin.jvm.internal.o.o("INSTANCE_");
        throw null;
    }

    public final java.lang.String[] b() {
        com.tencent.luggage.sdk.processes.e eVar = com.tencent.luggage.sdk.processes.h.f47639g;
        return (java.lang.String[]) kz5.n0.Q(kz5.n0.V0(kz5.z.I(new java.lang.String[]{eVar.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class), eVar.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI1.class), eVar.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI2.class), eVar.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI3.class), eVar.a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI4.class)}))).toArray(new java.lang.String[0]);
    }
}
