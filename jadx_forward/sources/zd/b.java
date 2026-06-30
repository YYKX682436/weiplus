package zd;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77565x366c91de = 585;

    /* renamed from: NAME */
    public static final java.lang.String f77566x24728b = "hideSplashScreen";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHideSplashScreen", "hideSplashScreen jsApi");
        if (!D()) {
            e9Var.a(i17, o("ok"));
            C(e9Var);
        } else {
            if (e9Var.mo32091x9a3f0ba2() == null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            e9Var.mo32091x9a3f0ba2().H0();
            C(e9Var);
            e9Var.a(i17, o("ok"));
        }
    }

    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
    }

    public boolean D() {
        return false;
    }
}
