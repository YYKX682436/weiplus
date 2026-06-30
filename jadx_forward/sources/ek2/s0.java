package ek2;

/* loaded from: classes10.dex */
public final class s0 extends ek2.g0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f335063v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335064u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ek2.t0 params) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f335064u = "CgiFinderLiveCreateLottery";
        r45.fo1 fo1Var = new r45.fo1();
        fo1Var.set(2, java.lang.Long.valueOf(params.f335066a));
        fo1Var.set(3, java.lang.Long.valueOf(params.f335067b));
        java.lang.String str = params.f335068c;
        fo1Var.set(4, java.lang.Long.valueOf(pm0.v.Z(str)));
        fo1Var.set(5, java.lang.Integer.valueOf(params.f335069d));
        fo1Var.set(6, params.f335070e);
        r45.xy1 xy1Var = new r45.xy1();
        xy1Var.set(0, java.lang.Integer.valueOf(params.f335071f));
        xy1Var.set(1, params.f335072g);
        xy1Var.set(3, params.f335080o);
        fo1Var.set(7, xy1Var);
        fo1Var.set(8, java.lang.Integer.valueOf(params.f335074i));
        fo1Var.set(9, java.lang.Integer.valueOf(params.f335073h));
        r45.kv0 a17 = db2.t4.f309704a.a(6645);
        if (zl2.r4.f555483a.w1()) {
            a17.set(6, 3);
        }
        fo1Var.set(1, a17);
        fo1Var.set(10, str);
        fo1Var.set(11, java.lang.Long.valueOf(params.f335075j));
        fo1Var.set(12, params.f335076k);
        fo1Var.set(13, params.f335077l);
        fo1Var.set(14, java.lang.Integer.valueOf(params.f335078m));
        fo1Var.set(15, params.f335079n);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fo1Var;
        r45.go1 go1Var = new r45.go1();
        go1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) go1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = go1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivecreatelottery";
        lVar.f152200d = 6645;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveLottery,init liveId:");
        sb6.append(fo1Var.m75942xfb822ef2(2));
        sb6.append(",objectId:");
        sb6.append(fo1Var.m75942xfb822ef2(3));
        sb6.append(",nonceId:");
        sb6.append(fo1Var.m75945x2fec8307(10));
        sb6.append(",lotteryDuration:");
        sb6.append(fo1Var.m75939xb282bd08(5));
        sb6.append(",lotteryDescription:");
        sb6.append(fo1Var.m75945x2fec8307(6));
        sb6.append(",lotteryAttendType:");
        r45.xy1 xy1Var2 = (r45.xy1) fo1Var.m75936x14adae67(7);
        sb6.append(xy1Var2 != null ? java.lang.Integer.valueOf(xy1Var2.m75939xb282bd08(0)) : null);
        sb6.append(",attendWording:");
        r45.xy1 xy1Var3 = (r45.xy1) fo1Var.m75936x14adae67(7);
        sb6.append(xy1Var3 != null ? xy1Var3.m75945x2fec8307(1) : null);
        sb6.append(",lotteryWinnerCnt:");
        sb6.append(fo1Var.m75939xb282bd08(8));
        sb6.append(",opType:");
        sb6.append(fo1Var.m75939xb282bd08(9));
        sb6.append(",setting_flag:");
        sb6.append(fo1Var.m75942xfb822ef2(11));
        sb6.append(",claim_method:");
        r45.yy1 yy1Var = (r45.yy1) fo1Var.m75936x14adae67(13);
        sb6.append(yy1Var != null ? java.lang.Integer.valueOf(yy1Var.m75939xb282bd08(0)) : null);
        sb6.append('-');
        r45.yy1 yy1Var2 = (r45.yy1) fo1Var.m75936x14adae67(13);
        sb6.append(yy1Var2 != null ? yy1Var2.m75945x2fec8307(1) : null);
        sb6.append(",lottery_method_id:");
        sb6.append(fo1Var.m75939xb282bd08(14));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveCreateLottery", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.go1 resp = (r45.go1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335064u, "FinderLiveLottery [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ",result:" + pm0.b0.g(resp));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
