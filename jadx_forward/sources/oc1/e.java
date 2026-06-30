package oc1;

/* loaded from: classes.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f73030x366c91de = 910;

    /* renamed from: NAME */
    public static final java.lang.String f73031x24728b = "checkHandoffEnabled";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckHandoffEnabled", "invoke JsApiCheckHandoffEnabled");
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean optBoolean = jSONObject.optBoolean("showToast", true);
        int a17 = oc1.d.a("MicroMsg.JsApiCheckHandoffEnabled", c0Var.mo48798x74292566(), c0Var.t3().u0().f128817z);
        if (a17 != 0) {
            if (optBoolean && a17 < 5 && a17 > 1) {
                android.content.Context f229340d = c0Var.getF229340d();
                java.lang.String string = c0Var.getF229340d().getString(oc1.d.f425679c[a17]);
                ((ku5.t0) ku5.t0.f394148d).B(new oc1.c(f229340d, string));
            }
            hashMap.put("errCode", java.lang.Integer.valueOf(a17));
            hashMap.put("isEnabled", java.lang.Boolean.FALSE);
        } else {
            hashMap.put("isEnabled", java.lang.Boolean.TRUE);
        }
        c0Var.a(i17, p("ok", hashMap));
    }
}
