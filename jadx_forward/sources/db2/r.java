package db2;

/* loaded from: classes.dex */
public final class r extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String finderUsername, int i17, int i18, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        r45.fu0 fu0Var = new r45.fu0();
        fu0Var.set(1, db2.t4.f309704a.b(14597, qt2Var));
        fu0Var.set(2, finderUsername);
        fu0Var.set(3, java.lang.Integer.valueOf(i17));
        fu0Var.set(4, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fu0Var;
        r45.gu0 gu0Var = new r45.gu0();
        gu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gu0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = gu0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderapplystorepromotionrights";
        lVar.f152200d = 14597;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderApplyStorePromotionRights", "[init] finderUsername:" + finderUsername + " permissionType:" + i17 + ", operType:" + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gu0 resp = (r45.gu0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderApplyStorePromotionRights", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        g92.b.f351302e.M0(3).l();
    }
}
