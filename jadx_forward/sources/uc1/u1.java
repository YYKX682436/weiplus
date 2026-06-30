package uc1;

/* loaded from: classes13.dex */
public class u1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76920x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76921x24728b = "removeMapVisualLayer";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapVisualLayer", "layerId is empty");
            lVar.a(i17, o("fail:invalid data"));
        } else if (((vc1.p1) E).R(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer ok");
            lVar.a(i17, o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer fail");
            lVar.a(i17, o("fail"));
        }
    }
}
