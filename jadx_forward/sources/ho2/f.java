package ho2;

/* loaded from: classes2.dex */
public final class f extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f364401t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 3, null);
        qt2Var = (i18 & 1) != 0 ? null : qt2Var;
        gVar = (i18 & 2) != 0 ? null : gVar;
        str = (i18 & 4) != 0 ? null : str;
        r45.i81 i81Var = new r45.i81();
        i81Var.f458342d = db2.t4.f309704a.b(10305, qt2Var);
        i81Var.f458344f = gVar;
        i81Var.f458343e = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = i81Var;
        r45.j81 j81Var = new r45.j81();
        j81Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = j81Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = j81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmembercardlist";
        lVar.f152200d = 10305;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j81 resp = (r45.j81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMemberCardListCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
