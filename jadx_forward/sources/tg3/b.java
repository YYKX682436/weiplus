package tg3;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final tg3.b f500714a = new tg3.b();

    public static void a(tg3.b bVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, int i17, int i18, java.lang.Object obj) {
        bVar.b("msg_c2c_path_clean_for_auto_scan");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [int] */
    /* JADX WARN: Type inference failed for: r17v6, types: [int] */
    /* JADX WARN: Type inference failed for: r17v7, types: [int] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tg3.b.b(java.lang.String):void");
    }

    public final boolean c(bm5.v vVar, boolean z17, java.lang.String str) {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.Long l17;
        java.lang.String n17 = bm5.c0.f104083a.n(vVar, str, z17, false);
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s18 = com.p314xaae8f345.mm.vfs.w6.s(n17, false);
        if (s18 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s18) {
                if (x1Var != null && x1Var.f294769f && (s17 = com.p314xaae8f345.mm.vfs.w6.s(new com.p314xaae8f345.mm.vfs.r6(n17, x1Var.f294765b).o(), false)) != null) {
                    for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : s17) {
                        boolean z18 = true;
                        if (z17) {
                            java.lang.String name = x1Var2.f294765b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                            java.lang.Long j17 = r26.h0.j(r26.n0.q0(name, "_", name));
                            if (j17 != null) {
                                l17 = (j17.longValue() > 0L ? 1 : (j17.longValue() == 0L ? 0 : -1)) > 0 ? j17 : null;
                                if (l17 != null) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(str, l17.longValue());
                                    if (k17 != null) {
                                        java.lang.String z07 = k17.z0();
                                        if (z07 != null && z07.length() != 0) {
                                            z18 = false;
                                        }
                                        if (!z18) {
                                            if (vVar == bm5.v.f104276f) {
                                                ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Di(k17);
                                            } else if (vVar == bm5.v.f104277g) {
                                                ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Ni(k17);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            java.lang.String name2 = x1Var2.f294765b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                            java.lang.Long j18 = r26.h0.j(r26.n0.q0(name2, "_", name2));
                            if (j18 != null) {
                                l17 = (j18.longValue() > 0L ? 1 : (j18.longValue() == 0L ? 0 : -1)) > 0 ? j18 : null;
                                if (l17 != null) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 l18 = pt0.f0.f439742b1.l(str, l17.longValue());
                                    if (l18 != null) {
                                        java.lang.String z08 = l18.z0();
                                        if (z08 != null && z08.length() != 0) {
                                            z18 = false;
                                        }
                                        if (!z18) {
                                            if (vVar == bm5.v.f104276f) {
                                                ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Di(l18);
                                            } else if (vVar == bm5.v.f104277g) {
                                                ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Ni(l18);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
