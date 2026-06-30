package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.report.model.s {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f87943b;

    /* renamed from: c, reason: collision with root package name */
    public final ze.n f87944c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.i3 f87945d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f87946e;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.model.s0 f87953l;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87947f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87948g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87949h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.g0 f87950i = null;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.k0 f87951j = null;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.r0 f87952k = null;

    /* renamed from: m, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.report.model.y f87954m = null;

    public g(ze.n nVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        this.f87953l = null;
        this.f87943b = nVar.f74803n;
        this.f87944c = nVar;
        this.f87945d = i3Var;
        com.tencent.mm.plugin.appbrand.report.model.s0 s0Var = new com.tencent.mm.plugin.appbrand.report.model.s0(false);
        s0Var.f88099b = nVar.f74803n;
        s0Var.f88100c = nVar;
        if (nVar.E0() == null) {
            s0Var.f88102e = nVar.f74805p.f77281g + 1;
            s0Var.f88101d = nVar.u0().L;
        } else {
            s0Var.f88102e = nVar.E0().f305852r.f75399d + 1;
            s0Var.f88101d = nVar.E0().f305852r.pkgVersion;
        }
        this.f87953l = s0Var;
        h(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void a(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        if (bVar == null || this.f87947f) {
            return;
        }
        j(bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public void b(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f87946e = null;
        if (this.f87948g) {
            this.f87948g = false;
        } else {
            this.f87954m.b(bVar);
            this.f87951j.a(bVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void d(android.content.Intent intent) {
        this.f87946e = intent;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public void e(com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.luggage.sdk.jsapi.component.b bVar2, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.page.wd wdVar2 = com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH;
        if (wdVar2 == wdVar && this.f87949h) {
            this.f87949h = false;
            h(false);
        } else {
            this.f87949h = false;
        }
        boolean z17 = wdVar2 == wdVar || bVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar2.Y1()) || bVar2 == bVar;
        this.f87954m.e(bVar, z17 ? null : bVar2, wdVar);
        if (z17) {
            q(bVar, null);
        } else {
            bVar2.w3().c();
            q(bVar, bVar2);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void f(long j17) {
        p(j17, 4);
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public com.tencent.mm.plugin.appbrand.report.model.y g() {
        return this.f87954m;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void h(boolean z17) {
        com.tencent.mm.plugin.appbrand.report.model.y g17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f87943b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", com.tencent.mm.sdk.platformtools.z3.c(new java.lang.Throwable()));
            this.f87954m = com.tencent.mm.plugin.appbrand.report.model.y.f88120a;
            this.f87951j = com.tencent.mm.plugin.appbrand.report.model.k0.f88011n;
            this.f87950i = com.tencent.mm.plugin.appbrand.report.model.g0.C;
            this.f87952k = com.tencent.mm.plugin.appbrand.report.model.r0.A;
            return;
        }
        java.lang.String str = this.f87944c.u0().f47276v;
        java.lang.String f17 = com.tencent.mm.plugin.appbrand.report.model.j.f(this.f87944c.u0().D);
        if (!this.f87944c.f74797f.isEmpty()) {
            we.a aVar = (we.a) ((com.tencent.mm.plugin.appbrand.z5) this.f87944c.f74797f.get(0)).f92445b;
            if (z17 && aVar != null && aVar != this.f87945d && (g17 = aVar.getReporter().g()) != null) {
                this.f87954m = g17;
            }
        }
        if (this.f87954m == null) {
            this.f87954m = new com.tencent.mm.plugin.appbrand.report.model.i(f17, (this.f87954m == null || this.f87954m.peek() == null) ? this.f87944c.t0() : this.f87954m.peek().f88114b);
        }
        ze.n nVar = this.f87944c;
        com.tencent.mm.plugin.appbrand.report.model.g0 g0Var = new com.tencent.mm.plugin.appbrand.report.model.g0(false, this.f87954m);
        g0Var.f87960f = str;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = nVar.l2();
        g0Var.f87958d = l27.f87790f;
        g0Var.f87959e = l27.f87791g;
        g0Var.f87961g = nVar.f74803n;
        g0Var.f87962h = nVar;
        g0Var.f87964j = nVar.u0().f77281g + 1;
        g0Var.f87963i = nVar.u0().L;
        g0Var.f87965k = l27.f87792h;
        g0Var.f87975u = l27.f87788d;
        g0Var.f87976v = l27.f87789e;
        this.f87950i = g0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (f17 == null) {
            f17 = "";
        }
        linkedList.push(f17);
        ze.n nVar2 = this.f87944c;
        com.tencent.mm.plugin.appbrand.report.model.r0 r0Var = new com.tencent.mm.plugin.appbrand.report.model.r0(false);
        r0Var.f88077g = str;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l28 = nVar2.l2();
        r0Var.f88075e = l28.f87790f;
        r0Var.f88076f = l28.f87791g;
        r0Var.f88078h = nVar2.f74803n;
        r0Var.f88079i = nVar2;
        if (nVar2.E0() == null) {
            r0Var.f88081k = nVar2.f74805p.f77281g + 1;
            r0Var.f88080j = nVar2.u0().L;
        } else {
            r0Var.f88081k = nVar2.E0().f305852r.f75399d + 1;
            r0Var.f88080j = nVar2.E0().f305852r.pkgVersion;
        }
        r0Var.f88082l = l28.f87792h;
        r0Var.f88091u = l28.f87788d;
        r0Var.f88092v = l28.f87789e;
        r0Var.f88073c.addAll(linkedList);
        this.f87952k = r0Var;
        ze.n nVar3 = this.f87944c;
        com.tencent.mm.plugin.appbrand.report.model.k0 k0Var = new com.tencent.mm.plugin.appbrand.report.model.k0(false, this.f87954m);
        try {
            k0Var.f88015d = str;
            k0Var.f88014c = nVar3.f74803n;
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l29 = nVar3.l2();
            k0Var.f88016e = l29.f87790f;
            k0Var.f88017f = l29.f87791g;
            k0Var.f88018g = l29.f87788d;
            k0Var.f88019h = l29.f87789e;
            k0Var.f88021j = l29.f87792h;
            k0Var.f88022k = nVar3.u0().f77281g + 1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Report.kv_14004", e17, "Kv_14004 protect the npe", new java.lang.Object[0]);
        }
        this.f87951j = k0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void i() {
        this.f87948g = true;
        this.f87949h = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public void j(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        java.lang.String className;
        this.f87947f = true;
        this.f87954m.j(bVar);
        bVar.w3().c();
        com.tencent.mm.plugin.appbrand.report.model.g0 g0Var = this.f87950i;
        ze.n nVar = this.f87944c;
        g0Var.getClass();
        android.app.Activity a17 = q75.a.a(bVar.getF147807d());
        if (a17 != null && a17.isFinishing()) {
            g0Var.f87957c = true;
        }
        g0Var.a(nVar, bVar);
        g0Var.b();
        com.tencent.mm.plugin.appbrand.report.model.r0 r0Var = this.f87952k;
        java.util.LinkedList linkedList = r0Var.f88073c;
        r0Var.f88086p = (java.lang.String) linkedList.peekFirst();
        r0Var.f88088r = null;
        int ordinal = com.tencent.mm.plugin.appbrand.x0.d(r0Var.f88078h).ordinal();
        if (ordinal == 0) {
            r0Var.f88087q = 3;
        } else if (ordinal == 3) {
            r0Var.f88087q = 6;
        } else if (ordinal != 7) {
            android.content.Intent l17 = r0Var.f88079i.x0().getReporter().l();
            if (l17 != null) {
                if (l17.getComponent() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Report.kv_14992", "onBackground, intent %s, get null cmp name", l17);
                    className = "";
                } else {
                    className = l17.getComponent().getClassName();
                }
                r0Var.f88087q = 8;
                java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(l17, "appbrand_report_key_target_activity");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (l18 != null) {
                    className = l18;
                }
                r0Var.f88088r = className;
                linkedList.pollFirst();
                linkedList.push(className != null ? className : "");
            } else {
                r0Var.f88087q = 7;
            }
        }
        android.app.Activity a18 = q75.a.a(bVar.getF147807d());
        if (a18 != null && a18.isFinishing()) {
            r0Var.f88074d = true;
        }
        r0Var.b(bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public com.tencent.mm.plugin.appbrand.report.model.s0 k() {
        return this.f87953l;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public android.content.Intent l() {
        return this.f87946e;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public void m(long j17, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mm.plugin.appbrand.report.model.g gVar;
        int i17;
        int ordinal = wdVar.ordinal();
        int i18 = 2;
        if (ordinal == 0) {
            gVar = this;
            i17 = 1;
        } else if (ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            gVar = this;
            i17 = 3;
        } else {
            gVar = this;
            i17 = 2;
        }
        gVar.p(j17, i17);
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(390L, 0L, 1L, false);
        switch (((int) j17) / 250) {
            case 0:
                i18 = 1;
                break;
            case 1:
                break;
            case 2:
                i18 = 3;
                break;
            case 3:
                i18 = 4;
                break;
            case 4:
            case 5:
                i18 = 5;
                break;
            case 6:
            case 7:
                i18 = 6;
                break;
            default:
                i18 = 7;
                break;
        }
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(390L, i18, 1L, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.s
    public com.tencent.mm.plugin.appbrand.report.model.r0 n() {
        return this.f87952k;
    }

    public final void p(long j17, int i17) {
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = this.f87944c.E0();
        if (E0 == null) {
            return;
        }
        int i18 = E0.f305852r.pkgVersion;
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(13543, this.f87943b, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f87944c.u0().f47284z + 1000));
    }

    public final void q(com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.luggage.sdk.jsapi.component.b bVar2) {
        if (bVar2 != null) {
            com.tencent.mm.plugin.appbrand.report.model.g0 g0Var = this.f87950i;
            bVar.Y1();
            g0Var.a(this.f87944c, bVar2);
            g0Var.b();
            com.tencent.mm.plugin.appbrand.report.model.r0 r0Var = this.f87952k;
            java.lang.String Y1 = bVar.Y1();
            java.util.LinkedList linkedList = r0Var.f88073c;
            r0Var.f88086p = (java.lang.String) linkedList.peekFirst();
            r0Var.f88087q = 2;
            r0Var.f88088r = Y1;
            linkedList.push(bVar2.X1());
            r0Var.f88072b = bVar2.X1();
            r0Var.b(bVar2);
        }
        this.f87951j.a(bVar);
    }
}
