package com.google.protobuf;

/* loaded from: classes16.dex */
public class a3 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.c3 c3Var = new com.google.protobuf.c3();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 264) {
                            c3Var.f44969e |= 1;
                            c3Var.f44970f = d0Var.l();
                        } else if (F == 7994) {
                            if ((i17 & 2) == 0) {
                                c3Var.f44971g = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            c3Var.f44971g.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                        } else if (!c3Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = c3Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = c3Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    c3Var.f44971g = java.util.Collections.unmodifiableList(c3Var.f44971g);
                }
                c3Var.unknownFields = b17.build();
                c3Var.makeExtensionsImmutable();
            }
        }
        return c3Var;
    }
}
