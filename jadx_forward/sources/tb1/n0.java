package tb1;

/* loaded from: classes7.dex */
public class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76788x366c91de = 1384;

    /* renamed from: NAME */
    public static final java.lang.String f76789x24728b = "notifyCameraMessage";

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f498448g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNotifyCameraMessage", "data:%s", jSONObject);
        if (c0Var.Z0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNotifyCameraMessage", "no page context");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = c0Var.t3().x0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = (x07.m52169xfdaa7672() == null && x07.m52169xfdaa7672().mo14682x9dee9c37() == null) ? null : x07.m52169xfdaa7672().mo14682x9dee9c37();
        if (mo14682x9dee9c37 == null || mo14682x9dee9c37.t3() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNotifyCameraMessage", "mPageView is null or Runtime is null");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("open", false);
        mi1.w0 w0Var = this.f498448g;
        if (w0Var != null) {
            w0Var.mo147359x63a3b28a();
            this.f498448g = null;
        }
        if (optBoolean) {
            this.f498448g = mi1.c.a(mo14682x9dee9c37.t3()).h(mi1.d.CAMERA);
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
