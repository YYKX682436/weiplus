package c01;

/* loaded from: classes11.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f119052a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final r45.xb4 f119053b = new r45.xb4();

    /* renamed from: c, reason: collision with root package name */
    public static final kk.j f119054c = new kk.l(100);

    public static boolean A(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomMembersLogic", "isNeedUpdateChatroomInfo member is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "isNeedUpdateChatroomInfo old:%s new:%s", java.lang.Integer.valueOf(z07.f69101xc0ad1363), java.lang.Integer.valueOf(z07.f69085xe414bfe0));
        return z07.f69101xc0ad1363 < z07.f69085xe414bfe0;
    }

    public static boolean B(java.lang.String str) {
        return str.toLowerCase().endsWith("@chatroom") || str.toLowerCase().endsWith("@im.chatroom");
    }

    public static boolean C(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            return z07.L0(str2) || z07.G0(str2);
        }
        return false;
    }

    public static boolean D(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && !x(str, true);
    }

    public static boolean E() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("room_upgrade_to_wework").getBoolean("enter_show", false);
    }

    public static void F(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        if (z07 == null || z07.f69083xf6ef0cb0 == 0) {
            return;
        }
        z07.f69083xf6ef0cb0 = 0;
        a17.mo11260x413cb2b4(z07);
    }

    public static void G(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        if (z07 == null || z07.f69083xf6ef0cb0 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f69112x428234bd) || !z07.f69112x428234bd.contains(str2)) {
            return;
        }
        z07.f69083xf6ef0cb0 = 0;
        a17.mo11260x413cb2b4(z07);
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 H(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.lk4 lk4Var) {
        z3Var.X1(x51.j1.g(lk4Var.f461076d));
        z3Var.M1(x51.j1.g(lk4Var.f461076d));
        z3Var.R1(x51.j1.g(lk4Var.f461076d));
        z3Var.S1(x51.j1.g(lk4Var.f461080h));
        z3Var.g3(lk4Var.f461081i);
        z3Var.n1(x51.j1.g(lk4Var.f461082m));
        z3Var.p1(x51.j1.g(lk4Var.f461083n));
        z3Var.o1(x51.j1.g(lk4Var.f461080h));
        z3Var.M2(lk4Var.f461085p);
        z3Var.Z2(lk4Var.f461089t);
        z3Var.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(lk4Var.f461092w, lk4Var.f461086q, lk4Var.f461087r));
        z3Var.h3(lk4Var.f461088s);
        return z3Var;
    }

    public static boolean I(java.lang.String str) {
        mo.b v07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).v0(c01.z1.r());
        if (v07 != null) {
            return (v07.f411782f & 4194304) == 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomMembersLogic", "ChatroomMuteRefine dataLocal is null");
        return true;
    }

    public static boolean J(java.lang.String str) {
        mo.b v07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).v0(c01.z1.r());
        if (v07 != null) {
            return (v07.f411782f & 2097152) == 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomMembersLogic", "ChatroomMuteRefine dataLocal is null");
        return true;
    }

    public static boolean K(java.lang.String str) {
        mo.b v07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).v0(c01.z1.r());
        if (v07 != null) {
            return (v07.f411782f & 1048576) == 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomMembersLogic", "ChatroomMuteRefine dataLocal is null");
        return true;
    }

    public static void L(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, boolean z18) {
        if (z18) {
            r45.qn4 qn4Var = new r45.qn4();
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = str;
            du5Var.f454290e = true;
            qn4Var.f465640d = du5Var;
            qn4Var.f465641e = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "refreshConvBoxOpLog() send ModChatRoomMsgBox ChatRoomName:%s Switch:%s", du5Var, java.lang.Integer.valueOf(i17));
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(74, qn4Var));
        }
        if (z3Var != null && !android.text.TextUtils.isEmpty(z3Var.d1())) {
            c01.e2.g0(z3Var, z17);
        }
        if (z3Var == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            return;
        }
        c01.h8 h8Var = (c01.h8) i95.n0.c(c01.h8.class);
        java.lang.String d17 = z3Var.d1();
        boolean z19 = i17 == 1;
        ((np.h) h8Var).getClass();
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.p(d17, z19 ? 1 : 2));
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z3Var.d1();
        objArr[1] = java.lang.Boolean.valueOf(i17 == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "refreshConvBoxOpLog() send OpenIMModContactMsgFoldOplog name:%s isSet:%s", objArr);
    }

    public static boolean M(com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        if (a3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "updateChatroomMember error! member is null");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(a3Var.f69088x37548063);
        if (z07 != null && !java.util.Objects.equals(z07.f69107x5be1edb3, a3Var.f69107x5be1edb3)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5240xb606a5ea c5240xb606a5ea = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5240xb606a5ea();
            am.e2 e2Var = c5240xb606a5ea.f135573g;
            e2Var.getClass();
            e2Var.getClass();
            e2Var.getClass();
            c5240xb606a5ea.e();
        }
        if (z07 != null && z07.D0() > a3Var.D0() && z07.A0().size() != a3Var.A0().size()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(a3Var.D0());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a3Var.A0().size());
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(z07.D0());
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(z07.A0().size());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "current member version[%d,%d] must be > oldMember version[%d,%d], stack: %s", valueOf, valueOf2, valueOf3, valueOf4, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            return false;
        }
        boolean mo11260x413cb2b4 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(a3Var);
        if (mo11260x413cb2b4) {
            java.lang.String str = a3Var.f69088x37548063;
            java.lang.String str2 = a3Var.f69107x5be1edb3;
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
            if (((int) n17.E2) != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.r())) {
                if (str2.equals(c01.z1.r())) {
                    n17.H2(1, 1);
                } else {
                    n17.H2(1, 0);
                }
                Bi.p0(str, n17);
            }
        }
        return mo11260x413cb2b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0210 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean N(java.lang.String r19, java.lang.String r20, r45.vy r21, int r22, int r23, int r24, java.lang.String r25, mo.a r26, boolean r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.v1.N(java.lang.String, java.lang.String, r45.vy, int, int, int, java.lang.String, mo.a, boolean, boolean, int):boolean");
    }

    public static boolean O(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || (z07 = (a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a()).z0(str)) == null) {
            return false;
        }
        z07.f69106x1376a46c = 1;
        return a17.mo11260x413cb2b4(z07);
    }

    public static boolean a(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return false;
        }
        for (java.lang.String str2 : z07.A0()) {
            map.put(str2, z07.z0(str2));
        }
        return true;
    }

    public static void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + z17);
        if (z17 && f119053b.f471477d.isEmpty()) {
            return;
        }
        if (z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
            ((ku5.t0) ku5.t0.f394148d).h(new c01.u1(), "MicroMsg.ChatroomMembersLogic");
        }
    }

    public static void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "checkUpdateChatRoomInfoDetail username is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            if (z07.f69101xc0ad1363 < z07.f69085xe414bfe0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "checkUpdateChatRoomInfoDetail() %s update, stack:%s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5592xbb1d2e52 c5592xbb1d2e52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5592xbb1d2e52();
                c5592xbb1d2e52.f135916g.f88680a = str;
                c5592xbb1d2e52.e();
            }
        }
    }

    public static java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return null;
        }
        return z07.f69090xb4fe86b0;
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return null;
        }
        return z07.f69091xdb3bd03d;
    }

    public static long f(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return -1L;
        }
        long j17 = z07.f69092x65ba57ac;
        return j17 == 0 ? currentTimeMillis : j17;
    }

    public static java.lang.String g(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 == null) {
            return null;
        }
        return z07.f69112x428234bd;
    }

    public static void h(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
            java.util.Map map = f119052a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O(((java.util.HashMap) map).get(str), -1) != i17) {
                ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i17));
                ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).g(str, i17).b();
                return;
            }
            return;
        }
        r45.wb4 wb4Var = new r45.wb4();
        wb4Var.f470568d = str;
        wb4Var.f470569e = i17;
        r45.xb4 xb4Var = f119053b;
        xb4Var.f471477d.addFirst(wb4Var);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("getChatroomMemberDetail_" + gm0.m.i()).H("detail", xb4Var.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetail " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetail " + wb4Var.f470568d + " " + wb4Var.f470569e);
    }

    public static java.lang.String i(java.util.List list, int i17, java.lang.String str) {
        java.lang.String str2 = "";
        if (list != null && list.size() != 0) {
            if (i17 > 4 || i17 < 0) {
                i17 = 4;
            }
            int i18 = i17 - 1;
            int i19 = 0;
            while (true) {
                if (i19 >= list.size()) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) list.get(i19);
                if (str3.length() >= 1) {
                    str2 = str2 + ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, false).g2();
                    if (i19 == i18 && i19 < list.size()) {
                        str2 = str2 + "...";
                        break;
                    }
                    if (i19 < list.size() - 1) {
                        str2 = str2 + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
                    }
                }
                i19++;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && u(str)) {
                return k();
            }
        }
        return str2;
    }

    public static java.lang.String j(java.util.List list, java.lang.String str) {
        java.lang.String i17 = i(list, -1, "");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) && u(str)) ? k() : i17;
    }

    public static java.lang.String k() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571398dw);
    }

    public static java.lang.String l(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        final c01.l1 l1Var = c01.l1.f118831g;
        java.lang.Object obj = null;
        if (l1Var.f118834f) {
            java.lang.String str4 = str2 + "::" + str;
            str3 = (java.lang.String) l1Var.f118833e.a(str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomDisplayNameCache", "query value key=%s, value=%s", str4, str3);
            if (str3 != null && java.lang.Math.random() < 0.2d) {
                ((ku5.t0) ku5.t0.f394148d).q(new c01.m1(l1Var, str2, str, str3));
            }
        } else {
            str3 = null;
        }
        if (str3 != null) {
            return str3;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "[getDisplayNameInRoom] null == mStg");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str2);
        if (z07 == null) {
            return null;
        }
        java.lang.String z08 = z07.z0(str);
        if (l1Var.f118834f) {
            java.lang.String str5 = str2 + "::" + str;
            kk.t tVar = l1Var.f118833e;
            synchronized (tVar) {
                kk.s sVar = (kk.s) tVar.f390009c.get(str5);
                if (sVar != null) {
                    obj = sVar.f390004e;
                }
            }
            java.lang.String str6 = (java.lang.String) obj;
            if (str6 == null || !str6.equals(z08)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomDisplayNameCache", "update cache set %s=%s", str5, z08);
                l1Var.f118833e.b(str5, z08);
                ((ku5.t0) ku5.t0.f394148d).A("ChatroomDisplayNameCache_SYNC");
                ku5.u0 u0Var = ku5.t0.f394148d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: c01.l1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c01.l1.this.a();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.t(runnable, 2000L, "ChatroomDisplayNameCache_SYNC");
            }
        }
        return z08;
    }

    public static java.util.List m(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "chatroomName is null");
            return null;
        }
        if (B(str)) {
            return ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: this is not room:[" + str + "]");
        return null;
    }

    public static java.util.List n(java.lang.String str) {
        if (str.toLowerCase().endsWith("@chatroom")) {
            return ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: room:[" + str + "]");
        return null;
    }

    public static int o(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            if (a17 != null) {
                return a17.J0(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return 0;
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static java.lang.String p(java.lang.String str) {
        java.lang.String str2 = "";
        if (str != null && B(str)) {
            java.util.List m17 = m(str);
            int i17 = 0;
            while (m17 != null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) m17;
                if (i17 >= linkedList.size()) {
                    break;
                }
                java.lang.String str3 = (java.lang.String) linkedList.get(i17);
                if (str3.length() >= 1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                    if (n17 == null) {
                        str2 = str2 + str3;
                    } else {
                        str2 = str2 + n17.f2();
                    }
                    if (i17 < linkedList.size() - 1) {
                        str2 = str2 + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b08);
                    }
                }
                i17++;
            }
        }
        return str2;
    }

    public static int q() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AssociateChatRoomLocalCheckMaxMemberCount", 200);
    }

    public static void r(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (w() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("room_upgrade_to_wework").getBoolean(str, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member isHandle", str);
            } else {
                s(str, str2, i17, i18, null);
            }
        }
    }

    public static void s(java.lang.String str, java.lang.String str2, int i17, int i18, rn3.l lVar) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            long j17 = i18;
            if ((j17 & 131072) == 131072 || (j17 & 65536) != 65536) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("room_upgrade_to_wework").putBoolean(str, true);
            boolean a17 = t41.i.a();
            int q17 = q();
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = str;
            objArr[1] = str2 == null ? "null" : str2;
            objArr[2] = java.lang.Integer.valueOf(i18);
            objArr[3] = java.lang.Boolean.valueOf(a17);
            objArr[4] = java.lang.Integer.valueOf(q17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom chatRoomName:%s chatroomOwner:%s chatroomStatus:%s isInstallWeWork:%s maxNum:%s", objArr);
            if (!a17 || i17 >= q17 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, c01.z1.r())) {
                int i19 = !a17 ? 1 : 0;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, c01.z1.r())) {
                    i19 |= 2;
                }
                if (i17 >= q17) {
                    i19 |= 4;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6643x237afbfc c6643x237afbfc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6643x237afbfc();
                c6643x237afbfc.f139933d = c6643x237afbfc.b("Roomid", str, true);
                c6643x237afbfc.f139934e = i19;
                c6643x237afbfc.k();
                return;
            }
            rn3.i.Di().j("30001001_1", lVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("room_upgrade_to_wework").putBoolean("enter_show", true);
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0d);
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0f);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append(" <_wc_custom_link_ href=\"weixin://weixingroupupdate?roomname=");
            stringBuffer.append(str);
            stringBuffer.append("\">");
            stringBuffer.append(string2);
            stringBuffer.append("</_wc_custom_link_>");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.j1(0);
            f9Var.u1(str);
            f9Var.r1(3);
            f9Var.d1(stringBuffer.toString());
            f9Var.e1(c01.w9.m(str, java.lang.System.currentTimeMillis() / 1000));
            f9Var.m124850x7650bebc(10000);
            f9Var.f1(f9Var.w0() | 8);
            c01.w9.x(f9Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6643x237afbfc c6643x237afbfc2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6643x237afbfc();
            c6643x237afbfc2.f139933d = c6643x237afbfc2.b("Roomid", str, true);
            c6643x237afbfc2.f139934e = 0;
            c6643x237afbfc2.k();
        }
    }

    public static boolean t(java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = a17.W0(str);
        java.util.List m17 = (str.endsWith("@chatroom") || str.endsWith("@im.chatroom")) ? m(str) : new java.util.LinkedList();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        if (m17 == null) {
            while (i17 < arrayList.size()) {
                linkedList.add((java.lang.String) arrayList.get(i17));
                i17++;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                W0.f69107x5be1edb3 = str2;
            }
            W0.U0(linkedList);
            W0.f69094xd1f9ba88 = j(linkedList, str);
            W0.f69098xbcb1bed0 = linkedList.size();
            W0.f69107x5be1edb3 = str2;
            return a17.mo11260x413cb2b4(W0);
        }
        for (int i18 = 0; i18 < m17.size(); i18++) {
            linkedList.add((java.lang.String) m17.get(i18));
        }
        while (i17 < arrayList.size()) {
            if (!m17.contains(arrayList.get(i17))) {
                linkedList.add((java.lang.String) arrayList.get(i17));
            }
            i17++;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            W0.f69107x5be1edb3 = str2;
        }
        W0.U0(linkedList);
        W0.f69094xd1f9ba88 = j(linkedList, str);
        W0.f69098xbcb1bed0 = linkedList.size();
        return a17.mo11260x413cb2b4(W0);
    }

    public static synchronized boolean u(java.lang.String str) {
        synchronized (c01.v1.class) {
            boolean z17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(str);
            boolean z18 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && !x(str, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "isChatroomDismiss = " + z17 + ", inChatRoom = " + z18);
            return z17 || z18;
        }
    }

    public static boolean v() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "ChatroomMuteRefine enable:%s", java.lang.Boolean.valueOf(o17));
        return o17;
    }

    public static boolean w() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMForwardUpgradeChatRoomSwitch", 0) == 1;
    }

    public static boolean x(java.lang.String str, boolean z17) {
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
        java.util.List m17 = m(str);
        if (m17 == null) {
            if (!z17) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomMembersLogic", "isInChatRoom temp change");
            return true;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) m17;
        if (linkedList.size() != 0 && linkedList.contains(str2)) {
            return true;
        }
        linkedList.size();
        return false;
    }

    public static boolean y(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "username is null ");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return n17 != null && n17.v2();
    }

    public static boolean z(java.lang.String str) {
        java.util.List L0;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        a17.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from chatroom where chatroomname='");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("'");
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = null;
        android.database.Cursor f17 = a17.f275303d.f(sb6.toString(), null, 2);
        if (f17.moveToFirst()) {
            a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            a3Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return !(a3Var != null && (a3Var.f69106x1376a46c & 1) == 0) || (L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str)) == null || ((java.util.LinkedList) L0).size() == 0;
    }
}
