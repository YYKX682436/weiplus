package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f169476b;

    /* renamed from: c, reason: collision with root package name */
    public final ze.n f169477c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f169478d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f169479e;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0 f169486l;

    /* renamed from: f, reason: collision with root package name */
    public boolean f169480f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f169481g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f169482h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0 f169483i = null;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0 f169484j = null;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 f169485k = null;

    /* renamed from: m, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y f169487m = null;

    public g(ze.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        this.f169486l = null;
        this.f169476b = nVar.f156336n;
        this.f169477c = nVar;
        this.f169478d = i3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0(false);
        s0Var.f169632b = nVar.f156336n;
        s0Var.f169633c = nVar;
        if (nVar.E0() == null) {
            s0Var.f169635e = nVar.f156338p.f158814g + 1;
            s0Var.f169634d = nVar.u0().L;
        } else {
            s0Var.f169635e = nVar.E0().f387385r.f156932d + 1;
            s0Var.f169634d = nVar.E0().f387385r.f33456x1c82a56c;
        }
        this.f169486l = s0Var;
        h(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        if (bVar == null || this.f169480f) {
            return;
        }
        j(bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public void b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f169479e = null;
        if (this.f169481g) {
            this.f169481g = false;
        } else {
            this.f169487m.b(bVar);
            this.f169484j.a(bVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void d(android.content.Intent intent) {
        this.f169479e = intent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public void e(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH;
        if (wdVar2 == wdVar && this.f169482h) {
            this.f169482h = false;
            h(false);
        } else {
            this.f169482h = false;
        }
        boolean z17 = wdVar2 == wdVar || bVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.Y1()) || bVar2 == bVar;
        this.f169487m.e(bVar, z17 ? null : bVar2, wdVar);
        if (z17) {
            q(bVar, null);
        } else {
            bVar2.w3().c();
            q(bVar, bVar2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void f(long j17) {
        p(j17, 4);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y g() {
        return this.f169487m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void h(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y g17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f169476b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(new java.lang.Throwable()));
            this.f169487m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y.f169653a;
            this.f169484j = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0.f169544n;
            this.f169483i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0.C;
            this.f169485k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0.A;
            return;
        }
        java.lang.String str = this.f169477c.u0().f128809v;
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j.f(this.f169477c.u0().D);
        if (!this.f169477c.f156330f.isEmpty()) {
            we.a aVar = (we.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z5) this.f169477c.f156330f.get(0)).f173978b;
            if (z17 && aVar != null && aVar != this.f169478d && (g17 = aVar.mo51924x62662257().g()) != null) {
                this.f169487m = g17;
            }
        }
        if (this.f169487m == null) {
            this.f169487m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.i(f17, (this.f169487m == null || this.f169487m.mo52410x34715b() == null) ? this.f169477c.t0() : this.f169487m.mo52410x34715b().f169647b);
        }
        ze.n nVar = this.f169477c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0(false, this.f169487m);
        g0Var.f169493f = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = nVar.l2();
        g0Var.f169491d = l27.f169323f;
        g0Var.f169492e = l27.f169324g;
        g0Var.f169494g = nVar.f156336n;
        g0Var.f169495h = nVar;
        g0Var.f169497j = nVar.u0().f158814g + 1;
        g0Var.f169496i = nVar.u0().L;
        g0Var.f169498k = l27.f169325h;
        g0Var.f169508u = l27.f169321d;
        g0Var.f169509v = l27.f169322e;
        this.f169483i = g0Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (f17 == null) {
            f17 = "";
        }
        linkedList.push(f17);
        ze.n nVar2 = this.f169477c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0(false);
        r0Var.f169610g = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l28 = nVar2.l2();
        r0Var.f169608e = l28.f169323f;
        r0Var.f169609f = l28.f169324g;
        r0Var.f169611h = nVar2.f156336n;
        r0Var.f169612i = nVar2;
        if (nVar2.E0() == null) {
            r0Var.f169614k = nVar2.f156338p.f158814g + 1;
            r0Var.f169613j = nVar2.u0().L;
        } else {
            r0Var.f169614k = nVar2.E0().f387385r.f156932d + 1;
            r0Var.f169613j = nVar2.E0().f387385r.f33456x1c82a56c;
        }
        r0Var.f169615l = l28.f169325h;
        r0Var.f169624u = l28.f169321d;
        r0Var.f169625v = l28.f169322e;
        r0Var.f169606c.addAll(linkedList);
        this.f169485k = r0Var;
        ze.n nVar3 = this.f169477c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0(false, this.f169487m);
        try {
            k0Var.f169548d = str;
            k0Var.f169547c = nVar3.f156336n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l29 = nVar3.l2();
            k0Var.f169549e = l29.f169323f;
            k0Var.f169550f = l29.f169324g;
            k0Var.f169551g = l29.f169321d;
            k0Var.f169552h = l29.f169322e;
            k0Var.f169554j = l29.f169325h;
            k0Var.f169555k = nVar3.u0().f158814g + 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Report.kv_14004", e17, "Kv_14004 protect the npe", new java.lang.Object[0]);
        }
        this.f169484j = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void i() {
        this.f169481g = true;
        this.f169482h = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public void j(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        java.lang.String className;
        this.f169480f = true;
        this.f169487m.j(bVar);
        bVar.w3().c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0 g0Var = this.f169483i;
        ze.n nVar = this.f169477c;
        g0Var.getClass();
        android.app.Activity a17 = q75.a.a(bVar.getF229340d());
        if (a17 != null && a17.isFinishing()) {
            g0Var.f169490c = true;
        }
        g0Var.a(nVar, bVar);
        g0Var.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 r0Var = this.f169485k;
        java.util.LinkedList linkedList = r0Var.f169606c;
        r0Var.f169619p = (java.lang.String) linkedList.peekFirst();
        r0Var.f169621r = null;
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(r0Var.f169611h).ordinal();
        if (ordinal == 0) {
            r0Var.f169620q = 3;
        } else if (ordinal == 3) {
            r0Var.f169620q = 6;
        } else if (ordinal != 7) {
            android.content.Intent l17 = r0Var.f169612i.x0().mo51924x62662257().l();
            if (l17 != null) {
                if (l17.getComponent() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Report.kv_14992", "onBackground, intent %s, get null cmp name", l17);
                    className = "";
                } else {
                    className = l17.getComponent().getClassName();
                }
                r0Var.f169620q = 8;
                java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(l17, "appbrand_report_key_target_activity");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (l18 != null) {
                    className = l18;
                }
                r0Var.f169621r = className;
                linkedList.pollFirst();
                linkedList.push(className != null ? className : "");
            } else {
                r0Var.f169620q = 7;
            }
        }
        android.app.Activity a18 = q75.a.a(bVar.getF229340d());
        if (a18 != null && a18.isFinishing()) {
            r0Var.f169607d = true;
        }
        r0Var.b(bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0 k() {
        return this.f169486l;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public android.content.Intent l() {
        return this.f169479e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public void m(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g gVar;
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
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(390L, 0L, 1L, false);
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
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(390L, i18, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 n() {
        return this.f169485k;
    }

    public final void p(long j17, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = this.f169477c.E0();
        if (E0 == null) {
            return;
        }
        int i18 = E0.f387385r.f33456x1c82a56c;
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(13543, this.f169476b, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f169477c.u0().f128817z + 1000));
    }

    public final void q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar2) {
        if (bVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.g0 g0Var = this.f169483i;
            bVar.Y1();
            g0Var.a(this.f169477c, bVar2);
            g0Var.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 r0Var = this.f169485k;
            java.lang.String Y1 = bVar.Y1();
            java.util.LinkedList linkedList = r0Var.f169606c;
            r0Var.f169619p = (java.lang.String) linkedList.peekFirst();
            r0Var.f169620q = 2;
            r0Var.f169621r = Y1;
            linkedList.push(bVar2.X1());
            r0Var.f169605b = bVar2.X1();
            r0Var.b(bVar2);
        }
        this.f169484j.a(bVar);
    }
}
