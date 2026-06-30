package w53;

/* loaded from: classes.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        v53.d dVar = new v53.d();
        dVar.f514866d = userName;
        lVar.f152197a = dVar;
        lVar.f152198b = new v53.e();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getblacklist";
        lVar.f152200d = 2982;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetBlackList", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
