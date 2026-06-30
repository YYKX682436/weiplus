package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class s7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f281445a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f281446b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f281447c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f281448d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f281449e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final sb5.x1 f281450f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ig f281451g;

    public s7(yb5.d dVar) {
        this.f281450f = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) dVar.f542241c.a(sb5.g0.class))).n0();
        this.f281451g = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) dVar.f542241c.a(sb5.g0.class))).o0();
    }

    public final void a(java.lang.String str) {
        java.util.List y57;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (android.text.TextUtils.isEmpty(str) || (y57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(str, 1)) == null || y57.isEmpty() || (f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) y57.get(0)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ma c17 = c();
        p75.n0 n0Var = dm.da.f317956n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList2.add(dm.da.f317957o.u());
        p75.i0 g17 = dm.da.f317956n.g(linkedList);
        g17.f434190d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(1, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.oa oaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.oa) g17.a().o(c17.f274680g.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.oa.class);
        if (oaVar == null || f9Var.m124847x74d37ac6() != oaVar.f66277x297eb4f7) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m7) this.f281450f).a(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t7) this.f281451g).a(str));
        }
    }

    public final java.util.List b(int i17, int i18, java.lang.String str, long j17) {
        p75.n0 n0Var = dm.c8.f317695y0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.c8.f317692l1);
        p75.m c17 = dm.c8.f317697z1.o(java.lang.Long.valueOf(j17 - 1)).c(dm.c8.A1.j(str));
        p75.j0 j0Var = new p75.j0(i17, i18);
        linkedList2.add(dm.c8.f317697z1.u());
        p75.i0 g17 = dm.c8.f317695y0.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f434200a, j0Var.f434201b);
        return g17.a().j(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f275522r);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.ma c() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.na.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.na.class);
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.ma) ((com.p314xaae8f345.mm.p2621x8fb0427b.na) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.ma.class);
    }
}
