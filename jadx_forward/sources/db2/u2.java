package db2;

/* loaded from: classes5.dex */
public final class u2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i17, java.lang.String authToken, java.lang.String username, r45.tt4 tt4Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 2, null);
        tt4Var = (i18 & 8) != 0 ? null : tt4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authToken, "authToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.is2 is2Var = new r45.is2();
        is2Var.set(1, java.lang.Integer.valueOf(i17));
        is2Var.set(2, authToken);
        is2Var.set(3, username);
        if (tt4Var != null) {
            is2Var.set(6, tt4Var);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = is2Var;
        r45.js2 js2Var = new r45.js2();
        js2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) js2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = js2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderrealnameverify";
        lVar.f152200d = 9950;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderRealName", "init opType:" + i17 + ", authToken:" + authToken + " username:" + username);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.js2 resp = (r45.js2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderRealName", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
