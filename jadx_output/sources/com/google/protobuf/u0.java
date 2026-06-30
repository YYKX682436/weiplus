package com.google.protobuf;

/* loaded from: classes16.dex */
public class u0 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.w0 w0Var = new com.google.protobuf.w0();
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
                                w0Var.f45629d |= 1;
                                w0Var.f45630e = d0Var.t();
                            } else if (F == 16) {
                                w0Var.f45629d |= 2;
                                w0Var.f45631f = d0Var.t();
                            } else if (!w0Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = w0Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = w0Var;
                    throw y6Var;
                }
            } finally {
                w0Var.unknownFields = b17.build();
                w0Var.makeExtensionsImmutable();
            }
        }
        return w0Var;
    }
}
