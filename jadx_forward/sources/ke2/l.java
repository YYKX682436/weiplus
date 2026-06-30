package ke2;

/* loaded from: classes.dex */
public final class l extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388496t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.k f388497u;

    public l(int i17, long j17, ke2.k kVar) {
        super(null, null, 3, null);
        this.f388496t = "Finder.CgiFinderLiveClearAliasRole";
        this.f388497u = kVar;
        r45.pn1 pn1Var = new r45.pn1();
        pn1Var.set(1, db2.t4.f309704a.a(4020));
        pn1Var.set(2, java.lang.Integer.valueOf(i17));
        pn1Var.m75942xfb822ef2(3);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pn1Var;
        r45.qn1 qn1Var = new r45.qn1();
        qn1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qn1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = qn1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveclearaliasrole";
        lVar.f152200d = 4020;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init live_identity:");
        r45.kv0 kv0Var = (r45.kv0) pn1Var.m75936x14adae67(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(6)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveClearAliasRole", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.qn1 resp = (r45.qn1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388496t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.k kVar = this.f388497u;
        if (i17 == 0 && i18 == 0) {
            if (kVar != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p9(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q9) kVar).f198882a));
            }
        } else if (kVar != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o9(i18, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q9) kVar).f198882a));
        }
    }
}
