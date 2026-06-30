package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class p0 extends com.p176xb6135e39.p283xc50a8b8b.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    @Override // com.p176xb6135e39.p283xc50a8b8b.e9
    /* renamed from: parsePartialFrom */
    public java.lang.Object mo20549xc7f9c18(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.x0 x0Var = new com.p176xb6135e39.p283xc50a8b8b.x0();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            x0Var.f127188d = 1 | x0Var.f127188d;
                            x0Var.f127189e = m17;
                        case 18:
                            if ((i17 & 2) == 0) {
                                x0Var.f127190f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            x0Var.f127190f.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.u1.f127093u, t4Var));
                        case 26:
                            if ((i17 & 8) == 0) {
                                x0Var.f127192h = new java.util.ArrayList();
                                i17 |= 8;
                            }
                            x0Var.f127192h.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.x0.f127187t, t4Var));
                        case 34:
                            if ((i17 & 16) == 0) {
                                x0Var.f127193i = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            x0Var.f127193i.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.d1.f126529o, t4Var));
                        case 42:
                            if ((i17 & 32) == 0) {
                                x0Var.f127194m = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            x0Var.f127194m.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.t0.f127041m, t4Var));
                        case 50:
                            if ((i17 & 4) == 0) {
                                x0Var.f127191g = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            x0Var.f127191g.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.u1.f127093u, t4Var));
                        case 58:
                            com.p176xb6135e39.p283xc50a8b8b.i2 mo20599xaaa148a0 = (x0Var.f127188d & 2) != 0 ? x0Var.f127196o.mo20599xaaa148a0() : null;
                            com.p176xb6135e39.p283xc50a8b8b.j2 j2Var = (com.p176xb6135e39.p283xc50a8b8b.j2) d0Var.v(com.p176xb6135e39.p283xc50a8b8b.j2.f126757p, t4Var);
                            x0Var.f127196o = j2Var;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.l(j2Var);
                                x0Var.f127196o = mo20599xaaa148a0.mo20557x85702333();
                            }
                            x0Var.f127188d |= 2;
                        case 66:
                            if ((i17 & 64) == 0) {
                                x0Var.f127195n = new java.util.ArrayList();
                                i17 |= 64;
                            }
                            x0Var.f127195n.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.t2.f127068i, t4Var));
                        case 74:
                            if ((i17 & 256) == 0) {
                                x0Var.f127197p = new java.util.ArrayList();
                                i17 |= 256;
                            }
                            x0Var.f127197p.add(d0Var.v(com.p176xb6135e39.p283xc50a8b8b.w0.f127161i, t4Var));
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                            com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                            if ((i17 & 512) == 0) {
                                x0Var.f127198q = new com.p176xb6135e39.p283xc50a8b8b.f7();
                                i17 |= 512;
                            }
                            x0Var.f127198q.q(m18);
                        default:
                            if (!x0Var.mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = x0Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = x0Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    x0Var.f127190f = java.util.Collections.unmodifiableList(x0Var.f127190f);
                }
                if ((i17 & 8) != 0) {
                    x0Var.f127192h = java.util.Collections.unmodifiableList(x0Var.f127192h);
                }
                if ((i17 & 16) != 0) {
                    x0Var.f127193i = java.util.Collections.unmodifiableList(x0Var.f127193i);
                }
                if ((i17 & 32) != 0) {
                    x0Var.f127194m = java.util.Collections.unmodifiableList(x0Var.f127194m);
                }
                if ((i17 & 4) != 0) {
                    x0Var.f127191g = java.util.Collections.unmodifiableList(x0Var.f127191g);
                }
                if ((i17 & 64) != 0) {
                    x0Var.f127195n = java.util.Collections.unmodifiableList(x0Var.f127195n);
                }
                if ((i17 & 256) != 0) {
                    x0Var.f127197p = java.util.Collections.unmodifiableList(x0Var.f127197p);
                }
                if ((i17 & 512) != 0) {
                    x0Var.f127198q = x0Var.f127198q.b();
                }
                x0Var.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                x0Var.mo20781x1ff81300();
            }
        }
        return x0Var;
    }
}
