package com.google.protobuf;

/* loaded from: classes16.dex */
public class p0 extends com.google.protobuf.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.x0 x0Var = new com.google.protobuf.x0();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            com.google.protobuf.y m17 = d0Var.m();
                            x0Var.f45655d = 1 | x0Var.f45655d;
                            x0Var.f45656e = m17;
                        case 18:
                            if ((i17 & 2) == 0) {
                                x0Var.f45657f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            x0Var.f45657f.add(d0Var.v(com.google.protobuf.u1.f45560u, t4Var));
                        case 26:
                            if ((i17 & 8) == 0) {
                                x0Var.f45659h = new java.util.ArrayList();
                                i17 |= 8;
                            }
                            x0Var.f45659h.add(d0Var.v(com.google.protobuf.x0.f45654t, t4Var));
                        case 34:
                            if ((i17 & 16) == 0) {
                                x0Var.f45660i = new java.util.ArrayList();
                                i17 |= 16;
                            }
                            x0Var.f45660i.add(d0Var.v(com.google.protobuf.d1.f44996o, t4Var));
                        case 42:
                            if ((i17 & 32) == 0) {
                                x0Var.f45661m = new java.util.ArrayList();
                                i17 |= 32;
                            }
                            x0Var.f45661m.add(d0Var.v(com.google.protobuf.t0.f45508m, t4Var));
                        case 50:
                            if ((i17 & 4) == 0) {
                                x0Var.f45658g = new java.util.ArrayList();
                                i17 |= 4;
                            }
                            x0Var.f45658g.add(d0Var.v(com.google.protobuf.u1.f45560u, t4Var));
                        case 58:
                            com.google.protobuf.i2 builder = (x0Var.f45655d & 2) != 0 ? x0Var.f45663o.toBuilder() : null;
                            com.google.protobuf.j2 j2Var = (com.google.protobuf.j2) d0Var.v(com.google.protobuf.j2.f45224p, t4Var);
                            x0Var.f45663o = j2Var;
                            if (builder != null) {
                                builder.l(j2Var);
                                x0Var.f45663o = builder.buildPartial();
                            }
                            x0Var.f45655d |= 2;
                        case 66:
                            if ((i17 & 64) == 0) {
                                x0Var.f45662n = new java.util.ArrayList();
                                i17 |= 64;
                            }
                            x0Var.f45662n.add(d0Var.v(com.google.protobuf.t2.f45535i, t4Var));
                        case 74:
                            if ((i17 & 256) == 0) {
                                x0Var.f45664p = new java.util.ArrayList();
                                i17 |= 256;
                            }
                            x0Var.f45664p.add(d0Var.v(com.google.protobuf.w0.f45628i, t4Var));
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                            com.google.protobuf.y m18 = d0Var.m();
                            if ((i17 & 512) == 0) {
                                x0Var.f45665q = new com.google.protobuf.f7();
                                i17 |= 512;
                            }
                            x0Var.f45665q.q(m18);
                        default:
                            if (!x0Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = x0Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = x0Var;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    x0Var.f45657f = java.util.Collections.unmodifiableList(x0Var.f45657f);
                }
                if ((i17 & 8) != 0) {
                    x0Var.f45659h = java.util.Collections.unmodifiableList(x0Var.f45659h);
                }
                if ((i17 & 16) != 0) {
                    x0Var.f45660i = java.util.Collections.unmodifiableList(x0Var.f45660i);
                }
                if ((i17 & 32) != 0) {
                    x0Var.f45661m = java.util.Collections.unmodifiableList(x0Var.f45661m);
                }
                if ((i17 & 4) != 0) {
                    x0Var.f45658g = java.util.Collections.unmodifiableList(x0Var.f45658g);
                }
                if ((i17 & 64) != 0) {
                    x0Var.f45662n = java.util.Collections.unmodifiableList(x0Var.f45662n);
                }
                if ((i17 & 256) != 0) {
                    x0Var.f45664p = java.util.Collections.unmodifiableList(x0Var.f45664p);
                }
                if ((i17 & 512) != 0) {
                    x0Var.f45665q = x0Var.f45665q.b();
                }
                x0Var.unknownFields = b17.build();
                x0Var.makeExtensionsImmutable();
            }
        }
        return x0Var;
    }
}
