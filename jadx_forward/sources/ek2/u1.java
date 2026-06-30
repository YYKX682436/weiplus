package ek2;

/* loaded from: classes.dex */
public final class u1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335082u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.t1 f335083v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, long j18, java.lang.String audienceUsername, r45.hx0 finderCmdItem, ek2.t1 callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audienceUsername, "audienceUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderCmdItem, "finderCmdItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335082u = "Finder.CgiFinderLiveModifyShopShelf";
        this.f335083v = callback;
        r45.n12 n12Var = new r45.n12();
        n12Var.set(3, java.lang.Long.valueOf(j17));
        n12Var.set(2, java.lang.Long.valueOf(j18));
        n12Var.set(5, xy2.c.f(this.f97668n));
        n12Var.set(1, db2.t4.f309704a.a(6675));
        n12Var.set(4, finderCmdItem);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = n12Var;
        r45.o12 o12Var = new r45.o12();
        o12Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) o12Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = o12Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivemodshopshelf";
        lVar.f152200d = 6675;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(n12Var.m75942xfb822ef2(3));
        sb6.append(',');
        r45.hx0 hx0Var = (r45.hx0) n12Var.m75936x14adae67(4);
        sb6.append(hx0Var != null ? java.lang.Integer.valueOf(hx0Var.m75939xb282bd08(0)) : null);
        sb6.append(',');
        sb6.append(n12Var.m75945x2fec8307(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModifyShopShelf", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.o12 resp = (r45.o12) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335082u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        dk2.x2 x2Var = (dk2.x2) this.f335083v;
        x2Var.getClass();
        pm0.v.X(new dk2.w2(i17, i18, x2Var.f315831a, resp, str, x2Var.f315832b, x2Var.f315833c));
    }
}
