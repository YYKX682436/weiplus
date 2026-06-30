package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public class b implements sf.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f78019a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f78020b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78021c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f78022d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f78023e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.x f78024f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.v f78025g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.w f78026h;

    public b(int i17, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var) {
        this.f78019a = i17;
        this.f78020b = jSONObject;
        this.f78022d = new java.lang.ref.WeakReference(lVar);
        this.f78021c = k0Var;
        this.f78023e = lVar.getAppId();
    }

    @Override // sf.f
    public java.lang.String a(jc1.d dVar) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar != null && (k0Var = this.f78021c) != null) {
            lVar.a(this.f78019a, k0Var.r(null, dVar, null));
        }
        return null;
    }

    @Override // sf.f
    public java.lang.String b(jc1.d dVar, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar != null && (k0Var = this.f78021c) != null) {
            lVar.a(this.f78019a, k0Var.q(null, dVar, map));
        }
        return null;
    }

    @Override // sf.f
    public org.json.JSONObject c() {
        org.json.JSONObject jSONObject = this.f78020b;
        return jSONObject != null ? jSONObject : new org.json.JSONObject();
    }

    @Override // sf.f
    public java.lang.String d(java.lang.String str, jc1.d dVar) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar != null && (k0Var = this.f78021c) != null) {
            lVar.a(this.f78019a, k0Var.r(str, dVar, null));
        }
        return null;
    }

    @Override // sf.f
    public void e(final sf.e eVar) {
        final com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t)) {
            final androidx.lifecycle.y lifecycleOwner = lVar.getLifecycleOwner();
            if (lifecycleOwner != null) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.extendplugin.b$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.extendplugin.b bVar = com.tencent.mm.plugin.appbrand.extendplugin.b.this;
                        bVar.getClass();
                        lifecycleOwner.mo133getLifecycle().a(new androidx.lifecycle.x(bVar, eVar, lVar) { // from class: com.tencent.mm.plugin.appbrand.extendplugin.AppBrandInvokeContext$4

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ sf.e f78017d;

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f78018e;

                            {
                                this.f78017d = r2;
                                this.f78018e = r3;
                            }

                            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                            public void onDestroyed() {
                                sf.e eVar2 = this.f78017d;
                                if (eVar2 != null) {
                                    eVar2.onDestroy();
                                }
                            }

                            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
                            public void onPaused() {
                                sf.e eVar2 = this.f78017d;
                                if (eVar2 != null) {
                                    eVar2.a(tf1.h.b(this.f78018e.getAppId()));
                                }
                            }

                            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                            public void onResumed() {
                                sf.e eVar2 = this.f78017d;
                                if (eVar2 != null) {
                                    eVar2.b();
                                }
                            }
                        });
                    }
                };
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    runnable.run();
                    return;
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(runnable);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "addLifecycleListener");
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) lVar;
        com.tencent.mm.plugin.appbrand.extendplugin.c cVar = new com.tencent.mm.plugin.appbrand.extendplugin.c(this, eVar);
        this.f78024f = cVar;
        this.f78025g = new com.tencent.mm.plugin.appbrand.extendplugin.d(this, eVar, lVar);
        this.f78026h = new com.tencent.mm.plugin.appbrand.extendplugin.e(this, eVar);
        tVar.U(cVar);
        tVar.R(this.f78025g);
        tVar.w(this.f78026h);
    }

    @Override // sf.f
    public void f() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "removeLifecycleListener");
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) lVar;
            com.tencent.mm.plugin.appbrand.jsapi.x xVar = this.f78024f;
            if (xVar != null) {
                tVar.I(xVar);
                this.f78024f = null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.v vVar = this.f78025g;
            if (vVar != null) {
                tVar.O(vVar);
                this.f78025g = null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.w wVar = this.f78026h;
            if (wVar != null) {
                tVar.K(wVar);
                this.f78026h = null;
            }
        }
    }

    @Override // sf.f
    public java.lang.String g(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar == null || (k0Var = this.f78021c) == null) {
            return null;
        }
        lVar.a(this.f78019a, k0Var.o(str));
        return null;
    }

    @Override // sf.f
    public java.lang.String getAppId() {
        return this.f78023e;
    }

    @Override // sf.f
    public android.content.Context getContext() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar != null) {
            return lVar.getContext();
        }
        return null;
    }

    @Override // sf.f
    public java.lang.String h(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
        if (lVar == null || (k0Var = this.f78021c) == null) {
            return null;
        }
        lVar.a(this.f78019a, k0Var.p(str, map));
        return null;
    }

    @Override // sf.f
    public void i(sf.e eVar) {
    }

    @Override // sf.f
    public boolean j() {
        return this.f78021c instanceof com.tencent.mm.plugin.appbrand.jsapi.a1;
    }

    @Override // sf.f
    public boolean k() {
        return this.f78021c instanceof tf1.k;
    }

    @Override // sf.f
    public java.lang.String l() {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78021c;
        if (k0Var != null) {
            return k0Var.k();
        }
        return null;
    }

    @Override // sf.f
    public com.tencent.mm.plugin.appbrand.jsapi.l m() {
        return (com.tencent.mm.plugin.appbrand.jsapi.l) this.f78022d.get();
    }
}
