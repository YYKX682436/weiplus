package uc1;

/* loaded from: classes13.dex */
public class w1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76932x366c91de = 690;

    /* renamed from: NAME */
    public static final java.lang.String f76933x24728b = "setMapCenterOffset";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapCenterOffset", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapCenterOffset", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapCenterOffset", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("offset");
            float optDouble = (float) jSONArray.optDouble(0, 0.5d);
            float optDouble2 = (float) jSONArray.optDouble(1, 0.5d);
            boolean optBoolean = jSONObject.optBoolean("animated", false);
            vc1.p1 p1Var = (vc1.p1) E;
            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109 = p1Var.f516601e;
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98964x19b45a1b = c16320xe3e95109.mo98897xb5885626().mo98964x19b45a1b();
            c16320xe3e95109.mo1015x731810ef(optDouble, optDouble2);
            p1Var.D(mo98964x19b45a1b.m37195x2605e9e2(), mo98964x19b45a1b.m37196x79d7af9(), -1.0f, -1.0f, -1.0f, optBoolean);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapCenterOffset", "parse offset err:%s", e17);
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var2 = (vc1.p1) E;
        p1Var2.getClass();
        C(lVar, i17, o17, true, p1Var2 instanceof dg1.h);
    }
}
