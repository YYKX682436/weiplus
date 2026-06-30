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
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((t53.m0) i95.n0.c(t53.m0.class)).Zi().y0(sessionId);
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        f63.e session = (f63.e) obj;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        f63.k Zi = ((t53.m0) i95.n0.c(t53.m0.class)).Zi();
        java.lang.String field_selfUserName = session.field_selfUserName;
        kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
        java.lang.String field_talker = session.field_talker;
        kotlin.jvm.internal.o.f(field_talker, "field_talker");
        Zi.z0(sessionId, field_selfUserName, field_talker, session.field_extInfo);
    }

    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        java.lang.String str;
        f63.e localSessionInfo = (f63.e) obj;
        kotlin.jvm.internal.o.g(localSessionInfo, "localSessionInfo");
        kotlin.jvm.internal.o.g(rawBypMsg, "rawBypMsg");
        r45.j4 j4Var = rawBypMsg.f388826d;
        boolean z17 = rawBypMsg.f388830h;
        java.lang.String str2 = rawBypMsg.f388827e;
        java.lang.String g17 = x51.j1.g(j4Var.f377559f);
        java.lang.String g18 = x51.j1.g(j4Var.f377558e);
        java.lang.String s17 = s(rawBypMsg);
        java.lang.String r17 = r(rawBypMsg);
        com.tencent.mm.protobuf.f parseFrom = new v53.c().parseFrom(rawBypMsg.f388829g.f192156a);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.autogen.GameLifeMsgExtInfo");
        v53.c cVar = (v53.c) parseFrom;
        v53.m mVar = cVar.f433332f;
        if (mVar != null && (str = mVar.f433349e) != null && !r26.n0.B(str, "20008", false)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LAST_SAVED_MSG_TYPE_INT, java.lang.Integer.valueOf(cVar.f433332f.f433348d));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LAST_SAVED_EXTERN_INFO_STRING, cVar.f433332f.f433349e);
        }
        localSessionInfo.field_sessionId = str2;
        localSessionInfo.field_selfUserName = r17;
        localSessionInfo.field_talker = s17;
        localSessionInfo.field_extInfo = cVar;
        com.tencent.mars.xlog.Log.i(this.f256567h, "[beforeProcessAddMsg] svrMsgId=" + rawBypMsg.f388826d.f377568r + " isSender=" + z17 + " msgType=" + rawBypMsg.f388826d.f377560g + " createTime=" + rawBypMsg.f388826d.f377565o + " fromUser=" + g18 + " toUser=" + g17 + " sessionId=" + rawBypMsg.f388827e + ' ');
        return true;
    }
}
