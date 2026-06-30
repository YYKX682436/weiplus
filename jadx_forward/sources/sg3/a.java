package sg3;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements tg3.v0 {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        return c01.a2.f(str, str2);
    }

    public java.lang.String Bi(java.lang.String str) {
        java.util.Set set = c01.a2.f118580a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return n17 == null ? str : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0()) ? com.p314xaae8f345.mm.p670x38b72420.s.q3(n17.P0()) : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.t0()) ? com.p314xaae8f345.mm.p670x38b72420.s.q3(n17.t0()) : com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str) ? " " : str;
    }

    public java.lang.String Di(java.lang.String str) {
        return c01.a2.f118580a.contains(str) ? "" : str;
    }

    public java.lang.String Ni(java.lang.String str) {
        java.util.Set set = c01.a2.f118580a;
        if (str == null || str.length() <= 0) {
            return com.p314xaae8f345.mm.p670x38b72420.u.a();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return com.p314xaae8f345.mm.p670x38b72420.u.a();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            java.lang.String m77950x40021d37 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().m77950x40021d37(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m77950x40021d37)) {
                return m77950x40021d37;
            }
        }
        return (n17.i2() == null || n17.i2().length() <= 0) ? com.p314xaae8f345.mm.p670x38b72420.u.a() : n17.i2();
    }

    /* renamed from: getDisplayName */
    public java.lang.String m164550x40021d37(java.lang.String str) {
        return c01.a2.e(str);
    }

    public java.lang.String wi(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.Set set = c01.a2.f118580a;
        java.lang.String e17 = c01.a2.e(z3Var.d1());
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
            return e17;
        }
        if (e17 != null && !e17.equals(z3Var.d1())) {
            return e17;
        }
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(z3Var.d1());
        if (L0 == null || ((java.util.LinkedList) L0).size() <= 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571398dw);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = L0.iterator();
        while (it.hasNext()) {
            arrayList.add(c01.a2.e((java.lang.String) it.next()));
        }
        return "(" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ", ") + ")";
    }
}
