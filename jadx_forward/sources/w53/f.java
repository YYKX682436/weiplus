package w53;

/* loaded from: classes.dex */
public final class f extends com.p314xaae8f345.mm.p944x882e457a.i {
    public f(java.lang.String sessionId, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        v53.r rVar = new v53.r();
        rVar.f514893d = sessionId;
        rVar.f514894e = j17;
        rVar.f514895f = z17;
        lVar.f152197a = rVar;
        lVar.f152198b = new v53.s();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setchatsessiondata";
        lVar.f152200d = 1910;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSetChatSessionData", "onCgiBack, errType = " + i17 + ", errMsg = " + str);
    }
}
