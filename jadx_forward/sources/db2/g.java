package db2;

/* loaded from: classes.dex */
public final class g extends com.p314xaae8f345.mm.p944x882e457a.i {
    public g(java.lang.String username, java.lang.String msgSessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSessionId, "msgSessionId");
        r45.f11 f11Var = new r45.f11();
        f11Var.set(1, db2.t4.f309704a.a(18657));
        f11Var.set(2, username);
        f11Var.set(3, msgSessionId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = f11Var;
        r45.g11 g11Var = new r45.g11();
        g11Var.set(0, new r45.ie());
        lVar.f152198b = g11Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdelpersonalmsg";
        lVar.f152200d = 18657;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.CgiDelPrivateMsg", "CgiDelPrivateMsg init username = " + username + ", sessionId = " + msgSessionId);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.CgiDelPrivateMsg", "CgiDelPrivateMsg back, errType: " + i17 + ", errCode: " + i18);
    }
}
