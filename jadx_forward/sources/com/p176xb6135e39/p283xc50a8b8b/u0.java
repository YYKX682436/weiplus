package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class u0 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.w0 w0Var = new com.p176xb6135e39.p283xc50a8b8b.w0();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 8) {
                                w0Var.f127162d |= 1;
                                w0Var.f127163e = d0Var.t();
                            } else if (F == 16) {
                                w0Var.f127162d |= 2;
                                w0Var.f127164f = d0Var.t();
                            } else if (!w0Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = w0Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = w0Var;
                    throw y6Var;
                }
            } finally {
                w0Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                w0Var.mo20781x1ff81300();
            }
        }
        return w0Var;
    }
}
