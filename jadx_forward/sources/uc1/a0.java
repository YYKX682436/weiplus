package uc1;

/* loaded from: classes13.dex */
public class a0 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76838x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76839x24728b = "getMapSkew";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapSkew", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapSkew", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapSkew", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("skew", java.lang.Float.valueOf(((vc1.p1) E).f516601e.mo98897xb5885626().mo98961xd2ef9864().m37102xfb854d80()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapSkew", "getMapSkew ok, values:%s", hashMap.toString());
            C(lVar, i17, p("ok", hashMap), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
