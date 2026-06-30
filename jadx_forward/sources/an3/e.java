package an3;

/* loaded from: classes8.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    public static void a(int i17) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(143873, "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals("")) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(143874, 0L))) < 7200) {
            d(str, i17);
        } else {
            b(str);
        }
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi.j0(str)) {
            Bi.k(str);
        }
        c01.w9.h(str, new an3.d());
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 15);
        gm0.j1.u().c().w(143873, "");
        gm0.j1.u().c().w(143874, 0L);
        gm0.j1.u().c().w(143875, 0);
    }

    public static void d(java.lang.String str, int i17) {
        gm0.j1.d().g(new an3.g(2, str, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().l(143874, 0L))), i17));
    }
}
