package c01;

/* loaded from: classes9.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f118580a = new java.util.HashSet();

    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) ? "" : com.p314xaae8f345.mm.p670x38b72420.s.q3(n17.w0());
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return str;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            java.lang.String m77950x40021d37 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().m77950x40021d37(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m77950x40021d37)) {
                return m77950x40021d37;
            }
        }
        return (n17.f2() == null || n17.f2().length() <= 0) ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str) ? " " : str : n17.f2();
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        return d(z3Var, str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str));
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, boolean z17) {
        if (z3Var == null) {
            return com.p314xaae8f345.mm.p670x38b72420.u.a();
        }
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.P0()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.m77950x40021d37(str)) && c01.v1.u(str)) ? c01.v1.k() : com.p314xaae8f345.mm.p670x38b72420.s.q3(a17.m77950x40021d37(str));
        }
        java.lang.String g27 = z3Var.g2();
        if (g27 != null && !g27.isEmpty()) {
            return g27;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.P0()) || (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.B4(str))) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str) ? " " : str;
        }
        com.p314xaae8f345.mm.p670x38b72420.q qVar = com.p314xaae8f345.mm.p670x38b72420.s.I2;
        if (qVar != null) {
            return ((com.p314xaae8f345.mm.app.s7) qVar).a(str);
        }
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        return (str == null || str.length() <= 0) ? "" : c(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true), str);
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return e(str);
        }
        java.lang.String a17 = a(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return a17;
        }
        java.lang.String l17 = c01.v1.l(str, str2);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) ? e(str) : l17;
    }
}
