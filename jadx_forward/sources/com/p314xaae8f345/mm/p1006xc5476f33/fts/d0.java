package com.p314xaae8f345.mm.p1006xc5476f33.fts;

@j95.b
/* loaded from: classes12.dex */
public class d0 extends i95.w implements o13.z {
    public static volatile boolean D;
    public static boolean E;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A;
    public final java.util.HashSet B;
    public final java.util.LinkedList C;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.fts.o f218914f;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218923r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f218924s;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.BroadcastReceiver f218925t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f218926u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.p f218927v;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.SparseArray f218928w;

    /* renamed from: x, reason: collision with root package name */
    public final t13.g[] f218929x;

    /* renamed from: y, reason: collision with root package name */
    public final android.util.SparseArray f218930y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.SparseArray f218931z;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.t f218912d = new com.p314xaae8f345.mm.p1006xc5476f33.fts.t();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.t f218913e = new com.p314xaae8f345.mm.p1006xc5476f33.fts.t();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f218915g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f218916h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f218917i = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f218918m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218919n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f218920o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d f218921p = new com.p314xaae8f345.mm.p1006xc5476f33.fts.C15569x5978c15(this);

    /* renamed from: q, reason: collision with root package name */
    public final c01.jd f218922q = new com.p314xaae8f345.mm.p1006xc5476f33.fts.e0(this);

    public d0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f218923r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47>(a0Var) { // from class: com.tencent.mm.plugin.fts.PluginFTS$2
            {
                this.f39173x3fe91575 = -1435144905;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd472 = c5147x8f44fd47;
                com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.this;
                d0Var.f218912d.a().e(c5147x8f44fd472.f135497g.f87945a);
                d0Var.f218913e.a().e(c5147x8f44fd472.f135497g.f87945a);
                d0Var.f218920o = !r4.f87945a;
                return false;
            }
        };
        this.f218924s = new com.p314xaae8f345.mm.p1006xc5476f33.fts.f0(this);
        this.f218925t = new com.p314xaae8f345.mm.p1006xc5476f33.fts.g0(this);
        this.f218926u = new java.util.concurrent.ConcurrentHashMap();
        this.f218928w = new android.util.SparseArray();
        this.f218929x = new t13.g[]{null};
        this.f218930y = new android.util.SparseArray();
        this.f218931z = new android.util.SparseArray();
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a>(a0Var) { // from class: com.tencent.mm.plugin.fts.PluginFTS$6
            {
                this.f39173x3fe91575 = -1187832230;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a c5253x7523e44a) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.this;
                d0Var.getClass();
                d0Var.f218912d.b(65536, new com.p314xaae8f345.mm.p1006xc5476f33.fts.h0(d0Var));
                return false;
            }
        };
        this.B = new java.util.HashSet();
        this.C = new java.util.LinkedList();
    }

    public static void Ai(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        d0Var.getClass();
        d0Var.qj(1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3());
        d0Var.qj(2, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l());
        d0Var.qj(3, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2());
        d0Var.qj(4, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1());
        d0Var.qj(8, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2());
        d0Var.qj(11, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k());
        d0Var.qj(12, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3());
        d0Var.qj(16, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h3());
        d0Var.qj(10000, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4());
        d0Var.qj(14, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1());
    }

    public static void Bi(final com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "Create Index Storage %d", java.lang.Integer.valueOf(d0Var.f218926u.size()));
        if (!d0Var.mj() && !D) {
            D = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("fts_start_create_fail", true, pm0.w.f438337e, null, true, false, new yz5.a() { // from class: com.tencent.mm.plugin.fts.d0$$c
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.String.format("ftsInitExptEnabled=%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.this.f218918m));
                }
            });
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = d0Var.f218926u.values().iterator();
        while (it.hasNext()) {
            linkedList.add((o13.u) it.next());
        }
        java.util.Collections.sort(linkedList);
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ((o13.u) linkedList.get(i17)).mo150428xaf65a0fc();
        }
    }

    public static void Di(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "Create Native Logic");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = d0Var.f218931z;
            if (i17 >= sparseArray.size()) {
                return;
            }
            o13.w wVar = (o13.w) sparseArray.get(sparseArray.keyAt(i17));
            if (wVar != null) {
                try {
                    ((o13.b) wVar).f();
                } catch (java.lang.Exception e17) {
                    java.lang.String mo9545xfb82e301 = wVar.mo9545xfb82e301();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", mo9545xfb82e301, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            i17++;
        }
    }

    public static void wi(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        d0Var.getClass();
        d0Var.pj(new w13.k());
        d0Var.pj(new w13.b());
        d0Var.pj(new w13.f());
        d0Var.pj(new w13.h());
        d0Var.pj(new w13.i());
        d0Var.pj(new w13.a());
        d0Var.pj(new w13.j());
        d0Var.pj(new w13.g());
    }

    public void Ni(p13.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = this.f218912d;
        if (cVar != null) {
            tVar.a().a(cVar);
        } else {
            tVar.getClass();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar2 = this.f218913e;
        if (cVar != null) {
            tVar2.a().a(cVar);
        } else {
            tVar2.getClass();
        }
    }

    public final void Ri() {
        if (this.f218914f != null) {
            try {
                this.f218914f.c();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public t13.k Ui(int i17, android.content.Context context, t13.j jVar, int i18) {
        t13.h hVar = (t13.h) this.f218928w.get(i17);
        if (hVar != null) {
            return hVar.j0(context, jVar, i18);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(t13.l.class)).all()) {
            if (qVar.mo210xb7045565(java.lang.Integer.valueOf(i17))) {
                return ((t13.l) qVar.get()).j0(context, jVar, i18);
            }
        }
        return null;
    }

    public java.util.LinkedList Vi(java.util.HashSet hashSet, android.content.Context context, t13.j jVar, int i17) {
        t13.h hVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            t13.h hVar2 = (t13.h) this.f218928w.get(intValue);
            if (hVar2 != null) {
                linkedList2.add(hVar2);
            } else {
                for (fs.q qVar : ((fs.c) fs.g.f(t13.l.class)).all()) {
                    if (qVar.mo210xb7045565(java.lang.Integer.valueOf(intValue)) && (hVar = (t13.h) qVar.get()) != null) {
                        linkedList2.add(hVar);
                    }
                }
            }
        }
        java.util.Collections.sort(linkedList2);
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            linkedList.add(((t13.h) it6.next()).j0(context, jVar, i17));
        }
        return linkedList;
    }

    public final void Zi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "Destroy Native Logic");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f218931z;
            if (i17 >= sparseArray.size()) {
                return;
            }
            o13.w wVar = (o13.w) sparseArray.get(sparseArray.keyAt(i17));
            if (wVar != null) {
                try {
                    ((o13.b) wVar).g();
                } catch (java.lang.Exception e17) {
                    java.lang.String mo9545xfb82e301 = wVar.mo9545xfb82e301();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "Create Native Logic name=%s \nexception=%s", mo9545xfb82e301, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
            i17++;
        }
    }

    public final void aj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "Destroy Index Storage");
        for (o13.u uVar : this.f218926u.values()) {
            if (uVar != null) {
                uVar.mo150429x5cd39ffa();
            }
        }
    }

    public t13.g bj() {
        t13.g[] gVarArr = this.f218929x;
        if (gVarArr[0] == null) {
            synchronized (gVarArr) {
                t13.g[] gVarArr2 = this.f218929x;
                if (gVarArr2[0] == null) {
                    gVarArr2[0] = new com.p314xaae8f345.mm.p1006xc5476f33.fts.n();
                }
            }
        }
        return this.f218929x[0];
    }

    public o13.u cj(int i17) {
        return (o13.u) this.f218926u.get(java.lang.Integer.valueOf(i17));
    }

    public o13.v fj() {
        if (this.f218927v == null) {
            this.f218927v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p();
        }
        return this.f218927v;
    }

    public u13.h hj(int i17) {
        u13.h hVar = (u13.h) this.f218930y.get(i17);
        if (hVar != null) {
            return hVar;
        }
        for (fs.q qVar : ((fs.c) fs.g.f(u13.i.class)).all()) {
            if (qVar.mo210xb7045565(java.lang.Integer.valueOf(i17))) {
                return (u13.h) qVar.get();
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 ij() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 m3Var;
        synchronized (this.f218931z) {
            m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3) this.f218931z.get(1);
        }
        return m3Var;
    }

    public boolean mj() {
        return this.f218912d.a().b() && this.f218913e.a().b();
    }

    public void nj() {
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.C;
            if (i17 >= linkedList.size()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "lastIndexBuildContent[%d][%s]", java.lang.Integer.valueOf(i17), (java.lang.String) linkedList.get(i17));
            i17++;
        }
    }

    public void oj(t13.h hVar) {
        try {
            this.f218928w.put(hVar.mo9547xfb85f7b0(), hVar);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(o13.d.f423767t);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f218919n = intExtra == 2 || intExtra == 5;
        } else {
            this.f218919n = false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f218925t, intentFilter);
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f218922q;
        if (f17.f118823a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
        } else {
            ((java.util.HashSet) f17.f118824b).add(jdVar);
        }
        this.f218923r.mo48813x58998cd();
        this.A.mo48813x58998cd();
        gm0.j1.d().a(138, this.f218924s);
        this.f218918m = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.fts.C20221x1422e1a2()) == 1;
        if (this.f218918m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "ftsInitExptEnabled=true, defer postTask to startDaemon");
        } else {
            this.f218912d.b(-131072, new com.p314xaae8f345.mm.p1006xc5476f33.fts.j0(this));
            this.f218912d.b(-131071, new com.p314xaae8f345.mm.p1006xc5476f33.fts.i0(this, null));
            this.f218912d.b(65536, new com.p314xaae8f345.mm.p1006xc5476f33.fts.h0(this));
        }
        this.f218916h = true;
        yj(1);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        Zi();
        this.f218928w.clear();
        this.f218930y.clear();
        aj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "resetFTSTaskDaemon");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = this.f218912d;
        tVar.a().c();
        tVar.a().mo63521x35224f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread quit");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar2 = this.f218913e;
        tVar2.a().c();
        tVar2.a().mo63521x35224f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread quit");
        Ri();
        synchronized (this.f218929x) {
            t13.g gVar = this.f218929x[0];
            if (gVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) gVar).c();
                this.f218929x[0] = null;
            }
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f218925t);
        } catch (java.lang.Exception unused) {
        }
        this.f218923r.mo48814x2efc64();
        this.A.mo48814x2efc64();
        gm0.j1.d().q(138, this.f218924s);
        c01.kd f17 = gm0.j1.f();
        c01.jd jdVar = this.f218922q;
        if (f17.f118823a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
        } else {
            ((java.util.HashSet) f17.f118824b).remove(jdVar);
        }
        this.f218915g = false;
        this.f218916h = false;
        this.f218917i = false;
        this.f218918m = false;
    }

    public void pj(o13.u uVar) {
        this.f218926u.put(java.lang.Integer.valueOf(uVar.mo9551xfb85f7b0()), uVar);
    }

    public void qj(int i17, o13.w wVar) {
        synchronized (this.f218931z) {
            this.f218931z.put(i17, wVar);
        }
    }

    public void rj(java.lang.String str) {
        if (this.B.add(str) && !E && gm0.j1.b().h() % 9 == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6428x4b0dd440 c6428x4b0dd440 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6428x4b0dd440();
            c6428x4b0dd440.f137668d = c6428x4b0dd440.b("Action", str, true);
            c6428x4b0dd440.f137669e = c01.id.c();
            c6428x4b0dd440.k();
        }
    }

    public p13.c sj(int i17, p13.u uVar) {
        if (!mj()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButContextNotReady");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.g(-2, uVar);
            s75.d.b(gVar, "FTSExceptionHandler");
            return gVar;
        }
        android.util.SparseArray sparseArray = this.f218931z;
        if (sparseArray.indexOfKey(i17) < 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButNotFindSearchLogic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "Not Found Search Logic, LogicArraySize=%d", java.lang.Integer.valueOf(sparseArray.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.fts.g gVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.g(-2, uVar);
            s75.d.b(gVar2, "FTSExceptionHandler");
            return gVar2;
        }
        o13.w wVar = (o13.w) sparseArray.get(i17);
        if (((o13.b) wVar).f423740d) {
            return wVar.b(uVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchButLogicNotCreated");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.g gVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.g(-2, uVar);
        s75.d.b(gVar3, "FTSExceptionHandler");
        return gVar3;
    }

    public void tj(int i17, int i18, long j17, java.lang.String str, java.lang.String str2) {
        java.lang.String format = java.lang.String.format(java.util.Locale.CHINA, "type:%s subtype:%s entityId:%s auxIndex:%s content:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, str2);
        java.util.LinkedList linkedList = this.C;
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        linkedList.addLast(format);
    }

    public void uj(int i17) {
        try {
            this.f218928w.remove(i17);
        } catch (java.lang.Exception unused) {
        }
    }

    public void vj(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f218926u;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            o13.u uVar = (o13.u) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            try {
                uVar.mo150429x5cd39ffa();
            } catch (java.lang.Exception e17) {
                java.lang.String mo9549xfb82e301 = uVar.mo9549xfb82e301();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "Destroy Index Storage name=%s \nexception=%s", mo9549xfb82e301, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public void wj(int i17) {
        synchronized (this.f218931z) {
            o13.w wVar = (o13.w) this.f218931z.get(i17);
            if (wVar != null) {
                try {
                    ((o13.b) wVar).g();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.PluginFTS", "Destroy Native Logic name=%s \nexception=%s", wVar.mo9545xfb82e301(), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                this.f218931z.remove(i17);
            }
        }
    }

    public void xj(java.lang.String str, p13.y yVar, int i17) {
        if (mj()) {
            android.util.SparseArray sparseArray = this.f218931z;
            if (sparseArray.indexOfKey(1) >= 0) {
                o13.w wVar = (o13.w) sparseArray.get(1);
                java.util.HashMap hashMap = o13.n.f423774a;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (java.util.Map.Entry entry : o13.n.f423774a.entrySet()) {
                    hashMap2.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                wVar.d(str, yVar, i17, hashMap2);
            }
        }
    }

    public void yj(int i17) {
        gm0.j1.i();
        this.f218915g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0;
        if (this.f218915g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon user is initialized, source=%s", java.lang.Integer.valueOf(i17));
        } else {
            gm0.j1.d().a(138, this.f218924s);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for account initialized, source=%s", java.lang.Integer.valueOf(i17));
        }
        if (this.f218916h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon plugin fts account init source=%s", java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "waitAndStartDaemon wait for plugin fts account init source=%s", java.lang.Integer.valueOf(i17));
        }
        if (this.f218915g && this.f218916h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "startDaemon source=%s", java.lang.Integer.valueOf(i17));
            if (!this.f218912d.a().b()) {
                this.f218912d.a().mo63522x68ac462();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread start");
            }
            if (!this.f218913e.a().b()) {
                this.f218913e.a().mo63522x68ac462();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSTaskDaemon", "searchTaskThread start");
            }
            if (!this.f218918m || this.f218917i) {
                return;
            }
            this.f218917i = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "ftsInitExptEnabled=true, postTask to main looper after both daemons started");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.d0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.this;
                    d0Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.j0(d0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = d0Var.f218912d;
                    tVar.b(-131072, j0Var);
                    tVar.b(-131071, new com.p314xaae8f345.mm.p1006xc5476f33.fts.i0(d0Var, null));
                    tVar.b(65536, new com.p314xaae8f345.mm.p1006xc5476f33.fts.h0(d0Var));
                }
            });
        }
    }
}
