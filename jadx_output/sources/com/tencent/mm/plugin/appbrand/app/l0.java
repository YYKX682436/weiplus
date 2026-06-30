package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class l0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.x0 f75165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f75167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler f75168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.x6 f75169h;

    public l0(com.tencent.mm.plugin.appbrand.task.x0 x0Var, boolean z17, int i17, com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler, com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        this.f75165d = x0Var;
        this.f75166e = z17;
        this.f75167f = i17;
        this.f75168g = appBrandPreloadProfiler;
        this.f75169h = x6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.app.o0.f75205c = true;
        boolean z17 = com.tencent.mm.plugin.appbrand.app.o0.f75204b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "start misc preload type[%s], aggressive[%b], reason[%s], skip[%b], level[%d]", this.f75165d, java.lang.Boolean.valueOf(this.f75166e), (java.lang.String) obj, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f75167f));
        if (!z17) {
            try {
                com.tencent.mm.plugin.appbrand.ipc.f.a();
                if (this.f75166e) {
                    if (com.tencent.mm.plugin.appbrand.task.r.b(this.f75165d)) {
                        com.tencent.mm.plugin.appbrand.task.r.j(this.f75165d, null, true, this.f75168g, this.f75169h, this.f75167f);
                    }
                    com.tencent.mm.plugin.appbrand.app.o0.a("preload aggressive before keepalive");
                    if (bm5.f1.a().equals(com.tencent.mm.plugin.appbrand.task.z0.f89222n)) {
                        com.tencent.mm.plugin.appbrand.keepalive.j.a(new com.tencent.mm.plugin.appbrand.app.l0$$a());
                    }
                } else {
                    com.tencent.mm.plugin.appbrand.task.r.j(this.f75165d, null, false, this.f75168g, this.f75169h, this.f75167f);
                }
            } catch (java.lang.Exception e17) {
                if (com.tencent.mm.plugin.appbrand.o6.f86162n3) {
                    throw e17;
                }
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", e17, "Preload [%s] in IdleHandler encountered Exception", this.f75165d.name());
            }
        }
        return 0;
    }
}
