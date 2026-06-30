package ce1;

/* loaded from: classes15.dex */
public class h extends ce1.c {
    public static final int CTRL_INDEX = 896;
    public static final java.lang.String NAME = "queryTrafficCardInfo";

    @Override // ce1.c
    public void C(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, android.os.IInterface iInterface, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ce1.d dVar = ce1.d.f40749e;
            hashMap.put("errCode", java.lang.Integer.valueOf(dVar.f40771a));
            d0Var.a(i17, p("fail:" + dVar.f40772b, hashMap));
            D(4, dVar.f40771a, "deviceData is null");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", dVar.f40772b, d0Var.getAppId(), java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String optString = jSONObject.optString("issuerID");
        int optInt = jSONObject.optInt("dataType");
        boolean z17 = iInterface instanceof lb.l;
        org.json.JSONObject jSONObject2 = null;
        try {
            java.lang.String l17 = z17 ? ((lb.j) ((lb.l) iInterface)).l(optString, optInt) : iInterface instanceof t75.c ? ((t75.a) ((t75.c) iInterface)).l(optString, optInt) : "";
            if (!android.text.TextUtils.isEmpty(l17)) {
                jSONObject2 = new org.json.JSONObject(l17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "call huawei remote interface fail: [%s] ! ", e17.getMessage());
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (jSONObject2 == null) {
            ce1.d dVar2 = ce1.d.f40753i;
            hashMap2.put("errCode", java.lang.Integer.valueOf(dVar2.f40771a));
            d0Var.a(i17, p("fail:" + dVar2.f40772b, hashMap2));
            D(4, dVar2.f40771a, "call remote interface exception");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "call remote interface exception.");
            return;
        }
        int optInt2 = jSONObject2.optInt("resultCode");
        ce1.d dVar3 = ce1.d.f40748d;
        int i18 = dVar3.f40771a;
        if (optInt2 == i18) {
            hashMap2.put("errCode", java.lang.Integer.valueOf(i18));
            hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            d0Var.a(i17, p(dVar3.f40772b, hashMap2));
            D(4, dVar3.f40771a, "");
            return;
        }
        ce1.d a17 = z17 ? ce1.d.a(optInt2) : ce1.d.b(optInt2);
        if (a17 == ce1.d.K) {
            a17 = ce1.d.f40768x;
        }
        hashMap2.put("errCode", java.lang.Integer.valueOf(a17.f40771a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str = a17.f40772b;
        sb6.append(str);
        d0Var.a(i17, p(sb6.toString(), hashMap2));
        D(4, a17.f40771a, str);
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "Return code from huawei remote interface! with RetCode rechargeCard[%s] ", java.lang.Integer.valueOf(optInt2));
    }
}
