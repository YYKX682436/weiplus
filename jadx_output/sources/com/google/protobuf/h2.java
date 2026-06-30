package com.google.protobuf;

/* loaded from: classes16.dex */
public class h2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.j2 j2Var = new com.google.protobuf.j2();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            j2Var.f45225e |= 1;
                            j2Var.f45226f = d0Var.l();
                        } else if (F == 16) {
                            j2Var.f45225e |= 2;
                            j2Var.f45227g = d0Var.l();
                        } else if (F == 24) {
                            j2Var.f45225e |= 4;
                            j2Var.f45228h = d0Var.l();
                        } else if (F == 56) {
                            j2Var.f45225e |= 8;
                            j2Var.f45229i = d0Var.l();
                        } else if (F == 7994) {
                            if ((i17 & 16) == 0) {
                                j2Var.f45230m = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            j2Var.f45230m.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                        } else if (!j2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = j2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = j2Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 16) != 0) {
                    j2Var.f45230m = java.util.Collections.unmodifiableList(j2Var.f45230m);
                }
                j2Var.unknownFields = b17.build();
                j2Var.makeExtensionsImmutable();
            }
        }
        return j2Var;
    }
}
