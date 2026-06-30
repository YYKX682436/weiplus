package com.google.protobuf;

/* loaded from: classes16.dex */
public class f3 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.h3 h3Var = new com.google.protobuf.h3();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 8) {
                                if ((i17 & 1) == 0) {
                                    h3Var.f45152e = com.google.protobuf.l6.newIntList();
                                    i17 |= 1;
                                }
                                ((com.google.protobuf.m6) h3Var.f45152e).e(d0Var.t());
                            } else if (F == 10) {
                                int k17 = d0Var.k(d0Var.x());
                                if ((i17 & 1) == 0 && d0Var.d() > 0) {
                                    h3Var.f45152e = com.google.protobuf.l6.newIntList();
                                    i17 |= 1;
                                }
                                while (d0Var.d() > 0) {
                                    ((com.google.protobuf.m6) h3Var.f45152e).e(d0Var.t());
                                }
                                d0Var.j(k17);
                            } else if (F == 16) {
                                if ((i17 & 2) == 0) {
                                    h3Var.f45154g = com.google.protobuf.l6.newIntList();
                                    i17 |= 2;
                                }
                                ((com.google.protobuf.m6) h3Var.f45154g).e(d0Var.t());
                            } else if (F == 18) {
                                int k18 = d0Var.k(d0Var.x());
                                if ((i17 & 2) == 0 && d0Var.d() > 0) {
                                    h3Var.f45154g = com.google.protobuf.l6.newIntList();
                                    i17 |= 2;
                                }
                                while (d0Var.d() > 0) {
                                    ((com.google.protobuf.m6) h3Var.f45154g).e(d0Var.t());
                                }
                                d0Var.j(k18);
                            } else if (F == 26) {
                                com.google.protobuf.y m17 = d0Var.m();
                                h3Var.f45151d = 1 | h3Var.f45151d;
                                h3Var.f45156i = m17;
                            } else if (F == 34) {
                                com.google.protobuf.y m18 = d0Var.m();
                                h3Var.f45151d |= 2;
                                h3Var.f45157m = m18;
                            } else if (F == 50) {
                                com.google.protobuf.y m19 = d0Var.m();
                                if ((i17 & 16) == 0) {
                                    h3Var.f45158n = new com.google.protobuf.f7();
                                    i17 |= 16;
                                }
                                h3Var.f45158n.q(m19);
                            } else if (!h3Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = h3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = h3Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 1) != 0) {
                    ((com.google.protobuf.h) h3Var.f45152e).f45145d = false;
                }
                if ((i17 & 2) != 0) {
                    ((com.google.protobuf.h) h3Var.f45154g).f45145d = false;
                }
                if ((i17 & 16) != 0) {
                    h3Var.f45158n = h3Var.f45158n.b();
                }
                h3Var.unknownFields = b17.build();
                h3Var.makeExtensionsImmutable();
            }
        }
        return h3Var;
    }
}
