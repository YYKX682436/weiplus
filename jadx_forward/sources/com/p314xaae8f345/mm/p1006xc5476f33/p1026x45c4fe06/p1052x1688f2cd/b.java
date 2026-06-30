package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd;

/* loaded from: classes7.dex */
public class b implements sf.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f159552a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f159553b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f159554c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f159555d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f159556e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x f159557f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v f159558g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w f159559h;

    public b(int i17, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var) {
        this.f159552a = i17;
        this.f159553b = jSONObject;
        this.f159555d = new java.lang.ref.WeakReference(lVar);
        this.f159554c = k0Var;
        this.f159556e = lVar.mo48798x74292566();
    }

    @Override // sf.f
    public java.lang.String a(jc1.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar != null && (k0Var = this.f159554c) != null) {
            lVar.a(this.f159552a, k0Var.r(null, dVar, null));
        }
        return null;
    }

    @Override // sf.f
    public java.lang.String b(jc1.d dVar, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar != null && (k0Var = this.f159554c) != null) {
            lVar.a(this.f159552a, k0Var.q(null, dVar, map));
        }
        return null;
    }

    @Override // sf.f
    public org.json.JSONObject c() {
        org.json.JSONObject jSONObject = this.f159553b;
        return jSONObject != null ? jSONObject : new org.json.JSONObject();
    }

    @Override // sf.f
    public java.lang.String d(java.lang.String str, jc1.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar != null && (k0Var = this.f159554c) != null) {
            lVar.a(this.f159552a, k0Var.r(str, dVar, null));
        }
        return null;
    }

    @Override // sf.f
    public void e(final sf.e eVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t)) {
            final p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = lVar.mo50358x95c7fa5f();
            if (mo50358x95c7fa5f != null) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.extendplugin.b$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b.this;
                        bVar.getClass();
                        mo50358x95c7fa5f.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x(bVar, eVar, lVar) { // from class: com.tencent.mm.plugin.appbrand.extendplugin.AppBrandInvokeContext$4

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ sf.e f159550d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f159551e;

                            {
                                this.f159550d = r2;
                                this.f159551e = r3;
                            }

                            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                            /* renamed from: onDestroyed */
                            public void m50268x7495d2fa() {
                                sf.e eVar2 = this.f159550d;
                                if (eVar2 != null) {
                                    eVar2.mo10362xac79a11b();
                                }
                            }

                            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
                            /* renamed from: onPaused */
                            public void m50269x53a16fed() {
                                sf.e eVar2 = this.f159550d;
                                if (eVar2 != null) {
                                    eVar2.a(tf1.h.b(this.f159551e.mo48798x74292566()));
                                }
                            }

                            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                            /* renamed from: onResumed */
                            public void m50270x91113ef8() {
                                sf.e eVar2 = this.f159550d;
                                if (eVar2 != null) {
                                    eVar2.b();
                                }
                            }
                        });
                    }
                };
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    runnable.run();
                    return;
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "addLifecycleListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.c(this, eVar);
        this.f159557f = cVar;
        this.f159558g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.d(this, eVar, lVar);
        this.f159559h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.e(this, eVar);
        tVar.U(cVar);
        tVar.R(this.f159558g);
        tVar.w(this.f159559h);
    }

    @Override // sf.f
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "removeLifecycleListener");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) lVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x xVar = this.f159557f;
            if (xVar != null) {
                tVar.I(xVar);
                this.f159557f = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v vVar = this.f159558g;
            if (vVar != null) {
                tVar.O(vVar);
                this.f159558g = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w wVar = this.f159559h;
            if (wVar != null) {
                tVar.K(wVar);
                this.f159559h = null;
            }
        }
    }

    @Override // sf.f
    public java.lang.String g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar == null || (k0Var = this.f159554c) == null) {
            return null;
        }
        lVar.a(this.f159552a, k0Var.o(str));
        return null;
    }

    @Override // sf.f
    /* renamed from: getAppId */
    public java.lang.String mo50271x74292566() {
        return this.f159556e;
    }

    @Override // sf.f
    /* renamed from: getContext */
    public android.content.Context mo50272x76847179() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar != null) {
            return lVar.mo50352x76847179();
        }
        return null;
    }

    @Override // sf.f
    public java.lang.String h(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
        if (lVar == null || (k0Var = this.f159554c) == null) {
            return null;
        }
        lVar.a(this.f159552a, k0Var.p(str, map));
        return null;
    }

    @Override // sf.f
    public void i(sf.e eVar) {
    }

    @Override // sf.f
    public boolean j() {
        return this.f159554c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1;
    }

    @Override // sf.f
    public boolean k() {
        return this.f159554c instanceof tf1.k;
    }

    @Override // sf.f
    public java.lang.String l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f159554c;
        if (k0Var != null) {
            return k0Var.k();
        }
        return null;
    }

    @Override // sf.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f159555d.get();
    }
}
