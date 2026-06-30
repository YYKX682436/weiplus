package wt1;

/* loaded from: classes8.dex */
public class g0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public float f530813d = -85.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f530814e = -1000.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f530815f = 0;

    public void a(java.lang.String str, java.lang.String str2, int i17) {
        if ((java.lang.System.currentTimeMillis() / 1000) - this.f530815f > 1800) {
            this.f530813d = -85.0f;
            this.f530814e = -1000.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
        }
        if (this.f530813d == -85.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
        }
        if (this.f530814e == -1000.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
        }
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.e.f33379x366c91de, this);
        gm0.j1.n().f354821b.g(new xt1.c0(this.f530813d, this.f530814e, str, str2, i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.e.f33379x366c91de, this);
    }
}
