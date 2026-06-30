package com.google.protobuf;

/* loaded from: classes16.dex */
public class l3 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.n3 n3Var = new com.google.protobuf.n3();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                com.google.protobuf.y m17 = d0Var.m();
                                n3Var.f45334d = 1 | n3Var.f45334d;
                                n3Var.f45335e = m17;
                            } else if (F == 16) {
                                n3Var.f45334d |= 2;
                                n3Var.f45336f = d0Var.l();
                            } else if (!n3Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = n3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = n3Var;
                    throw y6Var;
                }
            } finally {
                n3Var.unknownFields = b17.build();
                n3Var.makeExtensionsImmutable();
            }
        }
        return n3Var;
    }
}
