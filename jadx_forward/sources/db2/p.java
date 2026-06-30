package db2;

/* loaded from: classes5.dex */
public final class p extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17, java.lang.String str, int i17, java.lang.String reportData, java.lang.String reportBypassData, r45.cl2 cl2Var, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        java.util.LinkedList m75941xfb821914;
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportBypassData, "reportBypassData");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadreport";
        lVar.f152200d = 9935;
        r45.xt0 xt0Var = new r45.xt0();
        db2.t4 t4Var = db2.t4.f309704a;
        xt0Var.set(1, t4Var.b(9935, qt2Var));
        xt0Var.set(2, java.lang.Integer.valueOf(i17));
        xt0Var.set(3, reportData);
        xt0Var.set(4, reportBypassData);
        xt0Var.set(5, cl2Var);
        t4Var.h((r45.kv0) xt0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = xt0Var;
        r45.yt0 yt0Var = new r45.yt0();
        yt0Var.set(0, new r45.ie());
        lVar.f152198b = yt0Var;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderAdReport ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(reportData);
        sb6.append(", sessionBuffer: ");
        r45.kv0 kv0Var = (r45.kv0) xt0Var.m75936x14adae67(1);
        sb6.append((kv0Var == null || (m75941xfb821914 = kv0Var.m75941xfb821914(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(m75941xfb821914)) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdReport", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.yt0 resp = (r45.yt0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdReport", "CgiFinderAdReport onCgiEnd errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str + ' ');
    }
}
