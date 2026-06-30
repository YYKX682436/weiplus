package nd1;

/* loaded from: classes7.dex */
public class h1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72935x366c91de = 238;

    /* renamed from: NAME */
    private static final java.lang.String f72936x24728b = "setNavigationBarRightButton";

    public h1() {
        si1.e.a(f72936x24728b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = d0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) d0Var : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) d0Var).V0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.b(d0Var);
        boolean optBoolean = jSONObject.optBoolean("hide", false);
        if (V0 == null) {
            d0Var.a(i17, o("fail:page don't exist"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiSetNavigationBarRightButton", "onInvoke: page not exist");
            return;
        }
        if (b17 == null) {
            d0Var.a(i17, o("fail:internal error invalid js component"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiSetNavigationBarRightButton", "onInvoke: service not AppBrandService");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSetNavigationBarRightButton", "onInvoke: hide=" + optBoolean + ", appId=" + V0.mo48798x74292566());
        V0.b3(optBoolean ^ true, al1.h0.JsApi);
        if (optBoolean || !(!(this instanceof nd1.j2))) {
            d0Var.a(i17, o("ok"));
            return;
        }
        java.lang.String optString = jSONObject.optString("iconPath");
        if (android.text.TextUtils.isEmpty(optString)) {
            d0Var.a(i17, o("ok"));
            return;
        }
        zl1.f0 f0Var = new zl1.f0(optString, new nd1.e1(this, d0Var, i17), b17);
        f0Var.f555164f = new nd1.g1(this, V0, d0Var, i17);
        f0Var.b();
    }
}
