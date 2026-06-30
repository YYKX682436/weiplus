package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class j3 extends com.p176xb6135e39.p283xc50a8b8b.g {
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.o3 o3Var = new com.p176xb6135e39.p283xc50a8b8b.o3();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 18) {
                                if (!(z18 & true)) {
                                    o3Var.f126888e = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                o3Var.f126888e.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.n3.f126866i, t4Var));
                            } else if (F == 26) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                o3Var.f126887d |= 1;
                                o3Var.f126889f = m17;
                            } else if (F == 32) {
                                o3Var.f126887d |= 2;
                                o3Var.f126890g = d0Var.H();
                            } else if (F == 40) {
                                o3Var.f126887d |= 4;
                                o3Var.f126891h = d0Var.u();
                            } else if (F == 49) {
                                o3Var.f126887d |= 8;
                                o3Var.f126892i = d0Var.n();
                            } else if (F == 58) {
                                o3Var.f126887d |= 16;
                                o3Var.f126893m = d0Var.m();
                            } else if (F == 66) {
                                com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                                o3Var.f126887d = 32 | o3Var.f126887d;
                                o3Var.f126894n = m18;
                            } else if (!o3Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = o3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = o3Var;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    o3Var.f126888e = java.util.Collections.unmodifiableList(o3Var.f126888e);
                }
                o3Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                o3Var.mo20781x1ff81300();
            }
        }
        return o3Var;
    }
}
