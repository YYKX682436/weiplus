package uc1;

/* loaded from: classes13.dex */
public class y extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76940x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76941x24728b = "getMapRotate";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRotate", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapRotate", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapRotate", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, java.lang.Float.valueOf(((vc1.p1) E).f516601e.mo98897xb5885626().mo98961xd2ef9864().m37101x2fd5b378()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapRotate", "getMapRotate ok, values:%s", hashMap.toString());
            C(lVar, i17, p("ok", hashMap), true, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
