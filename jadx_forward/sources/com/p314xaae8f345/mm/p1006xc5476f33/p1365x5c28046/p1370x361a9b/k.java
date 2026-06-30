package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.e f179167e;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.j f179172j;

    /* renamed from: k, reason: collision with root package name */
    public int f179173k;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f179176n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f179177o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f179163a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f179164b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f179165c = false;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l f179166d = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Vector f179168f = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f179169g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Vector f179170h = new java.util.Vector();

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f179171i = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f179174l = {false};

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f179175m = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.f(this);

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.e eVar) {
        this.f179173k = -1;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f179176n = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.C13268xbe51c92a(this, a0Var);
        this.f179177o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934>(a0Var) { // from class: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$3
            {
                this.f39173x3fe91575 = 1273581380;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a14934) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a149342 = c5324xe5a14934;
                if (!(c5324xe5a149342 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5324xe5a149342.f135636g.f89136b)) {
                    return false;
                }
                am.p4 p4Var = c5324xe5a149342.f135636g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k.this.d(p4Var.f89136b, p4Var.f89135a, p4Var.f89137c);
                return false;
            }
        };
        this.f179167e = eVar;
        android.os.Process.myUid();
        this.f179173k = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public synchronized void a(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) it.next();
                java.util.Iterator it6 = this.f179169g.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(lVar.mo9638xb5884f29(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) it6.next()).mo9638xb5884f29())) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    ((java.util.LinkedList) this.f179169g).addAll(list);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "addNoWifiTask: %s", lVar.mo9638xb5884f29());
                }
            }
        }
    }

    public synchronized void b(java.util.List list) {
        if (list != null) {
            if (list.size() > 0) {
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) list.get(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar2 = this.f179166d;
                    if (lVar2 != null && lVar2.mo9637xb2c87fbf(lVar)) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = lVar == null ? "task is null" : lVar.mo9638xb5884f29();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", objArr);
                    } else if (lVar == null || this.f179170h.contains(lVar)) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[0] = lVar == null ? "task is null" : lVar.mo9638xb5884f29();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", objArr2);
                    } else {
                        this.f179170h.add(lVar);
                    }
                }
            }
        }
    }

    public void c() {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.g(this));
    }

    public synchronized void d(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is finish. key:%s success:%b", str, java.lang.Boolean.valueOf(z17));
        if (this.f179166d != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (this.f179168f.contains(this.f179166d)) {
                this.f179168f.remove(this.f179166d);
            } else if (((java.util.LinkedList) this.f179169g).contains(this.f179166d)) {
                ((java.util.LinkedList) this.f179169g).remove(this.f179166d);
            } else if (this.f179170h.contains(this.f179166d)) {
                this.f179170h.remove(this.f179166d);
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "retry later.");
            } else if (i17 != 2) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.h(this, i17));
            }
            if (i17 == 2) {
                ((ku5.t0) ku5.t0.f394148d).k(this.f179175m, 3000L);
            } else {
                ((ku5.t0) ku5.t0.f394148d).k(this.f179175m, 1000L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.BKGLoaderManager", "CurrentTask or key is null. or key is no equal crrentkey ");
    }

    public synchronized void e() {
        java.util.Vector vector = this.f179168f;
        if (vector != null) {
            vector.clear();
        }
        java.util.Vector vector2 = this.f179170h;
        if (vector2 != null) {
            vector2.clear();
        }
        ((java.util.LinkedList) this.f179169g).clear();
        this.f179164b = false;
        this.f179165c = false;
    }

    public synchronized void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "tryToStart: %s", java.lang.Boolean.valueOf(this.f179163a));
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && !this.f179163a && this.f179169g.isEmpty()) {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is 3g or 4g]");
                this.f179164b = false;
                this.f179165c = false;
                c();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is not wifi, 3g nor 4g]");
            }
        }
        java.util.Vector vector = this.f179168f;
        if (vector == null || vector.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart no task list .");
            java.util.Vector vector2 = this.f179168f;
            if (vector2 == null || vector2.size() <= 0) {
                this.f179164b = false;
            }
            java.util.Vector vector3 = this.f179168f;
            if ((vector3 == null || vector3.size() <= 0) && this.f179164b) {
                this.f179164b = false;
            }
            c();
        } else {
            this.f179164b = true;
            this.f179165c = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) this.f179168f.remove(0);
            this.f179166d = lVar;
            lVar.b(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.d) this.f179167e.f179155a).execute(this.f179166d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s upload list size:%d", this.f179166d.mo9638xb5884f29(), java.lang.Integer.valueOf(this.f179168f.size()));
            c();
        }
        if (!this.f179164b) {
            if (this.f179169g.isEmpty()) {
                java.util.Vector vector4 = this.f179170h;
                if (vector4 == null || vector4.size() <= 0) {
                    this.f179165c = false;
                    this.f179163a = false;
                } else {
                    this.f179165c = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) this.f179170h.remove(0);
                    this.f179166d = lVar2;
                    lVar2.b(this);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.d) this.f179167e.f179155a).execute(this.f179166d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart download store emoji task is runing. productID:%s size:%d", this.f179166d.mo9638xb5884f29(), java.lang.Integer.valueOf(this.f179170h.size()));
                }
            } else {
                this.f179165c = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l lVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l) ((java.util.LinkedList) this.f179169g).remove(0);
                this.f179166d = lVar3;
                lVar3.b(this);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.d) this.f179167e.f179155a).execute(this.f179166d);
            }
            c();
        }
    }
}
