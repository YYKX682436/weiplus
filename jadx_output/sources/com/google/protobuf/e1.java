package com.google.protobuf;

/* loaded from: classes16.dex */
public class e1 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.g1 g1Var = new com.google.protobuf.g1();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 16) {
                            g1Var.f45097e |= 1;
                            g1Var.f45098f = d0Var.l();
                        } else if (F == 24) {
                            g1Var.f45097e |= 2;
                            g1Var.f45099g = d0Var.l();
                        } else if (F == 7994) {
                            if ((i17 & 4) == 0) {
                                g1Var.f45100h = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            g1Var.f45100h.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                        } else if (!g1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = g1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = g1Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 4) != 0) {
                    g1Var.f45100h = java.util.Collections.unmodifiableList(g1Var.f45100h);
                }
                g1Var.unknownFields = b17.build();
                g1Var.makeExtensionsImmutable();
            }
        }
        return g1Var;
    }
}
