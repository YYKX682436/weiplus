package com.google.protobuf;

/* loaded from: classes16.dex */
public class a2 extends com.google.protobuf.g {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.c2 c2Var = new com.google.protobuf.c2();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        switch (F) {
                            case 0:
                                z17 = true;
                            case 10:
                                com.google.protobuf.y m17 = d0Var.m();
                                c2Var.f44953d |= 1;
                                c2Var.f44954e = m17;
                            case 18:
                                com.google.protobuf.y m18 = d0Var.m();
                                c2Var.f44953d |= 2;
                                c2Var.f44955f = m18;
                            case 26:
                                com.google.protobuf.y m19 = d0Var.m();
                                int i17 = (c17 == true ? 1 : 0) & 4;
                                c17 = c17;
                                if (i17 == 0) {
                                    c2Var.f44956g = new com.google.protobuf.f7();
                                    c17 = (c17 == true ? 1 : 0) | 4;
                                }
                                c2Var.f44956g.q(m19);
                            case 34:
                                int i18 = (c17 == true ? 1 : 0) & 32;
                                c17 = c17;
                                if (i18 == 0) {
                                    c2Var.f44959m = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | ' ';
                                }
                                c2Var.f44959m.add(d0Var.v(com.google.protobuf.x0.f45654t, t4Var));
                            case 42:
                                int i19 = (c17 == true ? 1 : 0) & 64;
                                c17 = c17;
                                if (i19 == 0) {
                                    c2Var.f44960n = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | '@';
                                }
                                c2Var.f44960n.add(d0Var.v(com.google.protobuf.d1.f44996o, t4Var));
                            case 50:
                                int i27 = (c17 == true ? 1 : 0) & 128;
                                c17 = c17;
                                if (i27 == 0) {
                                    c2Var.f44961o = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 128;
                                }
                                c2Var.f44961o.add(d0Var.v(com.google.protobuf.z2.f45770m, t4Var));
                            case 58:
                                int i28 = (c17 == true ? 1 : 0) & 256;
                                c17 = c17;
                                if (i28 == 0) {
                                    c2Var.f44962p = new java.util.ArrayList();
                                    c17 = (c17 == true ? 1 : 0) | 256;
                                }
                                c2Var.f44962p.add(d0Var.v(com.google.protobuf.u1.f45560u, t4Var));
                            case 66:
                                com.google.protobuf.e2 builder = (c2Var.f44953d & 4) != 0 ? c2Var.f44963q.toBuilder() : null;
                                com.google.protobuf.g2 g2Var = (com.google.protobuf.g2) d0Var.v(com.google.protobuf.g2.F, t4Var);
                                c2Var.f44963q = g2Var;
                                if (builder != null) {
                                    builder.l(g2Var);
                                    c2Var.f44963q = builder.buildPartial();
                                }
                                c2Var.f44953d |= 4;
                            case 74:
                                com.google.protobuf.e3 builder2 = (c2Var.f44953d & 8) != 0 ? c2Var.f44964r.toBuilder() : null;
                                com.google.protobuf.i3 i3Var = (com.google.protobuf.i3) d0Var.v(com.google.protobuf.i3.f45188g, t4Var);
                                c2Var.f44964r = i3Var;
                                if (builder2 != null) {
                                    builder2.f(i3Var);
                                    c2Var.f44964r = builder2.buildPartial();
                                }
                                c2Var.f44953d |= 8;
                            case 80:
                                int i29 = (c17 == true ? 1 : 0) & 8;
                                c17 = c17;
                                if (i29 == 0) {
                                    c2Var.f44957h = com.google.protobuf.l6.newIntList();
                                    c17 = (c17 == true ? 1 : 0) | '\b';
                                }
                                ((com.google.protobuf.m6) c2Var.f44957h).e(d0Var.t());
                            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                                int k17 = d0Var.k(d0Var.x());
                                int i37 = (c17 == true ? 1 : 0) & 8;
                                c17 = c17;
                                if (i37 == 0) {
                                    c17 = c17;
                                    if (d0Var.d() > 0) {
                                        c2Var.f44957h = com.google.protobuf.l6.newIntList();
                                        c17 = (c17 == true ? 1 : 0) | '\b';
                                    }
                                }
                                while (d0Var.d() > 0) {
                                    ((com.google.protobuf.m6) c2Var.f44957h).e(d0Var.t());
                                }
                                d0Var.j(k17);
                            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                                int i38 = (c17 == true ? 1 : 0) & 16;
                                c17 = c17;
                                if (i38 == 0) {
                                    c2Var.f44958i = com.google.protobuf.l6.newIntList();
                                    c17 = (c17 == true ? 1 : 0) | 16;
                                }
                                ((com.google.protobuf.m6) c2Var.f44958i).e(d0Var.t());
                            case 90:
                                int k18 = d0Var.k(d0Var.x());
                                int i39 = (c17 == true ? 1 : 0) & 16;
                                c17 = c17;
                                if (i39 == 0) {
                                    c17 = c17;
                                    if (d0Var.d() > 0) {
                                        c2Var.f44958i = com.google.protobuf.l6.newIntList();
                                        c17 = (c17 == true ? 1 : 0) | 16;
                                    }
                                }
                                while (d0Var.d() > 0) {
                                    ((com.google.protobuf.m6) c2Var.f44958i).e(d0Var.t());
                                }
                                d0Var.j(k18);
                            case 98:
                                com.google.protobuf.y m27 = d0Var.m();
                                c2Var.f44953d |= 16;
                                c2Var.f44965s = m27;
                            default:
                                if (!c2Var.parseUnknownField(d0Var, b17, t4Var, F)) {
                                    z17 = true;
                                }
                        }
                    } catch (java.io.IOException e17) {
                        com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e17);
                        y6Var.f45739d = c2Var;
                        throw y6Var;
                    }
                } catch (com.google.protobuf.y6 e18) {
                    e18.f45739d = c2Var;
                    throw e18;
                }
            } finally {
                if (((c17 == true ? 1 : 0) & 4) != 0) {
                    c2Var.f44956g = c2Var.f44956g.b();
                }
                if (((c17 == true ? 1 : 0) & 32) != 0) {
                    c2Var.f44959m = java.util.Collections.unmodifiableList(c2Var.f44959m);
                }
                if (((c17 == true ? 1 : 0) & 64) != 0) {
                    c2Var.f44960n = java.util.Collections.unmodifiableList(c2Var.f44960n);
                }
                if (((c17 == true ? 1 : 0) & 128) != 0) {
                    c2Var.f44961o = java.util.Collections.unmodifiableList(c2Var.f44961o);
                }
                if (((c17 == true ? 1 : 0) & 256) != 0) {
                    c2Var.f44962p = java.util.Collections.unmodifiableList(c2Var.f44962p);
                }
                if (((c17 == true ? 1 : 0) & 8) != 0) {
                    ((com.google.protobuf.h) c2Var.f44957h).f45145d = false;
                }
                if (((c17 == true ? 1 : 0) & 16) != 0) {
                    ((com.google.protobuf.h) c2Var.f44958i).f45145d = false;
                }
                c2Var.unknownFields = b17.build();
                c2Var.makeExtensionsImmutable();
            }
        }
        return c2Var;
    }
}
