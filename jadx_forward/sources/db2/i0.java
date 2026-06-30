package db2;

/* loaded from: classes.dex */
public final class i0 extends az2.j {
    public i0(long j17, int i17) {
        super(null, null, 3, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u21 u21Var = new r45.u21();
        u21Var.set(1, db2.t4.f309704a.b(20577, this.f97668n));
        u21Var.set(2, java.lang.Long.valueOf(j17));
        u21Var.set(3, java.lang.Integer.valueOf(i17));
        lVar.f152197a = u21Var;
        r45.v21 v21Var = new r45.v21();
        v21Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v21Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v21Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfavpostplay";
        lVar.f152200d = 20577;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderFavPostPlay", "CgiFinderFavPostPlay topicId=" + j17 + ", favActionId=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v21 resp = (r45.v21) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderFavPostPlay", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
    }
}
