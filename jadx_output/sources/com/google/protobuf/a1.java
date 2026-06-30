package com.google.protobuf;

/* loaded from: classes16.dex */
public class a1 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.c1 c1Var = new com.google.protobuf.c1();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 8) {
                                c1Var.f44947d |= 1;
                                c1Var.f44948e = d0Var.t();
                            } else if (F == 16) {
                                c1Var.f44947d |= 2;
                                c1Var.f44949f = d0Var.t();
                            } else if (!c1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = c1Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = c1Var;
                    throw y6Var;
                }
            } finally {
                c1Var.unknownFields = b17.build();
                c1Var.makeExtensionsImmutable();
            }
        }
        return c1Var;
    }
}
