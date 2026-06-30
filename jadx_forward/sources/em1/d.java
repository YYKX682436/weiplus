package em1;

/* loaded from: classes7.dex */
public abstract class d extends cl.l3 {

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f336559f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f336560g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f336561h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseArray f336562i;

    public d(cl.m3 m3Var) {
        super(m3Var);
        this.f336559f = new em1.e(this, 1);
        this.f336560g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f336561h = new android.util.SparseArray();
        this.f336562i = new em1.f(this, 1);
        this.f124221d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.a();
    }

    @Override // cl.l3
    public void a(cl.q0 q0Var, java.util.ArrayList arrayList, cl.k3 k3Var) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        em1.h hVar = new em1.h(this, arrayList2, q0Var, k3Var);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cl.j3 j3Var = (cl.j3) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8EngineWorkerManagerLU", "batchInjectWorkEvalItems, about to submit item:%s, valid(%b)", j3Var.f124201a, java.lang.Boolean.valueOf(j3Var.a()));
            if (j3Var.a()) {
                boolean z17 = j3Var instanceof em1.o;
                if (z17) {
                }
                java.lang.String[] strArr = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128893l0;
                int length = strArr.length;
                boolean z18 = false;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (u46.l.b(j3Var.f124201a, strArr[i17])) {
                        z18 = true;
                        break;
                    }
                    i17++;
                }
                com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = j3Var.f124202b;
                if (z18) {
                    hVar.mo1850x58b836e(java.lang.Boolean.FALSE);
                    if (j3Var.a()) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
                        arrayList3.add(c1481x17e6a5e9);
                        q0Var.b(arrayList3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.a(), new em1.i(this, j3Var, currentTimeMillis));
                    }
                } else {
                    java.lang.String str = z17 ? ((em1.o) j3Var).f336598c : null;
                    if (!u46.l.e(str)) {
                        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e92 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
                        c1481x17e6a5e92.f4814xcdd22c98 = str;
                        c1481x17e6a5e92.f4815xcdd276a5 = 3;
                        arrayList2.add(c1481x17e6a5e92);
                    }
                    arrayList2.add(c1481x17e6a5e9);
                }
            }
        }
        hVar.mo1850x58b836e(java.lang.Boolean.TRUE);
    }

    @Override // cl.l3
    public void b(cl.q0 q0Var, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (q0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8EngineWorkerManagerLU", "hy: engine context released");
        } else if (valueCallback != null) {
            q0Var.d(str, new em1.m(this, valueCallback));
        } else {
            q0Var.d(str, null);
        }
    }

    @Override // cl.l3
    public void c(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.util.List list, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8EngineWorkerManagerLU", "hy: trigger bind to %d", java.lang.Integer.valueOf(i17));
        cl.q0 q0Var = (cl.q0) this.f124219b.get(java.lang.Integer.valueOf(i17));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(q0Var);
        if (q0Var == null || mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8EngineWorkerManagerLU", "hy: worker not in map!");
        } else {
            ((cl.a) q0Var.f124257b).h(new em1.l(this, mVar, list, d(i17, weakReference), q0Var, i17, z17), false);
        }
    }

    @Override // cl.l3
    public void e(final int i17, cl.q0 q0Var) {
        final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2) this.f336562i.get(i17);
        if (n2Var != null) {
            cl.p pVar = q0Var.f124257b;
            ((cl.a) pVar).f124121u.add(new java.lang.Runnable() { // from class: em1.d$$a
                @Override // java.lang.Runnable
                public final void run() {
                    u81.h hVar;
                    em1.d dVar = em1.d.this;
                    dVar.getClass();
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var2 = n2Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = n2Var2.f129038d;
                    if (c11510xdd90c2f2 != null && (hVar = c11510xdd90c2f2.N) != null) {
                        hVar.c(n2Var2.f129036b);
                    }
                    com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var2.f129035a;
                    if (abstractC22919x419b2652 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
                        throw null;
                    }
                    abstractC22919x419b2652.m83328x5cd39ffa();
                    dVar.f336562i.remove(i17);
                }
            });
        }
        final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e) this.f336559f.get(i17);
        if (eVar != null) {
            cl.p pVar2 = q0Var.f124257b;
            ((cl.a) pVar2).f124120t.add(new java.lang.Runnable() { // from class: em1.d$$b
                @Override // java.lang.Runnable
                public final void run() {
                    em1.d dVar = em1.d.this;
                    dVar.getClass();
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e eVar2 = eVar;
                    eVar2.f128932b.b();
                    eVar2.f128931a.m43151x68d28c71();
                    dVar.f336559f.remove(i17);
                }
            });
        }
        synchronized (this.f336561h) {
            this.f336561h.remove(i17);
        }
        super.e(i17, q0Var);
    }

    @Override // cl.l3
    public void f() {
        super.f();
        this.f336559f.clear();
        this.f336562i.clear();
        this.f336561h.clear();
    }

    @Override // cl.l3
    public void h() {
        if (this.f336560g.getAndSet(true)) {
            return;
        }
        synchronized (this.f336561h) {
            for (int i17 = 0; i17 < this.f336561h.size(); i17++) {
                final em1.n nVar = (em1.n) this.f336561h.valueAt(i17);
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = nVar.f336597d;
                ((cl.a) nVar.f336596c.f124257b).h(new java.lang.Runnable() { // from class: em1.d$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        em1.d dVar = em1.d.this;
                        dVar.getClass();
                        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = nVar.f336595b.f128931a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar2 = mVar;
                        c5128x72a3f151.m43155xb8268694(mVar2.mo48798x74292566(), dVar.l(mVar2), dVar.k(mVar2));
                    }
                }, false);
                final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2) this.f336562i.get(nVar.f336594a);
                if (n2Var != null && (mVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) mVar;
                    if (e9Var.t3() != null) {
                        ((cl.a) nVar.f336596c.f124257b).h(new java.lang.Runnable() { // from class: em1.d$$d
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2.this.c(e9Var.t3(), ((cl.a) nVar.f336596c.f124257b).f124101a.m15873x206d1933());
                            }
                        }, false);
                    }
                }
            }
        }
    }

    @Override // cl.l3
    public com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8EngineWorkerManagerLU", "[no-node] setupJSRuntimeConfig called");
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 i17 = super.i(mVar);
        if (!(mVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) ? false : ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) mVar).A1().f128903q) {
            i17.f135493r = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8EngineWorkerManagerLU", "[no-node] setupJSRuntimeConfig: config.skipNode = true");
        }
        return i17;
    }

    public final java.lang.String k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) mVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
        if (interfaceC11702x4ae7c33 == null) {
            return "";
        }
        return org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V + interfaceC11702x4ae7c33.i();
    }

    public java.lang.String l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        return "";
    }

    public java.lang.String m() {
        return "";
    }

    public void n(cl.j3 j3Var, long j17, long j18, cl.k1 k1Var) {
    }
}
