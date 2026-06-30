package na1;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72905x366c91de = 688;

    /* renamed from: NAME */
    public static final java.lang.String f72906x24728b = "reportCanvasData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCanvasData", "hy: request report canvas data");
        java.lang.String optString = jSONObject.optString("eventInfo");
        int optInt = jSONObject.optInt("viewId", 0);
        if (c0Var.V0() == null || c0Var.V0().B1(pa1.a.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReportCanvasData", "hy: current is not game");
            return;
        }
        pa1.e eVar = ((pa1.t) ((pa1.a) c0Var.V0().B1(pa1.a.class))).f434500x;
        if (eVar != null) {
            eVar.f434491c.m77784x795fa299(new pa1.c(eVar, optInt, optString));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportCanvasData", "hy: guard is null!");
        }
    }
}
