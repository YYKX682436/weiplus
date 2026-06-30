package rc1;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76497x366c91de = 1351;

    /* renamed from: NAME */
    private static final java.lang.String f76498x24728b = "updateCapsuleIcon";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (jSONObject == null || c0Var == null) {
            return;
        }
        c0Var.V0().g4(jSONObject.optString("sessionBuffer"));
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("key_appid", c0Var.t3().f156336n);
        lVarArr[1] = new jz5.l("key_type", mi1.a.KOUBEI);
        lVarArr[2] = new jz5.l("key_img_url", jSONObject.optString("iconUrl"));
        lVarArr[3] = new jz5.l("key_img_url_dark", jSONObject.optString("darkModeIconUrl"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = c0Var.t3().N2();
        lVarArr[4] = new jz5.l("key_page_path", N2 != null ? N2.X1() : null);
        lVarArr[5] = new jz5.l("key_session_buffer", jSONObject.optString("sessionBuffer"));
        lVarArr[6] = new jz5.l("key_show_duration", 4000L);
        lVarArr[7] = new jz5.l("key_allow_animation", java.lang.Boolean.TRUE);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        mi1.f a17 = mi1.c.a(c0Var.t3());
        if (a17 != null) {
            a17.k(k17, mi1.e.TAIL, "");
        }
    }
}
