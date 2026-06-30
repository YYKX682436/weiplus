package com.google.protobuf;

/* loaded from: classes16.dex */
public class j3 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.o3 o3Var = new com.google.protobuf.o3();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 18) {
                                if (!(z18 & true)) {
                                    o3Var.f45355e = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                o3Var.f45355e.add(d0Var.v(com.google.protobuf.n3.f45333i, t4Var));
                            } else if (F == 26) {
                                com.google.protobuf.y m17 = d0Var.m();
                                o3Var.f45354d |= 1;
                                o3Var.f45356f = m17;
                            } else if (F == 32) {
                                o3Var.f45354d |= 2;
                                o3Var.f45357g = d0Var.H();
                            } else if (F == 40) {
                                o3Var.f45354d |= 4;
                                o3Var.f45358h = d0Var.u();
                            } else if (F == 49) {
                                o3Var.f45354d |= 8;
                                o3Var.f45359i = d0Var.n();
                            } else if (F == 58) {
                                o3Var.f45354d |= 16;
                                o3Var.f45360m = d0Var.m();
                            } else if (F == 66) {
                                com.google.protobuf.y m18 = d0Var.m();
                                o3Var.f45354d = 32 | o3Var.f45354d;
                                o3Var.f45361n = m18;
                            } else if (!o3Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = o3Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = o3Var;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    o3Var.f45355e = java.util.Collections.unmodifiableList(o3Var.f45355e);
                }
                o3Var.unknownFields = b17.build();
                o3Var.makeExtensionsImmutable();
            }
        }
        return o3Var;
    }
}
