package ib1;

/* loaded from: classes7.dex */
public final class o implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib1.p f371606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f371607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371608d;

    public o(java.lang.String str, ib1.p pVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f371605a = str;
        this.f371606b = pVar;
        this.f371607c = i17;
        this.f371608d = lVar;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + this.f371605a + ", result: " + mVar, new java.lang.Object[0]);
        int i17 = mVar.f425571a;
        int i18 = this.f371607c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371608d;
        ib1.p pVar = this.f371606b;
        if (i17 == 0) {
            qb1.a.b(pVar, i18, lVar, null);
        } else {
            lVar.a(i18, pVar.q(mVar.f425572b, mVar.f425573c, kz5.c1.l(new jz5.l("errCode", java.lang.Integer.valueOf(i17)))));
        }
    }
}
