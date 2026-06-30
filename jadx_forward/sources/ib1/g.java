package ib1;

/* loaded from: classes7.dex */
public final class g implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib1.h f371584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f371585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371586d;

    public g(java.lang.String str, ib1.h hVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f371583a = str;
        this.f371584b = hVar;
        this.f371585c = i17;
        this.f371586d = lVar;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + this.f371583a + ", result: " + mVar, new java.lang.Object[0]);
        int i17 = mVar.f425571a;
        int i18 = this.f371585c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371586d;
        ib1.h hVar = this.f371584b;
        if (i17 != 0) {
            lVar.a(i18, hVar.q(mVar.f425572b, mVar.f425573c, kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(i17)))));
            return;
        }
        java.lang.Object obj = mVar.f425574d;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        if (num != null) {
            qb1.a.b(hVar, i18, lVar, kz5.c1.i(new jz5.l("RSSI", num)));
            return;
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", -1));
        hVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        l17.put("errno", 1509000);
        lVar.a(i18, hVar.t("fail:internal error", l17));
    }
}
