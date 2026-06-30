package com.google.protobuf;

/* loaded from: classes16.dex */
public class r0 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.t0 t0Var = new com.google.protobuf.t0();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            t0Var.f45509d |= 1;
                            t0Var.f45510e = d0Var.t();
                        } else if (F == 16) {
                            t0Var.f45509d |= 2;
                            t0Var.f45511f = d0Var.t();
                        } else if (F == 26) {
                            com.google.protobuf.o1 builder = (t0Var.f45509d & 4) != 0 ? t0Var.f45512g.toBuilder() : null;
                            com.google.protobuf.p1 p1Var = (com.google.protobuf.p1) d0Var.v(com.google.protobuf.p1.f45373h, t4Var);
                            t0Var.f45512g = p1Var;
                            if (builder != null) {
                                builder.l(p1Var);
                                t0Var.f45512g = builder.buildPartial();
                            }
                            t0Var.f45509d |= 4;
                        } else if (!t0Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = t0Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = t0Var;
                    throw y6Var;
                }
            } finally {
                t0Var.unknownFields = b17.build();
                t0Var.makeExtensionsImmutable();
            }
        }
        return t0Var;
    }
}
