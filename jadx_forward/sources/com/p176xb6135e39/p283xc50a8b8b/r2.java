package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class r2 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.t2 t2Var = new com.p176xb6135e39.p283xc50a8b8b.t2();
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
                            t2Var.f127069d = 1 | t2Var.f127069d;
                            t2Var.f127070e = m17;
                        } else if (F == 18) {
                            com.p176xb6135e39.p283xc50a8b8b.v2 mo20599xaaa148a0 = (t2Var.f127069d & 2) != 0 ? t2Var.f127071f.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.w2 w2Var = (com.p176xb6135e39.p283xc50a8b8b.w2) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.w2.f127176h, t4Var);
                            t2Var.f127071f = w2Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(w2Var);
                                t2Var.f127071f = mo20599xaaa148a0.mo20557x85702333();
                            }
                            t2Var.f127069d |= 2;
                        } else if (!t2Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = t2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = t2Var;
                    throw y6Var;
                }
            } finally {
                t2Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                t2Var.mo20781x1ff81300();
            }
        }
        return t2Var;
    }
}
