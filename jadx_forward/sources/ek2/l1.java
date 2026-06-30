package ek2;

/* loaded from: classes3.dex */
public final class l1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335027u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.k1 f335028v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(long j17, long j18, java.lang.String finderUsername, java.lang.String stockId, int i17, int i18, long j19, ek2.k1 callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stockId, "stockId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335027u = "Finder.CgiFinderLiveIssueCoupon";
        this.f335028v = callback;
        r45.rw1 rw1Var = new r45.rw1();
        rw1Var.set(1, db2.t4.f309704a.a(5941));
        rw1Var.set(4, java.lang.Long.valueOf(j17));
        rw1Var.set(3, java.lang.Long.valueOf(j18));
        rw1Var.set(2, finderUsername);
        rw1Var.set(5, stockId);
        rw1Var.set(6, java.lang.Integer.valueOf(i17));
        rw1Var.set(7, java.lang.Integer.valueOf(i18));
        rw1Var.set(8, java.lang.Long.valueOf(j19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = rw1Var;
        r45.sw1 sw1Var = new r45.sw1();
        sw1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) sw1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = sw1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveissuecoupon";
        lVar.f152200d = 5941;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveIssueCoupon", "init " + rw1Var.m75942xfb822ef2(4) + ", " + rw1Var.m75945x2fec8307(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.sw1 resp = (r45.sw1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335027u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        dk2.v2 v2Var = (dk2.v2) this.f335028v;
        v2Var.getClass();
        pm0.v.X(new dk2.u2(i17, i18, v2Var.f315761a, str, resp));
    }
}
