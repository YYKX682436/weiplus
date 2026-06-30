package uc1;

/* loaded from: classes13.dex */
public class x extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76934x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76935x24728b = "getMapRegion";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRegion", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapRegion", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRegion", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        vc1.z2 z2Var = p1Var.A().f516758a;
        if (z2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRegion", "visibleRegion is  null");
            lVar.a(i17, o("fail:visibleRegion is null"));
            return;
        }
        vc1.z1 z1Var = z2Var.f516765a;
        if (z1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRegion", "latLngBounds is  null");
            lVar.a(i17, o("fail:latLngBounds is null"));
            return;
        }
        vc1.y1 y1Var = z1Var.f516763a;
        vc1.y1 y1Var2 = z1Var.f516764b;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (y1Var != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(y1Var.f516756a));
            hashMap.put("longitude", java.lang.Double.valueOf(y1Var.f516757b));
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (y1Var2 != null) {
            hashMap2.put("latitude", java.lang.Double.valueOf(y1Var2.f516756a));
            hashMap2.put("longitude", java.lang.Double.valueOf(y1Var2.f516757b));
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("southwest", hashMap);
        hashMap3.put("northeast", hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", hashMap3.toString());
        C(lVar, i17, p("ok", hashMap3), true, p1Var instanceof dg1.h);
    }
}
