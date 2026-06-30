package com.google.protobuf;

/* loaded from: classes16.dex */
public final class ga {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.protobuf.ga f45143b;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.oa f45144a;

    static {
        int i17 = com.google.protobuf.oa.f45369b;
        f45143b = new com.google.protobuf.ga(true, com.google.protobuf.na.f45340a);
    }

    public ga(boolean z17, com.google.protobuf.oa oaVar) {
        this.f45144a = oaVar;
    }

    public static void c(int i17, int i18, java.util.List list, com.google.protobuf.ha haVar) {
        int F;
        for (java.lang.Object obj : list) {
            haVar.c(java.lang.String.valueOf(i17));
            haVar.c(": ");
            int i19 = i18 & 7;
            if (i19 == 0) {
                haVar.c(com.google.protobuf.ia.d(((java.lang.Long) obj).longValue()));
            } else if (i19 == 1) {
                haVar.c(java.lang.String.format(null, "0x%016x", (java.lang.Long) obj));
            } else if (i19 == 2) {
                try {
                    com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
                    com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
                    try {
                        com.google.protobuf.d0 m17 = yVar.m();
                        do {
                            F = m17.F();
                            if (F == 0) {
                                break;
                            }
                        } while (b17.e(F, m17));
                        m17.a(0);
                        com.google.protobuf.wa build = b17.build();
                        haVar.c("{");
                        haVar.a();
                        haVar.f45170b.append("  ");
                        d(build, haVar);
                        haVar.b();
                        haVar.c("}");
                    } catch (com.google.protobuf.y6 e17) {
                        throw e17;
                    } catch (java.io.IOException e18) {
                        throw new java.lang.RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e18);
                    }
                } catch (com.google.protobuf.y6 unused) {
                    haVar.c("\"");
                    java.util.logging.Logger logger = com.google.protobuf.ia.f45201a;
                    haVar.c(com.google.protobuf.ma.a((com.google.protobuf.y) obj));
                    haVar.c("\"");
                }
            } else if (i19 == 3) {
                d((com.google.protobuf.wa) obj, haVar);
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

    public static void d(com.google.protobuf.wa waVar, com.google.protobuf.ha haVar) {
        for (java.util.Map.Entry entry : waVar.f45652d.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            com.google.protobuf.ua uaVar = (com.google.protobuf.ua) entry.getValue();
            c(intValue, 0, uaVar.f45586a, haVar);
            c(intValue, 5, uaVar.f45587b, haVar);
            c(intValue, 1, uaVar.f45588c, haVar);
            c(intValue, 2, uaVar.f45589d, haVar);
            for (com.google.protobuf.wa waVar2 : uaVar.f45590e) {
                haVar.c(((java.lang.Integer) entry.getKey()).toString());
                haVar.c(" {");
                haVar.a();
                haVar.f45170b.append("  ");
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
    public final void a(com.google.protobuf.r8 r7, com.google.protobuf.ha r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ga.a(com.google.protobuf.r8, com.google.protobuf.ha):void");
    }

    public final void b(com.google.protobuf.b4 b4Var, java.lang.Object obj, com.google.protobuf.ha haVar) {
        if (b4Var.o()) {
            haVar.c("[");
            boolean z17 = b4Var.f44915n.r().f45226f;
            java.lang.String str = b4Var.f44910f;
            if (z17 && b4Var.f44914m == com.google.protobuf.a4.f44855g) {
                com.google.protobuf.s1 a17 = com.google.protobuf.s1.a(b4Var.f44909e.f45564g);
                if (a17 == null) {
                    a17 = com.google.protobuf.s1.LABEL_OPTIONAL;
                }
                if (a17 == com.google.protobuf.s1.LABEL_OPTIONAL) {
                    if (!b4Var.o()) {
                        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not an extension. (%s)", str));
                    }
                    if (b4Var.f44912h == b4Var.n()) {
                        haVar.c(b4Var.n().f45467e);
                        haVar.c("]");
                    }
                }
            }
            haVar.c(str);
            haVar.c("]");
        } else if (b4Var.f44914m == com.google.protobuf.a4.f44854f) {
            haVar.c(b4Var.n().getName());
        } else {
            haVar.c(b4Var.getName());
        }
        com.google.protobuf.z3 z3Var = b4Var.f44914m.f44859d;
        com.google.protobuf.z3 z3Var2 = com.google.protobuf.z3.MESSAGE;
        if (z3Var == z3Var2) {
            haVar.c(" {");
            haVar.a();
            haVar.f45170b.append("  ");
        } else {
            haVar.c(": ");
        }
        switch (b4Var.f44914m.ordinal()) {
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
                haVar.c(com.google.protobuf.ia.d(((java.lang.Long) obj).longValue()));
                break;
            case 4:
            case 14:
            case 16:
                haVar.c(((java.lang.Integer) obj).toString());
                break;
            case 6:
            case 12:
                int intValue = ((java.lang.Integer) obj).intValue();
                java.util.logging.Logger logger = com.google.protobuf.ia.f45201a;
                haVar.c(intValue >= 0 ? java.lang.Integer.toString(intValue) : java.lang.Long.toString(intValue & io.flutter.embedding.android.KeyboardMap.kValueMask));
                break;
            case 7:
                haVar.c(((java.lang.Boolean) obj).toString());
                break;
            case 8:
                haVar.c("\"");
                haVar.c(com.google.protobuf.ma.a(com.google.protobuf.y.h((java.lang.String) obj)));
                haVar.c("\"");
                break;
            case 9:
            case 10:
                a((com.google.protobuf.k8) obj, haVar);
                break;
            case 11:
                haVar.c("\"");
                if (obj instanceof com.google.protobuf.y) {
                    java.util.logging.Logger logger2 = com.google.protobuf.ia.f45201a;
                    haVar.c(com.google.protobuf.ma.a((com.google.protobuf.y) obj));
                } else {
                    java.util.logging.Logger logger3 = com.google.protobuf.ia.f45201a;
                    haVar.c(com.google.protobuf.ma.b(new com.google.protobuf.ka((byte[]) obj)));
                }
                haVar.c("\"");
                break;
            case 13:
                haVar.c(((com.google.protobuf.y3) obj).getName());
                break;
        }
        if (b4Var.f44914m.f44859d == z3Var2) {
            haVar.b();
            haVar.c("}");
        }
        haVar.a();
    }
}
