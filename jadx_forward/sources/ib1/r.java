package ib1;

/* loaded from: classes7.dex */
public class r implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f371614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib1.s f371615d;

    public r(ib1.s sVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371615d = sVar;
        this.f371612a = str;
        this.f371613b = lVar;
        this.f371614c = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged result:%s", this.f371612a, mVar);
        int i17 = mVar.f425571a;
        ib1.s sVar = this.f371615d;
        int i18 = this.f371614c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f371613b;
        if (i17 != 0) {
            new java.util.HashMap().put("errCode", java.lang.Integer.valueOf(mVar.f425571a));
            lVar.a(i18, sVar.r(mVar.f425572b, mVar.f425573c, null));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(43);
            return;
        }
        new java.util.HashMap().put("errCode", 0);
        sVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i18, sVar.u(str, jSONObject));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(42);
    }
}
