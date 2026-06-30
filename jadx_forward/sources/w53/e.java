package w53;

/* loaded from: classes4.dex */
public final class e extends com.p314xaae8f345.mm.p944x882e457a.i {
    public e(java.lang.String userName, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        v53.p pVar = new v53.p();
        v53.a aVar = new v53.a();
        aVar.f514854d = userName;
        aVar.f514855e = z17;
        pVar.f514891d = aVar;
        pVar.f514892e = z18;
        lVar.f152197a = pVar;
        lVar.f152198b = new v53.q();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setblacklist";
        lVar.f152200d = 1102;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSetBlackList", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
