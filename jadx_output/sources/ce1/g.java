package ce1;

/* loaded from: classes15.dex */
public class g extends ce1.c {
    public static final int CTRL_INDEX = 897;
    public static final java.lang.String NAME = "issueTrafficCard";

    @Override // ce1.c
    public void C(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, android.os.IInterface iInterface, org.json.JSONObject jSONObject) {
        java.lang.String str;
        if (jSONObject == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ce1.d dVar = ce1.d.f40749e;
            hashMap.put("errCode", java.lang.Integer.valueOf(dVar.f40771a));
            d0Var.a(i17, p("fail:" + dVar.f40772b, hashMap));
            D(3, dVar.f40771a, "deviceData is null");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiIssueTrafficCard", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", dVar.f40772b, d0Var.getAppId(), java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String optString = jSONObject.optString("issuerID");
        java.lang.String optString2 = jSONObject.optString("orderNo");
        java.lang.String optString3 = jSONObject.optString("cityCode");
        java.lang.String optString4 = jSONObject.optString("orderStatus");
        hashMap2.put("issuerID", optString);
        hashMap2.put("orderNo", optString2);
        hashMap2.put("appID", "APP-WECHAT");
        hashMap2.put("operation", "1");
        hashMap2.put("cityCode", optString3);
        hashMap2.put("orderStatus", optString4);
        boolean z17 = iInterface instanceof lb.l;
        org.json.JSONObject jSONObject2 = null;
        try {
            if (z17) {
                ((lb.j) ((lb.l) iInterface)).k(hashMap2);
                str = ((lb.j) ((lb.l) iInterface)).j(hashMap2);
            } else if (iInterface instanceof t75.c) {
                ((t75.a) ((t75.c) iInterface)).k(hashMap2);
                str = ((t75.a) ((t75.c) iInterface)).j(hashMap2);
            } else {
                str = "";
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject2 = new org.json.JSONObject(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiIssueTrafficCard", "call remote interface fail: [%s] ! ", e17.getMessage());
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (jSONObject2 == null) {
            ce1.d dVar2 = ce1.d.f40753i;
            hashMap3.put("errCode", java.lang.Integer.valueOf(dVar2.f40771a));
            d0Var.a(i17, p("fail:" + dVar2.f40772b, hashMap3));
            D(3, dVar2.f40771a, "call remote interface exception");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiIssueTrafficCard", "call remote interface exception.");
            return;
        }
        int optInt = jSONObject2.optInt("resultCode");
        ce1.d dVar3 = ce1.d.f40748d;
        int i18 = dVar3.f40771a;
        if (optInt == i18) {
            hashMap3.put("errCode", java.lang.Integer.valueOf(i18));
            d0Var.a(i17, p(dVar3.f40772b, hashMap3));
            D(3, dVar3.f40771a, "");
            return;
        }
        ce1.d a17 = z17 ? ce1.d.a(optInt) : ce1.d.b(optInt);
        if (a17 == ce1.d.K) {
            a17 = ce1.d.D;
        }
        hashMap3.put("errCode", java.lang.Integer.valueOf(a17.f40771a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str2 = a17.f40772b;
        sb6.append(str2);
        d0Var.a(i17, p(sb6.toString(), hashMap3));
        D(3, a17.f40771a, str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiIssueTrafficCard", "Return code from remote interface! with RetCode issueCard[%s] ", java.lang.Integer.valueOf(optInt));
    }
}
