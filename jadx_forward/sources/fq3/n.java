package fq3;

@j95.b
/* loaded from: classes12.dex */
public class n extends jm0.o implements gq3.e {
    public sq3.b A;
    public pq3.j B;
    public final xg3.h0 C = new fq3.j(this);
    public final l75.z0 D = new fq3.k(this);
    public final l75.z0 E = new fq3.l(this);

    /* renamed from: m, reason: collision with root package name */
    public long f347061m;

    /* renamed from: n, reason: collision with root package name */
    public kq3.h f347062n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e f347063o;

    /* renamed from: p, reason: collision with root package name */
    public nq3.f f347064p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.f f347065q;

    /* renamed from: r, reason: collision with root package name */
    public nq3.g f347066r;

    /* renamed from: s, reason: collision with root package name */
    public mq3.d f347067s;

    /* renamed from: t, reason: collision with root package name */
    public mq3.c f347068t;

    /* renamed from: u, reason: collision with root package name */
    public kq3.l f347069u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.d f347070v;

    /* renamed from: w, reason: collision with root package name */
    public nq3.e f347071w;

    /* renamed from: x, reason: collision with root package name */
    public mq3.b f347072x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c f347073y;

    /* renamed from: z, reason: collision with root package name */
    public nq3.d f347074z;

    public static void Zi(fq3.n nVar, xg3.l0 l0Var) {
        nVar.getClass();
        boolean equals = l0Var.f535944b.equals("insert");
        java.util.ArrayList arrayList = l0Var.f535945c;
        int i17 = 0;
        if (!equals) {
            java.lang.String str = l0Var.f535944b;
            if (!str.equals("update")) {
                if (str.equals("delete")) {
                    while (i17 < arrayList.size()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
                        if (f9Var.A0() == 0) {
                            nVar.aj().V6(f9Var);
                        }
                        i17++;
                    }
                    return;
                }
                return;
            }
            while (i17 < arrayList.size()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
                if (f9Var2.A0() == 0) {
                    if (f9Var2.k2()) {
                        nVar.aj().U6(f9Var2);
                    }
                    if (f9Var2.mo78013xfb85f7b0() == 268445456) {
                        nVar.aj().V6(f9Var2);
                    }
                }
                i17++;
            }
            return;
        }
        while (i17 < arrayList.size()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
            if (f9Var3.A0() == 0) {
                nVar.aj().U6(f9Var3);
            }
            int A0 = f9Var3.A0();
            oq3.i iVar = oq3.k.f428927a;
            if (A0 == 0 && f9Var3.J2()) {
                if (iVar.c(1, f9Var3.Q0()) == 0) {
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).getClass();
                    if (gm0.j1.a()) {
                        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar2.m134976x2690a4ac();
                        if (nVar2.f347069u != null) {
                            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar3.m134976x2690a4ac();
                            nVar3.f347069u.a(new tq3.b(f9Var3));
                        }
                    }
                }
            } else if (f9Var3.A0() == 0 && f9Var3.k2() && iVar.c(4, f9Var3.Q0()) == 0) {
                fq3.w wVar = (fq3.w) ((bx1.t) i95.n0.c(bx1.t.class));
                wVar.getClass();
                if (gm0.j1.a()) {
                    fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar4.m134976x2690a4ac();
                    if (nVar4.f347069u != null) {
                        fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar5.m134976x2690a4ac();
                        nVar5.f347069u.a(new fq3.s(wVar, f9Var3));
                    }
                }
            }
            nVar.m134976x2690a4ac();
            if (nVar.f347072x != null) {
                if (f9Var3.A0() == 1) {
                    nVar.m134976x2690a4ac();
                    mq3.b bVar = nVar.f347072x;
                    java.lang.String Q0 = f9Var3.Q0();
                    bVar.getClass();
                    fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar6.m134976x2690a4ac();
                    nVar6.f347069u.a(new mq3.a(bVar, Q0, 1));
                } else {
                    nVar.m134976x2690a4ac();
                    mq3.b bVar2 = nVar.f347072x;
                    java.lang.String Q02 = f9Var3.Q0();
                    bVar2.getClass();
                    fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar7.m134976x2690a4ac();
                    nVar7.f347069u.a(new mq3.a(bVar2, Q02, 3));
                }
            }
            i17++;
        }
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(oq3.g.class);
        set.add(sq3.f.class);
        set.add(oq3.c.class);
    }

    @Override // jm0.o
    public void Ri(android.content.Context context) {
        new fq3.m(this, null).run();
        q25.b.b(new kq3.g(), "//priority");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.D);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.E);
    }

    @Override // jm0.o
    public void Vi() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.D);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.E);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.C);
        pq3.j jVar = this.B;
        if (jVar != null) {
            jVar.f439177i.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.c cVar = this.f347073y;
        if (cVar != null) {
            cVar.f234706d = 0L;
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(cVar);
            cVar.f234714o.mo48814x2efc64();
            this.f347073y = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.d dVar = this.f347070v;
        if (dVar != null) {
            dVar.getClass();
            this.f347070v = null;
        }
        kq3.l lVar = this.f347069u;
        if (lVar != null) {
            ((java.util.LinkedList) lVar.f392811a).clear();
            lVar.f392812b.mo50302x6b17ad39(null);
            lVar.f392812b.mo50299x35224f();
            lVar.f392812b = null;
            this.f347069u = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = this.f347063o;
        if (eVar != null) {
            eVar.f234716b.close();
            eVar.f234717c.close();
            eVar.f234719e.close();
            eVar.f234720f.close();
            eVar.f234721g.close();
            eVar.f234722h.close();
            eVar.f234718d.close();
            this.f347063o = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.f fVar = this.f347065q;
        if (fVar != null) {
            fVar.f401990b.close();
            fVar.f401991c.close();
            fVar.f401992d.close();
        }
        kq3.h hVar = this.f347062n;
        if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = hVar.f392806a;
            objArr[0] = c26948xabb259c7;
            objArr[1] = java.lang.Boolean.valueOf(c26948xabb259c7 != null ? c26948xabb259c7.m107697xb9a70294() : false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.PriorityDB", "close db:%s isOpen:%b ", objArr);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = hVar.f392806a;
            if (c26948xabb259c72 != null && c26948xabb259c72.m107697xb9a70294()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.PriorityDB", "close in trans :%b ", java.lang.Boolean.valueOf(hVar.f392806a.m107689x51d3479()));
                while (hVar.f392806a.m107689x51d3479()) {
                    hVar.f392806a.m107670x7d3c6b03();
                }
                hVar.f392807b.close();
                hVar.f392808c.close();
                hVar.f392809d.close();
                hVar.f392806a.close();
                hVar.f392806a = null;
            }
            this.f347062n = null;
        }
    }

    public oq3.c aj() {
        if (!jm0.g.class.isAssignableFrom(oq3.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(oq3.c.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (oq3.c) ((jm0.g) a17);
    }

    public oq3.g bj() {
        if (!jm0.g.class.isAssignableFrom(oq3.g.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(oq3.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (oq3.g) ((jm0.g) a17);
    }

    public sq3.f cj() {
        if (!jm0.g.class.isAssignableFrom(sq3.f.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(sq3.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (sq3.f) ((jm0.g) a17);
    }
}
