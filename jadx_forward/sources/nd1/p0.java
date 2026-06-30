package nd1;

/* loaded from: classes7.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72965x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72966x24728b = "rewriteRoute";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REWRITE_ROUTE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar.t3().x0();
        if (optString == null || optString.length() == 0) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("webviewId", 0) : 0;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("lastOpenType", "") : null;
        if (optString2 == null) {
            optString2 = "";
        }
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("routeId", null) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiRewriteRoute", "invoke rewriteRoute, data:" + jSONObject + " webviewId:" + optInt + ", url:" + optString + " openType:" + optString2 + " jsRouteId:" + optString3);
        nd1.o0 o0Var = new nd1.o0(yVar, x07, optInt, optString, optString2, optString3, i17, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = x07.f168252y;
        long a17 = paVar.a(wdVar, optString3);
        paVar.b(a17, "overrideEntryPagePath", java.lang.Boolean.FALSE, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n4(x07, o0Var, optString, wdVar, a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4 r4Var = x07.f168239i;
        if (r4Var != null ? r4Var.b(optString, wdVar, x07, n4Var) : false) {
            return;
        }
        n4Var.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
