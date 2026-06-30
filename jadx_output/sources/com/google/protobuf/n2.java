package com.google.protobuf;

/* loaded from: classes16.dex */
public class n2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.q2 q2Var = new com.google.protobuf.q2();
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
                            q2Var.f45441e |= 1;
                            q2Var.f45442f = d0Var.l();
                        } else if (F == 272) {
                            int o17 = d0Var.o();
                            if (com.google.protobuf.p2.a(o17) == null) {
                                b17.g(34, o17);
                            } else {
                                q2Var.f45441e |= 2;
                                q2Var.f45443g = o17;
                            }
                        } else if (F == 7994) {
                            if ((i17 & 4) == 0) {
                                q2Var.f45444h = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            q2Var.f45444h.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                        } else if (!q2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = q2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = q2Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 4) != 0) {
                    q2Var.f45444h = java.util.Collections.unmodifiableList(q2Var.f45444h);
                }
                q2Var.unknownFields = b17.build();
                q2Var.makeExtensionsImmutable();
            }
        }
        return q2Var;
    }
}
