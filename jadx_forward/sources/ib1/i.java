package ib1;

/* loaded from: classes7.dex */
public class i implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e f371596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f371599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ib1.j f371600f;

    public i(ib1.j jVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371600f = jVar;
        this.f371595a = str;
        this.f371596b = eVar;
        this.f371597c = str2;
        this.f371598d = lVar;
        this.f371599e = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices result:%s", this.f371595a, mVar);
        int i17 = mVar.f425571a;
        int i18 = this.f371599e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371598d;
        ib1.j jVar = this.f371600f;
        if (i17 == 0) {
            jVar.C(lVar, i18, this.f371596b.j(this.f371597c, false));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f425571a));
            lVar.a(i18, jVar.q(mVar.f425572b, mVar.f425573c, hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(138);
        }
    }
}
