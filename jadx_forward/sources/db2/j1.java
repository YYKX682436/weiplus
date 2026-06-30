package db2;

/* loaded from: classes2.dex */
public final class j1 extends az2.j {
    public j1(long j17, long j18) {
        super(null, null, 3, null);
        r45.c91 c91Var = new r45.c91();
        c91Var.set(1, db2.t4.f309704a.b(8577, this.f97668n));
        c91Var.set(2, java.lang.Long.valueOf(j17));
        c91Var.set(3, java.lang.Long.valueOf(j18));
        c91Var.set(4, (r45.gx4) ((jz5.n) kr2.q.f392850h.a().f392858g).mo141623x754a37bb());
        r45.d91 d91Var = new r45.d91();
        d91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d91Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = c91Var;
        lVar.f152198b = d91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetnpssurvey";
        lVar.f152200d = 8577;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNpsSurvey", "init objectId = " + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d91 resp = (r45.d91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNpsSurvey", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
