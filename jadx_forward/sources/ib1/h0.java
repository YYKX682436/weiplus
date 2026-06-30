package ib1;

/* loaded from: classes7.dex */
public class h0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f371593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib1.g0 f371594c;

    public h0(ib1.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371594c = g0Var;
        this.f371592a = lVar;
        this.f371593b = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "[onScanResult]result:%s", mVar);
        int i17 = mVar.f425571a;
        ib1.g0 g0Var = this.f371594c;
        int i18 = this.f371593b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371592a;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(mVar.f425571a));
            hashMap.put("isDiscovering", java.lang.Boolean.FALSE);
            lVar.a(i18, g0Var.q(mVar.f425572b, mVar.f425573c, hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(13);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 0);
        hashMap2.put("isDiscovering", java.lang.Boolean.TRUE);
        g0Var.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap2.put("errno", 0);
        lVar.a(i18, g0Var.t("ok", hashMap2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(12);
    }
}
