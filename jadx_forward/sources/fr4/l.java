package fr4;

/* loaded from: classes11.dex */
public final class l extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f347377d = jz5.h.b(fr4.k.f347376d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f347378e = jz5.h.b(fr4.j.f347375d);

    @Override // et1.c, vg3.t3
    public void C0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo, boolean[] isConsumed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isConsumed, "isConsumed");
        java.lang.String str = notifyInfo.f535943a;
        if (str == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(str)) {
            return;
        }
        jz5.f0 f0Var = null;
        if (f9Var != null) {
            if (!(f9Var.m124847x74d37ac6() != 0)) {
                f9Var = null;
            }
            if (f9Var != null) {
                et1.b h17 = h(f9Var);
                int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(notifyInfo.f535944b, "insert") ? notifyInfo.f535946d : 0;
                kr4.g y07 = q().y0(str);
                s(y07, ((kr4.n) ((jz5.n) this.f347377d).mo141623x754a37bb()).y0(str), f9Var, h17, i17, notifyInfo);
                l(y07);
                b(y07, i17, f9Var);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            k(str);
        }
        isConsumed[0] = true;
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xg3.l0 notifyInfo) {
        kr4.g conversation = (kr4.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return q().y0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((kr4.n) ((jz5.n) this.f347377d).mo141623x754a37bb()).y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        kr4.g y07 = q().y0(sessionId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wConvUpdater", "[onConversationMsgEmpty] " + y07.f72763xa3c65b86);
        if (y07.f72763xa3c65b86 > 0) {
            y07.f69038xf66fcca9 = "";
            q().m145258xce0038c9(y07.f72763xa3c65b86, y07, false);
            q().mo142179xf35bbb4(y07.f69048xbed8694c, 1, y07);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(sessionId);
    }

    @Override // et1.c
    public /* bridge */ /* synthetic */ java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, et1.b bVar, int i17, xg3.l0 l0Var) {
        kr4.g gVar = (kr4.g) obj;
        s(gVar, (kr4.o) obj2, f9Var, bVar, i17, l0Var);
        return gVar;
    }

    @Override // et1.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(kr4.g conv, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 latestMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestMsg, "latestMsg");
        if (conv.f69042xef647383 == 1) {
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            kr4.g y07 = q().y0("w1wsayhisessionholder@w1wmsg");
            kr4.k Ai = g0Var.Ai();
            java.lang.String field_talkerUserName = conv.f69050x3e123854;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talkerUserName, "field_talkerUserName");
            kr4.e y08 = Ai.y0(field_talkerUserName);
            if (y08 == null) {
                hr4.p.f365796a.a(conv.f69050x3e123854, new fr4.i(conv, y07, this, i17));
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 t07 = y08.t0();
            conv.Z = t07;
            conv.f393040x0 = t07.g2();
            y07.f69038xf66fcca9 = conv.f393040x0 + ':' + conv.f69038xf66fcca9;
            t(y07, conv, i17);
        }
    }

    public final kr4.m q() {
        return (kr4.m) ((jz5.n) this.f347378e).mo141623x754a37bb();
    }

    @Override // et1.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void l(kr4.g conversation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        if (conversation.f72763xa3c65b86 <= 0) {
            q().mo51731x24249762(conversation, false);
            q().mo142179xf35bbb4(conversation.f69048xbed8694c, 2, conversation);
        } else {
            q().m145258xce0038c9(conversation.f72763xa3c65b86, conversation, false);
            q().mo142179xf35bbb4(conversation.f69048xbed8694c, 1, conversation);
        }
    }

    public kr4.g s(kr4.g conv, kr4.o sessionInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastMsgInfo, "lastMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestData, "digestData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        int i18 = sessionInfo.f69156xef647383;
        if (conv.f69042xef647383 == 1 && lastMsgInfo.A0() == 1) {
            i18 = 0;
            kr4.n nVar = (kr4.n) ((jz5.n) this.f347377d).mo141623x754a37bb();
            java.lang.String field_sessionId = sessionInfo.f69158xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            java.lang.String field_talkerUserName = sessionInfo.f69160x3e123854;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talkerUserName, "field_talkerUserName");
            java.lang.String field_selfUserName = sessionInfo.f69157x5568d387;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
            nVar.D0(field_sessionId, field_talkerUserName, field_selfUserName, sessionInfo.f69159x10a0fed7, sessionInfo.f69155xa5ffa630, 0);
        }
        conv.f69047x5568d387 = sessionInfo.f69157x5568d387;
        conv.f69038xf66fcca9 = digestData.f338097a.f38869x6ac9171;
        conv.f69040x6b1fb014 = digestData.f338098b.f38869x6ac9171;
        conv.f69053xa783a79b = lastMsgInfo.mo78012x3fdd41df();
        conv.f69039x6b1f5383 = java.lang.String.valueOf(lastMsgInfo.mo78013xfb85f7b0());
        conv.f69052xa35b5abb += i17;
        conv.f69044x11a0aa61 = lastMsgInfo.m124847x74d37ac6();
        conv.f69043xff7bdab7 = lastMsgInfo.A0();
        conv.f69049x10a0fed7 = lastMsgInfo.P0();
        conv.f69050x3e123854 = sessionInfo.f69160x3e123854;
        conv.f69046x9b4f418d = 0;
        conv.f69042xef647383 = i18;
        if (i17 != 0) {
            ((fr4.g0) i95.n0.c(fr4.g0.class)).bj(3009, sessionInfo.f69157x5568d387);
        }
        return conv;
    }

    public final void t(kr4.g gVar, kr4.g gVar2, int i17) {
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        gVar.f69052xa35b5abb += i17;
        gVar.f69053xa783a79b = gVar2.f69053xa783a79b;
        gVar.f69047x5568d387 = g0Var.Di();
        gVar.f69045xa97e89ae = 1000L;
        if (!g0Var.f347364r) {
            gVar.f69046x9b4f418d = 0;
        }
        if (q().m145258xce0038c9(gVar.f72763xa3c65b86, gVar, false)) {
            q().mo142179xf35bbb4(gVar.f69048xbed8694c, 1, gVar);
        }
    }
}
