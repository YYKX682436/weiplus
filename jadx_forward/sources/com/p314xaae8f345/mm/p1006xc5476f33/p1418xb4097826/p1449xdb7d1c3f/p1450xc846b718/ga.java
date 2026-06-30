package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class ga {
    public ga(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar, java.lang.String str, int i17, int i18, zy2.na naVar, int i19, java.lang.Object obj) {
        return gaVar.d(str, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) == 0 ? i18 : 0, (i19 & 8) != 0 ? new zy2.na(null, 0, false, null, 0, null, null, 127, null) : naVar);
    }

    public final int[] a(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 b07 = nk6.b0("NotificationCenterLike", username);
        int i17 = b07 != null ? b07.f455421e : 0;
        r45.f03 b08 = nk6.b0("NotificationCenterComment", username);
        int i18 = b08 != null ? b08.f455421e : 0;
        r45.f03 b09 = nk6.b0("NotificationCenterFollow", username);
        int i19 = b09 != null ? b09.f455421e : 0;
        r45.f03 b010 = nk6.b0("AuthorProfileNotify", username);
        int i27 = b010 != null ? b010.f455421e : 0;
        r45.f03 b011 = nk6.b0("MemberNotificationCenterLike", username);
        int i28 = b011 != null ? b011.f455421e : 0;
        r45.f03 b012 = nk6.b0("MemberNotificationCenterComment", username);
        int i29 = b012 != null ? b012.f455421e : 0;
        r45.f03 b013 = nk6.b0("MemberNotificationCenterJoin", username);
        int i37 = b013 != null ? b013.f455421e : 0;
        r45.f03 b014 = nk6.b0("AuthorProfileMemberNotify", username);
        return new int[]{i17, i18, i19, i27, i28, i29, i37, b014 != null ? b014.f455421e : 0};
    }

    public final void b(java.lang.String contextId, int i17, zy2.na dslRenderInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dslRenderInfo, "dslRenderInfo");
        if (((c61.l7) i95.n0.c(c61.l7.class)).nk().v()) {
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("FinderLiveEntrance");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
            r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
            if (I0 == null || vs2Var == null) {
                return;
            }
            int i18 = (vs2Var.f470020e == 16 || I0.f455420d == 6) ? 2 : 3;
            java.lang.String str = "8001-" + c01.id.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).getClass();
            sb6.append(kp2.a.f392489a.a(0, 0));
            sb6.append('-');
            sb6.append(c01.id.c());
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.g(x2Var, "1", L0, I0, i18, contextId, i17, str, sb7, 0, dslRenderInfo, 256, null);
        }
    }

    public final void c(java.lang.String contextId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        if (c92.g.f121271a.b() ? ((c61.l7) i95.n0.c(c61.l7.class)).nk().C0() : ((c61.l7) i95.n0.c(c61.l7.class)).nk().v()) {
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("NearbyEntrance");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("NearbyEntrance");
            r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
            if (I0 == null || vs2Var == null) {
                return;
            }
            int i18 = (vs2Var.f470020e == 16 || I0.f455420d == 6) ? 2 : 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
            x2Var.e("1", L0, I0, i18, (r20 & 16) != 0 ? "" : contextId, (r20 & 32) != 0 ? 0 : i17, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
        }
    }

    public final java.lang.String d(java.lang.String contextId, int i17, int i18, zy2.na dslRenderInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dslRenderInfo, "dslRenderInfo");
        if (!((c61.l7) i95.n0.c(c61.l7.class)).nk().f0()) {
            return null;
        }
        java.lang.String f17 = f("FinderEntrance", contextId, i17, i18, dslRenderInfo);
        f("FinderMentionEntrance", contextId, i17, i18, new zy2.na(null, 0, false, null, 0, null, null, 127, null));
        return f17;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(java.lang.String r32, java.lang.String r33, int r34, int r35, zy2.na r36) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga.f(java.lang.String, java.lang.String, int, int, zy2.na):java.lang.String");
    }

    public final void g(int i17, r45.qt2 contextObj, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("TLFollow");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("TLFollow");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187093d, str2)) {
                return;
            }
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, "2", 7, i17, 1, 0, 0, str2, null, vs2Var.C, contextObj, i18, z17 ? 1 : 0, 128, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.h(x2Var, "2", L0, I0, i17, contextObj, z17 ? 1 : 0, i18, null, 0, 0, null, 0, null, 8064, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187093d = str2;
        }
    }

    public final void h(int i17, r45.qt2 contextObj, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("TLRecommendTab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("TLRecommendTab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187092c, str2)) {
                return;
            }
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, "2", 8, i17, 1, 0, 0, str2, null, vs2Var.C, contextObj, i18, z17 ? 1 : 0, 128, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.h(x2Var, "2", L0, I0, i17, contextObj, z17 ? 1 : 0, i18, null, 0, 0, null, 0, null, 8064, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187092c = str2;
        }
    }

    public final void i(int i17, r45.qt2 contextObj, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("finder_tl_city_tab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("finder_tl_city_tab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (i17 == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187095f, str2)) {
            return;
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, "2", 9, i17, 1, 0, 0, str2, null, vs2Var.C, contextObj, i18, z17 ? 1 : 0, 128, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.h(x2Var, "2", L0, I0, i17, contextObj, z17 ? 1 : 0, i18, null, 0, 0, null, 0, null, 8064, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187095f = str2;
        }
    }

    public final void j(int i17, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("finder_tl_nearby_tab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("finder_tl_nearby_tab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "2", 3, i17, 1, 1, 0, str, null, 0L, contextObj, 0, 0, 3456, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "2", L0, I0, i17, contextObj, 0, null, 2, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
    }

    public final void k(int i17, r45.qt2 contextObj, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("finder_tl_hot_tab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("finder_tl_hot_tab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        java.lang.String str2 = str == null ? "" : str;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187094e, str2)) {
                return;
            }
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String str3 = vs2Var.f470023h;
        java.lang.String str4 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "2", 3, i17, 1, 2, 0, str3 == null ? "" : str3, null, 0L, contextObj, i18, z17 ? 1 : 0, 384, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.h(x2Var, "2", L0, I0, i17, contextObj, z17 ? 1 : 0, i18, null, 0, 0, null, 0, null, 8064, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187094e = str4;
        }
    }

    public final java.lang.String l(int i17, r45.qt2 qt2Var, java.lang.String lastExposeTipsId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastExposeTipsId, "lastExposeTipsId");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("TLPersonalCenter");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("TLPersonalCenter");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        str = "";
        if (I0 == null || vs2Var == null) {
            return "";
        }
        if (i17 == 1) {
            java.lang.String str2 = vs2Var.f470023h;
            str = str2 != null ? str2 : "";
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lastExposeTipsId, str)) {
                return str;
            }
        }
        java.lang.String str3 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "2", L0, I0, i17, qt2Var, 0, null, 0, 0, 480, null);
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        int i18 = I1 != null ? I1.f68721x6e5f342 : 0;
        int i19 = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1 ? 0 : 2;
        if (i18 > 0) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, "2", 4, i17, 1, i19, i18, null, null, 0L, qt2Var, 0, 0, 3520, null);
        } else {
            r45.f03 I02 = nk6.I0("Personal_Center_FavList_Entrance");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02 = nk6.L0("Personal_Center_FavList_Entrance");
            r45.vs2 vs2Var2 = L02 != null ? L02.f65874xb5f7102a : null;
            if (I02 != null && vs2Var2 != null) {
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, "2", 6, i17, 1, 0, 0, null, null, 0L, qt2Var, 0, 0, 3520, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L02);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "2", L02, I02, i17, qt2Var, 0, null, 0, 0, 480, null);
            }
            r45.f03 I03 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L03 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
            if (I03 != null && L03 != null) {
                i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c19, "2", 2, i17, 1, 1, 0, null, null, 0L, qt2Var, 0, 0, 3520, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "2", L03, I03, i17, qt2Var, 0, null, 0, 0, 480, null);
            }
        }
        return str3;
    }

    public final void m(int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            int i18 = nyVar.f216905d;
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.h(2, V6, i18, false);
                return;
            }
            if (i17 == 35) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.i(2, V6, i18, false);
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.g(2, V6, i18, false);
            } else {
                if (i17 != 4) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a.k(2, V6, i18, false);
            }
        }
    }

    public final void n(int i17, r45.qt2 qt2Var, int i18, java.lang.String clickSubTabContext) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContext, "clickSubTabContext");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("NearbyLiveTab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("NearbyLiveTab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        java.lang.String str2 = str == null ? "" : str;
        if (i17 == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187102m, str2)) {
            return;
        }
        java.lang.String str3 = (qt2Var == null || (m75945x2fec83072 = qt2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec83072;
        java.lang.String str4 = (qt2Var == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.g(x2Var, "9", L0, I0, i17, str3, i18, str4, clickSubTabContext, 0, null, 768, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187102m = str2;
        }
    }

    public final void o(int i17, r45.qt2 qt2Var) {
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("NearbyPeopleTab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("NearbyPeopleTab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (i17 == 3 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187103n, str2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "9", L0, I0, i17, qt2Var, 0, null, 0, 0, 480, null);
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187103n = str2;
        }
    }

    public final void p(int i17, r45.qt2 qt2Var) {
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.f03 I0 = nk6.I0("NearbyFeedTab");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("NearbyFeedTab");
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (I0 == null || vs2Var == null) {
            return;
        }
        java.lang.String str = vs2Var.f470023h;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (i17 == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187101l, str2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "9", L0, I0, i17, qt2Var, 0, null, 0, 0, 480, null);
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187101l = str2;
        }
    }
}
