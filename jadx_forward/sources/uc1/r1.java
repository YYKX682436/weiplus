package uc1;

/* loaded from: classes13.dex */
public class r1 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76908x366c91de = 786;

    /* renamed from: NAME */
    public static final java.lang.String f76909x24728b = "removeMapCustomLayer";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapCustomLayer", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveMapCustomLayer", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMapCustomLayer", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("layerId", "");
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4397xf8628040 interfaceC4397xf8628040 = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4397xf8628040) ((java.util.concurrent.ConcurrentHashMap) ((vc1.p1) E).O).remove(optString);
        if (interfaceC4397xf8628040 != null) {
            interfaceC4397xf8628040.mo37162xc84af884();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "removeCustomLayer fail, layerId:%s", optString);
        }
        C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
    }
}
