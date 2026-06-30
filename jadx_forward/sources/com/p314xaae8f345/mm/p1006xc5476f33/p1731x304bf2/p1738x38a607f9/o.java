package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.app.s2 {
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p pVar) {
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.f220952a;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_FILE_CLEAN_TIME_LONG;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 86400) {
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                m43.c.b().a("game_cache_clean", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.k());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }
}
