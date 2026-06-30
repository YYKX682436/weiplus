package eb2;

/* loaded from: classes2.dex */
public final class m0 extends td2.b {

    /* renamed from: g, reason: collision with root package name */
    public final int f332355g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f332356h;

    /* renamed from: i, reason: collision with root package name */
    public final eb2.f0 f332357i;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f332358m = new im5.c();

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f332359n = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: o, reason: collision with root package name */
    public final int f332360o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f332361p;

    /* renamed from: q, reason: collision with root package name */
    public final ey2.t0 f332362q;

    /* renamed from: r, reason: collision with root package name */
    public final ey2.o0 f332363r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f332364s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f332365t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f332366u;

    public m0(int i17, r45.qt2 qt2Var, eb2.f0 f0Var) {
        this.f332355g = i17;
        this.f332356h = qt2Var;
        this.f332357i = f0Var;
        this.f332360o = f0Var != null ? f0Var.f332282h : 0;
        java.lang.String name = java.lang.String.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.v0 policy = (true && true) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.v0.f189593d : null;
        name = (1 & 2) != 0 ? "" : name;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        new java.util.concurrent.locks.ReentrantLock().newCondition();
        new java.util.LinkedList();
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f332362q = t0Var;
        this.f332363r = t0Var.N6(i17);
        this.f332366u = "Finder.TimelineFeedFetcher#" + i17;
    }

    public static void E0(eb2.m0 m0Var, db2.u3 callback, int i17, db2.v3 v3Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18, java.util.List list, rn5.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar, int i18, java.lang.Object obj) {
        int i19 = (i18 & 2) != 0 ? 0 : i17;
        db2.v3 v3Var2 = (i18 & 4) != 0 ? null : v3Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i18 & 8) != 0 ? null : gVar;
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? false : z18;
        rn5.a aVar2 = (i18 & 128) != 0 ? null : aVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i18 & 256) != 0 ? null : gVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar2 = (i18 & 512) != 0 ? null : eVar;
        m0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.f332366u, "[fetch] pullType=" + i19 + " tabType=" + m0Var.f332355g + " isPreloadMore=" + z19 + ", isGetHistory=" + m0Var.f332361p + " tabStateVM=" + m0Var.f332362q.hashCode() + " isAtAppPush=" + m0Var.f332363r.f338985l);
        eb2.g0 g0Var = new eb2.g0(callback);
        if (i19 == 0 || i19 == 1) {
            m0Var.f332361p = false;
        }
        boolean z28 = gVar3 == null;
        if (z28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.f332366u, "[innerFetch] use tabType=" + m0Var.f332355g + " GlobalLastBuffer");
            java.util.Iterator it = m0Var.f332363r.f338987n.iterator();
            while (it.hasNext()) {
            }
            if (i19 == 0) {
                gm0.j1.u().c().x(hc2.d0.c(m0Var.f332355g), null);
            }
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(m0Var.f332355g), "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            gVar3 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
        }
        java.lang.String str = m0Var.f332366u;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerFetch: lastBufferSize=");
        sb6.append(gVar3 != null ? java.lang.Integer.valueOf(gVar3.f273689a.length) : null);
        sb6.append(", lastBuffer=");
        sb6.append(gVar3 == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar3.f273689a));
        sb6.append(" subTabItem=null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3325xe03a0797.p3326xc267989b.l.d(m0Var.f332359n, null, null, new eb2.l0(m0Var, i19, gVar3, list, z27, aVar2, gVar4, v3Var2, eVar2, z28, g0Var, null), 3, null);
    }
}
