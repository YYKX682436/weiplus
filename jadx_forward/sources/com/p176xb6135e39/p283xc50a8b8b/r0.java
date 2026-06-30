package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class r0 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.t0 t0Var = new com.p176xb6135e39.p283xc50a8b8b.t0();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            t0Var.f127042d |= 1;
                            t0Var.f127043e = d0Var.t();
                        } else if (F == 16) {
                            t0Var.f127042d |= 2;
                            t0Var.f127044f = d0Var.t();
                        } else if (F == 26) {
                            com.p176xb6135e39.p283xc50a8b8b.o1 mo20599xaaa148a0 = (t0Var.f127042d & 4) != 0 ? t0Var.f127045g.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.p1 p1Var = (com.p176xb6135e39.p283xc50a8b8b.p1) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.p1.f126906h, t4Var);
                            t0Var.f127045g = p1Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(p1Var);
                                t0Var.f127045g = mo20599xaaa148a0.mo20557x85702333();
                            }
                            t0Var.f127042d |= 4;
                        } else if (!t0Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = t0Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = t0Var;
                    throw y6Var;
                }
            } finally {
                t0Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                t0Var.mo20781x1ff81300();
            }
        }
        return t0Var;
    }
}
