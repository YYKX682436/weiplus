package db2;

/* loaded from: classes.dex */
public final class o1 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r45.qt2 qt2Var, java.lang.String str, java.lang.String jumpInfoNativeByPassInfo) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoNativeByPassInfo, "jumpInfoNativeByPassInfo");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u91 u91Var = new r45.u91();
        u91Var.set(1, db2.t4.f309704a.b(8755, qt2Var));
        u91Var.set(2, str);
        u91Var.set(4, jumpInfoNativeByPassInfo);
        lVar.f152197a = u91Var;
        r45.v91 v91Var = new r45.v91();
        v91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v91Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetrecommendreasonheader";
        lVar.f152200d = 16734;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetRecommendReasonHeader", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v91 resp = (r45.v91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetRecommendReasonHeader", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
    }
}
