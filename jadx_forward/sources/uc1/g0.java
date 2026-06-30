package uc1;

/* loaded from: classes13.dex */
public class g0 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76874x366c91de = 857;

    /* renamed from: NAME */
    public static final java.lang.String f76875x24728b = "initMapMarkerCluster";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInitMapMarkerCluster", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInitMapMarkerCluster", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInitMapMarkerCluster", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("enableDefaultStyle", true);
        boolean optBoolean2 = jSONObject.optBoolean("zoomOnClick", true);
        int optInt = jSONObject.optInt("minimumClusterSize", 2);
        int optInt2 = jSONObject.optInt("gridSize", 60);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInitMapMarkerCluster", "enableDefaultStyle:%b, zoomOnClick:%b, minimumClusterSize:%d, gridSize:%d", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2));
        ((vc1.p1) E).C(optBoolean, optBoolean2, optInt, optInt2, new uc1.d0(this, jSONObject, lVar));
        lVar.a(i17, o("ok"));
    }
}
