package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f77031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f77032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.l5 f77033f;

    public c5(com.tencent.mm.plugin.appbrand.l5 l5Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        this.f77033f = l5Var;
        this.f77031d = appBrandRuntime;
        this.f77032e = appBrandInitConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        this.f77033f.f84225i.c();
        if (this.f77031d == null) {
            this.f77033f.u();
        }
        com.tencent.mm.plugin.appbrand.l5 l5Var = this.f77033f;
        java.lang.String str = this.f77032e.f77278d;
        java.util.Iterator it = l5Var.f84226m.iterator();
        while (true) {
            if (!it.hasNext()) {
                appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) ((java.util.HashMap) l5Var.f84227n).get(str);
                break;
            } else {
                appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next();
                if (appBrandRuntime.f74803n.equals(str)) {
                    break;
                }
            }
        }
        if (appBrandRuntime != null) {
            this.f77033f.B(this.f77031d, appBrandRuntime, this.f77032e);
            return;
        }
        com.tencent.mm.plugin.appbrand.l5 l5Var2 = this.f77033f;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig cfg = this.f77032e;
        com.tencent.mm.plugin.appbrand.d9 d9Var = (com.tencent.mm.plugin.appbrand.d9) l5Var2;
        d9Var.getClass();
        kotlin.jvm.internal.o.g(cfg, "cfg");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6 = com.tencent.mm.plugin.appbrand.v1.a((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) cfg, d9Var);
        if (rt6 == null) {
            try {
                java.lang.Class cls = d9Var.f84223g;
                rt6 = (ze.n) ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) new d56.b(cls, cls).d(d9Var).f226632b);
            } catch (d56.c unused) {
                rt6 = new com.tencent.mm.plugin.appbrand.o6((com.tencent.mm.plugin.appbrand.l5) d9Var);
            }
        }
        com.tencent.mm.plugin.appbrand.l5 l5Var3 = this.f77033f;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f77031d;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig config = this.f77032e;
        com.tencent.mm.plugin.appbrand.d9 d9Var2 = (com.tencent.mm.plugin.appbrand.d9) l5Var3;
        d9Var2.getClass();
        ze.n nVar = (ze.n) appBrandRuntime2;
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(config, "config");
        if (rt6.J0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWidgetImpl", "loadNew(), runtime[" + rt6.f74803n + "] initialized, should be persistent, use loadExisted() instead");
            d9Var2.B(nVar, rt6, config);
            if (kotlin.jvm.internal.o.b(rt6.f74796e, d9Var2)) {
                com.tencent.mm.plugin.appbrand.report.b3.f87812a.e((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) config);
            }
            if (d9Var2.f84221e) {
                rt6.i0();
                return;
            }
            return;
        }
        rt6.f74804o = nVar;
        rt6.I0(config);
        d9Var2.f84226m.push(rt6);
        d9Var2.m(rt6.f74810s);
        if (nVar != null) {
            nVar.f0();
        }
        rt6.X0();
        if (kotlin.jvm.internal.o.b(rt6.f74796e, d9Var2)) {
            com.tencent.mm.plugin.appbrand.report.b3.f87812a.c((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) config);
        }
    }
}
