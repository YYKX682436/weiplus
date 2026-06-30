package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class q1 extends com.p176xb6135e39.p283xc50a8b8b.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = new com.p176xb6135e39.p283xc50a8b8b.u1();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            u1Var.f127094d = 1 | u1Var.f127094d;
                            u1Var.f127095e = m17;
                        case 18:
                            com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                            u1Var.f127094d |= 32;
                            u1Var.f127100m = m18;
                        case 24:
                            u1Var.f127094d |= 2;
                            u1Var.f127096f = d0Var.t();
                        case 32:
                            int o17 = d0Var.o();
                            if (com.p176xb6135e39.p283xc50a8b8b.s1.a(o17) == null) {
                                b17.g(4, o17);
                            } else {
                                u1Var.f127094d |= 4;
                                u1Var.f127097g = o17;
                            }
                        case 40:
                            int o18 = d0Var.o();
                            if (com.p176xb6135e39.p283xc50a8b8b.t1.a(o18) == null) {
                                b17.g(5, o18);
                            } else {
                                u1Var.f127094d |= 8;
                                u1Var.f127098h = o18;
                            }
                        case 50:
                            com.p176xb6135e39.p283xc50a8b8b.y m19 = d0Var.m();
                            u1Var.f127094d |= 16;
                            u1Var.f127099i = m19;
                        case 58:
                            com.p176xb6135e39.p283xc50a8b8b.y m27 = d0Var.m();
                            u1Var.f127094d |= 64;
                            u1Var.f127101n = m27;
                        case 66:
                            com.p176xb6135e39.p283xc50a8b8b.w1 mo20599xaaa148a0 = (u1Var.f127094d & 512) != 0 ? u1Var.f127104q.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.z1 z1Var = (com.p176xb6135e39.p283xc50a8b8b.z1) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.z1.f127292r, t4Var);
                            u1Var.f127104q = z1Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(z1Var);
                                u1Var.f127104q = mo20599xaaa148a0.mo20557x85702333();
                            }
                            u1Var.f127094d |= 512;
                        case 72:
                            u1Var.f127094d |= 128;
                            u1Var.f127102o = d0Var.t();
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                            com.p176xb6135e39.p283xc50a8b8b.y m28 = d0Var.m();
                            u1Var.f127094d |= 256;
                            u1Var.f127103p = m28;
                        case 136:
                            u1Var.f127094d |= 1024;
                            u1Var.f127105r = d0Var.l();
                        default:
                            if (!u1Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = u1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = u1Var;
                    throw y6Var;
                }
            } finally {
                u1Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                u1Var.mo20781x1ff81300();
            }
        }
        return u1Var;
    }
}
