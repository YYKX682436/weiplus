package cb1;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 206;
    public static final java.lang.String NAME = "deleteUserAutoFillData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.lang.String optString = jSONObject.optString("groupKey");
        int optInt = jSONObject.optInt("groupId", 0);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
            v5Var.a(i17, o("fail:groupKey is invalid"));
            return;
        }
        java.lang.String appId = v5Var.getAppId();
        int optInt2 = jSONObject.optInt("clientVersion", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, clientVersion:%s, groupId:%d, groupKey:%s", appId, java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt), optString);
        r45.nd0 nd0Var = new r45.nd0();
        nd0Var.f381257e = optString;
        nd0Var.f381256d = appId;
        nd0Var.f381258f = optInt;
        nd0Var.f381259g = 1;
        nd0Var.f381261i = optInt2;
        ((com.tencent.mm.plugin.appbrand.networking.c0) v5Var.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo", appId, nd0Var, r45.od0.class).n(new cb1.f(this, v5Var, i17));
    }
}
