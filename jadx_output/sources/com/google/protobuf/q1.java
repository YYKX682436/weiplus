package com.google.protobuf;

/* loaded from: classes16.dex */
public class q1 extends com.google.protobuf.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.u1 u1Var = new com.google.protobuf.u1();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            com.google.protobuf.y m17 = d0Var.m();
                            u1Var.f45561d = 1 | u1Var.f45561d;
                            u1Var.f45562e = m17;
                        case 18:
                            com.google.protobuf.y m18 = d0Var.m();
                            u1Var.f45561d |= 32;
                            u1Var.f45567m = m18;
                        case 24:
                            u1Var.f45561d |= 2;
                            u1Var.f45563f = d0Var.t();
                        case 32:
                            int o17 = d0Var.o();
                            if (com.google.protobuf.s1.a(o17) == null) {
                                b17.g(4, o17);
                            } else {
                                u1Var.f45561d |= 4;
                                u1Var.f45564g = o17;
                            }
                        case 40:
                            int o18 = d0Var.o();
                            if (com.google.protobuf.t1.a(o18) == null) {
                                b17.g(5, o18);
                            } else {
                                u1Var.f45561d |= 8;
                                u1Var.f45565h = o18;
                            }
                        case 50:
                            com.google.protobuf.y m19 = d0Var.m();
                            u1Var.f45561d |= 16;
                            u1Var.f45566i = m19;
                        case 58:
                            com.google.protobuf.y m27 = d0Var.m();
                            u1Var.f45561d |= 64;
                            u1Var.f45568n = m27;
                        case 66:
                            com.google.protobuf.w1 builder = (u1Var.f45561d & 512) != 0 ? u1Var.f45571q.toBuilder() : null;
                            com.google.protobuf.z1 z1Var = (com.google.protobuf.z1) d0Var.v(com.google.protobuf.z1.f45759r, t4Var);
                            u1Var.f45571q = z1Var;
                            if (builder != null) {
                                builder.l(z1Var);
                                u1Var.f45571q = builder.buildPartial();
                            }
                            u1Var.f45561d |= 512;
                        case 72:
                            u1Var.f45561d |= 128;
                            u1Var.f45569o = d0Var.t();
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                            com.google.protobuf.y m28 = d0Var.m();
                            u1Var.f45561d |= 256;
                            u1Var.f45570p = m28;
                        case 136:
                            u1Var.f45561d |= 1024;
                            u1Var.f45572r = d0Var.l();
                        default:
                            if (!u1Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = u1Var;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = u1Var;
                    throw y6Var;
                }
            } finally {
                u1Var.unknownFields = b17.build();
                u1Var.makeExtensionsImmutable();
            }
        }
        return u1Var;
    }
}
