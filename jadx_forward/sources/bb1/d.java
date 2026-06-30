package bb1;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4183x366c91de = 1180;

    /* renamed from: NAME */
    public static final java.lang.String f4184x24728b = "getInferenceEnvInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.INSTANCE.a();
            hashMap.put("ver", com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83540x94052646());
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
        } catch (com.p314xaae8f345.mm.p2818xd0d82df3.w unused) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:environment not ready" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 2004010);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
        }
    }
}
