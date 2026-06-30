package z53;

/* loaded from: classes8.dex */
public final class y extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f551805d = jz5.h.b(z53.w.f551803d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f551806e = jz5.h.b(z53.v.f551802d);

    /* renamed from: f, reason: collision with root package name */
    public long f551807f;

    @Override // et1.c, vg3.t3
    public void S0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationUpdateCallback", "msgInfo = " + f9Var + ", conversation = " + l4Var + ", newCon = " + z17 + ", notifyInfo = " + l0Var);
    }

    @Override // et1.c, vg3.t3
    public void W(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        z53.i conversation = (z53.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo) {
        ot0.q v17;
        java.util.Map map;
        z53.i conversation = (z53.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        java.util.ArrayList arrayList = notifyInfo.f535945c;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                if (f9Var2 != null && f9Var2.A0() != 1 && f9Var2.k2() && (v17 = ot0.q.v(f9Var2.j())) != null && (map = v17.Z1) != null) {
                    conversation.f67665x195d889b = (java.lang.String) map.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationUpdateCallback", "[beforeConvUpdate] notifyFunc:" + notifyInfo.f535944b + " delId:" + notifyInfo.f535949g);
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return o().z0(sessionId);
    }

    @Override // et1.c
    public et1.b h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        java.lang.String str;
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        java.lang.String str2 = null;
        if (!latestMsg.C2() || latestMsg.z0() == null) {
            if (latestMsg.k2() && (v17 = ot0.q.v(latestMsg.U1())) != null && v17.f430199i == 66) {
                str2 = v17.f430187f;
            }
            str = str2;
        } else {
            java.lang.String z07 = latestMsg.z0();
            if (z07 != null && z07.length() == 32) {
                str2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Bi(z07);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
            } else {
                str = "[" + str2 + ']';
            }
        }
        if (str == null) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0813 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            ((com.p314xaae8f345.mm.app.u7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w()).getClass();
            qm.a0.d(latestMsg, c19772x1c2cd0812, c19772x1c2cd0813, c19767x257d7f, false);
            str = c19772x1c2cd0812.f38869x6ac9171;
        }
        c19772x1c2cd081.f38869x6ac9171 = str;
        return new et1.b(c19772x1c2cd081, new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081());
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((f63.k) ((jz5.n) this.f551805d).mo141623x754a37bb()).y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        z53.i z07 = o().z0(sessionId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationUpdateCallback", "[onConversationMsgEmpty] " + z07.f72763xa3c65b86);
        if (z07.f72763xa3c65b86 > 0) {
            z07.f67663xf66fcca9 = "";
            o().m145258xce0038c9(z07.f72763xa3c65b86, z07, false);
            o().mo142179xf35bbb4(z07.f67670x114ef53e, 8, z07);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        z53.i conversation = (z53.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        boolean z17 = conversation.f72763xa3c65b86 <= 0;
        if (z17) {
            o().mo51731x24249762(conversation, false);
            o().mo142179xf35bbb4("single", 2, conversation);
        } else {
            o().m145258xce0038c9(conversation.f72763xa3c65b86, conversation, false);
            o().mo142179xf35bbb4("single", 1, conversation);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] isNew=" + z17 + " conLastMsgId:" + this.f551807f + " sessionId=" + conversation.f67669xbed8694c + " talker=" + conversation.f67670x114ef53e + ' ' + z53.u.a(conversation));
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        z53.i conv = (z53.i) obj;
        f63.e sessionInfo = (f63.e) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastMsgInfo, "lastMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestData, "digestData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        java.lang.String str = sessionInfo.f67824x5568d387;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = sessionInfo.f67826x114ef53e;
            if (!(str2 == null || str2.length() == 0)) {
                this.f551807f = conv.f67667x11a0aa61;
                conv.f67663xf66fcca9 = digestData.f338097a.f38869x6ac9171;
                conv.f67672xa783a79b = lastMsgInfo.mo78012x3fdd41df();
                conv.f67671xa35b5abb += i17;
                conv.f67667x11a0aa61 = lastMsgInfo.m124847x74d37ac6();
                conv.f67670x114ef53e = sessionInfo.f67826x114ef53e;
                conv.f67668x5568d387 = sessionInfo.f67824x5568d387;
                if (conv.f72763xa3c65b86 <= 0) {
                    ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(kz5.c0.i(conv.f67670x114ef53e, conv.f67668x5568d387), z53.x.f551804a);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(notifyInfo.f535944b, "delete")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] delete msg");
                    if (notifyInfo.f535949g == this.f551807f) {
                        o().m145258xce0038c9(conv.f72763xa3c65b86, conv, false);
                        o().mo142179xf35bbb4("single", 8, conv);
                    }
                    return null;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).K7("Common_IPC_appid", new com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a(sessionInfo.u0(), sessionInfo.v0(), sessionInfo.t0()));
                return conv;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ConversationUpdateCallback", "getSessionInfo invalid: " + sessionInfo);
        return null;
    }

    public final z53.t o() {
        return (z53.t) ((jz5.n) this.f551806e).mo141623x754a37bb();
    }
}
