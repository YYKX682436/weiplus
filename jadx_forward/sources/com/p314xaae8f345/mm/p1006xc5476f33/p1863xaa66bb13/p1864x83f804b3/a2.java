package com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3;

/* loaded from: classes12.dex */
public class a2 implements vg3.w4 {
    static {
        new java.util.LinkedList();
    }

    public static com.p314xaae8f345.mm.p944x882e457a.q0 b(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, r45.cx4 cx4Var, vg3.z4 z4Var) {
        vg3.f5 f5Var;
        int i17;
        com.p314xaae8f345.mm.p944x882e457a.q0 q0Var;
        boolean z17;
        r45.j4 j4Var = p0Var.f152259a;
        if (10008 == x51.o1.f533597q && x51.o1.f533598r != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", java.lang.Long.valueOf(j4Var.f459101r), java.lang.Integer.valueOf(x51.o1.f533598r));
            j4Var.f459101r = java.lang.Long.valueOf(x51.o1.f533598r).longValue();
            x51.o1.f533598r = 0;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().X9(j4Var.f459101r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        java.lang.String g18 = x51.j1.g(j4Var.f459092f);
        if (g17.equals(c01.z1.r()) && g18.equals("newsapp") && j4Var.f459093g != 51) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", java.lang.Long.valueOf(j4Var.f459101r), java.lang.Integer.valueOf(j4Var.f459093g));
            return null;
        }
        long c17 = c01.id.c();
        long j17 = ((int) (c17 / 1000)) - j4Var.f459098o;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = g17;
        objArr[1] = g18;
        objArr[2] = java.lang.Long.valueOf(j4Var.f459101r);
        objArr[3] = java.lang.Integer.valueOf(j4Var.f459090d);
        objArr[4] = java.lang.Integer.valueOf(j4Var.f459102s);
        objArr[5] = java.lang.Integer.valueOf(j4Var.f459095i);
        objArr[6] = java.lang.Integer.valueOf(j4Var.f459093g);
        objArr[7] = java.lang.Integer.valueOf(j4Var.f459098o);
        objArr[8] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(j4Var.f459098o);
        objArr[9] = java.lang.Long.valueOf(j17);
        objArr[10] = java.lang.Integer.valueOf(j4Var.f459096m);
        objArr[11] = java.lang.Integer.valueOf(x51.j1.e(j4Var.f459097n, new byte[0]).length);
        java.lang.String str = j4Var.f459099p;
        if (str == null) {
            str = "";
        }
        objArr[12] = java.lang.Integer.valueOf(str.length());
        java.lang.String str2 = j4Var.f459100q;
        if (str2 == null) {
            str2 = "";
        }
        objArr[13] = java.lang.Integer.valueOf(str2.length());
        r45.du5 du5Var = j4Var.f459094h;
        objArr[14] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(du5Var != null ? du5Var.f454289d : "");
        objArr[15] = java.lang.Long.valueOf(j4Var.f459103t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s flag:%s", objArr);
        android.util.SparseArray sparseArray = vg3.b5.f518182a;
        synchronized (sparseArray) {
            f5Var = (vg3.f5) sparseArray.get(5);
        }
        if (f5Var != null) {
            f5Var.E0(j4Var);
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.t4.class)).all()).iterator();
        while (it.hasNext()) {
            fs.q qVar = (fs.q) it.next();
            if (qVar.mo210xb7045565(5) && fs.g.d(fs.g.f347619c, qVar)) {
                ((vg3.t4) ((fs.n) qVar.get())).E0(j4Var);
            }
        }
        if (g17.equals("readerapp")) {
            j4Var.f459091e = x51.j1.i("newsapp");
            j4Var.f459093g = 12399999;
        }
        if ((g17.equals("blogapp") || g17.equals("newsapp")) && j4Var.f459093g != 10002) {
            j4Var.f459093g = 12399999;
        }
        if (j4Var.f459093g == 52) {
            j4Var.f459093g = 1000052;
        }
        if (j4Var.f459093g == 53) {
            j4Var.f459093g = 1000053;
        }
        java.util.Map map = c01.w9.f119072b;
        r45.j4 j4Var2 = p0Var.f152259a;
        if (j4Var2 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(x51.j1.g(j4Var2.f459091e), j4Var2.f459101r);
            if (o27 != null && o27.m124847x74d37ac6() != 0 && (o27.A0() == 0 || j4Var2.f459102s != 0)) {
                int w07 = o27.w0();
                int i18 = p0Var.f152260b ? w07 | 2 : w07 & (-3);
                int i19 = p0Var.f152261c ? i18 | 1 : i18 & (-2);
                int i27 = p0Var.f152262d ? i19 | 4 : i19 & (-5);
                if (i27 != o27.w0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", java.lang.Integer.valueOf(j4Var2.f459093g), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o27.w0()));
                    o27.f1(i27);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(o27.I0(), o27);
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.t0 a17 = com.p314xaae8f345.mm.p944x882e457a.s0.a(java.lang.Integer.valueOf(j4Var.f459093g));
        if (a17 == null) {
            a17 = com.p314xaae8f345.mm.p944x882e457a.s0.a(g17);
        }
        if (a17 != null) {
            mm.w.e("MessageExtension");
            com.p314xaae8f345.mm.p944x882e457a.q0 b17 = a17.b1(p0Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = b17 == null ? null : b17.f152276a;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", java.lang.Integer.valueOf(j4Var.f459093g), java.lang.Long.valueOf(j4Var.f459101r), java.lang.Integer.valueOf(j4Var.f459102s), java.lang.Integer.valueOf(j4Var.f459098o), p0Var);
                java.lang.String str3 = a17.getClass().getSimpleName() + "-" + j4Var.f459093g;
                mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddMsgEmpty: type=" + str3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
                    mm.w.f("MsgNull");
                    mm.y yVar = mm.w.f410089o;
                    if (yVar.b() || !mm.w.f410076b) {
                        yVar.c(str3);
                    }
                }
                q0Var = b17;
            } else {
                java.lang.String str4 = f9Var.G;
                if (f9Var.mo78012x3fdd41df() != j4Var.f459098o * 1000) {
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20240xf9b651eb()) != 0) {
                        p15.e eVar = new p15.e();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                            eVar.B(java.lang.String.valueOf(j4Var.f459098o));
                        } else {
                            eVar.m126728xdc93280d(str4);
                            eVar.B(java.lang.String.valueOf(j4Var.f459098o));
                        }
                        str4 = eVar.m126747x696739c();
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        str4 = "<msgsource><realcreatetime>" + j4Var.f459098o + "</realcreatetime></msgsource>";
                    } else {
                        str4 = str4.replace("</msgsource>", "<realcreatetime>" + j4Var.f459098o + "</realcreatetime></msgsource>");
                    }
                }
                f9Var.u3(str4);
                mm.h hVar = mm.h.f410018a;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(g17) && !u11.c.i()) {
                    mm.w.f("MsgPost");
                } else {
                    java.util.Objects.toString(z4Var);
                    if (f9Var.m124847x74d37ac6() <= 0) {
                        mm.w.f("MsgNoId");
                    } else if (z4Var == null) {
                        mm.w.f("MsgNullNotifier");
                    } else if (!b17.f152277b || c01.g.a(j4Var)) {
                        mm.w.f("MsgTotNotify");
                    } else {
                        z4Var.b(f9Var, j4Var);
                        mm.w.e("newMsg");
                        if (f9Var.b3() && cx4Var.f453431d > 0 && com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                            a25.q qVar2 = (a25.q) i95.n0.c(a25.q.class);
                            long j18 = j4Var.f459101r;
                            long j19 = j4Var.f459098o;
                            long j27 = cx4Var.f453432e;
                            long j28 = cx4Var.f453431d;
                            ((aq1.q0) qVar2).getClass();
                            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4 r4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class));
                            r4Var.getClass();
                            long j29 = j19 * 1000;
                            long a18 = c01.id.a();
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            long j37 = currentTimeMillis - a18;
                            if (java.lang.Math.abs(j37) <= 60000) {
                                if (1 <= j29 && j29 < a18) {
                                    ((ku5.t0) ku5.t0.f394148d).A("longMsgNotifyDispatch");
                                    ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q3(j18, a18, j29, currentTimeMillis, j27, r4Var, "longMsgNotifyDispatch", j37, j28), 5000L, "longMsgNotifyDispatch");
                                }
                            }
                        }
                    }
                }
                q0Var = b17;
            }
            z17 = true;
            i17 = 5;
        } else {
            i17 = 5;
            q0Var = null;
            z17 = false;
        }
        vg3.b5.b(i17, j4Var);
        if (q0Var != null) {
            q0Var.f152278c = j17;
            q0Var.f152279d = c17;
            q0Var.f152280e = c01.id.c();
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", java.lang.Integer.valueOf(j4Var.f459093g));
        }
        return q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5 A[LOOP:1: B:21:0x00e5->B:23:0x00eb, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01be  */
    @Override // vg3.w4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r18, r45.b50 r19, int r20, byte[] r21, boolean r22, r45.cx4 r23, vg3.z4 r24) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2.a(java.lang.Object, r45.b50, int, byte[], boolean, r45.cx4, vg3.z4):void");
    }

    public final void c(r45.j4 j4Var, java.lang.Object obj, int i17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (j4Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, false, false, false);
        com.p314xaae8f345.mm.p944x882e457a.q0 b17 = b(p0Var, cx4Var, z4Var);
        if (b17 != null && (f9Var = b17.f152276a) != null && f9Var.m124847x74d37ac6() < 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6377x3369aa22 c6377x3369aa22 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6377x3369aa22();
            c6377x3369aa22.f137235e = f9Var.I0();
            c6377x3369aa22.f137234d = f9Var.mo78013xfb85f7b0();
            c6377x3369aa22.f137237g = 1000 - f9Var.m124847x74d37ac6();
            c6377x3369aa22.f137236f = c6377x3369aa22.b(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede, "processAddMsg insert db error", true);
            c6377x3369aa22.k();
        }
        if (p0Var.f152260b) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z1(this, b17, obj, i17, j4Var));
    }
}
