package com.google.protobuf;

/* loaded from: classes16.dex */
public class k2 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.m2 m2Var = new com.google.protobuf.m2();
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
                                m2Var.f45316d = 1 | m2Var.f45316d;
                                m2Var.f45317e = m17;
                            } else if (F == 18) {
                                com.google.protobuf.y m18 = d0Var.m();
                                m2Var.f45316d |= 2;
                                m2Var.f45318f = m18;
                            } else if (F == 26) {
                                com.google.protobuf.y m19 = d0Var.m();
                                m2Var.f45316d |= 4;
                                m2Var.f45319g = m19;
                            } else if (F == 34) {
                                com.google.protobuf.o2 builder = (m2Var.f45316d & 8) != 0 ? m2Var.f45320h.toBuilder() : null;
                                com.google.protobuf.q2 q2Var = (com.google.protobuf.q2) d0Var.v(com.google.protobuf.q2.f45440n, t4Var);
                                m2Var.f45320h = q2Var;
                                if (builder != null) {
                                    builder.l(q2Var);
                                    m2Var.f45320h = builder.buildPartial();
                                }
                                m2Var.f45316d |= 8;
                            } else if (F == 40) {
                                m2Var.f45316d |= 16;
                                m2Var.f45321i = d0Var.l();
                            } else if (F == 48) {
                                m2Var.f45316d |= 32;
                                m2Var.f45322m = d0Var.l();
                            } else if (!m2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = m2Var;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = m2Var;
                    throw y6Var;
                }
            } finally {
                m2Var.unknownFields = b17.build();
                m2Var.makeExtensionsImmutable();
            }
        }
        return m2Var;
    }
}
