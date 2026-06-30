package w53;

/* loaded from: classes.dex */
public final class d extends com.p314xaae8f345.mm.p944x882e457a.i {
    public d(java.util.LinkedList userNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        v53.j jVar = new v53.j();
        jVar.f514877d = userNameList;
        lVar.f152197a = jVar;
        lVar.f152198b = new v53.k();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatuserinfo";
        lVar.f152200d = 1111;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetChatUserInfo", "errType = " + i17 + ", errCode = " + i18);
    }
}
