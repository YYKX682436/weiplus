package c63;

/* loaded from: classes8.dex */
public final class n extends et1.e implements ct1.x {
    @Override // ct1.c
    public int h() {
        return 3;
    }

    @Override // ct1.c
    public int i() {
        return 5;
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((t53.m0) i95.n0.c(t53.m0.class)).Zi().y0(sessionId);
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        f63.e session = (f63.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        f63.k Zi = ((t53.m0) i95.n0.c(t53.m0.class)).Zi();
        java.lang.String field_selfUserName = session.f67824x5568d387;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
        java.lang.String field_talker = session.f67826x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
        Zi.z0(sessionId, field_selfUserName, field_talker, session.f67823x26b3182a);
    }

    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        java.lang.String str;
        f63.e localSessionInfo = (f63.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSessionInfo, "localSessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        r45.j4 j4Var = rawBypMsg.f470359d;
        boolean z17 = rawBypMsg.f470363h;
        java.lang.String str2 = rawBypMsg.f470360e;
        java.lang.String g17 = x51.j1.g(j4Var.f459092f);
        java.lang.String g18 = x51.j1.g(j4Var.f459091e);
        java.lang.String s17 = s(rawBypMsg);
        java.lang.String r17 = r(rawBypMsg);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new v53.c().mo11468x92b714fd(rawBypMsg.f470362g.f273689a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.autogen.GameLifeMsgExtInfo");
        v53.c cVar = (v53.c) mo11468x92b714fd;
        v53.m mVar = cVar.f514865f;
        if (mVar != null && (str = mVar.f514882e) != null && !r26.n0.B(str, "20008", false)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LIFE_LAST_SAVED_MSG_TYPE_INT, java.lang.Integer.valueOf(cVar.f514865f.f514881d));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LIFE_LAST_SAVED_EXTERN_INFO_STRING, cVar.f514865f.f514882e);
        }
        localSessionInfo.f67825xbed8694c = str2;
        localSessionInfo.f67824x5568d387 = r17;
        localSessionInfo.f67826x114ef53e = s17;
        localSessionInfo.f67823x26b3182a = cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f338100h, "[beforeProcessAddMsg] svrMsgId=" + rawBypMsg.f470359d.f459101r + " isSender=" + z17 + " msgType=" + rawBypMsg.f470359d.f459093g + " createTime=" + rawBypMsg.f470359d.f459098o + " fromUser=" + g18 + " toUser=" + g17 + " sessionId=" + rawBypMsg.f470360e + ' ');
        return true;
    }
}
