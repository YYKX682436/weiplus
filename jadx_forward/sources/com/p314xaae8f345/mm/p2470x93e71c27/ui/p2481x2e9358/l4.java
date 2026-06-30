package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class l4 implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271995d;

    public l4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271995d = c19666xfd6e2f33;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        boolean z17;
        if (m0Var == null || l0Var == null || (str = l0Var.f535943a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271995d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19666xfd6e2f33.U2) && str.equals(c19666xfd6e2f33.U2)) {
            java.util.Iterator it = l0Var.f535945c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                z17 = true;
                if (f9Var.A0() == 1 && (f9Var.mo78013xfb85f7b0() == 1 || f9Var.mo78013xfb85f7b0() == 822083633)) {
                    break;
                }
            }
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(c19666xfd6e2f33.V2);
                i45.j jVar = i45.j.f369948a;
                i45.c g17 = jVar.g();
                if (g17 == null || !jVar.a(jVar.g())) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putLong("mmkv_key_voice_to_text_after_config_insert_last_time", c01.id.a());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putLong("mmkv_key_voice_to_text_after_config_insert_time", com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").getLong("mmkv_key_voice_to_text_after_config_insert_time", 0L) + 1);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var2.j1(0);
                f9Var2.u1(c19666xfd6e2f33.f271488a3.c());
                f9Var2.r1(3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<_wc_custom_link_ href='weixin://wetype/'>");
                java.lang.String str2 = g17.f369930b;
                sb6.append(str2);
                sb6.append("</_wc_custom_link_>");
                f9Var2.d1(g17.f369929a.replaceFirst(str2, sb6.toString()));
                f9Var2.e1(c01.w9.m(c19666xfd6e2f33.f271488a3.c(), c01.id.a() / 1000));
                f9Var2.m124850x7650bebc(10000);
                f9Var2.f1(f9Var2.w0() | 8);
                c01.w9.x(f9Var2);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c c7010x69e1879c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c();
                c7010x69e1879c.f143232d = 1L;
                c7010x69e1879c.k();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c c7010x69e1879c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c();
                c7010x69e1879c2.f143232d = 2L;
                c7010x69e1879c2.k();
            }
        }
    }
}
