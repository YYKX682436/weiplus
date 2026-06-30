package uc1;

/* loaded from: classes13.dex */
public class v1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76926x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76927x24728b = "setMapBoundary";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        vc1.y1 y1Var;
        boolean z17;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapBoundary", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapBoundary", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapBoundary", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        vc1.y1 y1Var2 = null;
        if (jSONObject.has("southwest")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("southwest");
            y1Var = new vc1.y1(optJSONObject.optDouble("latitude", 0.0d), optJSONObject.optDouble("longitude", 0.0d));
        } else {
            y1Var = null;
        }
        if (jSONObject.has("northeast")) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("northeast");
            y1Var2 = new vc1.y1(optJSONObject2.optDouble("latitude", 0.0d), optJSONObject2.optDouble("longitude", 0.0d));
        }
        if (y1Var2 == null || y1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            lVar.a(i17, o("fail:data is invalid"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        p1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", f76927x24728b);
        if (y1Var == null || y1Var2 == null) {
            z17 = false;
        } else {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26();
            c26041x873d1d26.f49502x83009af = y1Var.f516757b;
            c26041x873d1d26.f49501xaa2bac6c = y1Var.f516756a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26();
            c26041x873d1d262.f49502x83009af = y1Var2.f516757b;
            c26041x873d1d262.f49501xaa2bac6c = y1Var2.f516756a;
            p1Var.f516601e.mo98897xb5885626().mo99000xc9258fe4(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b(c26041x873d1d262, c26041x873d1d26));
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapBoundary", "setMapBoundary success");
            lVar.a(i17, o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            lVar.a(i17, o("fail:setMapBoundary is fail"));
        }
    }
}
