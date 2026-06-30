package com.google.protobuf;

/* loaded from: classes16.dex */
public class y0 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d1 d1Var = new com.google.protobuf.d1();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            d1Var.f44997d = 1 | d1Var.f44997d;
                            d1Var.f44998e = m17;
                        } else if (F == 18) {
                            if ((i17 & 2) == 0) {
                                d1Var.f44999f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            d1Var.f44999f.add(d0Var.v(com.google.protobuf.j1.f45217m, t4Var));
                        } else if (F == 26) {
                            com.google.protobuf.f1 builder = (d1Var.f44997d & 2) != 0 ? d1Var.f45000g.toBuilder() : null;
                            com.google.protobuf.g1 g1Var = (com.google.protobuf.g1) d0Var.v(com.google.protobuf.g1.f45096n, t4Var);
                            d1Var.f45000g = g1Var;
                            if (builder != null) {
                                builder.l(g1Var);
                                d1Var.f45000g = builder.buildPartial();
                            }
                            d1Var.f44997d |= 2;
                        } else if (F == 34) {
                            if ((i17 & 8) == 0) {
                                d1Var.f45001h = new java.util.ArrayList();
                                i17 |= 8;
                            }
                            d1Var.f45001h.add(d0Var.v(com.google.protobuf.c1.f44946i, t4Var));
                        } else if (F == 42) {
                            com.google.protobuf.y m18 = d0Var.m();
                            if ((i17 & 16) == 0) {
                                d1Var.f45002i = new com.google.protobuf.f7();
                                i17 |= 16;
                            }
                            d1Var.f45002i.q(m18);
                        } else if (!d1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = d1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = d1Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    d1Var.f44999f = java.util.Collections.unmodifiableList(d1Var.f44999f);
                }
                if ((i17 & 8) != 0) {
                    d1Var.f45001h = java.util.Collections.unmodifiableList(d1Var.f45001h);
                }
                if ((i17 & 16) != 0) {
                    d1Var.f45002i = d1Var.f45002i.b();
                }
                d1Var.unknownFields = b17.build();
                d1Var.makeExtensionsImmutable();
            }
        }
        return d1Var;
    }
}
