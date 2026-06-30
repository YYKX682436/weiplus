package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class f3 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.h3 h3Var = new com.p176xb6135e39.p283xc50a8b8b.h3();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 8) {
                                if ((i17 & 1) == 0) {
                                    h3Var.f126685e = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                    i17 |= 1;
                                }
                                ((com.p176xb6135e39.p283xc50a8b8b.m6) h3Var.f126685e).e(d0Var.t());
                            } else if (F == 10) {
                                int k17 = d0Var.k(d0Var.x());
                                if ((i17 & 1) == 0 && d0Var.d() > 0) {
                                    h3Var.f126685e = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                    i17 |= 1;
                                }
                                while (d0Var.d() > 0) {
                                    ((com.p176xb6135e39.p283xc50a8b8b.m6) h3Var.f126685e).e(d0Var.t());
                                }
                                d0Var.j(k17);
                            } else if (F == 16) {
                                if ((i17 & 2) == 0) {
                                    h3Var.f126687g = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                    i17 |= 2;
                                }
                                ((com.p176xb6135e39.p283xc50a8b8b.m6) h3Var.f126687g).e(d0Var.t());
                            } else if (F == 18) {
                                int k18 = d0Var.k(d0Var.x());
                                if ((i17 & 2) == 0 && d0Var.d() > 0) {
                                    h3Var.f126687g = com.p176xb6135e39.p283xc50a8b8b.l6.m20759x981d076d();
                                    i17 |= 2;
                                }
                                while (d0Var.d() > 0) {
                                    ((com.p176xb6135e39.p283xc50a8b8b.m6) h3Var.f126687g).e(d0Var.t());
                                }
                                d0Var.j(k18);
                            } else if (F == 26) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                h3Var.f126684d = 1 | h3Var.f126684d;
                                h3Var.f126689i = m17;
                            } else if (F == 34) {
                                com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                                h3Var.f126684d |= 2;
                                h3Var.f126690m = m18;
                            } else if (F == 50) {
                                com.p176xb6135e39.p283xc50a8b8b.y m19 = d0Var.m();
                                if ((i17 & 16) == 0) {
                                    h3Var.f126691n = new com.p176xb6135e39.p283xc50a8b8b.f7();
                                    i17 |= 16;
                                }
                                h3Var.f126691n.q(m19);
                            } else if (!h3Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = h3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = h3Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 1) != 0) {
                    ((com.p176xb6135e39.p283xc50a8b8b.h) h3Var.f126685e).f126678d = false;
                }
                if ((i17 & 2) != 0) {
                    ((com.p176xb6135e39.p283xc50a8b8b.h) h3Var.f126687g).f126678d = false;
                }
                if ((i17 & 16) != 0) {
                    h3Var.f126691n = h3Var.f126691n.b();
                }
                h3Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                h3Var.mo20781x1ff81300();
            }
        }
        return h3Var;
    }
}
