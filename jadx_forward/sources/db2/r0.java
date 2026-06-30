package db2;

/* loaded from: classes.dex */
public final class r0 extends az2.j {
    public r0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(null, null, 3, null);
        r45.m51 m51Var = new r45.m51();
        m51Var.set(1, db2.t4.f309704a.b(7394, qt2Var));
        m51Var.set(2, gVar);
        r45.n51 n51Var = new r45.n51();
        n51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) n51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = m51Var;
        lVar.f152198b = n51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcourselist";
        lVar.f152200d = 7394;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetCollectionList", "init lastBuffer:" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.n51 resp = (r45.n51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        java.util.LinkedList<r45.uz0> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCourse_info(...)");
        for (r45.uz0 uz0Var : m75941xfb821914) {
            cu2.g0 g0Var = cu2.g0.f303937a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uz0Var);
            g0Var.c(g0Var.e(uz0Var));
        }
    }
}
