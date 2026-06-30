package uc1;

/* loaded from: classes13.dex */
public class h extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76880x366c91de = 785;

    /* renamed from: NAME */
    public static final java.lang.String f76881x24728b = "addMapCustomLayer";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapCustomLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapCustomLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapCustomLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            vc1.p1 p1Var = (vc1.p1) E;
            p1Var.m(jSONObject.optString("layerId", ""));
            C(lVar, i17, o("ok"), true, p1Var instanceof dg1.h);
        }
    }
}
