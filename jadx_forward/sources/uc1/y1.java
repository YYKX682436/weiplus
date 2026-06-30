package uc1;

/* loaded from: classes13.dex */
public class y1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76944x366c91de = 860;

    /* renamed from: NAME */
    public static final java.lang.String f76945x24728b = "setMapIndoorMaskColor";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapIndoorMaskColor", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetMapIndoorMaskColor", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMapIndoorMaskColor", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("maskColor", "#000000");
        int parseColor = android.graphics.Color.parseColor("#000000");
        try {
            parseColor = ik1.w.l(optString);
        } catch (java.lang.Exception unused) {
        }
        ((vc1.p1) E).f516601e.mo98897xb5885626().mo98997x4f658e02(parseColor);
        lVar.a(i17, o("ok"));
    }
}
