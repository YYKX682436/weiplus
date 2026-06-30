package com.p314xaae8f345.mm.p950x112e8cc1;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 f152777d;

    public h(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 c6029xbb3f0190, com.p314xaae8f345.mm.p950x112e8cc1.g gVar) {
        this.f152777d = c6029xbb3f0190;
    }

    public final void a() {
        java.lang.String str;
        java.lang.Class cls;
        boolean z17;
        long s07;
        java.util.Map d17;
        java.lang.String str2;
        long s08;
        str = "";
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] accHasReady no!");
            return;
        }
        byte[] bArr = this.f152777d.f136319g.f89671a;
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] data is null");
            return;
        }
        r45.k4 k4Var = new r45.k4();
        try {
            k4Var.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetChatroomMsgReceiver", e17, "", new java.lang.Object[0]);
        }
        java.lang.System.currentTimeMillis();
        java.lang.String g17 = x51.j1.g(k4Var.f459878d);
        int i17 = k4Var.f459880f;
        long j17 = k4Var.f459881g * 1000;
        com.p314xaae8f345.mm.p2621x8fb0427b.d3 d3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        if (d3Var.n(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#update] chatRoomId:%s updatePushSeqRet[%s]:%s updatePushCreateTimeRet[%s]:%s", g17, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(d3Var.q(g17, i17)), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(d3Var.p(g17, j17)));
            cls = vg3.x3.class;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 W5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().W5(g17);
            if (W5 != null && W5.m124847x74d37ac6() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] has not any ReceivedMsg!");
                W5 = null;
            }
            if (W5 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgReceiver", "[lastFaultMsgInfo] lastFaultMsgInfo:%s timeFormat:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(W5.j()), k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, W5.mo78012x3fdd41df() / 1000));
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.c3 c3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.c3();
            c3Var.f69295xdec927b = g17;
            c3Var.f69293xcef36faa = i17;
            c3Var.f69291x16eb58cf = W5 != null ? W5.F0() : i17 - 1;
            c3Var.f69292xe2e39c3e = j17;
            cls = vg3.x3.class;
            c3Var.f69290xfc6f0f79 = W5 != null ? W5.mo78012x3fdd41df() : j17 - 1;
            long m17 = d3Var.m(c3Var, false);
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Long.valueOf(m17);
            objArr[1] = g17;
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = java.lang.Long.valueOf(j17);
            objArr[4] = java.lang.Long.valueOf(W5 != null ? W5.F0() : i17 - 1);
            objArr[5] = java.lang.Long.valueOf(W5 != null ? W5.mo78012x3fdd41df() : j17 - 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#insert] ret:%s,chatRoomId:%s updatePushSeq:%s updatePushCreateTime:%s field_lastLocalSeq:%s field_lastLocalCreateTime:%s", objArr);
            jx3.f.INSTANCE.mo68477x336bdfd8(403L, 77L, 1L, true);
        }
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        java.lang.String g18 = x51.j1.g(k4Var.f459878d);
        int i18 = k4Var.f459880f;
        long j18 = k4Var.f459879e;
        int i19 = k4Var.f459881g;
        int i27 = k4Var.f459884m;
        int i28 = k4Var.f459885n;
        int i29 = k4Var.f459882h;
        java.lang.String g19 = x51.j1.g(k4Var.f459883i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]", g18, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(g19));
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Di().p(g18);
        if (p17 == null) {
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(g18);
            p17.n1(i19 * 1000);
            long j19 = i18;
            p17.P1(j19);
            p17.Y1(1);
            p17.X1(1);
            com.p314xaae8f345.mm.p950x112e8cc1.f.d().b(g18);
            com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Ni();
            if (g18 == null) {
                x4Var.getClass();
                s08 = 0;
            } else {
                s08 = x4Var.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{g18});
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]", java.lang.Long.valueOf(s08), java.lang.Integer.valueOf(i18));
            if (s08 > 0) {
                j19 = s08;
            }
            p17.u1(j19);
            z17 = true;
        } else {
            int R0 = (int) p17.R0();
            if (i18 > R0) {
                p17.P1(i18);
                int c17 = p17.c1();
                p17.X1(i29);
                p17.n1(i19 * 1000);
                int d18 = i29 > p17.d1() ? i29 : p17.d1() + (i29 - c17);
                if (d18 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetChatroomMsgReceiver", "why???, unreadCount %d", java.lang.Integer.valueOf(d18));
                    d18 = 0;
                }
                p17.Y1(d18);
                long F0 = p17.F0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv  msgSeq[%d], firstSeq[%d], lastseq[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(F0), java.lang.Integer.valueOf(R0));
                if (F0 > 0) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).cj().k2(g18, R0);
                    if (k27 != null && k27.m124847x74d37ac6() > 0) {
                        p17.u1(k27.F0());
                    }
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Ni();
                    if (g18 == null) {
                        x4Var2.getClass();
                        s07 = 0;
                    } else {
                        s07 = x4Var2.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{g18});
                    }
                    if (s07 > 0) {
                        p17.u1(s07);
                    } else {
                        long V5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).cj().V5(g18);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv lastMsgSeq[%s]", java.lang.Long.valueOf(V5));
                        if (V5 > 0) {
                            p17.u1(V5);
                        }
                    }
                }
            } else if (i18 == R0 && i29 == 0 && p17.d1() > 0) {
                p17.Y1(0);
            }
            z17 = false;
        }
        if (i27 > 0) {
            p17.i1(p17.t0() + i27);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.j1(0);
        f9Var.u1(g18);
        f9Var.m124850x7650bebc(i28);
        f9Var.d1(g19);
        if (i28 == 49) {
            ot0.q v17 = ot0.q.v(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a0.f(g18, "", g19));
            f9Var.m124850x7650bebc(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.p(v17));
            if (f9Var.t2()) {
                g19 = v17.f430219n;
            }
            f9Var.d1(g19);
        } else if (i28 == 10002) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
            c01.ad.f118594a.getClass();
            if (f9Var.mo78013xfb85f7b0() == 10002 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g19)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g19)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysCmdMsgExtension", "null msg content");
                } else if (g19.startsWith("~SEMI_XML~")) {
                    d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p7.a(g19);
                    if (d17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", g19);
                    } else {
                        str2 = "brand_service";
                        if (str2 != null && str2.equals("revokemsg")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
                            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.revokemsg.newmsgid");
                            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.revokemsg.replacemsg");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", str3, str4);
                            f9Var.d1(str4);
                            f9Var.m124850x7650bebc(10000);
                        }
                    }
                } else {
                    int indexOf = g19.indexOf("<sysmsg");
                    if (indexOf == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
                    } else {
                        d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g19.substring(indexOf), "sysmsg", null);
                        if (d17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", g19);
                        } else {
                            str2 = (java.lang.String) d17.get(".sysmsg.$type");
                            if (str2 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
                                java.lang.String str32 = (java.lang.String) d17.get(".sysmsg.revokemsg.newmsgid");
                                java.lang.String str42 = (java.lang.String) d17.get(".sysmsg.revokemsg.replacemsg");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", str32, str42);
                                f9Var.d1(str42);
                                f9Var.m124850x7650bebc(10000);
                            }
                        }
                    }
                }
            }
        }
        p17.M1(0);
        p17.l1(f9Var.j());
        p17.S1(java.lang.Integer.toString(f9Var.mo78013xfb85f7b0()));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Di().w() != null) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            qm.a0.d(f9Var, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, false);
            p17.o1(c19772x1c2cd081.f38869x6ac9171);
            p17.p1(c19772x1c2cd0812.f38869x6ac9171);
            p17.K1(c19767x257d7f.f38864x6ac9171);
            if (f9Var.mo78013xfb85f7b0() == 49) {
                java.lang.String str5 = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(p17.j(), "msg", null).get(".msg.appmsg.title");
                java.lang.String y07 = p17.y0();
                if (y07 == null) {
                    y07 = "";
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    str = " ".concat(str5 != null ? str5 : "");
                }
                p17.o1(y07.concat(str));
            }
        } else {
            p17.o1(p17.j());
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", g18, java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Di().G(p17)), java.lang.Long.valueOf(p17.F0()), java.lang.Long.valueOf(p17.R0()), java.lang.Integer.valueOf(p17.c1()));
        } else {
            p17.j1(p17.u0() & (-1048577));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", g18, java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Di().Y(p17, g18, true, true)), java.lang.Long.valueOf(p17.F0()), java.lang.Long.valueOf(p17.R0()), java.lang.Integer.valueOf(p17.c1()));
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        try {
            a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetChatroomMsgReceiver", e17, "", new java.lang.Object[0]);
        }
        java.lang.System.currentTimeMillis();
    }
}
