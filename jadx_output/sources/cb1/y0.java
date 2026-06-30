package cb1;

/* loaded from: classes4.dex */
public class y0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 208;
    public static final java.lang.String NAME = "requestAuthUserAutoFillData";

    /* renamed from: g, reason: collision with root package name */
    public cb1.k1 f40336g;

    public static void C(cb1.y0 y0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, r45.yb ybVar) {
        y0Var.getClass();
        ((com.tencent.mm.plugin.appbrand.networking.c0) v5Var.q(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo", v5Var.getAppId(), ybVar, r45.zb.class).n(new cb1.x0(y0Var));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData data is invalid");
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
        java.lang.String optString = jSONObject.optString("wording");
        int optInt = jSONObject.optInt("authStatus", 2);
        int optInt2 = jSONObject.optInt("clientVersion", 0);
        java.lang.String appId = v5Var.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData appId:%s, clientVersion:%s", appId, java.lang.Integer.valueOf(optInt2));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording:%s, authStatus:%d, fieldIds:%s", optString, java.lang.Integer.valueOf(optInt), optJSONArray);
        r45.yb ybVar = new r45.yb();
        ybVar.f390940e = linkedList;
        ybVar.f390939d = appId;
        ybVar.f390942g = optInt;
        ybVar.f390944i = optInt2;
        if (optInt2 == 1) {
            com.tencent.mm.sdk.platformtools.u3.h(new cb1.p0(this, v5Var, i17, ybVar, optString));
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("authGroupList");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                linkedList2.add("  " + optJSONArray2.optString(i19));
            }
        }
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData fields is empty");
            v5Var.a(i17, o("fail:fields is empty"));
        } else if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording is empty");
            v5Var.a(i17, o("fail:wording is empty"));
        } else {
            if (jSONObject.optJSONArray("authGroupList") != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "authGroupList:%s", jSONObject.optJSONArray("authGroupList").toString());
            }
            com.tencent.mm.sdk.platformtools.u3.h(new cb1.q0(this, v5Var, i17, ybVar, optInt, optString, linkedList2));
        }
    }
}
