package com.tencent.mm.plugin.appbrand.appusage;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class v1 extends i95.w implements com.tencent.mm.plugin.appbrand.appusage.b6, l75.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.s0 f76595d = com.tencent.mm.plugin.appbrand.appusage.x1.f76644a;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76596e = "MicroMsg.AppBrandLocalUsageStorageNewImpl";

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List Ca(int i17, int i18) {
        if (i17 > 0) {
            return com.tencent.mm.plugin.appbrand.appusage.f3.L0(com.tencent.mm.plugin.appbrand.app.r9.hj().b1(null, i17, 0, i18));
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        kotlin.jvm.internal.o.f(emptyList, "emptyList(...)");
        return emptyList;
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public int getCount() {
        return com.tencent.mm.plugin.appbrand.app.r9.hj().y0();
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        com.tencent.mm.plugin.appbrand.app.r9.hj().remove(q0Var);
        com.tencent.mm.plugin.appbrand.app.r9.ij().remove(q0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List t0(int i17) {
        if (i17 > 0) {
            return com.tencent.mm.plugin.appbrand.appusage.f3.L0(com.tencent.mm.plugin.appbrand.app.r9.hj().b1(null, i17, 0, Integer.MAX_VALUE));
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        kotlin.jvm.internal.o.f(emptyList, "emptyList(...)");
        return emptyList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public boolean x0(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.appusage.o6.a(str, null, i17, null);
        boolean z17 = true;
        if (!com.tencent.mm.plugin.appbrand.app.r9.hj().W0(str, i17, 1)) {
            try {
                if (com.tencent.mm.plugin.appbrand.app.r9.hj().D0(str, i17)) {
                    z17 = false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f76596e, e17, "removeUsage", new java.lang.Object[0]);
                return false;
            }
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List ze(long j17, int i17) {
        return com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.a(j17, i17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        com.tencent.mm.plugin.appbrand.app.r9.hj().add(q0Var, looper);
        com.tencent.mm.plugin.appbrand.app.r9.ij().add(q0Var, looper);
    }
}
