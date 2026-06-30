package bq;

/* loaded from: classes5.dex */
public final class r1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.util.LinkedList reqItems) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqItems, "reqItems");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f309704a.a(6218));
        s81Var.set(2, reqItems);
        s81Var.set(4, g92.b.f351302e.U());
        lVar.f152197a = s81Var;
        lVar.f152198b = new r45.t81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        lVar.f152200d = 6218;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSessionStatusCGI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t81 resp = (r45.t81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append(',');
        sb6.append(i18);
        g0Var.d(20492, 7L, sb6.toString());
        g0Var.C(1473L, 7L, 1L);
    }
}
