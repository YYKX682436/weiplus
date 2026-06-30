package db2;

/* loaded from: classes.dex */
public final class m2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m2(int i17, java.lang.String reportData, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4093;
        r45.ho2 ho2Var = new r45.ho2();
        ho2Var.set(1, java.lang.Integer.valueOf(i17));
        ho2Var.set(2, reportData);
        lVar.f152197a = ho2Var;
        r45.io2 io2Var = new r45.io2();
        io2Var.set(0, new r45.ie());
        lVar.f152198b = io2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpassreport";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPassReport", "CgiFinderPassReport " + i17 + ", " + reportData);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.io2 resp = (r45.io2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPassReport", "CgiFinderPassReport onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
