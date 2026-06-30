package nd1;

/* loaded from: classes7.dex */
public final class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f72971x366c91de = 413;

    /* renamed from: NAME */
    public static final java.lang.String f72972x24728b = "scrollWebviewTo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar : yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) yVar).V0() : null;
        if (V0 == null) {
            return o("fail:page don't exist");
        }
        long optLong = jSONObject.optLong("duration", 300L);
        if (!jSONObject.has("scrollTop")) {
            return o("fail:invalid data");
        }
        try {
            V0.m(new nd1.q0(this, V0, java.lang.Math.round(ik1.w.f() * new java.math.BigDecimal(jSONObject.getString("scrollTop")).floatValue()), optLong));
            return o("ok");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Jsapi_scrollWebviewTo", "opt scrollTop, e = %s", e17);
            java.lang.String message = e17.getMessage();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (message == null) {
                message = "";
            }
            return o("fail:invalid data ".concat(message));
        }
    }
}
