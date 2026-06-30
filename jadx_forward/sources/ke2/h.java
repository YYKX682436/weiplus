package ke2;

/* loaded from: classes.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388486t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.jl1 f388487u;

    public h(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        this.f388486t = "CgiFinderLiveAudienceOpFanClub";
        r45.jl1 jl1Var = new r45.jl1();
        this.f388487u = jl1Var;
        jl1Var.set(1, db2.t4.f309704a.a(4143));
        jl1Var.set(2, xy2.c.f(qt2Var));
        jl1Var.set(3, java.lang.Integer.valueOf(i17));
        jl1Var.set(4, gVar);
        jl1Var.set(5, java.lang.Long.valueOf(j17));
        jl1Var.set(6, java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = jl1Var;
        r45.kl1 kl1Var = new r45.kl1();
        kl1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) kl1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = kl1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveaudienceopfanclub";
        lVar.f152200d = 4143;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveAudienceOpFanClub", "init " + jl1Var.m75945x2fec8307(2) + ',' + jl1Var.m75939xb282bd08(3) + ',' + jl1Var.m75934xbce7f2f(4) + ',' + jl1Var.m75942xfb822ef2(5) + ',' + jl1Var.m75942xfb822ef2(6));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kl1 resp = (r45.kl1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388486t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("op_code", java.lang.String.valueOf(this.f388487u.m75939xb282bd08(3))));
    }
}
