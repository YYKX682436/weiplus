package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e0 {

    /* renamed from: f, reason: collision with root package name */
    public final cl.p f165501f;

    /* renamed from: g, reason: collision with root package name */
    public final cl.q0 f165502g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p f165503h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f165504i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f165505m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f165506n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f165507o = new byte[0];

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f165508p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f165509q;

    public b(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0) {
        cl.p u07 = u0(c5138xafbea1a0);
        this.f165501f = u07;
        this.f165509q = c5138xafbea1a0 != null && c5138xafbea1a0.f135482g;
        cl.q0 v07 = v0(u07, 1);
        this.f165502g = v07;
        ((cl.a) u07).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c(this), false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d(this));
        this.f165503h = pVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "setMainContext id:%d", 1);
        synchronized (pVar.f165559c) {
            pVar.f165559c.put(1, this);
        }
        v07.getClass();
        ((cl.a) v07.f124257b).h(new cl.d1(v07, null), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n
    public cl.p c0() {
        return this.f165501f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public synchronized void d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar) {
        this.f165506n.add(xVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        ((cl.a) this.f165502g.f124257b).f124120t.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e(this));
        ((cl.a) this.f165502g.f124257b).f124121u.add(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.util.ArrayList arrayList;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b.this;
                synchronized (bVar) {
                    arrayList = new java.util.ArrayList(bVar.f165506n);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x) it.next()).mo32099xac79a11b();
                }
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = this.f165503h;
        synchronized (pVar.f165559c) {
            for (int i17 = 0; i17 < pVar.f165559c.size(); i17++) {
                int keyAt = pVar.f165559c.keyAt(i17);
                if (keyAt != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d", java.lang.Integer.valueOf(keyAt));
                    if (pVar.f165559c.get(keyAt) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d null", java.lang.Integer.valueOf(keyAt));
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) pVar.f165559c.get(keyAt)).mo14659x5cd39ffa();
                    }
                }
            }
            pVar.f165559c.clear();
        }
        super.mo14659x5cd39ffa();
        ((cl.a) this.f165501f).g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public synchronized void f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar, boolean z17) {
        if (z17) {
            this.f165505m.add(xVar);
        } else {
            this.f165504i.add(xVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        if ((cls != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0.class || this.f165509q) && cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r
    public final boolean l() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n
    public final cl.q0 n0() {
        return this.f165502g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r
    public final int o() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public synchronized void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar) {
        f0(xVar, false);
    }

    public final void s0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        synchronized (this.f165507o) {
            java.util.ArrayList arrayList = this.f165508p;
            if (arrayList != null) {
                arrayList.add(d0Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
        this.f165502g.g(1, sVar);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = this.f165503h;
        int incrementAndGet = pVar.f165558b.incrementAndGet();
        cl.a aVar = (cl.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d) pVar.f165557a).f165516a.f165501f;
        cl.q0 q0Var = new cl.q0(aVar, aVar.b(), new cl.d(aVar, incrementAndGet));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q(q0Var, incrementAndGet);
        synchronized (pVar.f165559c) {
            pVar.f165559c.put(incrementAndGet, qVar);
        }
        ((cl.a) q0Var.f124257b).h(new cl.d1(q0Var, null), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContext id:%d", java.lang.Integer.valueOf(incrementAndGet));
        return qVar;
    }

    public abstract cl.p u0(com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0);

    public abstract cl.q0 v0(cl.p pVar, int i17);

    public final java.util.List w0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = this.f165503h;
        pVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        synchronized (pVar.f165559c) {
            for (int i17 = 0; i17 < pVar.f165559c.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) pVar.f165559c.valueAt(i17);
                if (!nVar.l() || z17) {
                    linkedList.add(nVar);
                }
            }
        }
        return linkedList;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = this.f165503h;
        synchronized (pVar.f165559c) {
            rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r) pVar.f165559c.get(i17);
        }
        return rVar;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r y0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = this.f165503h;
        synchronized (pVar.f165559c) {
            rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r) pVar.f165559c.get(1);
        }
        return rVar;
    }
}
