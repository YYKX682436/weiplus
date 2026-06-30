package com.google.protobuf;

/* loaded from: classes16.dex */
public class x2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.z2 z2Var = new com.google.protobuf.z2();
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
                            if (F == 10) {
                                com.google.protobuf.y m17 = d0Var.m();
                                z2Var.f45771d = 1 | z2Var.f45771d;
                                z2Var.f45772e = m17;
                            } else if (F == 18) {
                                if ((i17 & 2) == 0) {
                                    z2Var.f45773f = new java.util.ArrayList();
                                    i17 |= 2;
                                }
                                z2Var.f45773f.add(d0Var.v(com.google.protobuf.m2.f45315p, t4Var));
                            } else if (F == 26) {
                                com.google.protobuf.b3 builder = (z2Var.f45771d & 2) != 0 ? z2Var.f45774g.toBuilder() : null;
                                com.google.protobuf.c3 c3Var = (com.google.protobuf.c3) d0Var.v(com.google.protobuf.c3.f44968m, t4Var);
                                z2Var.f45774g = c3Var;
                                if (builder != null) {
                                    builder.l(c3Var);
                                    z2Var.f45774g = builder.buildPartial();
                                }
                                z2Var.f45771d |= 2;
                            } else if (!z2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = z2Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = z2Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    z2Var.f45773f = java.util.Collections.unmodifiableList(z2Var.f45773f);
                }
                z2Var.unknownFields = b17.build();
                z2Var.makeExtensionsImmutable();
            }
        }
        return z2Var;
    }
}
