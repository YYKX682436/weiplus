package db2;

/* loaded from: classes.dex */
public final class e2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309488t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(long j17, long j18, java.lang.String nonceId, java.lang.String invitation_id, int i17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invitation_id, "invitation_id");
        this.f309488t = "Finder.CgiFinderLiveRespondGameInvitation";
        r45.v72 v72Var = new r45.v72();
        v72Var.set(1, db2.t4.f309704a.a(6625));
        v72Var.set(3, java.lang.Long.valueOf(j17));
        v72Var.set(2, java.lang.Long.valueOf(j18));
        v72Var.set(4, nonceId);
        v72Var.set(6, invitation_id);
        v72Var.set(5, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = v72Var;
        r45.w72 w72Var = new r45.w72();
        w72Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) w72Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = w72Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliverespondgameinvitation";
        lVar.f152200d = 6625;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveRespondGameInvitation", "init feedId:" + j17 + ", liveId:" + j18 + ", object_nonce_id:" + nonceId + ", linvitation_id:" + invitation_id);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.w72 resp = (r45.w72) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309488t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
