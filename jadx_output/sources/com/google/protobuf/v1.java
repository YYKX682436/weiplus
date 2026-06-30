package com.google.protobuf;

/* loaded from: classes16.dex */
public class v1 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.z1 z1Var = new com.google.protobuf.z1();
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
                                int o17 = d0Var.o();
                                if (com.google.protobuf.x1.a(o17) == null) {
                                    b17.g(1, o17);
                                } else {
                                    z1Var.f45760e = 1 | z1Var.f45760e;
                                    z1Var.f45761f = o17;
                                }
                            } else if (F == 16) {
                                z1Var.f45760e |= 2;
                                z1Var.f45762g = d0Var.l();
                            } else if (F == 24) {
                                z1Var.f45760e |= 16;
                                z1Var.f45765m = d0Var.l();
                            } else if (F == 40) {
                                z1Var.f45760e |= 8;
                                z1Var.f45764i = d0Var.l();
                            } else if (F == 48) {
                                int o18 = d0Var.o();
                                if (com.google.protobuf.y1.a(o18) == null) {
                                    b17.g(6, o18);
                                } else {
                                    z1Var.f45760e |= 4;
                                    z1Var.f45763h = o18;
                                }
                            } else if (F == 80) {
                                z1Var.f45760e |= 32;
                                z1Var.f45766n = d0Var.l();
                            } else if (F == 7994) {
                                if ((i17 & 64) == 0) {
                                    z1Var.f45767o = new java.util.ArrayList();
                                    i17 |= 64;
                                }
                                z1Var.f45767o.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                            } else if (!z1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = z1Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = z1Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 64) != 0) {
                    z1Var.f45767o = java.util.Collections.unmodifiableList(z1Var.f45767o);
                }
                z1Var.unknownFields = b17.build();
                z1Var.makeExtensionsImmutable();
            }
        }
        return z1Var;
    }
}
