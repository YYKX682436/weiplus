package cb1;

/* loaded from: classes4.dex */
public class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.m0 f40267c;

    public l0(cb1.m0 m0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40267c = m0Var;
        this.f40265a = v5Var;
        this.f40266b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.gq3 gq3Var = (r45.gq3) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        cb1.m0 m0Var = this.f40267c;
        int i17 = this.f40266b;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40265a;
        if (gq3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, null response");
            hashMap.put("ret", -99);
            v5Var.a(i17, m0Var.p("fail: ErrMsg: cgi fail", hashMap));
            return null;
        }
        int i18 = gq3Var.BaseResponse.f376959d;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), gq3Var.BaseResponse.f376960e);
            hashMap.put("ret", java.lang.Integer.valueOf(gq3Var.BaseResponse.f376959d));
            v5Var.a(i17, m0Var.p("fail: ErrMsg:" + gq3Var.BaseResponse.f376960e, hashMap));
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData success");
        java.lang.String str = !android.text.TextUtils.isEmpty(gq3Var.f375479d) ? gq3Var.f375479d : "";
        java.lang.String str2 = android.text.TextUtils.isEmpty(gq3Var.f375481f) ? "" : gq3Var.f375481f;
        int i19 = gq3Var.f375480e;
        java.util.LinkedList linkedList = gq3Var.f375482g;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData auth_info:%s, auth_status:%d", str2, java.lang.Integer.valueOf(i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData user_info_json:%s", str);
        hashMap.put("userData", str);
        hashMap.put("authStatus", java.lang.Integer.valueOf(i19));
        hashMap.put("authInfo", str2);
        if (linkedList != null && linkedList.size() > 0) {
            hashMap.put("authGroupList", new org.json.JSONArray((java.util.Collection) linkedList));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData authGroupList:%s", new org.json.JSONArray((java.util.Collection) linkedList).toString());
        }
        v5Var.a(i17, m0Var.p("ok", hashMap));
        return null;
    }
}
