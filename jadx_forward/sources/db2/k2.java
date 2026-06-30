package db2;

/* loaded from: classes.dex */
public final class k2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309571t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(java.lang.String poiId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        this.f309571t = poiId;
        r45.ll3 ll3Var = new r45.ll3();
        ll3Var.set(1, poiId);
        r45.ml3 ml3Var = new r45.ml3();
        ml3Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ml3Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ll3Var;
        lVar.f152198b = ml3Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmbizsec/getpoiinfo";
        lVar.f152200d = 28601;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderPOIServiceInfo", "init CgiPoiServiceInfo poiId:" + poiId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ml3 resp = (r45.ml3) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderPOIServiceInfo", "[onCgiBack] poiId:" + this.f309571t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
