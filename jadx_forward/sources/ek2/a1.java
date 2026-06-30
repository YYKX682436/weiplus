package ek2;

/* loaded from: classes3.dex */
public final class a1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.z0 f334941u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334942v;

    /* renamed from: w, reason: collision with root package name */
    public int f334943w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(int i17, java.lang.String finderUsername, long j17, long j18, byte[] bArr, java.lang.String nonceId, java.lang.String lotteryId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, ek2.z0 z0Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        this.f334941u = z0Var;
        this.f334942v = "CgiFinderLiveGetLotteryRecord";
        r45.gt1 gt1Var = new r45.gt1();
        gt1Var.set(2, finderUsername);
        gt1Var.set(3, java.lang.Long.valueOf(j17));
        gt1Var.set(4, java.lang.Long.valueOf(j18));
        gt1Var.set(5, java.lang.Long.valueOf(pm0.v.Z(nonceId)));
        gt1Var.set(6, lotteryId);
        gt1Var.set(7, gVar);
        gt1Var.set(1, db2.t4.f309704a.a(5258));
        gt1Var.set(8, nonceId);
        gt1Var.set(9, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        gt1Var.set(10, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = gt1Var;
        r45.ht1 ht1Var = new r45.ht1();
        ht1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ht1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ht1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetlotteryrecord";
        lVar.f152200d = 5258;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveGetLotteryRecord", "init scene:" + gt1Var.m75939xb282bd08(10) + ",finderUsername:" + gt1Var.m75945x2fec8307(2) + ",liveId:" + gt1Var.m75942xfb822ef2(3) + ",objectId:" + gt1Var.m75942xfb822ef2(4) + ",objectNonceId:" + gt1Var.m75945x2fec8307(8) + ",lotteryId:" + gt1Var.m75945x2fec8307(6) + ",lastBuffer:" + gt1Var.m75934xbce7f2f(7) + ",live_cookies:" + gt1Var.m75934xbce7f2f(9));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ht1 resp = (r45.ht1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f334942v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "result:" + pm0.b0.g(resp));
        }
        ek2.z0 z0Var = this.f334941u;
        if (z0Var != null) {
            z0Var.a(i17, i18, str, resp);
        }
    }
}
