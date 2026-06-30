package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class s implements gp1.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w0 {

    /* renamed from: x, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s f174747x;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f174748a = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f174749b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f174750c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f174751d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f174752e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f174753f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174754g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174755h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f174756i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f174757j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f174758k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f174759l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f174760m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f174761n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f174762o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f174763p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f174764q;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f174765r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f174766s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f174767t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f174768u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174769v;

    /* renamed from: w, reason: collision with root package name */
    public int f174770w;

    public s() {
        new java.util.concurrent.CopyOnWriteArrayList();
        this.f174749b = new java.util.concurrent.CopyOnWriteArraySet();
        this.f174750c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f174751d = new android.util.SparseArray();
        this.f174752e = new android.util.SparseArray();
        this.f174753f = new java.util.concurrent.ConcurrentHashMap();
        this.f174754g = null;
        this.f174755h = null;
        this.f174756i = false;
        this.f174757j = false;
        this.f174758k = false;
        this.f174759l = false;
        this.f174760m = false;
        this.f174761n = false;
        this.f174762o = true;
        this.f174763p = 0L;
        this.f174764q = 0;
        this.f174765r = 0;
        this.f174766s = 0;
        this.f174767t = false;
        this.f174769v = null;
        this.f174770w = -1;
    }

    public static void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, gp1.z zVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2;
        boolean z18;
        sVar.getClass();
        if (qp1.w.r(c12886x91aa2b6d) && !sVar.l0(c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallService", "addBallInfo, already add max count balls:%s", 5);
            return;
        }
        java.util.List list = sVar.f174748a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
        if (copyOnWriteArrayList.contains(c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "addBallInfo, existed:true, replaceExisted: %b, ballInfo:%s", java.lang.Boolean.valueOf(c12886x91aa2b6d.F), c12886x91aa2b6d);
            if (c12886x91aa2b6d.F) {
                c12886x91aa2b6d.F = false;
                sVar.V(c12886x91aa2b6d);
                return;
            }
            return;
        }
        if (qp1.w.t(c12886x91aa2b6d)) {
            if (qp1.w.a(list)) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (qp1.w.t((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next())) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d j17 = qp1.w.j(list);
                if (j17 != null) {
                    int i17 = j17.f174579d;
                    r5 = i17 != 9;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, type: %s, key: %s, canReplaced: %s", java.lang.Integer.valueOf(i17), j17.f174582g, java.lang.Boolean.valueOf(r5));
                    if (r5) {
                        sVar.Y0(j17, c12886x91aa2b6d);
                        if (zVar != null) {
                            zVar.X0(c12886x91aa2b6d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallService", "addBallInfo video ball is already exist, but video ball info is null");
            }
        }
        if (c12886x91aa2b6d.H == 2) {
            if (qp1.w.a(list)) {
                java.util.Iterator it6 = copyOnWriteArrayList.iterator();
                while (it6.hasNext()) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it6.next()).H == 2) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                if (qp1.w.a(list)) {
                    java.util.Iterator it7 = copyOnWriteArrayList.iterator();
                    while (it7.hasNext()) {
                        c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it7.next();
                        if (c12886x91aa2b6d2.H == 2) {
                            break;
                        }
                    }
                }
                c12886x91aa2b6d2 = null;
                sVar.Y0(c12886x91aa2b6d2, c12886x91aa2b6d);
                if (zVar != null) {
                    zVar.X0(c12886x91aa2b6d);
                    return;
                }
                return;
            }
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c12886x91aa2b6d.B = currentTimeMillis;
        c12886x91aa2b6d.C = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
        c12887x942bef81.f174623m = -1;
        if (c12886x91aa2b6d.f174579d != 20) {
            c12887x942bef81.f174617d = (c12886x91aa2b6d.I && c12887x942bef81.f174617d == 0) ? 3 : c12887x942bef81.f174617d;
        } else {
            int i18 = c12887x942bef81.f174617d;
            c12887x942bef81.f174617d = i18 != 0 ? i18 : 5;
        }
        copyOnWriteArrayList.add(c12886x91aa2b6d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "addBallInfoInner, existed:false, ballInfo:%s", c12886x91aa2b6d);
        if (!c12886x91aa2b6d.L) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.a(c12886x91aa2b6d, list);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        int size = copyOnWriteArrayList.size();
        e17.getClass();
        if (size == 1) {
            if (c12886x91aa2b6d.H != 0 && !c12886x91aa2b6d.f174578J) {
                r5 = true;
            }
            if (r5) {
                e17.f174880e = c12886x91aa2b6d.f174591s;
            }
        }
        sVar.W0(true);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", c12886x91aa2b6d.f174579d);
        bundle.putString("key", c12886x91aa2b6d.f174582g);
        sVar.M0(1, bundle);
        sVar.L0(c12886x91aa2b6d);
        if (zVar != null) {
            zVar.X0(c12886x91aa2b6d);
        }
        ((d73.i) i95.n0.c(d73.i.class)).Ce(c12886x91aa2b6d);
        if (qp1.w.t(c12886x91aa2b6d)) {
            ((ku5.t0) ku5.t0.f394148d).h(new qp1.g(c12886x91aa2b6d), "MicroMsg.FloatBallCollapseHelper");
        }
    }

    public static void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        android.util.SparseArray sparseArray = sVar.f174752e;
        java.util.Set<qp1.i0> set = (java.util.Set) sparseArray.get(c12886x91aa2b6d.f174579d);
        if (qp1.w.a(set)) {
            for (qp1.i0 i0Var : set) {
                if (z17) {
                    ((sl4.b) i0Var).d();
                } else {
                    ((sl4.b) i0Var).c();
                }
            }
        }
        java.util.Set<qp1.i0> set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            for (qp1.i0 i0Var2 : set2) {
                if (z17) {
                    ((sl4.b) i0Var2).d();
                } else {
                    ((sl4.b) i0Var2).c();
                }
            }
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.class) {
            if (f174747x == null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.class) {
                    f174747x = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s();
                }
            }
        }
        return f174747x;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w0
    public void A(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation:%s, change:%s", c11738x6e2c0d85, java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            return;
        }
        int i18 = c11738x6e2c0d85.f158468g;
        if (i18 != 2 && i18 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onBackgroundRunningAppChanged, operation ignored");
            return;
        }
        if ((c11738x6e2c0d85.f158467f & 2) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(7, qp1.n.b(c11738x6e2c0d85.f158465d, c11738x6e2c0d85.f158466e), null);
            c12886x91aa2b6d.f174581f = 2;
            X0(c12886x91aa2b6d);
        }
        if ((c11738x6e2c0d85.f158467f & 4) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(17, java.lang.String.format(java.util.Locale.US, "%s#%d", c11738x6e2c0d85.f158465d, java.lang.Integer.valueOf(c11738x6e2c0d85.f158466e)), null);
            c12886x91aa2b6d2.f174581f = 2;
            X0(c12886x91aa2b6d2);
        }
        if ((c11738x6e2c0d85.f158467f & 8) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(18, qp1.n.a(c11738x6e2c0d85.f158465d, c11738x6e2c0d85.f158466e), null);
            c12886x91aa2b6d3.f174581f = 2;
            X0(c12886x91aa2b6d3);
        }
        if ((c11738x6e2c0d85.f158467f & 16) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(19, qp1.n.a(c11738x6e2c0d85.f158465d, c11738x6e2c0d85.f158466e), null);
            c12886x91aa2b6d4.f174581f = 2;
            X0(c12886x91aa2b6d4);
        }
        if ((c11738x6e2c0d85.f158467f & 32) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(33, qp1.n.a(c11738x6e2c0d85.f158465d, c11738x6e2c0d85.f158466e), null);
            c12886x91aa2b6d5.f174581f = 2;
            X0(c12886x91aa2b6d5);
        }
        if ((c11738x6e2c0d85.f158467f & 64) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(40, qp1.n.a(c11738x6e2c0d85.f158465d, c11738x6e2c0d85.f158466e), null);
            c12886x91aa2b6d6.f174581f = 3;
            X0(c12886x91aa2b6d6);
        }
    }

    @Override // gp1.v
    public void A0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).contains(c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "exposeBallInfo, existed:false");
            return;
        }
        android.util.SparseArray sparseArray = this.f174751d;
        java.util.Set set = (java.util.Set) sparseArray.get(c12886x91aa2b6d.f174579d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).V(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.v(this, c12886x91aa2b6d));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).V(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.w(this, c12886x91aa2b6d));
    }

    @Override // gp1.v
    public void B(boolean z17) {
        J0(z17, null);
    }

    @Override // gp1.v
    public void B0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d info, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g.f174694a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String e17 = info.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "generateHashKey(...)");
        gVar.c(bitmap, gVar.a(e17));
    }

    @Override // gp1.v
    public void C(android.view.View view) {
        this.f174768u = view;
    }

    @Override // gp1.v
    public void C0() {
        synchronized (this.f174748a) {
            java.util.List d17 = qp1.w.d(this.f174748a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = null;
            if (qp1.w.a(d17)) {
                java.util.Iterator it = ((java.util.Vector) d17).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                    if (c12886x91aa2b6d != null && c12886x91aa2b6d2.B >= c12886x91aa2b6d.B) {
                    }
                    c12886x91aa2b6d = c12886x91aa2b6d2;
                }
            }
            if (c12886x91aa2b6d != null) {
                U(c12886x91aa2b6d);
            }
        }
    }

    @Override // gp1.v
    public android.graphics.Point D(int i17, int i18, int i19, android.graphics.Point point) {
        if (i17 != 1) {
            return T(i18, point);
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        int rotation = windowManager != null ? windowManager.getDefaultDisplay().getRotation() : 0;
        rp1.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.T;
        android.graphics.Point point2 = new android.graphics.Point();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        int b17 = hVar.b(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174732m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174734o) {
            point2.x = (int) (pp1.b.f438930f - (hVar.a() * qp1.c0.f447227c));
            point2.y = (int) (b17 + pp1.b.f438929e + ((qp1.c0.f447228d * (1 - hVar.a())) / 2));
        } else {
            point2.x = (int) (i18 - ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.f174948p0).mo141623x754a37bb()).floatValue());
            point2.y = (int) (b17 + pp1.b.f438929e + ((qp1.c0.f447228d * (1 - hVar.a())) / 2));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getFloatBallPositionForAnimation viewWidth: %s, viewHeight: %s, dockLeft: %s, ballSize: %s, position: %s, rotation: %s", valueOf, valueOf2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174734o), point, point2, java.lang.Integer.valueOf(rotation));
        return point2;
    }

    @Override // gp1.v
    public void D0(gp1.d0 d0Var) {
        if (d0Var != null) {
            java.util.List list = this.f174748a;
            if (qp1.w.a(list)) {
                d0Var.a(new java.util.ArrayList(list));
            } else {
                d0Var.a(new java.util.ArrayList());
            }
        }
    }

    @Override // gp1.v
    public void E(long j17) {
        this.f174763p = j17;
    }

    @Override // gp1.v
    public void E0(boolean z17) {
        Z0(z17, true, null);
    }

    @Override // gp1.v
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d I0 = I0();
        if (I0 != null) {
            I0.H = c12886x91aa2b6d.H;
            I0.P = c12886x91aa2b6d.P;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
            if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "switchVoipVoice");
            if (I0.P == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallView", "switchVoip animationInfo invalid and ignore");
                return;
            }
            android.graphics.Point point = new android.graphics.Point(I0.P.f420324a);
            android.graphics.Point point2 = new android.graphics.Point(I0.P.f420325b);
            if (!c12929x567537a0.b0(point) || !c12929x567537a0.b0(point2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallView", "switchVoip animationInfo size invalid and ignore");
                return;
            }
            c12929x567537a0.A0((c12929x567537a0.f175096x1 ? 8388611 : 8388613) | c12929x567537a0.R1, true);
            android.widget.FrameLayout frameLayout = c12929x567537a0.f175093w;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "animateVoipSwitch state: %d, startSize: %s, endSize: %s, current: %d, %d", java.lang.Integer.valueOf(I0.H), point, point2, java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height));
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            if (animatorListenerAdapter != null) {
                ofFloat.addListener(animatorListenerAdapter);
            }
            ofFloat.addListener(new rp1.k1(c12929x567537a0, I0, point, point2));
            ofFloat.addUpdateListener(new rp1.m1(c12929x567537a0, layoutParams, point, point2, frameLayout));
            ofFloat.start();
        }
    }

    @Override // gp1.v
    public android.graphics.Point G() {
        android.graphics.Point point;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            point = c12929x567537a0 != null ? c12929x567537a0.m54187x89e326be() : new android.graphics.Point(qp1.w.k(), qp1.w.l());
            if (point == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallUIManager", "getBallPosition, position is null, return default position");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
            return point;
        }
        point = new android.graphics.Point(qp1.w.k(), qp1.w.l());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        return point;
    }

    @Override // gp1.v
    public void H(gp1.y yVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f174749b).add(yVar);
    }

    @Override // gp1.v
    public void I(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null || !nVar.f174858j) {
            return;
        }
        c12929x567537a0.B.setAlpha(z17 ? 1.0f : 0.0f);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d I0() {
        java.util.List list = this.f174748a;
        if (!qp1.w.a(list)) {
            return null;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (qp1.w.t(c12886x91aa2b6d)) {
                return c12886x91aa2b6d;
            }
        }
        return null;
    }

    @Override // gp1.v
    public long J() {
        return this.f174763p;
    }

    public void J0(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f174759l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "hideFloatBall, has marked QB file view page, ignore hiding");
            return;
        }
        boolean z18 = q0() && !this.f174758k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "hideFloatBall forceHide: %b, canShowFloatBall: %b, videoBallInfo: %s", java.lang.Boolean.valueOf(this.f174758k), java.lang.Boolean.valueOf(z18), I0());
        if (z18) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        e17.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n0(e17, z17, animatorListenerAdapter));
    }

    @Override // gp1.v
    public int K() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null) {
            gp1.j[] jVarArr = gp1.j.f355718d;
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
        if (c12929x567537a0 != null) {
            return c12929x567537a0.m54188x5ef79061();
        }
        gp1.j[] jVarArr2 = gp1.j.f355718d;
        return -1;
    }

    public void K0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "markNoFloatBallPage:%s", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f174757j;
        this.f174757j = z17;
        if (z17 != z18) {
            M0(11, null);
        }
    }

    @Override // gp1.v
    public void L(int i17, gp1.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeFloatBallInfoEventListener, type:%s", java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            synchronized (this.f174751d) {
                java.util.Set set = (java.util.Set) this.f174751d.get(i17);
                if (set != null) {
                    set.remove(zVar);
                }
            }
        }
    }

    public final void L0(final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.util.SparseArray sparseArray = this.f174751d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Set set = (java.util.Set) sparseArray.get(sparseArray.keyAt(i17));
            if (qp1.w.a(set)) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((gp1.z) it.next()).X0(c12886x91aa2b6d);
                }
            }
        }
        fs.g.b(gp1.x.class, new fs.o() { // from class: com.tencent.mm.plugin.ball.service.s$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((gp1.x) nVar).X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.this);
                return false;
            }
        });
    }

    @Override // gp1.v
    public void M(int i17) {
        if (this.f174754g == null || this.f174754g.f174580e != i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeMessageBall type: %d", java.lang.Integer.valueOf(i17));
        synchronized (this.f174748a) {
            U(this.f174754g);
        }
    }

    public final void M0(int i17, android.os.Bundle bundle) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f174753f).values().iterator();
        while (it.hasNext()) {
            ((android.os.ResultReceiver) it.next()).send(i17, bundle);
        }
    }

    @Override // gp1.v
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibility, existed:false");
            return;
        }
        t07.f174578J = !z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibility, existed:true, visible:%s, ballInfo:%s", java.lang.Boolean.valueOf(z17), t07);
        Q0();
    }

    public final void N0(java.util.List list) {
        int size;
        java.util.Map map = this.f174753f;
        if (((java.util.concurrent.ConcurrentHashMap) map).isEmpty() || this.f174770w == (size = ((java.util.Vector) qp1.w.d(list)).size())) {
            return;
        }
        this.f174770w = size;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ActiveCount", size);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((android.os.ResultReceiver) it.next()).send(5, bundle);
        }
    }

    @Override // gp1.v
    public boolean O() {
        return qp1.u.f447276a.a();
    }

    public void O0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        try {
            synchronized (this.f174751d) {
                java.util.Set set = (java.util.Set) this.f174751d.get(c12886x91aa2b6d.f174579d);
                if (qp1.w.a(set)) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((gp1.z) it.next()).N0(c12886x91aa2b6d);
                    }
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d);
                for (fs.q qVar : ((fs.c) fs.g.f(gp1.x.class)).all()) {
                    if (qVar.mo210xb7045565(valueOf) && fs.g.d(fs.g.f347619c, qVar)) {
                        ((gp1.x) ((fs.n) qVar.get())).N0(c12886x91aa2b6d);
                    }
                }
                java.util.Set set2 = (java.util.Set) this.f174751d.get(0);
                if (qp1.w.a(set2)) {
                    java.util.Iterator it6 = set2.iterator();
                    while (it6.hasNext()) {
                        ((gp1.z) it6.next()).N0(c12886x91aa2b6d);
                    }
                }
                for (fs.q qVar2 : ((fs.c) fs.g.f(gp1.x.class)).all()) {
                    if (qVar2.mo210xb7045565(0) && fs.g.d(fs.g.f347619c, qVar2)) {
                        ((gp1.x) ((fs.n) qVar2.get())).N0(c12886x91aa2b6d);
                    }
                }
            }
            S0(c12886x91aa2b6d, 7);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallService", e17, "notifyBallDeleteButtonClicked exception", new java.lang.Object[0]);
        }
    }

    @Override // gp1.v
    public android.graphics.Point P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null) {
            return null;
        }
        return c12929x567537a0.m54189x7c40554();
    }

    public void P0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d target) {
        try {
            java.util.List ballList = this.f174748a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballList, "ballList");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.c(target, ballList, target.f174587o.f174602d ? 2 : 3);
            synchronized (this.f174751d) {
                java.util.Set set = (java.util.Set) this.f174751d.get(target.f174579d);
                if (qp1.w.a(set)) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((gp1.z) it.next()).V0(target);
                    }
                }
                fs.g.c(gp1.x.class, java.lang.Integer.valueOf(target.f174579d), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.a0(this, target));
                java.util.Set set2 = (java.util.Set) this.f174751d.get(0);
                if (qp1.w.a(set2)) {
                    java.util.Iterator it6 = set2.iterator();
                    while (it6.hasNext()) {
                        ((gp1.z) it6.next()).V0(target);
                    }
                }
                fs.g.c(gp1.x.class, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.b0(this, target));
            }
            S0(target, 6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallService", e17, "notifyBallPlayButtonClicked exception", new java.lang.Object[0]);
        }
    }

    @Override // gp1.v
    public void Q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            nVar.f174857i = z17;
        }
    }

    public final void Q0() {
        ov.m0 m0Var = (ov.m0) i95.n0.c(ov.m0.class);
        m0Var.getClass();
        if (gm0.j1.a()) {
            m0Var.m134976x2690a4ac();
        }
        synchronized (this.f174748a) {
            java.util.Vector vector = new java.util.Vector(this.f174748a);
            if (Y()) {
                if (qp1.w.a(vector)) {
                    java.util.Collections.sort(vector, new qp1.C29999x36a40a());
                } else {
                    vector = new java.util.Vector();
                }
            } else if (qp1.w.a(vector)) {
                java.util.Collections.sort(vector, new qp1.x());
            } else {
                vector = new java.util.Vector();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "notifyFloatBallInfoChanged, originSize: %d, sortedSize: %d, ballInfoList:%s", java.lang.Integer.valueOf(((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).size()), java.lang.Integer.valueOf(vector.size()), vector);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f174749b).iterator();
            while (it.hasNext()) {
                ((gp1.y) it.next()).X(vector, this.f174769v);
                N0(vector);
            }
        }
    }

    @Override // gp1.v
    public void R(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "markQBFileViewPage:%s", java.lang.Boolean.valueOf(z17));
        this.f174759l = z17;
    }

    public final void R0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, android.os.Bundle bundle) {
        java.lang.String e17 = c12886x91aa2b6d.e();
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.util.concurrent.ConcurrentHashMap) this.f174753f).get(e17);
        if (resultReceiver != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "notifyResultReceiver, event:%s, ballInfoHashKey:%s, receiver:%s", java.lang.Integer.valueOf(i17), e17, java.lang.Integer.valueOf(resultReceiver.hashCode()));
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            resultReceiver.send(i17, bundle);
        }
    }

    @Override // gp1.v
    public void S() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resetReadyStatusBallInfo");
        this.f174755h = null;
    }

    public final void S0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", c12886x91aa2b6d.f174579d);
        bundle.putString("key", c12886x91aa2b6d.f174582g);
        R0(c12886x91aa2b6d, i17, bundle);
    }

    @Override // gp1.v
    public android.graphics.Point T(int i17, android.graphics.Point point) {
        android.graphics.Point point2 = new android.graphics.Point();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174730h) {
            point2.set(qp1.e0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.G2), qp1.w.l() + qp1.e0.a(qp1.c0.f447237m));
        } else {
            point2.set((i17 - point.x) - qp1.e0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0.G2), qp1.w.l() + qp1.e0.a(qp1.c0.f447237m));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getFloatBallPositionForAnimation viewWidth: %s, dockLeft: %s, ballSize: %s, position:[%s, %s]", valueOf, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174730h), point, java.lang.Integer.valueOf(point2.x), java.lang.Integer.valueOf(point2.y));
        return point2;
    }

    public void T0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("type", c12886x91aa2b6d.f174579d);
        bundle2.putString("key", c12886x91aa2b6d.f174582g);
        bundle2.putInt("function_type", i18);
        if (bundle != null) {
            bundle2.putBundle("function_param", bundle);
        }
        R0(c12886x91aa2b6d, i17, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // gp1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.f174748a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.contains(r6)
            java.lang.String r1 = "MicroMsg.FloatBallService"
            if (r0 == 0) goto Ldd
            java.util.List r0 = r5.f174748a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r6)
            com.tencent.mm.plugin.ball.service.p4 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f()
            r0.j(r6)
            java.util.List r0 = r5.f174748a
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.d(r6, r0)
            java.util.List r0 = r5.f174748a
            r2 = 4
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.c(r6, r0, r2)
            java.lang.String r0 = "removeBallInfo, existed:true, ballInfo:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r2)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f174769v
            r2 = 0
            if (r0 == 0) goto L48
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f174769v
            boolean r0 = r0.m54054xb2c87fbf(r6)
            if (r0 == 0) goto L48
            java.lang.String r0 = "removeBallInfo, remove last enteredBallInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r5.f174769v = r2
        L48:
            com.tencent.mm.plugin.ball.ui.q0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e()
            java.util.List r1 = r5.f174748a
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            int r1 = r1.size()
            r0.getClass()
            r3 = 1
            if (r1 != 0) goto L72
            boolean r1 = r0.f()
            if (r1 == 0) goto L72
            int r1 = r6.H
            if (r1 == 0) goto L6a
            boolean r1 = r6.f174578J
            if (r1 != 0) goto L6a
            r1 = r3
            goto L6b
        L6a:
            r1 = 0
        L6b:
            if (r1 == 0) goto L72
            boolean r1 = r6.f174592t
            r0.f174880e = r1
            goto L92
        L72:
            boolean r1 = qp1.w.t(r6)
            if (r1 == 0) goto L92
            com.tencent.mm.plugin.ball.ui.f0 r1 = new com.tencent.mm.plugin.ball.ui.f0
            r1.<init>(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r0 != r4) goto L8b
            r1.run()
            goto L92
        L8b:
            ku5.u0 r0 = ku5.t0.f394148d
            ku5.t0 r0 = (ku5.t0) r0
            r0.B(r1)
        L92:
            r5.W0(r3)
            r0 = 3
            r5.R0(r6, r0, r2)
            r5.U0(r6)
            java.lang.Class<d73.i> r0 = d73.i.class
            i95.m r0 = i95.n0.c(r0)
            d73.i r0 = (d73.i) r0
            java.lang.String r1 = r6.f174582g
            r0.A8(r1)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r5.f174754g
            boolean r0 = r6.m54054xb2c87fbf(r0)
            if (r0 == 0) goto Lb3
            r5.f174754g = r2
        Lb3:
            boolean r0 = qp1.w.t(r6)
            if (r0 == 0) goto Lc4
            ku5.u0 r0 = ku5.t0.f394148d
            qp1.h r1 = qp1.h.f447257d
            java.lang.String r2 = "MicroMsg.FloatBallCollapseHelper"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r1, r2)
        Lc4:
            com.tencent.mm.plugin.ball.service.g r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g.f174694a
            java.lang.String r6 = r6.e()
            java.lang.String r1 = "generateHashKey(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            java.lang.String r6 = r0.a(r6)
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            if (r0 == 0) goto Le2
            com.p314xaae8f345.mm.vfs.w6.h(r6)
            goto Le2
        Ldd:
            java.lang.String r6 = "removeBallInfo, existed:false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.U(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    public final void U0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.util.SparseArray sparseArray = this.f174751d;
        java.util.Set set = (java.util.Set) sparseArray.get(c12886x91aa2b6d.f174579d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).G0(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.t(this, c12886x91aa2b6d));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).G0(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u(this, c12886x91aa2b6d));
    }

    @Override // gp1.v
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallInfo, existed:false");
            return;
        }
        t07.o(c12886x91aa2b6d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallInfo, existed:true, ballInfo:%s", t07);
        Q0();
        if (c12886x91aa2b6d.f174588p == t07.f174588p) {
            c(c12886x91aa2b6d);
        }
    }

    public final void V0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = c12886x91aa2b6d != null ? c12886x91aa2b6d.e() : "null";
            objArr[1] = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onEnterBallInfoPage, no this ball info:%s, withFloatBall: %s", objArr);
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        t07.B = java.lang.System.currentTimeMillis();
        this.f174769v = t07;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onEnterBallInfoPage, set lastEnteredBallInfo:%s, withFloatBall: %s", this.f174769v.e(), java.lang.Boolean.valueOf(z17));
        W0(z17);
    }

    @Override // gp1.v
    public void W(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null || !nVar.f174858j) {
            return;
        }
        c12929x567537a0.m54199x6952bca5(f17);
    }

    public final void W0(boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(this.f174769v);
        if (t07 == null || !qp1.w.a(this.f174748a)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = this.f174769v != null ? this.f174769v.e() : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, last enteredBallInfo:%s", objArr);
        } else {
            java.util.List list = this.f174748a;
            if (qp1.w.a(list)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next()).m54054xb2c87fbf(t07)) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, has other balls, hidden current ball info");
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
                boolean z19 = nVar != null && nVar.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, canNotShowFloatBall:%s, withFloatBall:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
                if (!z19 && z17) {
                    k(t07, 1.0f);
                }
                java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it6.next();
                    if (qp1.w.r(c12886x91aa2b6d) && c12886x91aa2b6d.f174578J && !c12886x91aa2b6d.m54054xb2c87fbf(t07)) {
                        c12886x91aa2b6d.f174578J = false;
                        R0(c12886x91aa2b6d, 4, null);
                    } else if (c12886x91aa2b6d.m54054xb2c87fbf(t07)) {
                        c12886x91aa2b6d.f174578J = true;
                    }
                }
            } else if (qp1.w.b(this.f174748a, t07)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "recheckBallInfoList, no other balls, make float ball transparent");
                if (qp1.w.r(t07) && Y()) {
                    t07.f174578J = true;
                } else {
                    t07.f174578J = false;
                    k(t07, 0.0f);
                }
            }
        }
        Q0();
    }

    @Override // gp1.v
    public void X(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "markForceHideAllFloatBall %b", java.lang.Boolean.valueOf(z17));
        this.f174758k = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174881f = z17;
    }

    public final void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null || !t07.I) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeAppBrandPassiveBallInfo, remove existedBallInfo:%s", t07);
        t07.M.f174623m = 10;
        U(t07);
    }

    @Override // gp1.v
    public boolean Y() {
        qp1.u uVar = qp1.u.f447276a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? ((java.lang.Boolean) ((jz5.n) qp1.u.f447277b).mo141623x754a37bb()).booleanValue() : ((java.lang.Boolean) ((jz5.n) qp1.u.f447278c).mo141623x754a37bb()).booleanValue();
    }

    public void Y0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).contains(c12886x91aa2b6d) || ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).contains(c12886x91aa2b6d2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "replacedBalInfo invalid");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "replaceBallInfo, replaced.type: %s, target.type: %s", java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), java.lang.Integer.valueOf(c12886x91aa2b6d2.f174579d));
        if (qp1.w.t(c12886x91aa2b6d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().b();
            c12886x91aa2b6d.f174583h = null;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).remove(c12886x91aa2b6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().j(c12886x91aa2b6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.d(c12886x91aa2b6d, ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).isEmpty());
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.c(c12886x91aa2b6d, this.f174748a, 4);
        if (this.f174769v != null && this.f174769v.m54054xb2c87fbf(c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "replacedBallInfo, remove last enteredBallInfo");
            this.f174769v = null;
        }
        ((d73.i) i95.n0.c(d73.i.class)).A8(c12886x91aa2b6d.f174582g);
        if (c12886x91aa2b6d.m54054xb2c87fbf(this.f174754g)) {
            this.f174754g = null;
        }
        R0(c12886x91aa2b6d, 3, null);
        U0(c12886x91aa2b6d);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c12886x91aa2b6d2.B = currentTimeMillis;
        c12886x91aa2b6d2.C = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d2.M;
        c12887x942bef81.f174623m = -1;
        if (c12886x91aa2b6d2.f174579d != 20) {
            c12887x942bef81.f174617d = (c12886x91aa2b6d2.I && c12887x942bef81.f174617d == 0) ? 3 : c12887x942bef81.f174617d;
        } else {
            int i17 = c12887x942bef81.f174617d;
            if (i17 == 0) {
                i17 = 5;
            }
            c12887x942bef81.f174617d = i17;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).add(c12886x91aa2b6d2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "replacedBallInfo addBallInfo, existed:false, ballInfo:%s", c12886x91aa2b6d2);
        if (!c12886x91aa2b6d2.L) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.a(c12886x91aa2b6d2, this.f174748a);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", c12886x91aa2b6d2.f174579d);
        bundle.putString("key", c12886x91aa2b6d2.f174582g);
        M0(1, bundle);
        L0(c12886x91aa2b6d2);
        ((d73.i) i95.n0.c(d73.i.class)).Ce(c12886x91aa2b6d2);
        int i18 = c12886x91aa2b6d.f174579d;
        if (i18 == 20) {
            i18 = c12886x91aa2b6d.f174580e;
        }
        android.util.SparseArray sparseArray = this.f174751d;
        java.util.Set set = (java.util.Set) sparseArray.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).F0(c12886x91aa2b6d, c12886x91aa2b6d2);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it6;
            if (!fVar.hasNext()) {
                break;
            }
            fs.q qVar = (fs.q) fVar.next();
            if (qVar.mo210xb7045565(valueOf) && fs.g.d(fs.g.f347619c, qVar)) {
                ((gp1.x) ((fs.n) qVar.get())).F0(c12886x91aa2b6d, c12886x91aa2b6d2);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it7 = set2.iterator();
            while (it7.hasNext()) {
                ((gp1.z) it7.next()).F0(c12886x91aa2b6d, c12886x91aa2b6d2);
            }
        }
        java.util.Iterator it8 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (true) {
            fs.f fVar2 = (fs.f) it8;
            if (!fVar2.hasNext()) {
                break;
            }
            fs.q qVar2 = (fs.q) fVar2.next();
            if (qVar2.mo210xb7045565(0) && fs.g.d(fs.g.f347619c, qVar2)) {
                ((gp1.x) ((fs.n) qVar2.get())).F0(c12886x91aa2b6d, c12886x91aa2b6d2);
            }
        }
        W0(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.j0(e17, true));
        if (qp1.w.t(c12886x91aa2b6d2)) {
            ((ku5.t0) ku5.t0.f394148d).h(new qp1.g(c12886x91aa2b6d2), "MicroMsg.FloatBallCollapseHelper");
        }
    }

    @Override // gp1.v
    public void Z() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575202l73);
    }

    public final void Z0(boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d;
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, no float window permission");
            java.util.List list = this.f174748a;
            if (qp1.w.a(list)) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c12886x91aa2b6d = null;
                        break;
                    } else {
                        c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                        if (c12886x91aa2b6d.f174579d == 7) {
                            break;
                        }
                    }
                }
                if (c12886x91aa2b6d != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, removed");
                    U(c12886x91aa2b6d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeLocationBackgroundBallInfoIfNeed, ignore");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().c();
            this.f174756i = false;
            ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "ballinfo clear2");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
            synchronized (f17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).remove("balls");
            }
            Q0();
            return;
        }
        if (this.f174756i) {
            if (this.f174757j && !q0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, has marked no float ball page, ignore resuming");
                return;
            }
            if (this.f174758k) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, has marked forceHideAllFloatBall, ignore resuming");
                return;
            }
            if (this.f174760m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall, hasHideForKeyboardHeightChange, ignore resuming");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(this.f174769v);
            if (!((t07 == null || !qp1.w.a(this.f174748a)) ? false : qp1.w.b(this.f174748a, t07))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall not singleBallInfoCondition, withAnimation:%s", java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
                e17.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.o0(e17, z17, z18, animatorListenerAdapter));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resumeFloatBall singleBallInfoCondition, withAnimation:false");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            e18.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.o0(e18, false, z18, animatorListenerAdapter));
            V0(this.f174769v, true);
        }
    }

    @Override // gp1.v
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onAccountRelease:%s", java.lang.Integer.valueOf(hashCode()));
        n(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e());
        n(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f());
        this.f174756i = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().c();
    }

    @Override // gp1.v
    public void a0(int i17, gp1.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "addFloatBallInfoEventListener, type:%s", java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            synchronized (this.f174751d) {
                java.util.Set set = (java.util.Set) this.f174751d.get(i17);
                if (set == null) {
                    set = new java.util.HashSet();
                    this.f174751d.put(i17, set);
                }
                set.add(zVar);
            }
        }
    }

    public final boolean a1(int i17, int i18, boolean z17, boolean z18, boolean z19, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        int l17;
        boolean q07 = q0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight needShowFloatBall: %b", java.lang.Boolean.valueOf(q07));
        if (!q07 || this.f174767t || !this.f174760m) {
            int i19 = qp1.c0.f447226b + qp1.c0.f447237m + qp1.c0.f447239o;
            android.view.View view = this.f174768u;
            if (view != null) {
                i19 = java.lang.Math.max(view.getMeasuredHeight(), i19);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
                l17 = c12929x567537a0 != null ? c12929x567537a0.m54196x652dfd9a() : qp1.w.l();
            } else {
                l17 = qp1.w.l();
            }
            boolean z27 = ((l17 + i19) + i17) + (z19 ? i18 : 0) >= this.f174766s && i17 > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByKbHeight, ballPositionY:[%s, %s], keyboardHeight:%s, screenHeight:%s, extraHeight: %d, hide: %b, checkBottomShadow: %b, checkExtraHeight: %b", java.lang.Integer.valueOf(l17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f174766s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            if (z27) {
                this.f174760m = true;
                J0(z17, animatorListenerAdapter);
                return true;
            }
            if (!this.f174760m) {
                return false;
            }
            this.f174760m = false;
            Z0(z17, true, animatorListenerAdapter);
            return true;
        }
        this.f174760m = false;
        android.view.View view2 = this.f174768u;
        if (view2 != null) {
            if (!((view2 == null || !(view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0)) ? false : ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0) view2).a0())) {
                android.view.View view3 = this.f174768u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f174768u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/ball/service/FloatBallService", "updateBallVisibilityByKbHeight", "(IIZZZLandroid/animation/AnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                Z0(z17, false, animatorListenerAdapter);
                return true;
            }
        }
        return false;
    }

    @Override // gp1.v
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        dp1.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721 c12911xaef21721;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updatePlayButton, existed:false");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updatePlayButton, existed:true, ballInfo:%s", t07);
        t07.f174587o.a(c12886x91aa2b6d.f174587o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        if (e17.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = e17.f174879d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 != null && (c12911xaef21721 = c12929x567537a0.f175100z) != null && (c12886x91aa2b6d2 = c12929x567537a0.M1) != null && c12886x91aa2b6d2 == t07) {
                c12911xaef21721.a(t07);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = nVar.f174852d;
            if (!(c12931xa4a39700 != null && c12931xa4a39700.getVisibility() == 0) || (lVar = nVar.f174852d.f175112g) == null) {
                return;
            }
            pm0.v.W(new dp1.b(lVar, t07));
        }
    }

    @Override // gp1.v
    public void b0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateCustomViewInMMProcess");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g0(this, c12886x91aa2b6d));
    }

    public final void b1(int i17, int i18, boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar != null ? nVar.f174853e : null;
        if (c12917x19ac03e7 != null && c12917x19ac03e7.s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight keyboardHeight: %s, extraHeight: %s, withAnimation: %s, checkExtraHeight: %s, animatorListenerAdapter: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), animatorListenerAdapter);
            if (!this.f174767t) {
                if (this.f174761n) {
                    this.f174761n = false;
                    if (c12917x19ac03e7.y()) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight keyboard hide and try to showContentBall");
                    c12917x19ac03e7.J(true, false, animatorListenerAdapter);
                    return;
                }
                return;
            }
            int m54115x95ba554c = c12917x19ac03e7.m54115x95ba554c();
            int m54111xccf0908e = c12917x19ac03e7.m54111xccf0908e();
            boolean z19 = ((m54111xccf0908e + m54115x95ba554c) + i17) + (z18 ? i18 : 0) >= this.f174766s && i17 > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByKbHeight, ballPositionY:[%s, %s], keyboardHeight:%s, screenHeight:%s, extraHeight: %d, hide: %b, checkExtraHeight: %b", java.lang.Integer.valueOf(m54111xccf0908e), java.lang.Integer.valueOf(m54115x95ba554c), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f174766s), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18));
            if (z19) {
                this.f174761n = true;
                c12917x19ac03e7.t(z17, animatorListenerAdapter);
            } else if (this.f174761n) {
                this.f174761n = false;
                c12917x19ac03e7.J(z17, false, animatorListenerAdapter);
            }
        }
    }

    @Override // gp1.v
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallBlurInfo, existed:false");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallBlurInfo, existed:true, ballInfo:%s", t07);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = c12886x91aa2b6d.f174588p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo2 = t07.f174588p;
        ballBlurInfo2.getClass();
        ballBlurInfo2.f174599d = ballBlurInfo.f174599d;
        ballBlurInfo2.f174600e = ballBlurInfo.f174600e;
        ballBlurInfo2.f174601f = ballBlurInfo.f174601f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        if (!e17.f() || (c12929x567537a0 = e17.f174879d.f174851c) == null || c12929x567537a0.f175097y == null || (c12886x91aa2b6d2 = c12929x567537a0.L1) == null || c12886x91aa2b6d2 != t07) {
            return;
        }
        c12929x567537a0.x0(ballBlurInfo2);
        qp1.b.a(ballBlurInfo2, c12929x567537a0.f175097y);
    }

    @Override // gp1.v
    public boolean c0() {
        java.util.List list = this.f174748a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                if (!c12886x91aa2b6d.f174578J) {
                    if (qp1.w.q(c12886x91aa2b6d.H, 2048) || qp1.w.q(c12886x91aa2b6d.H, 4) || qp1.w.q(c12886x91aa2b6d.H, 8) || qp1.w.q(c12886x91aa2b6d.H, 512) || qp1.w.q(c12886x91aa2b6d.H, 1024)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void c1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (this.f174754g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "updateMessageBall messageBallInfo is null and ignore");
            return;
        }
        if (t0(this.f174754g) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "updateMessageBall messageBallInfo not null but not added!!");
            return;
        }
        this.f174754g.o(c12886x91aa2b6d);
        this.f174754g.f174582g = c12886x91aa2b6d.f174582g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateMessageBall existed: true, and update %s", this.f174754g);
        V(this.f174754g);
    }

    @Override // gp1.v
    public void d(boolean z17) {
        K0(true);
        J0(z17, null);
    }

    @Override // gp1.v
    public android.graphics.Point d0() {
        android.graphics.Point point;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            point = (c12929x567537a0 == null || !nVar.f174858j) ? new android.graphics.Point(qp1.w.k(), qp1.w.l()) : c12929x567537a0.m54194x71b3e80e();
        } else {
            point = new android.graphics.Point(qp1.w.k(), qp1.w.l());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getFloatBallPosition, position:[%s, %s]", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        return point;
    }

    @Override // gp1.v
    public void e(int i17, qp1.i0 i0Var) {
        if (i0Var != null) {
            synchronized (this.f174752e) {
                java.util.Set set = (java.util.Set) this.f174752e.get(i17);
                if (set == null) {
                    set = new java.util.HashSet();
                    this.f174752e.put(i17, set);
                }
                set.add(i0Var);
            }
        }
    }

    @Override // gp1.v
    public void e0() {
        R(false);
        K0(false);
        if (this.f174769v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, safe");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "fixFloatBallIfNeed, lastEnteredBallInfo:%s", this.f174769v);
            i(t0(this.f174769v));
        }
    }

    @Override // gp1.v
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, android.os.ResultReceiver resultReceiver) {
        if (c12886x91aa2b6d == null || resultReceiver == null) {
            return;
        }
        java.lang.String e17 = c12886x91aa2b6d.e();
        java.util.Map map = this.f174753f;
        ((java.util.concurrent.ConcurrentHashMap) map).put(e17, resultReceiver);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "registerFloatBallEventReceiver, key:%s, receiver:%s, size: %s", e17, java.lang.Integer.valueOf(resultReceiver.hashCode()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) map).size()));
    }

    @Override // gp1.v
    public boolean f0() {
        return this.f174758k;
    }

    @Override // gp1.v
    public void g(int i17) {
        this.f174766s = i17;
    }

    @Override // gp1.v
    public void g0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (!((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).contains(c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "hideBallInfo, existed:false");
            return;
        }
        android.util.SparseArray sparseArray = this.f174751d;
        java.util.Set set = (java.util.Set) sparseArray.get(c12886x91aa2b6d.f174579d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).w(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x(this, c12886x91aa2b6d));
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).w(c12886x91aa2b6d);
            }
        }
        fs.g.c(gp1.x.class, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.y(this, c12886x91aa2b6d));
    }

    @Override // gp1.v
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.a(c12886x91aa2b6d, this.f174748a);
        }
    }

    @Override // gp1.v
    public void h0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        x0(c12886x91aa2b6d, c12886x91aa2b6d.N);
    }

    @Override // gp1.v
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = this.f174769v != null ? this.f174769v.e() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, lastEnteredBallInfo:%s", objArr);
        this.f174769v = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = t0(c12886x91aa2b6d);
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, no this ball info");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.n0(this, c12886x91aa2b6d);
            e17.getClass();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                e17.d(true, n0Var);
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.m0(e17, true, n0Var));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onExitBallInfoPage, ballInfo:%s", t07);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = t07.M;
        int i17 = c12887x942bef81.f174623m;
        if (i17 == -1) {
            c12887x942bef81.f174623m = 0;
        } else if (i17 != -1) {
            if (!(i17 == 7 || i17 == 4 || i17 == 5 || i17 == 12 || i17 == 13)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallReportLogic", "minimizeBallReport unexpected opType:%d", java.lang.Integer.valueOf(i17));
                c12887x942bef81.f174623m = 6;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.c(t07, c12887x942bef81.f174623m, 0L, 0L, 0L, java.lang.System.currentTimeMillis() - t07.B, 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null && nVar.c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.n0 n0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.n0(this, c12886x91aa2b6d);
            e18.getClass();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                e18.d(true, n0Var2);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.m0(e18, true, n0Var2));
            }
        } else if (!this.f174758k) {
            k(c12886x91aa2b6d, 1.0f);
        }
        if (t07.f174578J) {
            t07.f174578J = false;
            Q0();
        }
    }

    @Override // gp1.v
    public void i0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            qp1.j.a(i17, nVar.f174851c);
            qp1.j.a(i17, nVar.f174853e);
        }
    }

    @Override // gp1.v
    public boolean j() {
        return this.f174759l;
    }

    @Override // gp1.v
    public void j0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null || !nVar.f174858j) {
            return;
        }
        c12929x567537a0.m54200xe1461dd6(z17);
    }

    @Override // gp1.v
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, float f17) {
        if (f17 == 1.0f || qp1.w.b(this.f174748a, c12886x91aa2b6d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            e17.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.k0(e17, f17));
        }
    }

    @Override // gp1.v
    public void k0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.i0(e17, 2));
    }

    @Override // gp1.v
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            java.lang.String e17 = c12886x91aa2b6d.e();
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((java.util.concurrent.ConcurrentHashMap) this.f174753f).remove(e17);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = e17;
            objArr[1] = resultReceiver != null ? java.lang.Integer.valueOf(resultReceiver.hashCode()) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "removeFloatBallEventReceiver, key:%s, receiver:%s", objArr);
        }
    }

    @Override // gp1.v
    public boolean l0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (t0(c12886x91aa2b6d) != null) {
            return true;
        }
        synchronized (this.f174748a) {
            if (qp1.w.m(this.f174748a) >= 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "canAddBallInfo, false");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "canAddBallInfo, true");
            return true;
        }
    }

    @Override // gp1.v
    public void m(int i17, int i18, boolean z17, long j17) {
        this.f174764q = i17;
        this.f174765r = i18;
        this.f174767t = z17;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "KeyboardHeightChanged, no float ball");
            return;
        }
        b1(i17, i18, true, this.f174764q != 0, null);
        if (z17) {
            X(true);
        } else {
            X(false);
        }
        if (j17 != 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i0(this, i17, i18), j17);
        } else {
            a1(i17, i18, true, true, this.f174764q != 0, null);
        }
    }

    @Override // gp1.v
    public void m0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        V0(c12886x91aa2b6d, false);
    }

    @Override // gp1.v
    public void n(gp1.y yVar) {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f174749b).remove(yVar);
    }

    @Override // gp1.v
    public void n0() {
        android.os.Bundle bundle;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "onAccountInitialized:%s", java.lang.Integer.valueOf(hashCode()));
        H(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e());
        H(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f());
        this.f174756i = false;
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f().getClass();
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d> list = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174726d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "restoreProcessNameWithFileType");
            if (list != null && list.size() != 0) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d : list) {
                    if (c12886x91aa2b6d != null && c12886x91aa2b6d.f174579d == 4 && (bundle = c12886x91aa2b6d.G) != null) {
                        java.lang.String string = bundle.getString("processName");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "restore with process name: %s", string);
                            c12886x91aa2b6d.G.putString("processName", "");
                        }
                    }
                }
            }
            synchronized (this.f174748a) {
                if (!this.f174756i) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).clear();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "ballinfo clear1");
                    java.util.List i17 = qp1.w.i(list);
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).addAll(i17);
                    java.util.Vector vector = (java.util.Vector) i17;
                    if (!vector.isEmpty()) {
                        java.util.Iterator it = vector.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                            fs.g.c(gp1.x.class, java.lang.Integer.valueOf(c12886x91aa2b6d2.f174579d), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.z(this, c12886x91aa2b6d2));
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "ballinfo add1, size:" + ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).size());
                    if (Y()) {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).addAll(qp1.w.d(list));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "ballinfo add2, size:" + ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).size());
                    this.f174756i = true;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h0(this), 100L);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "restoreDataFromStorage, account not ready");
        }
        E0(true);
    }

    @Override // gp1.v
    public void o(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.c0(this);
        e17.getClass();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            e17.d(z17, c0Var);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.m0(e17, z17, c0Var));
        }
    }

    @Override // gp1.v
    public void o0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d != null) {
            if (this.f174755h == null) {
                this.f174755h = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(20, c12886x91aa2b6d.f174582g, null);
            }
            this.f174755h.o(c12886x91aa2b6d);
            this.f174755h.f174582g = c12886x91aa2b6d.f174582g;
            this.f174755h.f174579d = 20;
            this.f174755h.f174581f = c12886x91aa2b6d.f174581f;
            this.f174755h.H = 256;
            this.f174755h.f174578J = false;
            this.f174755h.I = false;
            this.f174755h.D = java.lang.System.currentTimeMillis();
            if (c12886x91aa2b6d.f174579d != 4 || this.f174755h.G == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f174755h.G.getString("processName"))) {
                return;
            }
            this.f174755h.G.putString("processName", "");
        }
    }

    @Override // gp1.v
    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        synchronized (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallStorage", "clearFloatBallStorage");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.d()).clear();
        }
    }

    @Override // gp1.v
    public java.util.List p0() {
        return this.f174748a;
    }

    @Override // gp1.v
    public void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        com.p314xaae8f345.mm.p2776x373aa5.p2791xca247920.p2792xbddafb2a.C22856x436a4cd0 c22856x436a4cd0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar == null || (c12929x567537a0 = nVar.f174851c) == null || !nVar.f174858j || (c22856x436a4cd0 = c12929x567537a0.f175094x) == null) {
            return;
        }
        c22856x436a4cd0.setAlpha(z17 ? 1.0f : 0.0f);
    }

    @Override // gp1.v
    public boolean q0() {
        java.util.List list = this.f174748a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                if (!c12886x91aa2b6d.f174578J) {
                    if (!qp1.w.t(c12886x91aa2b6d)) {
                        int i17 = c12886x91aa2b6d.f174579d;
                        if (i17 == 17 || i17 == 19) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gp1.v
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b r(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        qp1.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        qp1.c cVar2 = qp1.g0.f447256b;
        android.graphics.Point point = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b c12888x6374022b = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar2 != null ? cVar2.f447223a : null, ballInfo) && (cVar = qp1.g0.f447256b) != null) ? cVar.f447224b : null;
        if (c12888x6374022b != null) {
            qp1.g0.f447256b = null;
            return c12888x6374022b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null && (c12929x567537a0 = nVar.f174851c) != null) {
            point = c12929x567537a0.m54189x7c40554();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b(point, G());
    }

    @Override // gp1.v
    public void r0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.j0(e17, false));
    }

    @Override // gp1.v
    public void s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            nVar.m(i17);
        }
    }

    @Override // gp1.v
    public void s0() {
        this.f174768u = null;
    }

    @Override // gp1.v
    public boolean t(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByPosition, no float ball");
            return false;
        }
        if (this.f174767t) {
            b1(this.f174764q, this.f174765r, z17, false, animatorListenerAdapter);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateContentBallVisibilityByPosition keyboard not show and ignore");
        return false;
    }

    @Override // gp1.v
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        synchronized (this.f174748a) {
            if (!((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).contains(c12886x91aa2b6d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getBallInfo, existed:false");
                return null;
            }
            int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).indexOf(c12886x91aa2b6d);
            if (indexOf < 0 || indexOf >= ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).size()) {
                return null;
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) ((java.util.concurrent.CopyOnWriteArrayList) this.f174748a).get(indexOf);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "getBallInfo, existed:true, responseBallInfo:%s", c12886x91aa2b6d2);
                return c12886x91aa2b6d2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallService", e17, "getBallInfo exception", new java.lang.Object[0]);
                return null;
            }
        }
    }

    @Override // gp1.v
    public void u(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        w(c12886x91aa2b6d, null);
    }

    @Override // gp1.v
    public void u0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 != null) {
                c12929x567537a0.m54198x19836403(z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
            if (c12917x19ac03e7 != null) {
                c12917x19ac03e7.m54119x19836403(z17);
            }
        }
    }

    @Override // gp1.v
    public boolean v(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition, no float ball");
            return false;
        }
        if (this.f174767t) {
            return a1(this.f174764q, this.f174765r, z17, false, false, animatorListenerAdapter);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "updateBallVisibilityByPosition keyboard not show and ignore");
        return false;
    }

    @Override // gp1.v
    public void v0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "markWechatInForeground, foreground:%s", java.lang.Boolean.valueOf(z17));
        this.f174762o = z17;
        if (this.f174759l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "markWechatInForeground, has marked QB file view page, mark Wechat in foreground");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            e17.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.h0(e17, true));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
            e18.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.h0(e18, z17));
        }
        if (this.f174762o) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "resetReadyStatusBallInfo");
        this.f174755h = null;
    }

    @Override // gp1.v
    public void w(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, gp1.z zVar) {
        boolean z17 = false;
        if ((c12886x91aa2b6d.f174579d == 6 && c12886x91aa2b6d.M.f174618e == 11) && !qp1.q.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "isAskForPermissionAlready, no permission & no ask for");
            return;
        }
        int i17 = c12886x91aa2b6d.f174579d;
        if (i17 == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: location");
        } else if (i17 == 17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand_voip");
        } else if (i17 == 18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: audio_of_video_background_play");
        } else if (i17 == 33) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "shouldCheckPermissionWhenAddBallInfo, ignore for ballType: appbrand bluetooth");
        } else {
            z17 = true;
        }
        if (z17) {
            qp1.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c12886x91aa2b6d.f174579d, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.k0(this, c12886x91aa2b6d, zVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l0(this, c12886x91aa2b6d));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.m0(this, c12886x91aa2b6d, zVar));
        }
    }

    @Override // gp1.v
    public void w0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        V0(c12886x91aa2b6d, true);
    }

    @Override // gp1.v
    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, gp1.u uVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "initCustomViewInMMProcess");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.f0(this, c12886x91aa2b6d, uVar));
    }

    @Override // gp1.v
    public void x0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "clickBallInfo, ballInfo:%s enterPage:%s", c12886x91aa2b6d, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = c12886x91aa2b6d.M;
        int i17 = c12887x942bef81.f174623m;
        if (!(i17 == 1 || i17 == 2 || i17 == 3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallReportLogic", "activeBallTypeReport unexpected opType:%d", java.lang.Integer.valueOf(i17));
            c12887x942bef81.f174623m = 3;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.c(c12886x91aa2b6d, c12887x942bef81.f174623m, java.lang.System.currentTimeMillis() - c12886x91aa2b6d.B, 0L, 0L, 0L, 0L);
        if (z17) {
            V0(c12886x91aa2b6d, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.c(c12886x91aa2b6d, this.f174748a, 1);
        int i18 = c12886x91aa2b6d.f174579d;
        if (i18 == 20) {
            i18 = c12886x91aa2b6d.f174580e;
        }
        android.util.SparseArray sparseArray = this.f174751d;
        java.util.Set set = (java.util.Set) sparseArray.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((gp1.z) it.next()).r0(c12886x91aa2b6d);
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        for (fs.q qVar : ((fs.c) fs.g.f(gp1.x.class)).all()) {
            if (qVar.mo210xb7045565(valueOf) && fs.g.d(fs.g.f347619c, qVar)) {
                ((gp1.x) ((fs.n) qVar.get())).r0(c12886x91aa2b6d);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((gp1.z) it6.next()).r0(c12886x91aa2b6d);
            }
        }
        for (fs.q qVar2 : ((fs.c) fs.g.f(gp1.x.class)).all()) {
            if (qVar2.mo210xb7045565(0) && fs.g.d(fs.g.f347619c, qVar2)) {
                ((gp1.x) ((fs.n) qVar2.get())).r0(c12886x91aa2b6d);
            }
        }
    }

    @Override // gp1.v
    public void y(boolean z17) {
        K0(false);
        E0(z17);
    }

    @Override // gp1.v
    public java.util.Set y0() {
        return this.f174750c;
    }

    @Override // gp1.v
    public void z(long j17, gp1.t tVar) {
        int i17;
        if (this.f174755h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "addMessageBall readyMessageBallInfo is invalid and ignore");
            return;
        }
        if (!this.f174762o && !this.f174759l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "addMessageBall isWechatForeground: %b", java.lang.Boolean.valueOf(this.f174762o));
            if (tVar != null) {
                tVar.a(6);
            }
            this.f174755h = null;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174755h;
        java.lang.Boolean bool = qp1.w.f447288a;
        long j18 = c12886x91aa2b6d.D;
        boolean z17 = false;
        if (!((j18 == 0 || j17 == 0 || j17 - j18 > ((long) qp1.w.f447290c.intValue())) ? false : true)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.Integer num = qp1.w.f447290c;
            objArr[0] = java.lang.Integer.valueOf(num != null ? num.intValue() : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "addMessageBall can not add message ball because of time over limit %s", objArr);
            if (tVar != null) {
                tVar.a(5);
            }
            this.f174755h = null;
            return;
        }
        if (this.f174754g == null || t0(this.f174754g) == null) {
            this.f174754g = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(20, this.f174755h.f174582g, null);
            this.f174754g.o(this.f174755h);
            i17 = 1;
        } else {
            i17 = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallService", "addMessageBall addResult: %s, and add: %s", java.lang.Integer.valueOf(i17), this.f174754g);
        if (i17 == 1) {
            this.f174755h.M.f174617d = 5;
        } else if (i17 == 2) {
            this.f174755h.M.f174617d = 6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174755h;
        int i18 = c12886x91aa2b6d2.f174579d;
        if (i18 == 20) {
            i18 = c12886x91aa2b6d2.f174580e;
        }
        java.util.Set set = (java.util.Set) this.f174751d.get(i18);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((gp1.z) it.next()).Y0(c12886x91aa2b6d2)) {
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(gp1.x.class)).all()).iterator();
        while (it6.hasNext()) {
            fs.q qVar = (fs.q) it6.next();
            if (qVar.mo210xb7045565(valueOf) && fs.g.d(fs.g.f347619c, qVar) && ((gp1.x) ((fs.n) qVar.get())).Y0(c12886x91aa2b6d2)) {
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        if (i17 == 1) {
            this.f174754g.M.f174617d = 5;
            w(this.f174754g, null);
        } else if (i17 == 2) {
            c1(this.f174755h);
            if (this.f174754g != null && !this.f174754g.L) {
                this.f174754g.M.f174617d = 6;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.a(this.f174754g, this.f174748a);
            }
        }
        this.f174755h = null;
        if (tVar != null) {
            tVar.a(i17);
        }
    }

    @Override // gp1.v
    public boolean z0() {
        return this.f174757j;
    }
}
