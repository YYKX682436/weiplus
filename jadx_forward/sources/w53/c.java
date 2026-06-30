package w53;

/* loaded from: classes4.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.i {
    public c(java.lang.String str, java.lang.String toUserName, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        v53.h hVar = new v53.h();
        hVar.f514871d = str;
        hVar.f514872e = toUserName;
        hVar.f514873f = i17;
        hVar.f514874g = gVar;
        lVar.f152197a = hVar;
        lVar.f152198b = new v53.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetChatSessionId", "fromUserName[" + hVar.f514871d + "], toUserName[" + hVar.f514872e + "], scene[" + hVar.f514873f + "], extInfo[" + hVar.f514874g + ']');
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessionid";
        lVar.f152200d = 1103;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetChatSessionId", "onCgiBack, errType = " + i17 + ", errMsg = " + str);
    }
}
