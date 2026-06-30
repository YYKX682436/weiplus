package db2;

/* loaded from: classes.dex */
public final class k1 extends az2.j {
    public k1(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(null, null, 3, null);
        r45.e91 e91Var = new r45.e91();
        e91Var.set(1, db2.t4.f309704a.b(14144, qt2Var));
        e91Var.set(2, gVar);
        r45.f91 f91Var = new r45.f91();
        f91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f91Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = e91Var;
        lVar.f152198b = f91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetpaidcollectionlist";
        lVar.f152200d = 14144;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetCollectionList", "init lastBuffer:" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.f91 resp = (r45.f91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        java.util.LinkedList<r45.do2> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCollection_info(...)");
        for (r45.do2 do2Var : m75941xfb821914) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.m75936x14adae67(0);
            if (uz0Var != null) {
                cu2.g0 g0Var = cu2.g0.f303937a;
                g0Var.c(g0Var.e(uz0Var));
            }
            r45.n11 n11Var = (r45.n11) do2Var.m75936x14adae67(1);
            if (n11Var != null) {
                cu2.g0 g0Var2 = cu2.g0.f303937a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0 ak0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ak0();
                ak0Var.f65975xe4b3ebd0 = n11Var.m75942xfb822ef2(0);
                ak0Var.f65974x9255f2b0 = n11Var;
                ak0Var.f65973x4d9967ce = new r45.uz0();
                g0Var2.c(ak0Var);
            }
        }
    }
}
