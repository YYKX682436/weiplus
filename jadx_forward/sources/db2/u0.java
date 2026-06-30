package db2;

/* loaded from: classes3.dex */
public final class u0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.qm1 f309718t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309719u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(byte[] bArr, r45.qm1 boxId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, java.lang.String anchorUserName, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        this.f309718t = boxId;
        this.f309719u = "Finder.CgiFinderGetFriendBoxLiveMsg";
        r45.o61 o61Var = new r45.o61();
        o61Var.f463506d = db2.t4.f309704a.b(11261, qt2Var);
        o61Var.f463507e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        o61Var.f463508f = boxId;
        o61Var.f463509g = gVar;
        o61Var.f463510h = j17;
        o61Var.f463511i = j18;
        o61Var.f463512m = anchorUserName;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = o61Var;
        r45.p61 p61Var = new r45.p61();
        p61Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = p61Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = p61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfriendboxlivemsg";
        lVar.f152200d = 11261;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetFriendBoxLiveMsg", "CgiFinderGetFriendBoxLiveMsg init ");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.p61 resp = (r45.p61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309719u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
