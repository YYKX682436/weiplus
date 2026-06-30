package cb1;

/* loaded from: classes7.dex */
public class a1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 205;
    public static final java.lang.String NAME = "setUserAutoFillData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.lang.String optString = jSONObject.optString("dataList");
        java.lang.String appId = v5Var.getAppId();
        int optInt = jSONObject.optInt("clientVersion", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData appId:%s, clientVersion:%s, dataList:%s", appId, java.lang.Integer.valueOf(optInt), optString);
        r45.ou5 ou5Var = new r45.ou5();
        ou5Var.f382529d = appId;
        ou5Var.f382530e = optString;
        ou5Var.f382531f = 1;
        ou5Var.f382532g = optInt;
        ((com.tencent.mm.plugin.appbrand.networking.c0) v5Var.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo", appId, ou5Var, r45.pu5.class).n(new cb1.z0(this, v5Var, i17));
    }
}
