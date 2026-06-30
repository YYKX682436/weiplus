package uc1;

/* loaded from: classes13.dex */
public class q1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76904x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76905x24728b = "removeMapArc";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapArc", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapArc", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapArc", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        if (!jSONObject.has(dm.i4.f66865x76d1ec5a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapArc", "id is empty");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapArc", "removeMapArc success");
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a);
        java.util.HashMap hashMap = ((vc1.p1) E).f516634u0;
        if (hashMap.containsKey("" + optInt)) {
            ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc) hashMap.remove("" + optInt)).mo36414xc84af884();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc success id:%d", java.lang.Integer.valueOf(optInt));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc fail id:%d", java.lang.Integer.valueOf(optInt));
        }
        lVar.a(i17, o("ok"));
    }
}
