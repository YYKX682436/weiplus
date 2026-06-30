package ho2;

/* loaded from: classes4.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.cs0 f364400t;

    public e(r45.qt2 qt2Var, java.lang.String str, int i17, int i18, int i19) {
        super(null, null, 3, null);
        r45.cs0 cs0Var = new r45.cs0();
        this.f364400t = cs0Var;
        cs0Var.f453335d = db2.t4.f309704a.b(8732, qt2Var);
        cs0Var.f453336e = str;
        cs0Var.f453337f = i17;
        cs0Var.f453338g = i18;
        cs0Var.f453340i = java.lang.String.valueOf(i19);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cs0Var;
        r45.ds0 ds0Var = new r45.ds0();
        ds0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = ds0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = ds0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindersubscribemembershippaybill";
        lVar.f152200d = 8732;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ds0 resp = (r45.ds0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderFetchSubscribeMembershipPayBillCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " inletSource=" + this.f364400t.f453340i);
    }
}
