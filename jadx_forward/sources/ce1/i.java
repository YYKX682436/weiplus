package ce1;

/* loaded from: classes15.dex */
public class i extends ce1.c {

    /* renamed from: CTRL_INDEX */
    public static final int f4370x366c91de = 898;

    /* renamed from: NAME */
    public static final java.lang.String f4371x24728b = "rechargeTrafficCard";

    @Override // ce1.c
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, android.os.IInterface iInterface, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ce1.d dVar = ce1.d.f122282e;
            hashMap.put("errCode", java.lang.Integer.valueOf(dVar.f122304a));
            d0Var.a(i17, p("fail:" + dVar.f122305b, hashMap));
            D(5, dVar.f122304a, "deviceData is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRechargeTrafficCard", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", dVar.f122305b, d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String optString = jSONObject.optString("issuerID");
        java.lang.String optString2 = jSONObject.optString("orderNo");
        java.lang.String optString3 = jSONObject.optString("cityCode");
        java.lang.String optString4 = jSONObject.optString("retry");
        hashMap2.put("issuerID", optString);
        hashMap2.put("orderNo", optString2);
        hashMap2.put("appID", "APP-WECHAT");
        hashMap2.put("operation", "1");
        hashMap2.put("cityCode", optString3);
        hashMap2.put("retry", optString4);
        boolean z17 = iInterface instanceof lb.l;
        org.json.JSONObject jSONObject2 = null;
        try {
            java.lang.String p17 = z17 ? ((lb.j) ((lb.l) iInterface)).p(hashMap2) : iInterface instanceof t75.c ? ((t75.a) ((t75.c) iInterface)).p(hashMap2) : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRechargeTrafficCard", "rechargeCardString: [%s]! params: [%s]", p17, new org.json.JSONObject(hashMap2).toString());
            if (!android.text.TextUtils.isEmpty(p17)) {
                jSONObject2 = new org.json.JSONObject(p17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRechargeTrafficCard", "call remote interface fail: [%s] ! ", e17.getMessage());
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (jSONObject2 == null) {
            ce1.d dVar2 = ce1.d.f122286i;
            hashMap3.put("errCode", java.lang.Integer.valueOf(dVar2.f122304a));
            d0Var.a(i17, p("fail:" + dVar2.f122305b, hashMap3));
            D(5, dVar2.f122304a, "call remote interface exception");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRechargeTrafficCard", "call remote interface exception.");
            return;
        }
        int optInt = jSONObject2.optInt("resultCode");
        ce1.d dVar3 = ce1.d.f122281d;
        int i18 = dVar3.f122304a;
        if (optInt == i18) {
            hashMap3.put("errCode", java.lang.Integer.valueOf(i18));
            d0Var.a(i17, p(dVar3.f122305b, hashMap3));
            D(5, dVar3.f122304a, "");
            return;
        }
        ce1.d a17 = z17 ? ce1.d.a(optInt) : ce1.d.b(optInt);
        if (a17 == ce1.d.K) {
            a17 = ce1.d.F;
        }
        hashMap3.put("errCode", java.lang.Integer.valueOf(a17.f122304a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str = a17.f122305b;
        sb6.append(str);
        d0Var.a(i17, p(sb6.toString(), hashMap3));
        D(5, a17.f122304a, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRechargeTrafficCard", "Return code from remote interface! with RetCode rechargeCard[%s] ", java.lang.Integer.valueOf(optInt));
    }
}
