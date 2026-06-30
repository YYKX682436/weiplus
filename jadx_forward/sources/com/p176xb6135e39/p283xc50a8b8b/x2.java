package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class x2 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.z2 z2Var = new com.p176xb6135e39.p283xc50a8b8b.z2();
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
                            if (F == 10) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                z2Var.f127304d = 1 | z2Var.f127304d;
                                z2Var.f127305e = m17;
                            } else if (F == 18) {
                                if ((i17 & 2) == 0) {
                                    z2Var.f127306f = new java.util.ArrayList();
                                    i17 |= 2;
                                }
                                z2Var.f127306f.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.m2.f126848p, t4Var));
                            } else if (F == 26) {
                                com.p176xb6135e39.p283xc50a8b8b.b3 mo20599xaaa148a0 = (z2Var.f127304d & 2) != 0 ? z2Var.f127307g.mo20599xaaa148a0() : null;
                                com.p176xb6135e39.p283xc50a8b8b.c3 c3Var = (com.p176xb6135e39.p283xc50a8b8b.c3) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.c3.f126501m, t4Var);
                                z2Var.f127307g = c3Var;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.l(c3Var);
                                    z2Var.f127307g = mo20599xaaa148a0.mo20557x85702333();
                                }
                                z2Var.f127304d |= 2;
                            } else if (!z2Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = z2Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = z2Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    z2Var.f127306f = java.util.Collections.unmodifiableList(z2Var.f127306f);
                }
                z2Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                z2Var.mo20781x1ff81300();
            }
        }
        return z2Var;
    }
}
