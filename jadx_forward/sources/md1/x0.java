package md1;

/* loaded from: classes7.dex */
public class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72874x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f72875x24728b = "waitVoIPChat";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f407347g = "";

    /* renamed from: h, reason: collision with root package name */
    public u81.f f407348h = null;

    /* renamed from: i, reason: collision with root package name */
    public final md1.k1 f407349i = new md1.k1();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f407350m = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        boolean optBoolean = jSONObject.optBoolean("status", false);
        java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
        this.f407347g = mo48798x74292566;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "appId:%s, data:%s", mo48798x74292566, jSONObject);
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.D0(new md1.v0(this, optBoolean, c0Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "service is null");
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
        c0Var.a(i17, u(str, jSONObject2));
    }
}
