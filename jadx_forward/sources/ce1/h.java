package ce1;

/* loaded from: classes15.dex */
public class h extends ce1.c {

    /* renamed from: CTRL_INDEX */
    public static final int f4368x366c91de = 896;

    /* renamed from: NAME */
    public static final java.lang.String f4369x24728b = "queryTrafficCardInfo";

    @Override // ce1.c
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, android.os.IInterface iInterface, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ce1.d dVar = ce1.d.f122282e;
            hashMap.put("errCode", java.lang.Integer.valueOf(dVar.f122304a));
            d0Var.a(i17, p("fail:" + dVar.f122305b, hashMap));
            D(4, dVar.f122304a, "deviceData is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]", dVar.f122305b, d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "call huawei remote interface fail: [%s] ! ", e17.getMessage());
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (jSONObject2 == null) {
            ce1.d dVar2 = ce1.d.f122286i;
            hashMap2.put("errCode", java.lang.Integer.valueOf(dVar2.f122304a));
            d0Var.a(i17, p("fail:" + dVar2.f122305b, hashMap2));
            D(4, dVar2.f122304a, "call remote interface exception");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "call remote interface exception.");
            return;
        }
        int optInt2 = jSONObject2.optInt("resultCode");
        ce1.d dVar3 = ce1.d.f122281d;
        int i18 = dVar3.f122304a;
        if (optInt2 == i18) {
            hashMap2.put("errCode", java.lang.Integer.valueOf(i18));
            hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            d0Var.a(i17, p(dVar3.f122305b, hashMap2));
            D(4, dVar3.f122304a, "");
            return;
        }
        ce1.d a17 = z17 ? ce1.d.a(optInt2) : ce1.d.b(optInt2);
        if (a17 == ce1.d.K) {
            a17 = ce1.d.f122301x;
        }
        hashMap2.put("errCode", java.lang.Integer.valueOf(a17.f122304a));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str = a17.f122305b;
        sb6.append(str);
        d0Var.a(i17, p(sb6.toString(), hashMap2));
        D(4, a17.f122304a, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiQueryTrafficCardInfo", "Return code from huawei remote interface! with RetCode rechargeCard[%s] ", java.lang.Integer.valueOf(optInt2));
    }
}
