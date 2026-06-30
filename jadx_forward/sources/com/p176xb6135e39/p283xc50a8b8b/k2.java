package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class k2 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.m2 m2Var = new com.p176xb6135e39.p283xc50a8b8b.m2();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                m2Var.f126849d = 1 | m2Var.f126849d;
                                m2Var.f126850e = m17;
                            } else if (F == 18) {
                                com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                                m2Var.f126849d |= 2;
                                m2Var.f126851f = m18;
                            } else if (F == 26) {
                                com.p176xb6135e39.p283xc50a8b8b.y m19 = d0Var.m();
                                m2Var.f126849d |= 4;
                                m2Var.f126852g = m19;
                            } else if (F == 34) {
                                com.p176xb6135e39.p283xc50a8b8b.o2 mo20599xaaa148a0 = (m2Var.f126849d & 8) != 0 ? m2Var.f126853h.mo20599xaaa148a0() : null;
                                com.p176xb6135e39.p283xc50a8b8b.q2 q2Var = (com.p176xb6135e39.p283xc50a8b8b.q2) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.q2.f126973n, t4Var);
                                m2Var.f126853h = q2Var;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.l(q2Var);
                                    m2Var.f126853h = mo20599xaaa148a0.mo20557x85702333();
                                }
                                m2Var.f126849d |= 8;
                            } else if (F == 40) {
                                m2Var.f126849d |= 16;
                                m2Var.f126854i = d0Var.l();
                            } else if (F == 48) {
                                m2Var.f126849d |= 32;
                                m2Var.f126855m = d0Var.l();
                            } else if (!m2Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = m2Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = m2Var;
                    throw y6Var;
                }
            } finally {
                m2Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                m2Var.mo20781x1ff81300();
            }
        }
        return m2Var;
    }
}
