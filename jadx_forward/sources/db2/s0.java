package db2;

/* loaded from: classes.dex */
public final class s0 extends az2.j {
    public s0(long j17, int i17, java.lang.String str) {
        super(null, null, 3, null);
        r45.f61 f61Var = new r45.f61();
        f61Var.set(3, str);
        f61Var.set(1, java.lang.Long.valueOf(j17));
        f61Var.set(2, java.lang.Integer.valueOf(i17));
        r45.g61 g61Var = new r45.g61();
        g61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) g61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = f61Var;
        lVar.f152198b = g61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfeedhelppromotionedlist";
        lVar.f152200d = 14058;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetFeedHelpPromotionedList", "init lastBuffer:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.g61 resp = (r45.g61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetFeedHelpPromotionedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
