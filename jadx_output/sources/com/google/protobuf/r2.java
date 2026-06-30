package com.google.protobuf;

/* loaded from: classes16.dex */
public class r2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.t2 t2Var = new com.google.protobuf.t2();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            t2Var.f45536d = 1 | t2Var.f45536d;
                            t2Var.f45537e = m17;
                        } else if (F == 18) {
                            com.google.protobuf.v2 builder = (t2Var.f45536d & 2) != 0 ? t2Var.f45538f.toBuilder() : null;
                            com.google.protobuf.w2 w2Var = (com.google.protobuf.w2) d0Var.v(com.google.protobuf.w2.f45643h, t4Var);
                            t2Var.f45538f = w2Var;
                            if (builder != null) {
                                builder.l(w2Var);
                                t2Var.f45538f = builder.buildPartial();
                            }
                            t2Var.f45536d |= 2;
                        } else if (!t2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = t2Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = t2Var;
                    throw y6Var;
                }
            } finally {
                t2Var.unknownFields = b17.build();
                t2Var.makeExtensionsImmutable();
            }
        }
        return t2Var;
    }
}
