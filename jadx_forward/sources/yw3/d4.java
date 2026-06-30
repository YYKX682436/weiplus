package yw3;

/* loaded from: classes.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw3.d4 f548250d = new yw3.d4();

    public d4() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList.add(m07.f276591b);
        }
        arrayList.add("blogapp");
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("service_officialaccounts");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList)).d(dVar2.j("weixin"));
        p75.n0 n0Var = dm.e2.N1;
        p75.i0 g17 = n0Var.g(kz5.b0.c(dVar2));
        g17.f434189c = "MicroMsg.RepairerMvvmDBDemoUI";
        g17.f434190d = d17;
        g17.f434192f = dVar.h();
        g17.f434194h = 5L;
        g17.f434195i = true;
        p75.l0 a18 = g17.a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dVar2);
        p75.m0 j17 = dVar2.j("weixin");
        p75.i0 g18 = n0Var.g(linkedList);
        g18.f434190d = j17;
        g18.d(linkedList2);
        g18.b(linkedList3);
        p75.l0 a19 = g18.a();
        java.lang.String str = "SELECT * FROM (" + a18.f434169a + ") UNION SELECT * FROM (" + a19.f434169a + ')';
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String[] strArr = a18.f434170b;
        if (strArr != null) {
            kz5.h0.w(arrayList2, strArr);
        }
        java.lang.String[] strArr2 = a19.f434170b;
        if (strArr2 != null) {
            kz5.h0.w(arrayList2, strArr2);
        }
        java.lang.String[] strArr3 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        long max = java.lang.Math.max(a18.f434203c, a19.f434203c);
        boolean z17 = a18.f434205e || a19.f434205e;
        p75.g1 g1Var = new p75.g1(str + "", strArr3, max, a18.f434204d || a19.f434204d, z17);
        try {
            g1Var.o(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerMvvmDBDemoUI", e17, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerMvvmDBDemoUI", e18, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.p(gm0.j1.u().f354686f);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerMvvmDBDemoUI", e19, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.l(gm0.j1.u().f354686f);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerMvvmDBDemoUI", e27, "timeoutBtn", new java.lang.Object[0]);
        }
        p75.i0 g19 = dm.e2.N1.g(kz5.b0.c(dm.e2.T1));
        g19.f434189c = "MicroMsg.RepairerMvvmDBDemoUI";
        g19.f434190d = d17;
        g19.f434192f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
        g19.f434195i = true;
        p75.l0 a27 = g19.a();
        a27.o(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        a27.k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        a27.m(gm0.j1.u().f354686f);
        a27.i(gm0.j1.u().f354686f);
        a27.n(gm0.j1.u().f354686f);
        a27.j(gm0.j1.u().f354686f);
        return jz5.f0.f384359a;
    }
}
