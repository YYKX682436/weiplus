package ke2;

/* loaded from: classes.dex */
public final class r extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388518t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(java.lang.String appid, int i17, java.lang.String ticket, int i18, int i19, java.lang.String gameUserId) {
        super(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameUserId, "gameUserId");
        this.f388518t = "Finder.CgiFinderLiveGetAuthorization";
        r45.or1 or1Var = new r45.or1();
        or1Var.set(1, db2.t4.f309704a.a(4261));
        or1Var.set(2, xy2.c.f(this.f97668n));
        or1Var.set(3, wo.w0.k());
        or1Var.set(4, ticket);
        or1Var.set(5, appid);
        or1Var.set(6, java.lang.Integer.valueOf(i17));
        or1Var.set(7, java.lang.Integer.valueOf(i18));
        or1Var.set(8, java.lang.Integer.valueOf(i19));
        or1Var.set(9, gameUserId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = or1Var;
        r45.pr1 pr1Var = new r45.pr1();
        pr1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pr1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = pr1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        lVar.f152200d = 4261;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetAuthorization", "init " + appid + ", " + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pr1 resp = (r45.pr1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388518t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
