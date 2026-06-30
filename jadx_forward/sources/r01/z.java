package r01;

/* loaded from: classes9.dex */
public abstract class z {
    public static void a(java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(str);
        qk.o b17 = b(str);
        if (b17 == null) {
            r01.q3.bj().d(str);
            return;
        }
        if (b17.I0()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            if (Di.f276650d.mo70514xb06685ab(Di.E(str), "username=? or parentRef =?", new java.lang.String[]{str, str}) != 0) {
                Di.b(5, Di, str);
            }
            java.util.List i17 = r01.q3.cj().i1(str);
            c01.w9.i(i17, new r01.y(i17), com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        }
        if (b17.F0()) {
            java.lang.String d17 = r01.q3.cj().d1(str);
            if (d17 != null) {
                c01.w9.h(d17, null);
            }
            s01.r.b(str, true, null);
        }
        r01.q3.cj().P0(b17);
        r01.q3.bj().d(str);
    }

    public static qk.o b(java.lang.String str) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (b17.f66747xa783a79b > 0) {
            return b17;
        }
        return null;
    }

    public static boolean c() {
        return r01.q3.cj().u1(256) > 0;
    }

    public static boolean d() {
        return r01.q3.cj().u1(4) > 0;
    }

    public static boolean e() {
        return r01.q3.cj().u1(128) > 0;
    }

    public static boolean f() {
        return r01.q3.cj().u1(8) > 0;
    }

    public static boolean g(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.F0();
    }

    public static boolean h(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.G0();
    }

    public static boolean i(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        return b17.W0();
    }

    public static boolean j(java.lang.String str) {
        qk.o b17;
        return (str == null || (b17 = b(str)) == null || !b17.I0()) ? false : true;
    }

    public static boolean k(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.J0();
    }

    public static boolean l(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.L0();
    }

    public static boolean m(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        b17.A0();
        return b17.f66746x2262335f == 5;
    }

    public static boolean n(java.lang.String str) {
        qk.o b17 = b(str);
        return b17 != null && b17.Q0();
    }

    public static boolean o(java.lang.String str) {
        qk.o b17 = b(str);
        if (b17 == null) {
            return false;
        }
        return b17.T0();
    }

    public static void p(qk.o oVar) {
        if (oVar != null) {
            r45.ln4 ln4Var = new r45.ln4();
            ln4Var.f461192d = oVar.f66733x6baace8e;
            ln4Var.f461193e = oVar.f66748xdec927b;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
            r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0]);
        }
    }

    public static void q(qk.o oVar) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
            return;
        }
        r45.ln4 ln4Var = new r45.ln4();
        ln4Var.f461192d = oVar.f66733x6baace8e;
        ln4Var.f461193e = oVar.f66748xdec927b;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(oVar.f66748xdec927b);
        if (f07 == null || !f07.r2()) {
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(58, ln4Var));
        } else {
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", java.lang.Boolean.valueOf(r01.q3.cj().mo9952xce0038c9(oVar, new java.lang.String[0])), java.lang.Integer.valueOf(oVar.f66733x6baace8e));
    }
}
