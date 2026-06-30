package db2;

/* loaded from: classes3.dex */
public final class l extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, java.lang.String str, int i17, java.lang.String reportData, java.lang.String bypassData) {
        super(null, null, 3, null);
        java.util.LinkedList m75941xfb821914;
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8083;
        r45.lt0 lt0Var = new r45.lt0();
        lt0Var.set(2, reportData);
        lt0Var.set(3, bypassData);
        db2.t4 t4Var = db2.t4.f309704a;
        lt0Var.set(1, t4Var.a(8083));
        t4Var.h((r45.kv0) lt0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = lt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f152198b = mt0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadcommentreport";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport init reportData: ".concat(reportData));
        r45.kv0 kv0Var = (r45.kv0) lt0Var.m75936x14adae67(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport sessionBuffer: ".concat((kv0Var == null || (m75941xfb821914 = kv0Var.m75941xfb821914(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(m75941xfb821914)) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.mt0 resp = (r45.mt0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
