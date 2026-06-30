package nd1;

/* loaded from: classes7.dex */
public class d1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72919x366c91de = 198;

    /* renamed from: NAME */
    public static final java.lang.String f72920x24728b = "setNavigationBarColor";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        try {
            int l17 = ik1.w.l(jSONObject.getString("frontColor"));
            int l18 = ik1.w.l(jSONObject.getString("backgroundColor"));
            jSONObject.optDouble("alpha", 1.0d);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("animation");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("duration");
                str = optJSONObject.optString("timingFunc");
                i18 = optInt;
            } else {
                str = "";
                i18 = 0;
            }
            nd1.c1 c1Var = new nd1.c1(this, yVar, i17, l18, l17, i18, str);
            if ((yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) || !yVar.mo32091x9a3f0ba2().Q1()) {
                yVar.m(c1Var);
            } else {
                yVar.mo32091x9a3f0ba2().I1(c1Var);
            }
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str3, jSONObject2));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetNavigationBarColor", "Color parse error");
            yVar.a(i17, o("fail:invalid color"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
