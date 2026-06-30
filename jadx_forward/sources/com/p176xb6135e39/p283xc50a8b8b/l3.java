package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class l3 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.n3 n3Var = new com.p176xb6135e39.p283xc50a8b8b.n3();
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
                                n3Var.f126867d = 1 | n3Var.f126867d;
                                n3Var.f126868e = m17;
                            } else if (F == 16) {
                                n3Var.f126867d |= 2;
                                n3Var.f126869f = d0Var.l();
                            } else if (!n3Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = n3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = n3Var;
                    throw y6Var;
                }
            } finally {
                n3Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                n3Var.mo20781x1ff81300();
            }
        }
        return n3Var;
    }
}
