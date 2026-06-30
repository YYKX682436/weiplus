package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class n2 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var = new com.p176xb6135e39.p283xc50a8b8b.q2();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 264) {
                            q2Var.f126974e |= 1;
                            q2Var.f126975f = d0Var.l();
                        } else if (F == 272) {
                            int o17 = d0Var.o();
                            if (com.p176xb6135e39.p283xc50a8b8b.p2.a(o17) == null) {
                                b17.g(34, o17);
                            } else {
                                q2Var.f126974e |= 2;
                                q2Var.f126976g = o17;
                            }
                        } else if (F == 7994) {
                            if ((i17 & 4) == 0) {
                                q2Var.f126977h = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            q2Var.f126977h.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.o3.f126886q, t4Var));
                        } else if (!q2Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = q2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = q2Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 4) != 0) {
                    q2Var.f126977h = java.util.Collections.unmodifiableList(q2Var.f126977h);
                }
                q2Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                q2Var.mo20781x1ff81300();
            }
        }
        return q2Var;
    }
}
