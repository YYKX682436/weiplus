package hc2;

/* loaded from: classes2.dex */
public abstract class s {
    public static final boolean a(ya2.b2 b2Var) {
        return (b2Var == null || (b2Var.f69308x26b1b2e8 & 16384) == 0) ? false : true;
    }

    public static final boolean b() {
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        return ((j37 != null ? j37.f68698x26b1b2e8 : 0) & 1024) != 0;
    }

    public static final boolean c(ya2.b2 b2Var) {
        return ((b2Var != null ? b2Var.f69298x75e87a18 : 0L) & 1024) == 1024;
    }

    public static final boolean d(ya2.b2 b2Var, long j17) {
        if (b2Var != null) {
            return ((((j17 > 1L ? 1 : (j17 == 1L ? 0 : -1)) == 0 || (j17 > 2L ? 1 : (j17 == 2L ? 0 : -1)) == 0) || (j17 > 4L ? 1 : (j17 == 4L ? 0 : -1)) == 0) && (b2Var.f69327x1c739054 & j17) == j17) ? false : true;
        }
        return true;
    }

    public static final boolean e(ya2.b2 b2Var) {
        long j17 = b2Var != null ? b2Var.f69298x75e87a18 : 0L;
        return (j17 & 1) == 1 && (j17 & 2) == 2;
    }

    public static final boolean f(ya2.b2 b2Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b2Var != null ? b2Var.D0() : null, g92.b.f351302e.U())) {
            return b();
        }
        return ((b2Var != null ? b2Var.f69308x26b1b2e8 : 0) & 1024) != 0;
    }

    public static final boolean g() {
        r45.h23 h23Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W0).mo141623x754a37bb()).r()).booleanValue()) {
            return false;
        }
        g92.b bVar = g92.b.f351302e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        return j37 != null && (h23Var = (r45.h23) j37.u0().m75936x14adae67(52)) != null && h23Var.m75939xb282bd08(1) == 1;
    }

    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa h(r45.gb4 gb4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gb4Var, "<this>");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
        c19782x23db1cfa.m76240x66bc2758(gb4Var.m75945x2fec8307(0));
        c19782x23db1cfa.m76218xe0a5bcad(gb4Var.m75945x2fec8307(1));
        c19782x23db1cfa.m76227x7ac946f0(gb4Var.m75945x2fec8307(2));
        c19782x23db1cfa.m76203xcbec40f8((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) gb4Var.m75936x14adae67(3));
        c19782x23db1cfa.m76238x6ff7a51e(gb4Var.m75939xb282bd08(7));
        return c19782x23db1cfa;
    }

    public static final r45.gb4 i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        if (c19782x23db1cfa == null) {
            return null;
        }
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, c19782x23db1cfa.m76197x6c03c64c());
        gb4Var.set(2, c19782x23db1cfa.m76184x8010e5e4());
        gb4Var.set(1, c19782x23db1cfa.m76175x6d346f39());
        gb4Var.set(3, c19782x23db1cfa.m76160xd133dfec());
        gb4Var.set(7, java.lang.Integer.valueOf(c19782x23db1cfa.m76195x13a3e4aa()));
        return gb4Var;
    }
}
