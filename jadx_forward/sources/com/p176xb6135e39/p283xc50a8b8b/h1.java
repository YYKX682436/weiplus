package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class h1 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.j1 j1Var = new com.p176xb6135e39.p283xc50a8b8b.j1();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            j1Var.f126751d = 1 | j1Var.f126751d;
                            j1Var.f126752e = m17;
                        } else if (F == 16) {
                            j1Var.f126751d |= 2;
                            j1Var.f126753f = d0Var.t();
                        } else if (F == 26) {
                            com.p176xb6135e39.p283xc50a8b8b.l1 mo20599xaaa148a0 = (j1Var.f126751d & 4) != 0 ? j1Var.f126754g.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.m1 m1Var = (com.p176xb6135e39.p283xc50a8b8b.m1) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.m1.f126842m, t4Var);
                            j1Var.f126754g = m1Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(m1Var);
                                j1Var.f126754g = mo20599xaaa148a0.mo20557x85702333();
                            }
                            j1Var.f126751d |= 4;
                        } else if (!j1Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = j1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = j1Var;
                    throw y6Var;
                }
            } finally {
                j1Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                j1Var.mo20781x1ff81300();
            }
        }
        return j1Var;
    }
}
