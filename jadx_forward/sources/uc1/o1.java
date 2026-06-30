package uc1;

/* loaded from: classes13.dex */
public class o1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76898x366c91de = 890;

    /* renamed from: NAME */
    public static final java.lang.String f76899x24728b = "removeMapGroundOverlay";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (((vc1.p1) E).O(jSONObject.getInt(dm.i4.f66865x76d1ec5a))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay success");
                lVar.a(i17, o("ok"));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay fail");
                lVar.a(i17, o("fail"));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveGroundOverlay", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveGroundOverlay", "parse remove groundOverlay error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            C(lVar, i17, o17, false, p1Var instanceof dg1.h);
        }
    }
}
