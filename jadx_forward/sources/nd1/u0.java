package nd1;

/* loaded from: classes7.dex */
public class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72979x366c91de = 388;

    /* renamed from: NAME */
    public static final java.lang.String f72980x24728b = "setMenuStyle";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMenuStyle", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("style");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = e9Var.mo32091x9a3f0ba2().x0().m52174xaf156f4a();
        if (m52174xaf156f4a == null) {
            e9Var.a(i17, o("fail view is null"));
            return;
        }
        if (optString.equalsIgnoreCase("dark")) {
            m52174xaf156f4a.X2("dark");
        } else {
            if (!optString.equalsIgnoreCase("light")) {
                e9Var.a(i17, o("fail invalid style ".concat(optString)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetMenuStyle", "fail invalid style %s", optString);
                return;
            }
            m52174xaf156f4a.X2("light");
        }
        e9Var.a(i17, o("ok"));
    }
}
