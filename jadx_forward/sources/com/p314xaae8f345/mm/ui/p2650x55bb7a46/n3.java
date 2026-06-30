package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class n3 {
    public static boolean A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        if (f9Var == null || (v17 = ot0.q.v(f9Var.j())) == null || v17.f430199i != 19) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
        am.eq eqVar = c5888x4e3b0044.f136196g;
        eqVar.f88116a = 0;
        eqVar.f88117b = v17.f430196h0;
        c5888x4e3b0044.e();
        r45.ul5 ul5Var = c5888x4e3b0044.f136197h.f88225a;
        if (ul5Var != null) {
            java.util.Iterator it = ul5Var.f468998f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "record type subDataItem contain tpurl, type:%d", java.lang.Integer.valueOf(gp0Var.I));
                    return true;
                }
            }
        }
        java.lang.String str = v17.f430196h0;
        return str != null && str.contains("<recordxml>");
    }

    public static boolean B(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var.mo78013xfb85f7b0() == 419430449;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(r5.f68663x861009b5) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r5) {
        /*
            r0 = 1
            if (r5 != 0) goto Lb
            java.lang.String r5 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r1 = "check is store emoji error, msg is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r1)
            return r0
        Lb:
            boolean r1 = r5.m2()
            java.lang.Class<k12.s> r2 = k12.s.class
            if (r1 == 0) goto L44
            com.tencent.mm.storage.y4 r1 = new com.tencent.mm.storage.y4
            java.lang.String r3 = r5.j()
            r1.<init>(r3)
            java.lang.String r5 = r5.U1()
            ot0.q r5 = ot0.q.v(r5)
            if (r5 != 0) goto L2f
            ot0.q r5 = new ot0.q
            r5.<init>()
            java.lang.String r1 = r1.f277889d
            r5.f430231q = r1
        L2f:
            i95.m r1 = i95.n0.c(r2)
            k12.s r1 = (k12.s) r1
            g30.h r1 = (g30.h) r1
            s25.a r1 = r1.wi()
            java.lang.String r5 = r5.f430231q
            y12.h r1 = (y12.h) r1
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r1.N(r5)
            goto L56
        L44:
            i95.m r1 = i95.n0.c(r2)
            k12.s r1 = (k12.s) r1
            g30.h r1 = (g30.h) r1
            s25.a r1 = r1.wi()
            y12.h r1 = (y12.h) r1
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r1.M(r5)
        L56:
            r1 = 0
            if (r5 == 0) goto L80
            int r3 = r5.f68653x95b20dd4
            l75.e0 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2
            r4 = 81
            if (r3 == r4) goto L7f
            java.lang.String r3 = r5.f68663x861009b5
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L80
            i95.m r2 = i95.n0.c(r2)
            k12.s r2 = (k12.s) r2
            g30.h r2 = (g30.h) r2
            s25.a r2 = r2.wi()
            java.lang.String r3 = r5.f68663x861009b5
            y12.h r2 = (y12.h) r2
            boolean r2 = r2.S(r3)
            if (r2 == 0) goto L80
        L7f:
            return r1
        L80:
            if (r5 == 0) goto L89
            boolean r5 = r5.A0()
            if (r5 == 0) goto L89
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.C(com.tencent.mm.storage.f9):boolean");
    }

    public static boolean D(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "isTeenModeAuthForbidForwardMsg, check msg error, msg is null");
            return true;
        }
        ot0.q v17 = ot0.q.v(f9Var.A0() == 0 ? c01.w9.u(f9Var.j()) : f9Var.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "isTeenModeAuthForbidForwardMsg, parse app message content fail");
            return false;
        }
        int i17 = v17.f430199i;
        return i17 == 83 || i17 == 102 || i17 == 103 || i17 == 84;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01f6 A[Catch: Exception -> 0x025b, TryCatch #1 {Exception -> 0x025b, blocks: (B:20:0x005d, B:29:0x01f0, B:31:0x01f6, B:34:0x01fd, B:36:0x0202, B:38:0x0208, B:40:0x0211, B:42:0x022f, B:46:0x018a), top: B:19:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0202 A[Catch: Exception -> 0x025b, TryCatch #1 {Exception -> 0x025b, blocks: (B:20:0x005d, B:29:0x01f0, B:31:0x01f6, B:34:0x01fd, B:36:0x0202, B:38:0x0208, B:40:0x0211, B:42:0x022f, B:46:0x018a), top: B:19:0x005d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(android.content.Context r16, java.lang.String r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.E(android.content.Context, java.lang.String, com.tencent.mm.storage.f9, boolean, boolean):void");
    }

    public static void F(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.d1(str2);
            f9Var.j1(i17);
            E(context, str, f9Var, z17, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingEditModeLogic", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "retransmit sigle app msg error : %s", e17.getLocalizedMessage());
        }
    }

    public static void G(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str2) {
        r15.d dVar;
        if (!H(context, str, f9Var, "video") || f9Var == null) {
            return;
        }
        if (f9Var.Y2() && t21.d3.b(f9Var.z0())) {
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "retransmit video failed,msg[%s] is not exist", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return;
        }
        d(str2, h17);
        if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f517738g)) {
            c01.h7 h7Var = new c01.h7();
            h7Var.f118760b = f9Var.m124847x74d37ac6();
            h7Var.f118762d = f9Var.Q0();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                dVar = null;
            } else {
                dVar = new r15.d();
                dVar.j(1);
                dVar.l(1);
                dVar.k(str2);
            }
            ((vf0.k2) ((c35.o) i95.n0.c(c35.o.class))).wi(f9Var, str, h7Var, new vf0.r2(null, null, null, null, null, null, false, null, null, dVar, false, false));
            return;
        }
        if (h17.f496544i == 199) {
            b(h17, f9Var.z0(), str, h17.f496555t, h17.f496548m, h17.g(), f9Var.mo78013xfb85f7b0(), tg3.l1.a(f9Var));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S)) {
            if (a(h17, str, f9Var, str2)) {
                return;
            }
            c(str, f9Var, str2);
            return;
        }
        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str3 = h17.S;
        ((vf0.y1) x1Var2).getClass();
        t21.v2 h18 = t21.d3.h(str3);
        if (h18 == null || !h18.i()) {
            if (a(h17, str, f9Var, str2)) {
                return;
            }
            c(str, f9Var, str2);
            return;
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104103r, f9Var.z0(), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj6) || !com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
            if (a(h17, str, f9Var, str2)) {
                return;
            }
            c(str, f9Var, str2);
        } else {
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(rj6, f9Var.m124847x74d37ac6(), 3);
            b(h17, f9Var.z0(), str, h17.f496555t, h17.f496548m, h17.g(), f9Var.mo78013xfb85f7b0(), tg3.l1.a(f9Var));
        }
    }

    public static boolean H(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str2) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "send %s fail, context is null", str2);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "send %s fail, username is null", str2);
            return false;
        }
        if (f9Var != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "send %s fail, msg is null", str2);
        return false;
    }

    public static boolean a(t21.v2 v2Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str2) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(v2Var.g(), "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "%s cdntra parse video recv xml failed");
            return false;
        }
        java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
        java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$md5");
        java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$newmd5");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$playlength"), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.videomsg.$cdnthumblength"), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1328L, 12L, 1L, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f104104s, v2Var.d(), false))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeLogic", "checkVideoCdnInfo md5 %s", str5);
                g0Var.mo68477x336bdfd8(1328L, 2L, 1L, true);
                return false;
            }
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_ChattingEditModeLogic_2";
        mVar.f323320f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.k3(str3, str4, P3, P, str, str5, str6, f9Var, v2Var, str2, P2);
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("checkExist", java.lang.System.currentTimeMillis(), str, "" + f9Var.m124847x74d37ac6());
        mVar.f69591xf9dbbe9c = str3;
        mVar.f69575xf11df5f5 = str4;
        mVar.f69593x419c9c3d = str5;
        mVar.f69592xf1ebe47b = 4;
        mVar.f69618x114ef53e = str;
        mVar.f69609xd84b8349 = 2;
        mVar.f69617x5f1e8863 = "";
        mVar.f69607x9bef5d80 = true;
        mVar.f69621xf91593ca = true;
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "check exist fail! download video before retransmit");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(t21.v2 r30, java.lang.String r31, java.lang.String r32, int r33, int r34, java.lang.String r35, int r36, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 r37) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.b(t21.v2, java.lang.String, java.lang.String, int, int, java.lang.String, int, com.tencent.mm.plugin.msg.MsgIdTalker):void");
    }

    public static void c(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str2) {
        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.l3(f9Var, str, str2));
    }

    public static void d(java.lang.String str, t21.v2 v2Var) {
        r15.d j17;
        if (v2Var == null) {
            return;
        }
        y15.d dVar = new y15.d();
        dVar.m126728xdc93280d(v2Var.g());
        r15.b j18 = dVar.j();
        if (j18 == null || (j17 = j18.j()) == null) {
            return;
        }
        j17.k(str);
        j18.o(j17);
        dVar.o(j18);
        v2Var.f496558w = dVar.m126747x696739c();
    }

    public static java.lang.String e(java.lang.String str, int i17, boolean z17) {
        return (z17 && str != null && i17 == 0) ? c01.w9.u(str) : str;
    }

    public static int f(java.util.List list) {
        int i17 = 0;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "get invalid send to friend msg num error, select item empty");
            return 0;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.g3() || C(f9Var) || f9Var.L2() || y(f9Var) || B(f9Var) || m(f9Var)) {
                i17++;
            }
        }
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0177, code lost:
    
        if ((r8.mo78013xfb85f7b0() == r5) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if ((r1.mo78013xfb85f7b0() == 67) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(boolean r17, java.util.List r18, java.lang.String r19, ot0.f3 r20) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.g(boolean, java.util.List, java.lang.String, ot0.f3):boolean");
    }

    public static void h(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, java.lang.String str, ot0.q qVar) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        java.lang.String N0 = c21053xdbf1e5f4.N0();
        if (com.p314xaae8f345.mm.vfs.w6.k(N0 + "_thumb") > 0) {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.vfs.w6.N(N0 + "_thumb", 0, (int) com.p314xaae8f345.mm.vfs.w6.k(N0 + "_thumb"));
        } else {
            try {
                java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(N0);
                c11286x34a5504.m48468xb4dcc327(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(E, 1.0f));
                E.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingEditModeLogic", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "sendAppMsgEmoji Fail cause there is no thumb");
            }
        }
        c11286x34a5504.f33122xe4128443 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984(N0);
        if (qVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.H(qVar, c11286x34a5504, str, c21053xdbf1e5f4.mo42933xb5885648(), null, 0, null, null, null, null, null, null);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, c21053xdbf1e5f4.f68643xf1b7e6de, null, str, 1, c21053xdbf1e5f4.mo42933xb5885648());
        }
    }

    public static boolean i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        ot0.q v17;
        return z17 && f9Var != null && (v17 = ot0.q.v(f9Var.j())) != null && v17.f430199i == 33 && v17.f430214l2 == 1;
    }

    public static boolean j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(f9Var.A0() == 0 ? c01.w9.u(f9Var.j()) : f9Var.j());
        if (v17 != null) {
            return v17.E2 == 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
        return false;
    }

    public static boolean k(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, check msg error, msg is null");
            return true;
        }
        ot0.q v17 = ot0.q.v(f9Var.A0() == 0 ? c01.w9.u(f9Var.j()) : f9Var.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
            return false;
        }
        if (v17.f430238r2 != 0) {
            return true;
        }
        int i17 = v17.f430199i;
        if (i17 == 33 && v17.f430214l2 == 3) {
            return true;
        }
        if (i17 == 36 && v17.f430214l2 == 3) {
            return true;
        }
        if (i17 == 46 && v17.f430214l2 == 3) {
            return true;
        }
        if (i17 != 44 || (v17.f430214l2 != 3 && v17.s(false))) {
            return v17.f430199i == 48 && v17.f430214l2 == 3;
        }
        return true;
    }

    public static boolean l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !f9Var.t2()) {
            return false;
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.lang.String j17 = f9Var.j();
        kk.j jVar = ot0.g0.f430010a;
        return j17 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(m124847x74d37ac6, j17).f430115m == 1;
    }

    public static boolean m(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var.mo78013xfb85f7b0() == 436207665 || f9Var.mo78013xfb85f7b0() == 469762097;
    }

    public static boolean n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        if (f9Var == null || !f9Var.k2()) {
            return false;
        }
        e40.v vVar = (e40.v) i95.n0.c(e40.v.class);
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || !ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
            return false;
        }
        if (((d40.n) vVar).wi()) {
            e40.v vVar2 = (e40.v) i95.n0.c(e40.v.class);
            java.lang.String str2 = v17.f430223o;
            java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) ((d40.n) vVar2).f307898d).mo141623x754a37bb();
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                str = str2.toLowerCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (kz5.n0.O(hashSet, str)) {
                return v17.f430215m >= 10737418240L;
            }
        }
        return v17.f430215m >= 1073741824;
    }

    public static boolean o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.K2() || !f9Var.E2()) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277891a) || !c01.e2.G(D3.f277891a);
    }

    public static boolean p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.K2()) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
        java.lang.String str = D3.f277891a;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
        }
        int i17 = D3.f277907q;
        java.util.Set set = c01.e2.f118650a;
        return !com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17) && f9Var.mo78013xfb85f7b0() == 42 && !s(D3.f277891a) && (f9Var.F & 512) > 0;
    }

    public static boolean q(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
        java.lang.String str = D3.f277891a;
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
        }
        int i17 = D3.f277907q;
        java.util.Set set = c01.e2.f118650a;
        return !com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i17) && f9Var.mo78013xfb85f7b0() == 42 && !s(D3.f277891a) && (f9Var.F & 2048) > 0;
    }

    public static boolean r(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || v17.f430199i != 16) {
            return v17 != null && v17.f430199i == 34;
        }
        return true;
    }

    public static boolean s(java.lang.String str) {
        return (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20203x3a0493c4()) == 1) && !android.text.TextUtils.isEmpty(str) && c01.e2.J(str);
    }

    public static boolean t(java.util.List list) {
        t21.j3 d17;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.m78014x7b98c171() && (d17 = t21.j3.f496333h.d(f9Var.J0())) != null && d17.f496337b) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u(java.util.List list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var.m78014x7b98c171() && t21.d3.v(f9Var.z0())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean v(java.util.List list) {
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).Y2()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r1 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r3 != 130) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013f, code lost:
    
        if ((!r1.a() ? false : r1.f294799a.F(r1.f294800b)) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        if (r1 != 199) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.w(java.util.List):boolean");
    }

    public static boolean x(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        return f9Var != null && f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i));
    }

    public static boolean y(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeLogic", "check is game msg error, msg is null");
            return true;
        }
        if (f9Var.k2()) {
            return false;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeLogic", "parse app message content fail");
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        return j17 != null && j17.k();
    }

    public static boolean z(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        java.lang.String str2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j()).f277891a;
        if (str2 != null && str2.length() > 0) {
            return com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(str) || f9Var.mo78013xfb85f7b0() == 66;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeLogic", "getView : parse possible friend msg failed");
        return false;
    }
}
