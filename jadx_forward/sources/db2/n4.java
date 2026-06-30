package db2;

/* loaded from: classes2.dex */
public final class n4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f309632t;

    public /* synthetic */ n4(long j17, java.lang.String str, java.lang.String str2, int i17, r45.qt2 qt2Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, str, str2, (i18 & 8) != 0 ? 0 : i17, qt2Var);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tj4 resp = (r45.tj4) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(long j17, java.lang.String username, java.lang.String videoNonceId, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoNonceId, "videoNonceId");
        this.f309632t = j17;
        r45.sj4 sj4Var = new r45.sj4();
        r45.pj4 pj4Var = new r45.pj4();
        pj4Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        if (qt2Var != null) {
            pj4Var.set(1, java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
        }
        sj4Var.set(1, pj4Var);
        sj4Var.set(2, java.lang.Long.valueOf(j17));
        sj4Var.set(3, username);
        sj4Var.set(4, videoNonceId);
        sj4Var.set(6, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/megavideodetail";
        lVar.f152200d = 4195;
        lVar.f152197a = sj4Var;
        lVar.f152198b = new r45.tj4();
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiMegaVideoGetDetail", "videoId " + j17 + " username " + username);
    }
}
