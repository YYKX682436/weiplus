package uc1;

/* loaded from: classes13.dex */
public class a2 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76842x366c91de = 892;

    /* renamed from: NAME */
    public static final java.lang.String f76843x24728b = "toScreenLocation";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiToScreenLocation", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiToScreenLocation", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiToScreenLocation", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            double d17 = jSONObject.getDouble("longitude");
            double d18 = jSONObject.getDouble("latitude");
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", f76843x24728b);
            android.graphics.Point mo98932x5ab0ff9c = p1Var.f516601e.mo98897xb5885626().mo98968x78d58245().mo98932x5ab0ff9c(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(d18, d17));
            if (mo98932x5ab0ff9c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiToScreenLocation", "toScreenLocation fail");
                lVar.a(i17, o("fail:point is empty"));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("x", java.lang.Integer.valueOf(ik1.w.d(mo98932x5ab0ff9c.x)));
            hashMap.put("y", java.lang.Integer.valueOf(ik1.w.d(mo98932x5ab0ff9c.y)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiToScreenLocation", "toScreenLocation ok values:%s", hashMap.toString());
            lVar.a(i17, p("ok", hashMap));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiToScreenLocation", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiToScreenLocation", "parse toScreenLocation error, exception : %s", e17);
            java.lang.String o17 = o("fail:internal error");
            vc1.p1 p1Var2 = (vc1.p1) E;
            p1Var2.getClass();
            C(lVar, i17, o17, false, p1Var2 instanceof dg1.h);
        }
    }
}
