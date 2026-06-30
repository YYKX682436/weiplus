package uc1;

/* loaded from: classes13.dex */
public class u extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76918x366c91de = 893;

    /* renamed from: NAME */
    public static final java.lang.String f76919x24728b = "fromScreenLocation";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiFromScreenLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFromScreenLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiFromScreenLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            int i18 = jSONObject.getInt("x");
            int i19 = jSONObject.getInt("y");
            android.graphics.Point point = new android.graphics.Point();
            point.x = ik1.w.c(i18);
            point.y = ik1.w.c(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFromScreenLocation", "x:%d, y:%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", f76919x24728b);
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98924x7ce5ca8b = p1Var.f516601e.mo98897xb5885626().mo98968x78d58245().mo98924x7ce5ca8b(point);
            double m37195x2605e9e2 = mo98924x7ce5ca8b.m37195x2605e9e2();
            double m37196x79d7af9 = mo98924x7ce5ca8b.m37196x79d7af9();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("latitude", java.lang.Double.valueOf(m37195x2605e9e2));
            hashMap.put("longitude", java.lang.Double.valueOf(m37196x79d7af9));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFromScreenLocation", "fromScreenLocation ok values:%s", hashMap.toString());
            lVar.a(i17, p("ok", hashMap));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFromScreenLocation", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiFromScreenLocation", "parse fromScreenLocation error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o17, false, p1Var2 instanceof dg1.h);
        }
    }
}
