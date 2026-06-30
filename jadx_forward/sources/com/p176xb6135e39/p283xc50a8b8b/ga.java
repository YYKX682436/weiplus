package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class ga {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.ga f126676b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.oa f126677a;

    static {
        int i17 = com.p176xb6135e39.p283xc50a8b8b.oa.f126902b;
        f126676b = new com.p176xb6135e39.p283xc50a8b8b.ga(true, com.p176xb6135e39.p283xc50a8b8b.na.f126873a);
    }

    public ga(boolean z17, com.p176xb6135e39.p283xc50a8b8b.oa oaVar) {
        this.f126677a = oaVar;
    }

    public static void c(int i17, int i18, java.util.List list, com.p176xb6135e39.p283xc50a8b8b.ha haVar) {
        int F;
        for (java.lang.Object obj : list) {
            haVar.c(java.lang.String.valueOf(i17));
            haVar.c(": ");
            int i19 = i18 & 7;
            if (i19 == 0) {
                haVar.c(com.p176xb6135e39.p283xc50a8b8b.ia.d(((java.lang.Long) obj).longValue()));
            } else if (i19 == 1) {
                haVar.c(java.lang.String.format(null, "0x%016x", (java.lang.Long) obj));
            } else if (i19 == 2) {
                try {
                    com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
                    com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
                    try {
                        com.p176xb6135e39.p283xc50a8b8b.d0 m17 = yVar.m();
                        do {
                            F = m17.F();
                            if (F == 0) {
                                break;
                            }
                        } while (b17.e(F, m17));
                        m17.a(0);
                        com.p176xb6135e39.p283xc50a8b8b.wa mo20556x59bc66e = b17.mo20556x59bc66e();
                        haVar.c("{");
                        haVar.a();
                        haVar.f126703b.append("  ");
                        d(mo20556x59bc66e, haVar);
                        haVar.b();
                        haVar.c("}");
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        throw e17;
                    } catch (java.io.IOException e18) {
                        throw new java.lang.RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e18);
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
                    haVar.c("\"");
                    java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
                    haVar.c(com.p176xb6135e39.p283xc50a8b8b.ma.a((com.p176xb6135e39.p283xc50a8b8b.y) obj));
                    haVar.c("\"");
                }
            } else if (i19 == 3) {
                d((com.p176xb6135e39.p283xc50a8b8b.wa) obj, haVar);
            } else {
                if (i19 != 5) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(20);
                    sb6.append("Bad tag: ");
                    sb6.append(i18);
                    throw new java.lang.IllegalArgumentException(sb6.toString());
                }
                haVar.c(java.lang.String.format(null, "0x%08x", (java.lang.Integer) obj));
            }
            haVar.a();
        }
    }

    public static void d(com.p176xb6135e39.p283xc50a8b8b.wa waVar, com.p176xb6135e39.p283xc50a8b8b.ha haVar) {
        for (java.util.Map.Entry entry : waVar.f127185d.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            com.p176xb6135e39.p283xc50a8b8b.ua uaVar = (com.p176xb6135e39.p283xc50a8b8b.ua) entry.getValue();
            c(intValue, 0, uaVar.f127119a, haVar);
            c(intValue, 5, uaVar.f127120b, haVar);
            c(intValue, 1, uaVar.f127121c, haVar);
            c(intValue, 2, uaVar.f127122d, haVar);
            for (com.p176xb6135e39.p283xc50a8b8b.wa waVar2 : uaVar.f127123e) {
                haVar.c(((java.lang.Integer) entry.getKey()).toString());
                haVar.c(" {");
                haVar.a();
                haVar.f126703b.append("  ");
                d(waVar2, haVar);
                haVar.b();
                haVar.c("}");
                haVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p176xb6135e39.p283xc50a8b8b.r8 r7, com.p176xb6135e39.p283xc50a8b8b.ha r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.ga.a(com.google.protobuf.r8, com.google.protobuf.ha):void");
    }

    public final void b(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.ha haVar) {
        if (b4Var.o()) {
            haVar.c("[");
            boolean z17 = b4Var.f126448n.r().f126759f;
            java.lang.String str = b4Var.f126443f;
            if (z17 && b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126388g) {
                com.p176xb6135e39.p283xc50a8b8b.s1 a17 = com.p176xb6135e39.p283xc50a8b8b.s1.a(b4Var.f126442e.f127097g);
                if (a17 == null) {
                    a17 = com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL;
                }
                if (a17 == com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL) {
                    if (!b4Var.o()) {
                        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not an extension. (%s)", str));
                    }
                    if (b4Var.f126445h == b4Var.n()) {
                        haVar.c(b4Var.n().f127000e);
                        haVar.c("]");
                    }
                }
            }
            haVar.c(str);
            haVar.c("]");
        } else if (b4Var.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126387f) {
            haVar.c(b4Var.n().mo20569xfb82e301());
        } else {
            haVar.c(b4Var.mo20569xfb82e301());
        }
        com.p176xb6135e39.p283xc50a8b8b.z3 z3Var = b4Var.f126447m.f126392d;
        com.p176xb6135e39.p283xc50a8b8b.z3 z3Var2 = com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE;
        if (z3Var == z3Var2) {
            haVar.c(" {");
            haVar.a();
            haVar.f126703b.append("  ");
        } else {
            haVar.c(": ");
        }
        switch (b4Var.f126447m.ordinal()) {
            case 0:
                haVar.c(((java.lang.Double) obj).toString());
                break;
            case 1:
                haVar.c(((java.lang.Float) obj).toString());
                break;
            case 2:
            case 15:
            case 17:
                haVar.c(((java.lang.Long) obj).toString());
                break;
            case 3:
            case 5:
                haVar.c(com.p176xb6135e39.p283xc50a8b8b.ia.d(((java.lang.Long) obj).longValue()));
                break;
            case 4:
            case 14:
            case 16:
                haVar.c(((java.lang.Integer) obj).toString());
                break;
            case 6:
            case 12:
                int intValue = ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
                haVar.c(intValue >= 0 ? java.lang.Integer.toString(intValue) : java.lang.Long.toString(intValue & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
                break;
            case 7:
                haVar.c(((java.lang.Boolean) obj).toString());
                break;
            case 8:
                haVar.c("\"");
                haVar.c(com.p176xb6135e39.p283xc50a8b8b.ma.a(com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj)));
                haVar.c("\"");
                break;
            case 9:
            case 10:
                a((com.p176xb6135e39.p283xc50a8b8b.k8) obj, haVar);
                break;
            case 11:
                haVar.c("\"");
                if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
                    java.util.logging.Logger logger2 = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
                    haVar.c(com.p176xb6135e39.p283xc50a8b8b.ma.a((com.p176xb6135e39.p283xc50a8b8b.y) obj));
                } else {
                    java.util.logging.Logger logger3 = com.p176xb6135e39.p283xc50a8b8b.ia.f126734a;
                    haVar.c(com.p176xb6135e39.p283xc50a8b8b.ma.b(new com.p176xb6135e39.p283xc50a8b8b.ka((byte[]) obj)));
                }
                haVar.c("\"");
                break;
            case 13:
                haVar.c(((com.p176xb6135e39.p283xc50a8b8b.y3) obj).mo20569xfb82e301());
                break;
        }
        if (b4Var.f126447m.f126392d == z3Var2) {
            haVar.b();
            haVar.c("}");
        }
        haVar.a();
    }
}
