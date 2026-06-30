package db2;

/* loaded from: classes.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309414t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g liveCookies, java.lang.String comment_msg, java.lang.String finderUsername) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCookies, "liveCookies");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment_msg, "comment_msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f309414t = "Finder.CgiAudienceSendCommentToReserveGame";
        r45.pb pbVar = new r45.pb();
        pbVar.set(1, db2.t4.f309704a.a(4226));
        pbVar.set(3, java.lang.Long.valueOf(j17));
        pbVar.set(4, java.lang.Long.valueOf(j18));
        pbVar.set(6, liveCookies);
        pbVar.set(5, comment_msg);
        pbVar.set(2, finderUsername);
        gk2.e eVar = dk2.ef.I;
        pbVar.set(7, java.lang.Integer.valueOf(eVar != null && ((mm2.n0) eVar.a(mm2.n0.class)).f410806r ? 16 : 2));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pbVar;
        r45.qb qbVar = new r45.qb();
        qbVar.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qbVar.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = qbVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/audiencesendcommenttoreservegame";
        lVar.f152200d = 4226;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiAudienceSendCommentToReserveGame", "init feedId:" + j17 + ", liveId:" + j18 + ", comment_msg:" + comment_msg + ", liveCookies size:" + liveCookies.f273689a.length);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.qb resp = (r45.qb) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309414t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
