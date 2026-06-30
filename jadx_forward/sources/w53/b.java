package w53;

/* loaded from: classes.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {
    public b(java.util.LinkedList sessionIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionIdList, "sessionIdList");
        v53.f fVar = new v53.f();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        fVar.f514869d = sessionIdList;
        lVar.f152197a = fVar;
        lVar.f152198b = new v53.g();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessiondata";
        lVar.f152200d = 1910;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetChatSessionData", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
