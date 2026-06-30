package ic1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69917x366c91de = 1431;

    /* renamed from: NAME */
    public static final java.lang.String f69918x24728b = "clearEntryPagePath";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiClearEntryPagePath", "clearEntryPagePath invoke: %s", mo48798x74292566);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            lVar.o(new ic1.a(this, mo48798x74292566, lVar, i17));
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid appid" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1005);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
