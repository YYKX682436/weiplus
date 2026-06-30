package com.tencent.mm.modelgetchatroommsg;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.SilenceNotifyEvent f71244d;

    public h(com.tencent.mm.autogen.events.SilenceNotifyEvent silenceNotifyEvent, com.tencent.mm.modelgetchatroommsg.g gVar) {
        this.f71244d = silenceNotifyEvent;
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
            com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] accHasReady no!");
            return;
        }
        byte[] bArr = this.f71244d.f54786g.f8138a;
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] data is null");
            return;
        }
        r45.k4 k4Var = new r45.k4();
        try {
            k4Var.parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", e17, "", new java.lang.Object[0]);
        }
        java.lang.System.currentTimeMillis();
        java.lang.String g17 = x51.j1.g(k4Var.f378345d);
        int i17 = k4Var.f378347f;
        long j17 = k4Var.f378348g * 1000;
        com.tencent.mm.storage.d3 d3Var = (com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        if (d3Var.n(g17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#update] chatRoomId:%s updatePushSeqRet[%s]:%s updatePushCreateTimeRet[%s]:%s", g17, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(d3Var.q(g17, i17)), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(d3Var.p(g17, j17)));
            cls = vg3.x3.class;
        } else {
            com.tencent.mm.storage.f9 W5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().W5(g17);
            if (W5 != null && W5.getMsgId() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run] has not any ReceivedMsg!");
                W5 = null;
            }
            if (W5 != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgReceiver", "[lastFaultMsgInfo] lastFaultMsgInfo:%s timeFormat:%s", com.tencent.mm.sdk.platformtools.t8.G1(W5.j()), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, W5.getCreateTime() / 1000));
            }
            com.tencent.mm.storage.c3 c3Var = new com.tencent.mm.storage.c3();
            c3Var.field_username = g17;
            c3Var.field_lastPushSeq = i17;
            c3Var.field_lastLocalSeq = W5 != null ? W5.F0() : i17 - 1;
            c3Var.field_lastPushCreateTime = j17;
            cls = vg3.x3.class;
            c3Var.field_lastLocalCreateTime = W5 != null ? W5.getCreateTime() : j17 - 1;
            long m17 = d3Var.m(c3Var, false);
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Long.valueOf(m17);
            objArr[1] = g17;
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = java.lang.Long.valueOf(j17);
            objArr[4] = java.lang.Long.valueOf(W5 != null ? W5.F0() : i17 - 1);
            objArr[5] = java.lang.Long.valueOf(W5 != null ? W5.getCreateTime() : j17 - 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "[UpdateMsgSeqStorageTask$run#insert] ret:%s,chatRoomId:%s updatePushSeq:%s updatePushCreateTime:%s field_lastLocalSeq:%s field_lastLocalCreateTime:%s", objArr);
            jx3.f.INSTANCE.idkeyStat(403L, 77L, 1L, true);
        }
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        java.lang.String g18 = x51.j1.g(k4Var.f378345d);
        int i18 = k4Var.f378347f;
        long j18 = k4Var.f378346e;
        int i19 = k4Var.f378348g;
        int i27 = k4Var.f378351m;
        int i28 = k4Var.f378352n;
        int i29 = k4Var.f378349h;
        java.lang.String g19 = x51.j1.g(k4Var.f378350i);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]", g18, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), com.tencent.mm.sdk.platformtools.t8.G1(g19));
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Di().p(g18);
        if (p17 == null) {
            p17 = new com.tencent.mm.storage.l4(g18);
            p17.n1(i19 * 1000);
            long j19 = i18;
            p17.P1(j19);
            p17.Y1(1);
            p17.X1(1);
            com.tencent.mm.modelgetchatroommsg.f.d().b(g18);
            com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Ni();
            if (g18 == null) {
                x4Var.getClass();
                s08 = 0;
            } else {
                s08 = x4Var.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{g18});
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]", java.lang.Long.valueOf(s08), java.lang.Integer.valueOf(i18));
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
                    com.tencent.mars.xlog.Log.e("MicroMsg.GetChatroomMsgReceiver", "why???, unreadCount %d", java.lang.Integer.valueOf(d18));
                    d18 = 0;
                }
                p17.Y1(d18);
                long F0 = p17.F0();
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv  msgSeq[%d], firstSeq[%d], lastseq[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(F0), java.lang.Integer.valueOf(R0));
                if (F0 > 0) {
                    com.tencent.mm.storage.f9 k27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).cj().k2(g18, R0);
                    if (k27 != null && k27.getMsgId() > 0) {
                        p17.u1(k27.F0());
                    }
                } else {
                    com.tencent.mm.storage.x4 x4Var2 = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Ni();
                    if (g18 == null) {
                        x4Var2.getClass();
                        s07 = 0;
                    } else {
                        s07 = x4Var2.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{g18});
                    }
                    if (s07 > 0) {
                        p17.u1(s07);
                    } else {
                        long V5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).cj().V5(g18);
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv lastMsgSeq[%s]", java.lang.Long.valueOf(V5));
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
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(0);
        f9Var.u1(g18);
        f9Var.setType(i28);
        f9Var.d1(g19);
        if (i28 == 49) {
            ot0.q v17 = ot0.q.v(com.tencent.mm.pluginsdk.model.app.a0.f(g18, "", g19));
            f9Var.setType(com.tencent.mm.pluginsdk.model.app.k0.p(v17));
            if (f9Var.t2()) {
                g19 = v17.f348686n;
            }
            f9Var.d1(g19);
        } else if (i28 == 10002) {
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
            c01.ad.f37061a.getClass();
            if (f9Var.getType() == 10002 && !com.tencent.mm.sdk.platformtools.t8.K0(g19)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(g19)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "null msg content");
                } else if (g19.startsWith("~SEMI_XML~")) {
                    d17 = com.tencent.mm.sdk.platformtools.p7.a(g19);
                    if (d17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", g19);
                    } else {
                        str2 = "brand_service";
                        if (str2 != null && str2.equals("revokemsg")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
                            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.revokemsg.newmsgid");
                            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.revokemsg.replacemsg");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", str3, str4);
                            f9Var.d1(str4);
                            f9Var.setType(10000);
                        }
                    }
                } else {
                    int indexOf = g19.indexOf("<sysmsg");
                    if (indexOf == -1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
                    } else {
                        d17 = com.tencent.mm.sdk.platformtools.aa.d(g19.substring(indexOf), "sysmsg", null);
                        if (d17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", g19);
                        } else {
                            str2 = (java.lang.String) d17.get(".sysmsg.$type");
                            if (str2 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
                                java.lang.String str32 = (java.lang.String) d17.get(".sysmsg.revokemsg.newmsgid");
                                java.lang.String str42 = (java.lang.String) d17.get(".sysmsg.revokemsg.replacemsg");
                                com.tencent.mars.xlog.Log.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", str32, str42);
                                f9Var.d1(str42);
                                f9Var.setType(10000);
                            }
                        }
                    }
                }
            }
        }
        p17.M1(0);
        p17.l1(f9Var.j());
        p17.S1(java.lang.Integer.toString(f9Var.getType()));
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Di().w() != null) {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            qm.a0.d(f9Var, pString, pString2, pInt, false);
            p17.o1(pString.value);
            p17.p1(pString2.value);
            p17.K1(pInt.value);
            if (f9Var.getType() == 49) {
                java.lang.String str5 = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(p17.j(), "msg", null).get(".msg.appmsg.title");
                java.lang.String y07 = p17.y0();
                if (y07 == null) {
                    y07 = "";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    str = " ".concat(str5 != null ? str5 : "");
                }
                p17.o1(y07.concat(str));
            }
        } else {
            p17.o1(p17.j());
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", g18, java.lang.Long.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Di().G(p17)), java.lang.Long.valueOf(p17.F0()), java.lang.Long.valueOf(p17.R0()), java.lang.Integer.valueOf(p17.c1()));
        } else {
            p17.j1(p17.u0() & (-1048577));
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr updateConv update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", g18, java.lang.Long.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Di().Y(p17, g18, true, true)), java.lang.Long.valueOf(p17.F0()), java.lang.Long.valueOf(p17.R0()), java.lang.Integer.valueOf(p17.c1()));
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        try {
            a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetChatroomMsgReceiver", e17, "", new java.lang.Object[0]);
        }
        java.lang.System.currentTimeMillis();
    }
}
