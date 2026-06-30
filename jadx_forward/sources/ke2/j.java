package ke2;

/* loaded from: classes.dex */
public final class j extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388489t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.i f388490u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.fv0 f388491v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, long j18, java.lang.String audienceUsername, int i17, boolean z17, ke2.i callback) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audienceUsername, "audienceUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f388489t = "Finder.CgiFinderLiveBanComment";
        this.f388490u = callback;
        r45.fv0 fv0Var = new r45.fv0();
        this.f388491v = fv0Var;
        fv0Var.set(2, java.lang.Long.valueOf(j17));
        fv0Var.set(3, java.lang.Long.valueOf(j18));
        fv0Var.set(4, audienceUsername);
        fv0Var.set(5, java.lang.Integer.valueOf(i17));
        fv0Var.set(6, java.lang.Boolean.valueOf(z17));
        fv0Var.set(1, db2.t4.f309704a.a(6656));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fv0Var;
        r45.gv0 gv0Var = new r45.gv0();
        gv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gv0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = gv0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderbanlivecomment";
        lVar.f152200d = 6656;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveBanComment", "CgiFinderLiveBanComment init " + fv0Var.m75942xfb822ef2(2) + ',' + fv0Var.m75945x2fec8307(4));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gv0 resp = (r45.gv0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388489t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        r45.fv0 fv0Var = this.f388491v;
        ke2.i iVar = this.f388490u;
        if (i17 == 0 && i18 == 0) {
            iVar.b(fv0Var.m75933x41a8a7f2(6));
        } else {
            iVar.a(i17, i18, str, fv0Var.m75933x41a8a7f2(6));
        }
    }
}
