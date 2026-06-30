package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class va extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int F;
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        do {
            try {
                F = d0Var.F();
                if (F == 0) {
                    break;
                }
            } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                e17.f127272d = b17.mo20556x59bc66e();
                throw e17;
            } catch (java.io.IOException e18) {
                com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                y6Var.f127272d = b17.mo20556x59bc66e();
                throw y6Var;
            }
        } while (b17.e(F, d0Var));
        return b17.mo20556x59bc66e();
    }
}
