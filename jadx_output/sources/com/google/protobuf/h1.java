package com.google.protobuf;

/* loaded from: classes16.dex */
public class h1 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.j1 j1Var = new com.google.protobuf.j1();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            j1Var.f45218d = 1 | j1Var.f45218d;
                            j1Var.f45219e = m17;
                        } else if (F == 16) {
                            j1Var.f45218d |= 2;
                            j1Var.f45220f = d0Var.t();
                        } else if (F == 26) {
                            com.google.protobuf.l1 builder = (j1Var.f45218d & 4) != 0 ? j1Var.f45221g.toBuilder() : null;
                            com.google.protobuf.m1 m1Var = (com.google.protobuf.m1) d0Var.v(com.google.protobuf.m1.f45309m, t4Var);
                            j1Var.f45221g = m1Var;
                            if (builder != null) {
                                builder.l(m1Var);
                                j1Var.f45221g = builder.buildPartial();
                            }
                            j1Var.f45218d |= 4;
                        } else if (!j1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = j1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = j1Var;
                    throw y6Var;
                }
            } finally {
                j1Var.unknownFields = b17.build();
                j1Var.makeExtensionsImmutable();
            }
        }
        return j1Var;
    }
}
