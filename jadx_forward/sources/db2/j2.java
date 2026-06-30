package db2;

/* loaded from: classes.dex */
public final class j2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309557t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String poiId, int i17, int i18, java.lang.Long l17, java.lang.String str, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        this.f309557t = poiId;
        r45.po2 po2Var = new r45.po2();
        po2Var.set(2, poiId);
        po2Var.set(3, java.lang.Integer.valueOf(i18));
        db2.t4 t4Var = db2.t4.f309704a;
        po2Var.set(1, t4Var.b(19576, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) po2Var.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i17));
        }
        po2Var.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (l17 != null && l17.longValue() != 0) {
            t4Var.h((r45.kv0) po2Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), l17, str)));
        }
        r45.qo2 qo2Var = new r45.qo2();
        qo2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qo2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = po2Var;
        lVar.f152198b = qo2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpoibasicinfo";
        lVar.f152200d = 19576;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderPOIBasicInfo", "init CgiPoiBasicInfo poiId:" + poiId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.qo2 resp = (r45.qo2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderPOIBasicInfo", "[onCgiBack] poiId:" + this.f309557t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
