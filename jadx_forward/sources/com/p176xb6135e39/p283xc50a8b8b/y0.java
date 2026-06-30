package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class y0 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d1 d1Var = new com.p176xb6135e39.p283xc50a8b8b.d1();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            d1Var.f126530d = 1 | d1Var.f126530d;
                            d1Var.f126531e = m17;
                        } else if (F == 18) {
                            if ((i17 & 2) == 0) {
                                d1Var.f126532f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            d1Var.f126532f.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.j1.f126750m, t4Var));
                        } else if (F == 26) {
                            com.p176xb6135e39.p283xc50a8b8b.f1 mo20599xaaa148a0 = (d1Var.f126530d & 2) != 0 ? d1Var.f126533g.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.g1 g1Var = (com.p176xb6135e39.p283xc50a8b8b.g1) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.g1.f126629n, t4Var);
                            d1Var.f126533g = g1Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(g1Var);
                                d1Var.f126533g = mo20599xaaa148a0.mo20557x85702333();
                            }
                            d1Var.f126530d |= 2;
                        } else if (F == 34) {
                            if ((i17 & 8) == 0) {
                                d1Var.f126534h = new java.util.ArrayList();
                                i17 |= 8;
                            }
                            d1Var.f126534h.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.c1.f126479i, t4Var));
                        } else if (F == 42) {
                            com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                            if ((i17 & 16) == 0) {
                                d1Var.f126535i = new com.p176xb6135e39.p283xc50a8b8b.f7();
                                i17 |= 16;
                            }
                            d1Var.f126535i.q(m18);
                        } else if (!d1Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = d1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = d1Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    d1Var.f126532f = java.util.Collections.unmodifiableList(d1Var.f126532f);
                }
                if ((i17 & 8) != 0) {
                    d1Var.f126534h = java.util.Collections.unmodifiableList(d1Var.f126534h);
                }
                if ((i17 & 16) != 0) {
                    d1Var.f126535i = d1Var.f126535i.b();
                }
                d1Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                d1Var.mo20781x1ff81300();
            }
        }
        return d1Var;
    }
}
