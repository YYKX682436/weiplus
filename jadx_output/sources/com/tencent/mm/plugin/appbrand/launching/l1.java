package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class l1 implements hm0.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f84745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x2 f84746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84748i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams f84749m;

    public l1(com.tencent.mm.plugin.appbrand.launching.m1 m1Var, java.lang.String str, java.lang.String str2, com.tencent.mm.ipcinvoker.r rVar, com.tencent.mm.plugin.appbrand.launching.x2 x2Var, int i17, int i18, com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams) {
        this.f84743d = str;
        this.f84744e = str2;
        this.f84745f = rVar;
        this.f84746g = x2Var;
        this.f84747h = i17;
        this.f84748i = i18;
        this.f84749m = appBrandPrepareTask$PrepareParams;
    }

    @Override // hm0.t
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke onMMKernelStartupDone username[%s] appId[%s]", this.f84743d, this.f84744e);
        gm0.y1 y1Var = gm0.j1.i().f273208a.f273302g;
        y1Var.getClass();
        fm5.b bVar = new fm5.b(this, y1Var);
        synchronized (y1Var) {
            y1Var.f264181d.remove(bVar);
        }
        boolean n17 = gm0.j1.b().n();
        boolean r17 = gm0.m.r();
        if (n17 && !r17) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareCall$2$2
                {
                    this.__eventId = 19430116;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent) {
                    if (coreAccountInitializationNotifiedEvent != null) {
                        dead();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall account notifyAllDone, start real prepare");
                    }
                    com.tencent.mm.plugin.appbrand.launching.l1.this.f84746g.m();
                    return false;
                }
            };
            if (gm0.j1.b().f273254q) {
                iListener.callback(null);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall account not notifyAllDone yet, wait for it");
                iListener.alive();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall, startup done, hasLogin %B, hold %B", java.lang.Boolean.valueOf(n17), java.lang.Boolean.valueOf(r17));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.launching.k1(this));
        com.tencent.mm.ipcinvoker.r rVar = this.f84745f;
        if (rVar != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_KILL_CLIENT_PROCESS;
            rVar.a(appBrandPrepareTask$PrepareResult);
        }
    }

    @Override // hm0.t
    public void e(boolean z17) {
        gm0.y1 y1Var = gm0.j1.i().f273208a.f273302g;
        y1Var.getClass();
        fm5.b bVar = new fm5.b(this, y1Var);
        synchronized (y1Var) {
            y1Var.f264181d.remove(bVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "kernel onExit(%b), kill prepare process appId[%s] type[%d] scene[%d] sessionId[%s]", java.lang.Boolean.valueOf(z17), this.f84744e, java.lang.Integer.valueOf(this.f84747h), java.lang.Integer.valueOf(this.f84748i), this.f84749m.f84382f.f47276v);
        com.tencent.mm.ipcinvoker.r rVar = this.f84745f;
        if (rVar != null) {
            com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
            appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_KILL_CLIENT_PROCESS;
            rVar.a(appBrandPrepareTask$PrepareResult);
        }
    }
}
