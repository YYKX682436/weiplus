package uc1;

/* loaded from: classes13.dex */
public class z extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76946x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f76947x24728b = "getMapScale";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapScale", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapScale", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetMapScale", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        vc1.p1 p1Var = (vc1.p1) E;
        hashMap.put("scale", java.lang.Float.valueOf(p1Var.f516601e.mo98897xb5885626().mo98961xd2ef9864().m37104xfb888c49()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMapScale", "getMapScale ok, values:%s", hashMap.toString());
        C(lVar, i17, p("ok", hashMap), true, p1Var instanceof dg1.h);
    }
}
