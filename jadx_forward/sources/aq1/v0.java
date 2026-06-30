package aq1;

/* loaded from: classes12.dex */
public class v0 implements vg3.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static f21.g f94629d;

    /* renamed from: e, reason: collision with root package name */
    public static oq.e f94630e;

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m9 b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.b(str2, f94629d, f94630e);
        java.lang.String valueOf = java.lang.String.valueOf(b17 == null ? 1 : b17.f283489d);
        int i17 = c01.ia.f118787a;
        java.lang.String b18 = c01.ia.b(str, "eggIncluded", d75.b.h(valueOf, "eggIncluded"));
        return b17 != null ? c01.ia.b(b18, "eggSeed", d75.b.h(java.lang.String.valueOf(c06.e.f119249d.g(2147483647L) + 1), "eggSeed")) : b18;
    }

    public static void b() {
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        if (K == null) {
            return;
        }
        if (f94629d != K || f94630e == null) {
            oq.e eVar = new oq.e();
            f94630e = eVar;
            eVar.a(K);
        }
        f94629d = K;
    }

    @Override // vg3.a4
    public void j(r45.ll4 ll4Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ll4Var.f461110i)) {
            ll4Var.f461110i = f9Var.G;
        }
        if (f9Var.mo78013xfb85f7b0() == 1) {
            jz5.l lVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.f283550t;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.m9 m9Var = (lVar == null || ((java.lang.Long) lVar.f384366d).longValue() != f9Var.m124847x74d37ac6()) ? null : (com.p314xaae8f345.mm.ui.p2650x55bb7a46.m9) com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.f283550t.f384367e;
            if (m9Var == null) {
                b();
                m9Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.b(f9Var.j(), f94629d, f94630e);
            }
            if (m9Var != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.f283550t = new jz5.l(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), m9Var);
            }
            int i17 = m9Var != null ? m9Var.f283489d : 1;
            java.lang.String str = ll4Var.f461110i;
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            int i18 = c01.ia.f118787a;
            java.lang.String b17 = c01.ia.b(str, "eggIncluded", d75.b.h(valueOf, "eggIncluded"));
            ll4Var.f461110i = b17;
            if (m9Var == null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    b17 = b17.replaceAll("(?s)<eggSeed[^>]*>.*?</eggSeed>", "");
                }
                ll4Var.f461110i = b17;
            }
        }
    }
}
