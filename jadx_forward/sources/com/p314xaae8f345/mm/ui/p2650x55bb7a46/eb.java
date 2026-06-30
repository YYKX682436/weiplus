package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public abstract class eb {
    public static java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0;
        java.lang.String str = (qVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430227p) || (D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(qVar.f430227p)) == null || !D0.t0() || !com.p314xaae8f345.mm.vfs.w6.j(D0.f68099xfeae815)) ? "" : D0.f68099xfeae815;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && f9Var != null) ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true) : str;
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, boolean z17) {
        java.lang.String str;
        if (b0Var == null || b0Var.f404166a <= 0) {
            return null;
        }
        if (b0Var.j() && (str = b0Var.f404170e) != null && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return str;
        }
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(b0Var.l()), b0Var.f404170e, null, null);
        if (aj6 != null && com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(aj6)) {
                return aj6;
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            return m11.b1.Di().P0(aj6);
        }
        if (!z17) {
            return null;
        }
        java.lang.String aj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104097i, b0Var.f404172g, null, null);
        if (aj7 == null || !com.p314xaae8f345.mm.vfs.w6.j(aj7)) {
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(aj7)) {
            return aj7;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return m11.b1.Di().P0(aj7);
    }

    public static java.lang.String c(java.lang.String str, long j17, boolean z17) {
        java.lang.String b17;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 T1 = m11.b1.Di().T1(str, j17);
        if (T1 == null || (b17 = b(pt0.f0.Li(str, j17), T1, z17)) == null) {
            return null;
        }
        return b17;
    }

    public static java.lang.String d(java.lang.String str, long j17, boolean z17) {
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String b17 = b(pt0.f0.V9(str, j17), m11.b1.Di().b2(str, j17), z17);
        if (b17 != null) {
            return b17;
        }
        return null;
    }
}
