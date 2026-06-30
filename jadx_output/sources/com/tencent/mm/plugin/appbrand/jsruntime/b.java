package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class b extends com.tencent.mm.plugin.appbrand.jsruntime.n implements com.tencent.mm.plugin.appbrand.jsruntime.t, com.tencent.mm.plugin.appbrand.jsruntime.j0, com.tencent.mm.plugin.appbrand.jsruntime.y, com.tencent.mm.plugin.appbrand.jsruntime.e0 {

    /* renamed from: f, reason: collision with root package name */
    public final cl.p f83968f;

    /* renamed from: g, reason: collision with root package name */
    public final cl.q0 f83969g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.p f83970h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f83971i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f83972m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f83973n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f83974o = new byte[0];

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f83975p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f83976q;

    public b(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        cl.p u07 = u0(iJSRuntime$Config);
        this.f83968f = u07;
        this.f83976q = iJSRuntime$Config != null && iJSRuntime$Config.f53949g;
        cl.q0 v07 = v0(u07, 1);
        this.f83969g = v07;
        ((cl.a) u07).h(new com.tencent.mm.plugin.appbrand.jsruntime.c(this), false);
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = new com.tencent.mm.plugin.appbrand.jsruntime.p(new com.tencent.mm.plugin.appbrand.jsruntime.d(this));
        this.f83970h = pVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "setMainContext id:%d", 1);
        synchronized (pVar.f84026c) {
            pVar.f84026c.put(1, this);
        }
        v07.getClass();
        ((cl.a) v07.f42724b).h(new cl.d1(v07, null), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n
    public cl.p c0() {
        return this.f83968f;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public synchronized void d0(com.tencent.mm.plugin.appbrand.jsruntime.x xVar) {
        this.f83973n.add(xVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        ((cl.a) this.f83969g.f42724b).f42587t.add(new com.tencent.mm.plugin.appbrand.jsruntime.e(this));
        ((cl.a) this.f83969g.f42724b).f42588u.add(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.util.ArrayList arrayList;
                com.tencent.mm.plugin.appbrand.jsruntime.b bVar = com.tencent.mm.plugin.appbrand.jsruntime.b.this;
                synchronized (bVar) {
                    arrayList = new java.util.ArrayList(bVar.f83973n);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.appbrand.jsruntime.x) it.next()).onDestroy();
                }
            }
        });
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = this.f83970h;
        synchronized (pVar.f84026c) {
            for (int i17 = 0; i17 < pVar.f84026c.size(); i17++) {
                int keyAt = pVar.f84026c.keyAt(i17);
                if (keyAt != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d", java.lang.Integer.valueOf(keyAt));
                    if (pVar.f84026c.get(keyAt) == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d null", java.lang.Integer.valueOf(keyAt));
                    } else {
                        ((com.tencent.mm.plugin.appbrand.jsruntime.n) pVar.f84026c.get(keyAt)).destroy();
                    }
                }
            }
            pVar.f84026c.clear();
        }
        super.destroy();
        ((cl.a) this.f83968f).g();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public synchronized void f0(com.tencent.mm.plugin.appbrand.jsruntime.x xVar, boolean z17) {
        if (z17) {
            this.f83972m.add(xVar);
        } else {
            this.f83971i.add(xVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.t
    public final com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        if ((cls != com.tencent.mm.plugin.appbrand.jsruntime.b0.class || this.f83976q) && cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.r
    public final boolean l() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.n
    public final cl.q0 n0() {
        return this.f83969g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.r
    public final int o() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.y
    public synchronized void r(com.tencent.mm.plugin.appbrand.jsruntime.x xVar) {
        f0(xVar, false);
    }

    public final void s0(com.tencent.mm.plugin.appbrand.jsruntime.d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        synchronized (this.f83974o) {
            java.util.ArrayList arrayList = this.f83975p;
            if (arrayList != null) {
                arrayList.add(d0Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
        this.f83969g.g(1, sVar);
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.r t0() {
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = this.f83970h;
        int incrementAndGet = pVar.f84025b.incrementAndGet();
        cl.a aVar = (cl.a) ((com.tencent.mm.plugin.appbrand.jsruntime.d) pVar.f84024a).f83983a.f83968f;
        cl.q0 q0Var = new cl.q0(aVar, aVar.b(), new cl.d(aVar, incrementAndGet));
        com.tencent.mm.plugin.appbrand.jsruntime.q qVar = new com.tencent.mm.plugin.appbrand.jsruntime.q(q0Var, incrementAndGet);
        synchronized (pVar.f84026c) {
            pVar.f84026c.put(incrementAndGet, qVar);
        }
        ((cl.a) q0Var.f42724b).h(new cl.d1(q0Var, null), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContext id:%d", java.lang.Integer.valueOf(incrementAndGet));
        return qVar;
    }

    public abstract cl.p u0(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config);

    public abstract cl.q0 v0(cl.p pVar, int i17);

    public final java.util.List w0(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = this.f83970h;
        pVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (pVar.f84026c) {
            for (int i17 = 0; i17 < pVar.f84026c.size(); i17++) {
                com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) pVar.f84026c.valueAt(i17);
                if (!nVar.l() || z17) {
                    linkedList.add(nVar);
                }
            }
        }
        return linkedList;
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.r x0(int i17) {
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar;
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = this.f83970h;
        synchronized (pVar.f84026c) {
            rVar = (com.tencent.mm.plugin.appbrand.jsruntime.r) pVar.f84026c.get(i17);
        }
        return rVar;
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.r y0() {
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar;
        com.tencent.mm.plugin.appbrand.jsruntime.p pVar = this.f83970h;
        synchronized (pVar.f84026c) {
            rVar = (com.tencent.mm.plugin.appbrand.jsruntime.r) pVar.f84026c.get(1);
        }
        return rVar;
    }
}
