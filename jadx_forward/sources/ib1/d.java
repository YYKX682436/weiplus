package ib1;

/* loaded from: classes7.dex */
public class d implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f371577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib1.e f371579e;

    public d(ib1.e eVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str2) {
        this.f371579e = eVar;
        this.f371575a = str;
        this.f371576b = lVar;
        this.f371577c = i17;
        this.f371578d = str2;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection result:%s", this.f371575a, mVar);
        int i17 = mVar.f425571a;
        java.lang.String str = this.f371578d;
        int i18 = this.f371577c;
        ib1.e eVar = this.f371579e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371576b;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f425571a));
            lVar.a(i18, eVar.q(mVar.f425572b, mVar.f425573c, hashMap));
            eVar.C(lVar, str, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(27);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        eVar.getClass();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap2.put("errno", 0);
        lVar.a(i18, eVar.t("ok", hashMap2));
        eVar.C(lVar, str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(26);
    }
}
