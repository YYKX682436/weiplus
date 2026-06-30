package ke2;

/* loaded from: classes3.dex */
public final class o0 extends az2.j {

    /* renamed from: v, reason: collision with root package name */
    public static final ke2.n0 f388509v = new ke2.n0(null);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388510t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f388511u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(java.lang.String cgiUri, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req, r45.ld2 baseRequest, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUri, "cgiUri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRequest, "baseRequest");
        this.f388510t = cgiUri;
        this.f388511u = "Finder.CgiFinderLiveTransferBuffer";
        r45.md2 md2Var = new r45.md2();
        md2Var.set(1, db2.t4.f309704a.b(i17, qt2Var));
        md2Var.set(2, baseRequest);
        md2Var.set(3, hc2.b.a(req));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = md2Var;
        r45.nd2 nd2Var = new r45.nd2();
        nd2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) nd2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = nd2Var;
        lVar.f152199c = cgiUri;
        lVar.f152200d = i17;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveTransferBuffer", "init cgiUri:" + cgiUri + ", cgiNumber:" + i17 + ", baseRequest:" + pm0.b0.g(baseRequest));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.nd2 resp = (r45.nd2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388511u, "[onCgiBack] cgiUri:" + this.f388510t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
