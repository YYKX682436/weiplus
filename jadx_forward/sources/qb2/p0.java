package qb2;

/* loaded from: classes10.dex */
public final class p0 extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f442799d = jz5.h.b(qb2.n0.f442793d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f442800e = jz5.h.b(qb2.o0.f442795d);

    public p0() {
        pm0.v.K(null, new qb2.m0(this, g92.b.f351302e.U()));
    }

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        qb2.t conv = (qb2.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
        if (i17 > 0) {
            zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
            int i18 = conv.f65862x29cbf907;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) S).h(i18 == 1 ? null : conv.f65864x1362f030, conv.f65869x2262335f == 1 ? i18 == 1 ? zy2.y8.C : zy2.y8.D : i18 == 1 ? zy2.y8.E : zy2.y8.F);
        }
        int i19 = conv.f65862x29cbf907;
        if (i19 == 1) {
            if (conv.f65869x2262335f != 3) {
                return;
            }
            o();
            qb2.t D0 = r().D0("finderaliassessionholder");
            D0.f65853xf66fcca9 = conv.f65853xf66fcca9;
            D0.f65861x9b4f418d = 0;
            D0.f65870xa35b5abb += i17;
            D0.f65871xa783a79b = conv.f65871xa783a79b;
            r().m145258xce0038c9(D0.f72763xa3c65b86, D0, false);
            return;
        }
        if (i19 == 2 && conv.f65869x2262335f == 1) {
            java.lang.String field_senderUserName = conv.f65864x1362f030;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_senderUserName, "field_senderUserName");
            q(field_senderUserName);
            qb2.t D02 = r().D0("findersayhisessionholder");
            D02.f65853xf66fcca9 = conv.f65853xf66fcca9;
            D02.f65861x9b4f418d = 0;
            D02.f65870xa35b5abb += i17;
            D02.f65871xa783a79b = conv.f65871xa783a79b;
            r().m145258xce0038c9(D02.f72763xa3c65b86, D02, false);
        }
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo) {
        qb2.t conversation = (qb2.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return r().D0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0) ((jz5.n) this.f442799d).mo141623x754a37bb()).J0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        qb2.t D0 = r().D0(sessionId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationUpdater", "[onConversationMsgEmpty] " + D0.f72763xa3c65b86);
        if (D0.f72763xa3c65b86 > 0) {
            D0.f65853xf66fcca9 = "";
            r().m145258xce0038c9(D0.f72763xa3c65b86, D0, false);
            r().mo142179xf35bbb4(D0.f65866xbed8694c, 1, D0);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        qb2.t conversation = (qb2.t) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        if (conversation.f72763xa3c65b86 <= 0) {
            r().mo51731x24249762(conversation, false);
            r().mo142179xf35bbb4(conversation.f65866xbed8694c, 2, conversation);
        } else {
            r().m145258xce0038c9(conversation.f72763xa3c65b86, conversation, false);
            r().mo142179xf35bbb4(conversation.f65866xbed8694c, 1, conversation);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        java.lang.String str;
        int i18;
        int i19;
        java.lang.String str2;
        java.lang.String str3;
        qb2.t conv = (qb2.t) obj;
        qb2.x1 sessionInfo = (qb2.x1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastMsgInfo, "lastMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestData, "digestData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        java.lang.String str4 = sessionInfo.f65984xbed8694c;
        java.lang.String str5 = sessionInfo.f65985x114ef53e;
        int i27 = sessionInfo.f65986x2262335f;
        int i28 = sessionInfo.f65976xaf64e94a;
        int i29 = sessionInfo.f65980x36454e5d;
        int i37 = sessionInfo.f65977x83e02cb6;
        java.lang.String str6 = sessionInfo.f65983x1362f030;
        int i38 = sessionInfo.f65982x13644c0a;
        int i39 = sessionInfo.f65979x404ea322;
        boolean z17 = sessionInfo.f65978x3679555d;
        if (i27 == 1 && (lastMsgInfo.A0() == 1 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, c01.z1.r()))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 dj0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0) ((jz5.n) this.f442799d).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
            zy2.bb bbVar = zy2.bb.f558889f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
            i18 = i39;
            i19 = i38;
            str2 = str6;
            str3 = str5;
            dj0Var.L0(str4, str5, 2, 1, bbVar, i29, i37, str6, i18, z17);
            java.lang.String concat = "[updateFinderConversation] change type to normal. sessionId=".concat(str4);
            str = "Finder.ConversationUpdater";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, concat);
            i27 = 2;
            i28 = 1;
        } else {
            str = "Finder.ConversationUpdater";
            i18 = i39;
            i19 = i38;
            str2 = str6;
            str3 = str5;
        }
        boolean z18 = conv.f72763xa3c65b86 <= 0;
        int i47 = conv.f65870xa35b5abb;
        conv.f65853xf66fcca9 = digestData.f338097a.f38869x6ac9171;
        conv.f65855x6b1fb014 = digestData.f338098b.f38869x6ac9171;
        conv.f65871xa783a79b = lastMsgInfo.mo78012x3fdd41df();
        conv.f65854x6b1f5383 = java.lang.String.valueOf(lastMsgInfo.mo78013xfb85f7b0());
        conv.f65870xa35b5abb += i17;
        conv.f65859x11a0aa61 = lastMsgInfo.m124847x74d37ac6();
        conv.f65858xff7bdab7 = lastMsgInfo.A0();
        conv.f65867x10a0fed7 = lastMsgInfo.P0();
        java.lang.String str7 = str3;
        conv.f65868x114ef53e = str7;
        conv.f65869x2262335f = i27;
        conv.f65851xaf64e94a = i28;
        java.lang.String str8 = str2;
        conv.f65864x1362f030 = str8;
        conv.f65863x13644c0a = i19;
        conv.f65862x29cbf907 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(str7) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str8, c01.z1.r()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str8, c01.z1.k()))) ? 1 : 2;
        conv.f65861x9b4f418d = 0;
        m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
        conv.f65865xc6d52e88 = I1 != null ? I1.f68724xe1786669 : 0;
        conv.f65857x404ea322 = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[updateFinderConversation] isNew=" + z18 + " beforeUnreadCount=" + i47 + " insertCount=" + i17 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(conv));
        return conv;
    }

    public final void o() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("finderaliassessionholder");
        Di.m(linkedList);
        qb2.t D0 = r().D0("finderaliassessionholder");
        if (D0.f72763xa3c65b86 < 0) {
            qb2.t a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
            a17.f65866xbed8694c = "finderaliassessionholder";
            a17.f65868x114ef53e = "finderaliassessionholder";
            a17.f65869x2262335f = 200;
            a17.f65862x29cbf907 = 1;
            a17.f65870xa35b5abb = r().L0(1, 3, "");
            r().mo880xb970c2b9(a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationUpdater", "[checkInsertHolder] " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(D0));
    }

    public final void q(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("findersessionholder");
        Di.m(linkedList);
        qb2.t D0 = r().D0("findersayhisessionholder");
        if (D0.f72763xa3c65b86 < 0) {
            qb2.t a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
            a17.f65866xbed8694c = "findersayhisessionholder";
            a17.f65868x114ef53e = "findersayhisessionholder";
            a17.f65860xa97e89ae = 1000L;
            a17.f65869x2262335f = 100;
            a17.f65862x29cbf907 = 2;
            a17.f65864x1362f030 = str;
            a17.f65870xa35b5abb = r().L0(2, 1, str);
            r().mo880xb970c2b9(a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConversationUpdater", "[checkInsertHolder] " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u80.a(D0));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 r() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80) ((jz5.n) this.f442800e).mo141623x754a37bb();
    }
}
