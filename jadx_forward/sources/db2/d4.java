package db2;

/* loaded from: classes.dex */
public final class d4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309476t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g liveCookies, java.lang.String nonceId, java.lang.String str) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCookies, "liveCookies");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        this.f309476t = "Finder.CgiFinderliveGetTeamupGiftPrepare";
        r45.ev1 ev1Var = new r45.ev1();
        ev1Var.set(1, db2.t4.f309704a.a(6863));
        ev1Var.set(2, java.lang.Long.valueOf(j17));
        ev1Var.set(3, java.lang.Long.valueOf(j18));
        ev1Var.set(4, liveCookies);
        ev1Var.set(5, nonceId);
        ev1Var.set(8, str == null ? "" : str);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ev1Var.set(6, xy2.c.e(context));
        gk2.e eVar = dk2.ef.I;
        ev1Var.set(7, java.lang.Integer.valueOf(eVar != null && ((mm2.n0) eVar.a(mm2.n0.class)).f410806r ? 16 : 2));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ev1Var;
        r45.fv1 fv1Var = new r45.fv1();
        fv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fv1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fv1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetteamupgiftprepare";
        lVar.f152200d = 6863;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderliveGetTeamupGiftPrepare", "init feedId:" + j17 + ", liveId:" + j18 + ", object_nonce_id:" + nonceId + ", reddot_id:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fv1 resp = (r45.fv1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309476t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
