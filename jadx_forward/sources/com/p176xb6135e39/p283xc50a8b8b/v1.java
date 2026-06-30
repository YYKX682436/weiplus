package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class v1 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var = new com.p176xb6135e39.p283xc50a8b8b.z1();
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
                            if (F == 8) {
                                int o17 = d0Var.o();
                                if (com.p176xb6135e39.p283xc50a8b8b.x1.a(o17) == null) {
                                    b17.g(1, o17);
                                } else {
                                    z1Var.f127293e = 1 | z1Var.f127293e;
                                    z1Var.f127294f = o17;
                                }
                            } else if (F == 16) {
                                z1Var.f127293e |= 2;
                                z1Var.f127295g = d0Var.l();
                            } else if (F == 24) {
                                z1Var.f127293e |= 16;
                                z1Var.f127298m = d0Var.l();
                            } else if (F == 40) {
                                z1Var.f127293e |= 8;
                                z1Var.f127297i = d0Var.l();
                            } else if (F == 48) {
                                int o18 = d0Var.o();
                                if (com.p176xb6135e39.p283xc50a8b8b.y1.a(o18) == null) {
                                    b17.g(6, o18);
                                } else {
                                    z1Var.f127293e |= 4;
                                    z1Var.f127296h = o18;
                                }
                            } else if (F == 80) {
                                z1Var.f127293e |= 32;
                                z1Var.f127299n = d0Var.l();
                            } else if (F == 7994) {
                                if ((i17 & 64) == 0) {
                                    z1Var.f127300o = new java.util.ArrayList();
                                    i17 |= 64;
                                }
                                z1Var.f127300o.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.o3.f126886q, t4Var));
                            } else if (!z1Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = z1Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = z1Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 64) != 0) {
                    z1Var.f127300o = java.util.Collections.unmodifiableList(z1Var.f127300o);
                }
                z1Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                z1Var.mo20781x1ff81300();
            }
        }
        return z1Var;
    }
}
