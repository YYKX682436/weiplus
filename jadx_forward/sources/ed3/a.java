package ed3;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69665x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f69666x24728b = "finishLoading";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a c16414xa73e916a = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFinishLoading", "[mb] finish loading.");
        c16414xa73e916a.mo50354x59eafec1().mo49309x41012807();
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
        c16414xa73e916a.a(i17, u(str, jSONObject2));
    }
}
