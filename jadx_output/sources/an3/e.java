package an3;

/* loaded from: classes8.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    public static void a(int i17) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(143873, "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals("")) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(143874, 0L))) < 7200) {
            d(str, i17);
        } else {
            b(str);
        }
    }

    public static void b(java.lang.String str) {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi.j0(str)) {
            Bi.k(str);
        }
        c01.w9.h(str, new an3.d());
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
        gm0.j1.u().c().w(143873, "");
        gm0.j1.u().c().w(143874, 0L);
        gm0.j1.u().c().w(143875, 0);
    }

    public static void d(java.lang.String str, int i17) {
        gm0.j1.d().g(new an3.g(2, str, (int) com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(143874, 0L))), i17));
    }
}
