package db2;

/* loaded from: classes.dex */
public final class e0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.qt2 qt2Var, java.lang.String posterFinderUsername, long j17, java.lang.String sourceFeedId, int i17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterFinderUsername, "posterFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFeedId, "sourceFeedId");
        r45.o11 o11Var = new r45.o11();
        o11Var.set(1, db2.t4.f309704a.b(13468, qt2Var));
        o11Var.set(2, posterFinderUsername);
        o11Var.set(3, java.lang.Long.valueOf(j17));
        o11Var.set(4, sourceFeedId);
        o11Var.set(5, java.lang.Integer.valueOf(i17));
        r45.p11 p11Var = new r45.p11();
        p11Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) p11Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = o11Var;
        lVar.f152198b = p11Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdramapurchase";
        lVar.f152200d = 13468;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.p11 resp = (r45.p11) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderDramaPurchase", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
