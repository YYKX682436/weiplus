package ek2;

/* loaded from: classes.dex */
public final class h3 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f334993o;

    public h3(r45.qt2 qt2Var, long j17) {
        super(qt2Var);
        this.f334993o = "Finder.FinderGetLiveH5UrlCGI";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g71 g71Var = new r45.g71();
        g71Var.set(1, db2.t4.f309704a.b(21268, qt2Var));
        g71Var.set(2, java.lang.Long.valueOf(j17));
        lVar.f152197a = g71Var;
        r45.h71 h71Var = new r45.h71();
        h71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliveh5url";
        lVar.f152200d = 21268;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetLiveH5UrlCGI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h71 resp = (r45.h71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334993o, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
