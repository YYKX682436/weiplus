package ek2;

/* loaded from: classes.dex */
public final class e2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334975u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.d2 f334976v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(long j17, long j18, java.lang.String str, java.lang.String audienceUsername, long j19, int i17, int i18, int i19, r45.qt2 qt2Var, int i27, ek2.d2 d2Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audienceUsername, "audienceUsername");
        this.f334975u = "Finder.CgiFinderLivePromoteProduct";
        this.f334976v = d2Var;
        r45.g52 g52Var = new r45.g52();
        g52Var.set(3, java.lang.Long.valueOf(j17));
        g52Var.set(4, java.lang.Long.valueOf(j18));
        g52Var.set(2, audienceUsername);
        g52Var.set(5, java.lang.Long.valueOf(j19));
        r45.y46 y46Var = new r45.y46();
        y46Var.set(0, java.lang.Long.valueOf(j19));
        y46Var.set(1, java.lang.Integer.valueOf(i27));
        g52Var.set(14, y46Var);
        g52Var.set(6, java.lang.Integer.valueOf(i18));
        g52Var.set(8, java.lang.Integer.valueOf(i17));
        g52Var.set(13, java.lang.Integer.valueOf(i19));
        db2.t4 t4Var = db2.t4.f309704a;
        g52Var.set(1, t4Var.a(5800));
        t4Var.h((r45.kv0) g52Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(j18), str)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = g52Var;
        r45.h52 h52Var = new r45.h52();
        h52Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h52Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h52Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivepromoteproduct";
        lVar.f152200d = 5800;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLivePromoteProduct", "CgiFinderLivePromoteProduct init " + g52Var.m75942xfb822ef2(3) + ',' + g52Var.m75945x2fec8307(2) + ",productId:" + g52Var.m75942xfb822ef2(5) + ",ad_id:" + g52Var.m75942xfb822ef2(9) + ",promoteType:" + g52Var.m75939xb282bd08(8) + ",scene:" + g52Var.m75939xb282bd08(6));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h52 resp = (r45.h52) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334975u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.d2 d2Var = this.f334976v;
        if (d2Var != null) {
            d2Var.a(i17, i18, str, resp);
        }
    }
}
