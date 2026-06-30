package db2;

/* loaded from: classes3.dex */
public final class n0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f309609t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309610u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(byte[] bArr, long j17, long j18, java.util.List boxList, java.lang.String anchorUserName, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxList, "boxList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        this.f309609t = boxList;
        this.f309610u = "Finder.CgiFinderGetBoxMsgTips";
        r45.ur1 ur1Var = new r45.ur1();
        ur1Var.f469120d = db2.t4.f309704a.b(11382, qt2Var);
        ur1Var.f469121e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        ur1Var.f469122f = j17;
        ur1Var.f469123g = j18;
        ur1Var.f469124h.addAll(boxList);
        ur1Var.f469125i = anchorUserName;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ur1Var;
        r45.vr1 vr1Var = new r45.vr1();
        vr1Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = vr1Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = vr1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetboxmsgtips";
        lVar.f152200d = 11382;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetBoxMsgTips", "CgiFinderGetBoxMsgTips init ");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.vr1 resp = (r45.vr1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309610u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
