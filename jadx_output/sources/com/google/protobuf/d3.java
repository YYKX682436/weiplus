package com.google.protobuf;

/* loaded from: classes16.dex */
public class d3 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.i3 i3Var = new com.google.protobuf.i3();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            if (!(z18 & true)) {
                                i3Var.f45189d = new java.util.ArrayList();
                                z18 |= true;
                            }
                            i3Var.f45189d.add(d0Var.v(com.google.protobuf.h3.f45150q, t4Var));
                        } else if (!i3Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = i3Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = i3Var;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    i3Var.f45189d = java.util.Collections.unmodifiableList(i3Var.f45189d);
                }
                i3Var.unknownFields = b17.build();
                i3Var.makeExtensionsImmutable();
            }
        }
        return i3Var;
    }
}
