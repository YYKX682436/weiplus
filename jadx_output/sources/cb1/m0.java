package cb1;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 204;
    public static final java.lang.String NAME = "getUserAutoFillData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fields");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                linkedList.add(optJSONArray.optString(i18));
            }
        }
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData fields is empty");
            v5Var.a(i17, o("fail:fields is empty"));
            return;
        }
        java.lang.String appId = v5Var.getAppId();
        int optInt = jSONObject.optInt("clientVersion", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData appId:%s, clientVersion:%s data:%s", appId, java.lang.Integer.valueOf(optInt), jSONObject.toString());
        r45.fq3 fq3Var = new r45.fq3();
        fq3Var.f374547f = linkedList;
        fq3Var.f374545d = appId;
        fq3Var.f374546e = jSONObject.optBoolean("getAllInfo", false);
        fq3Var.f374548g = 1;
        fq3Var.f374549h = optInt;
        ((com.tencent.mm.plugin.appbrand.networking.c0) v5Var.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo", appId, fq3Var, r45.gq3.class).n(new cb1.l0(this, v5Var, i17));
    }
}
