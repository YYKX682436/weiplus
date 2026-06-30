package bc1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4193x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f4194x24728b = "stopCollectInvokeCost";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopCollectInvokeCost", "env.invokeCostManager:" + lVar.mo50356x8f2ff6d2() + " invoke data:" + jSONObject + " stop");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d2 = lVar.mo50356x8f2ff6d2();
        if (mo50356x8f2ff6d2 != null) {
            synchronized (mo50356x8f2ff6d2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsInvokeCostManager", mo50356x8f2ff6d2 + " stop");
                mo50356x8f2ff6d2.f162850b = true;
            }
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
