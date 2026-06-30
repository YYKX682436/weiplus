package uc1;

/* loaded from: classes13.dex */
public class q extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76902x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76903x24728b = "addMapVisualLayer";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapVisualLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapVisualLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapVisualLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapVisualLayer", "layerId is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        boolean z17 = false;
        int optInt = jSONObject.optInt("interval", 0);
        double optDouble = jSONObject.optDouble("opacity", 1.0d);
        int optInt2 = jSONObject.optInt("zIndex", 0);
        java.lang.String optString2 = jSONObject.optString(ya.b.f77487x44fa364);
        ((vc1.p1) E).f516638w0 = new uc1.p(this, jSONObject, lVar);
        vc1.p1 p1Var = (vc1.p1) E;
        java.util.HashMap hashMap = p1Var.f516632t0;
        if (hashMap.containsKey("" + optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "VisualLayer not exist, remove visualLayer id:%s first, and than add again", optString);
            p1Var.R(optString);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer id:%s", optString);
        com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4275x165a4b4e mo35547x3136c9db = new com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d(optString).mo35547x3136c9db();
        mo35547x3136c9db.m35553xcda70c34(optInt);
        mo35547x3136c9db.m35554x2cb3cb7a(optInt2);
        mo35547x3136c9db.m35550x52b5721c((float) optDouble);
        if (android.text.TextUtils.isEmpty(optString2)) {
            mo35547x3136c9db.m35552x534d5c42(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17473xce508f76);
        } else {
            int y17 = p1Var.y(optString2);
            if (y17 >= 0) {
                mo35547x3136c9db.m35552x534d5c42(y17);
            } else {
                mo35547x3136c9db.m35552x534d5c42(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17473xce508f76);
            }
        }
        com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo98951xd51c1690 = p1Var.f516601e.mo98897xb5885626().mo98951xd51c1690(mo35547x3136c9db.mo35549x59bc66e());
        if (mo98951xd51c1690 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer fail id:%s", optString);
        } else {
            vc1.m1 m1Var = new vc1.m1(p1Var, optString);
            mo98951xd51c1690.mo35529xc254a1e6(m1Var);
            hashMap.put(optString, mo98951xd51c1690);
            p1Var.f516636v0.put(optString, m1Var);
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer ok");
            lVar.a(i17, o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapVisualLayer", "addMapVisualLayer fail");
            lVar.a(i17, o("fail"));
        }
    }
}
