package uc1;

/* loaded from: classes13.dex */
public class x1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76938x366c91de = 526;

    /* renamed from: NAME */
    public static final java.lang.String f76939x24728b = "setMapIndoorFloor";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapIndoorFloor", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapIndoorFloor", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapIndoorFloor", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            ((vc1.p1) E).f516601e.mo98897xb5885626().mo98996x255ed3b7(jSONObject.optString("buildingId"), jSONObject.optString("floorName"));
            C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
