package fg5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final fg5.c f344034a = new fg5.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f344035b;

    public final void a(long j17, long j18, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, yf5.j0 j0Var) {
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        java.util.List list;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null) {
            h17 = "";
        }
        if (l4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            j19 = 0;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(h17)) {
            j19 = 3;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(h17)) {
            j19 = 5;
        } else {
            if (!c01.e2.U(h17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(h17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.U4(h17)) {
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1) == 1) || !c01.e2.N(h17)) {
                    j19 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.B3(h17) ? 6L : r26.i0.y(h17, "gh_", false) ? 7L : com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(h17) ? 9L : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(h17) ? 2L : 1L;
                }
            }
            j19 = 4;
        }
        if (l4Var != null) {
            j27 = l4Var.d1() + l4Var.f1();
            j28 = l4Var.f1() > 0 ? 1L : 2L;
        } else {
            j27 = 0;
            j28 = 0;
        }
        if (j0Var == null || (list = ((yf5.w0) j0Var).f543518q.f543380d) == null) {
            j29 = 0;
            j37 = 0;
        } else {
            int size = list.size();
            long j38 = 0;
            long j39 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                yf5.x xVar = (yf5.x) list.get(i17);
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = xVar.f543528d;
                int d17 = l4Var2 != null ? l4Var2.d1() : 0;
                if (xVar.f543547z == 1) {
                    j39++;
                    j38 += d17;
                }
            }
            j29 = j38;
            j37 = j39;
        }
        long c17 = c01.id.c();
        if (j17 == 2) {
            f344035b = c17;
        }
        long j47 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20113xe34cc462()) == 1 ? 3L : 2L;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v3 a17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.f289747g.a(null);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6397x8f55ace6 c6397x8f55ace6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6397x8f55ace6();
        c6397x8f55ace6.f137401d = j17;
        c6397x8f55ace6.f137402e = j18;
        c6397x8f55ace6.f137403f = j19;
        c6397x8f55ace6.f137404g = c6397x8f55ace6.b("UserName", h17, true);
        c6397x8f55ace6.f137405h = c6397x8f55ace6.b("unread_jump_event_ms", java.lang.String.valueOf(c17), true);
        c6397x8f55ace6.f137406i = j28;
        c6397x8f55ace6.f137407j = j27;
        int i18 = a17.f289716a;
        int i19 = a17.f289717b;
        c6397x8f55ace6.f137408k = i18 + i19;
        c6397x8f55ace6.f137409l = j29;
        c6397x8f55ace6.f137410m = j37;
        c6397x8f55ace6.f137411n = j47;
        c6397x8f55ace6.f137415r = i18;
        c6397x8f55ace6.f137416s = i19;
        c6397x8f55ace6.f137413p = a17.f289718c;
        c6397x8f55ace6.f137414q = a17.f289719d;
        c6397x8f55ace6.f137412o = 1L;
        c6397x8f55ace6.f137417t = 20260429L;
        c6397x8f55ace6.k();
    }
}
