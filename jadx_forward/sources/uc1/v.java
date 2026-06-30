package uc1;

/* loaded from: classes13.dex */
public class v extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76922x366c91de = 144;

    /* renamed from: NAME */
    public static final java.lang.String f76923x24728b = "getMapCenterLocation";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapCenterLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapCenterLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapCenterLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        vc1.p1 p1Var = (vc1.p1) E;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98964x19b45a1b = p1Var.f516601e.mo98897xb5885626().mo98964x19b45a1b();
        double m37195x2605e9e2 = mo98964x19b45a1b.m37195x2605e9e2();
        double m37196x79d7af9 = mo98964x19b45a1b.m37196x79d7af9();
        hashMap.put("latitude", java.lang.Double.valueOf(m37195x2605e9e2));
        hashMap.put("longitude", java.lang.Double.valueOf(m37196x79d7af9));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", hashMap.toString());
        C(lVar, i17, p("ok", hashMap), true, p1Var instanceof dg1.h);
    }
}
