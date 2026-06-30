package uc1;

/* loaded from: classes13.dex */
public class t extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76914x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76915x24728b = "executeMapVisualLayerCommand";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        java.lang.String optString2 = jSONObject.optString("command");
        if (android.text.TextUtils.isEmpty(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiExecuteMapVisualLayerCommand", "command is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        vc1.p1 p1Var = (vc1.p1) E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109 = p1Var.f516601e;
        java.lang.String str = "";
        if (c16320xe3e95109 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand fail, tencentMapView null");
        } else {
            java.util.HashMap hashMap = p1Var.f516632t0;
            if (hashMap.containsKey("" + optString)) {
                com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1 = (com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1) hashMap.get("" + optString);
                if (interfaceC4273x137f8dd1 != null) {
                    str = c16320xe3e95109.mo98897xb5885626().mo98958x60c07621(interfaceC4273x137f8dd1, optString2);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand layerId not exist");
                str = c16320xe3e95109.mo98897xb5885626().mo98958x60c07621(null, optString2);
            }
        }
        if (android.text.TextUtils.isEmpty(str) || !str.contains(ya.b.f77504xbb80cbe3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand fail");
            lVar.a(i17, o("fail"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiExecuteMapVisualLayerCommand", "executeMapVisualLayerCommand ok");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            lVar.a(i17, p("ok", hashMap2));
        }
    }
}
