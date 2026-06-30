package uc1;

/* loaded from: classes13.dex */
public class n1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76894x366c91de = 141;

    /* renamed from: NAME */
    public static final java.lang.String f76895x24728b = "moveToMapLocation";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveToMapLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMoveToMapLocation", "moveToMapLocation data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveToMapLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("latitude") || jSONObject.has("longitude")) {
            ((vc1.p1) E).D(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("latitude"), 0.0d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("longitude"), 0.0d), -1.0f, -1.0f, -1.0f, true);
        } else {
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s moveToMapLocation", p1Var);
            vc1.e eVar = new vc1.e(p1Var);
            p1Var.L = eVar;
            if (p1Var.f516598c0 != null && p1Var.f516596b0) {
                eVar.run();
                p1Var.L = null;
            }
        }
        java.lang.String o17 = o("ok");
        vc1.p1 p1Var2 = (vc1.p1) E;
        p1Var2.getClass();
        C(lVar, i17, o17, true, p1Var2 instanceof dg1.h);
    }
}
