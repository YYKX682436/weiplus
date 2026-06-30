package ar1;

/* loaded from: classes11.dex */
public final class c extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f94902d = jz5.h.b(ar1.a.f94900d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f94903e = jz5.h.b(ar1.b.f94901d);

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        hr1.e conv = (hr1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo) {
        hr1.e conversation = (hr1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return o().z0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((hr1.o) ((jz5.n) this.f94902d).mo141623x754a37bb()).y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        hr1.e z07 = o().z0(sessionId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansConversationUpdater", "[onConversationMsgEmpty] " + z07.f72763xa3c65b86);
        if (z07.f72763xa3c65b86 > 0) {
            z07.f66316xf66fcca9 = "";
            o().m145258xce0038c9(z07.f72763xa3c65b86, z07, false);
            o().mo142179xf35bbb4(z07.f66326xbed8694c, 1, z07);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        hr1.e conversation = (hr1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        if (conversation.f72763xa3c65b86 <= 0) {
            o().mo51731x24249762(conversation, false);
            o().mo142179xf35bbb4(conversation.f66326xbed8694c, 2, conversation);
        } else {
            o().m145258xce0038c9(conversation.f72763xa3c65b86, conversation, false);
            o().mo142179xf35bbb4(conversation.f66326xbed8694c, 1, conversation);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        hr1.e conv = (hr1.e) obj;
        hr1.m sessionInfo = (hr1.m) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastMsgInfo, "lastMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestData, "digestData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        java.lang.String str = sessionInfo.f66480x114ef53e;
        int i18 = sessionInfo.f66481x2262335f;
        boolean z17 = conv.f72763xa3c65b86 <= 0;
        int i19 = conv.f66330xa35b5abb;
        conv.f66325xea7a0fe2 = sessionInfo.f66478x1362f030;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = digestData.f338097a;
        conv.f66316xf66fcca9 = c19772x1c2cd081.f38869x6ac9171;
        conv.f66318x6b1fb014 = digestData.f338098b.f38869x6ac9171;
        conv.f66331xa783a79b = lastMsgInfo.mo78012x3fdd41df();
        conv.f66317x6b1f5383 = java.lang.String.valueOf(lastMsgInfo.mo78013xfb85f7b0());
        conv.f66330xa35b5abb += i17;
        conv.f66322x11a0aa61 = lastMsgInfo.m124847x74d37ac6();
        conv.f66321xff7bdab7 = lastMsgInfo.A0();
        conv.f66327x10a0fed7 = lastMsgInfo.P0();
        conv.f66328x114ef53e = str;
        conv.f66329x2262335f = i18;
        dr1.a aVar = dr1.a.f324117a;
        conv.f66320xb4776b7c = aVar.d() ? sessionInfo.f66477xb4776b7c : 0;
        conv.f66324x9b4f418d = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansConversationUpdater", "[updateBizFansConversation] isNew=" + z17 + " beforeUnreadCount=" + i19 + " insertCount=" + i17 + " isGreet=" + conv.f66320xb4776b7c);
        if (conv.f66320xb4776b7c == 1 && i17 > 0) {
            long mo78012x3fdd41df = lastMsgInfo.mo78012x3fdd41df();
            java.lang.String str2 = c19772x1c2cd081.f38869x6ac9171;
            if (str2 == null) {
                str2 = "";
            }
            aVar.a(0, i17, mo78012x3fdd41df, str2);
        }
        return conv;
    }

    public final hr1.i o() {
        return (hr1.i) ((jz5.n) this.f94903e).mo141623x754a37bb();
    }
}
