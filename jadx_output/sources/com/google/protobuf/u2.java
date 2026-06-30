package com.google.protobuf;

/* loaded from: classes16.dex */
public class u2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.w2 w2Var = new com.google.protobuf.w2();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 7994) {
                            if (!(z18 & true)) {
                                w2Var.f45644e = new java.util.ArrayList();
                                z18 |= true;
                            }
                            w2Var.f45644e.add(d0Var.v(com.google.protobuf.o3.f45353q, t4Var));
                        } else if (!w2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = w2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = w2Var;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    w2Var.f45644e = java.util.Collections.unmodifiableList(w2Var.f45644e);
                }
                w2Var.unknownFields = b17.build();
                w2Var.makeExtensionsImmutable();
            }
        }
        return w2Var;
    }
}
