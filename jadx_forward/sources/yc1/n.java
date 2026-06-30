package yc1;

/* loaded from: classes7.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77523x366c91de = 615;

    /* renamed from: NAME */
    public static final java.lang.String f77524x24728b = "checkNetworkAPIURL";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean t17;
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data nil"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCheckNetworkAPIURL", "data is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String optString = jSONObject.optString("api", "");
        java.lang.String optString2 = jSONObject.optString("url", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCheckNetworkAPIURL", "invalid api:%s,url:%s", optString, optString2);
            hashMap.put("isValid", java.lang.Boolean.FALSE);
            lVar.a(i17, p("fail:api or url invalid", hashMap));
            return;
        }
        uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
        int i18 = 0;
        if (optString.equalsIgnoreCase("request")) {
            t17 = uh1.j0.t(aVar.f509282p, optString2, false);
        } else if (optString.equalsIgnoreCase("websocket")) {
            t17 = uh1.j0.t(aVar.f509283q, optString2, aVar.A);
        } else if (optString.equalsIgnoreCase("downloadFile")) {
            t17 = uh1.j0.t(aVar.f509285s, optString2, false);
        } else if (optString.equalsIgnoreCase("uploadFile")) {
            t17 = uh1.j0.t(aVar.f509284r, optString2, false);
        } else if (optString.equalsIgnoreCase("udp")) {
            t17 = uh1.j0.t(aVar.f509286t, optString2, false);
        } else {
            if (!optString.equalsIgnoreCase("tcp")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCheckNetworkAPIURL", "hy: unknown api: %s", optString);
                hashMap.put("isValid", java.lang.Boolean.FALSE);
                lVar.a(i17, p("fail:unknow api", hashMap));
                return;
            }
            t17 = uh1.j0.t(aVar.f509287u, optString2, false);
        }
        java.lang.String str = (java.lang.String) uh1.j0.D(optString2).get("host");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckNetworkAPIURL", "ipHost:%s", str);
            i18 = uh1.j0.u(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCheckNetworkAPIURL", "checkRet:%b,ipCheckRet:%d,api:%s,url:%s", java.lang.Boolean.valueOf(t17), java.lang.Integer.valueOf(i18), optString, optString2);
        if (t17) {
            hashMap.put("isInDomainList", java.lang.Boolean.TRUE);
        } else {
            hashMap.put("isInDomainList", java.lang.Boolean.FALSE);
        }
        if (i18 == 0) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            hashMap.put("isInLAN", bool);
            hashMap.put("isLocalHost", bool);
        } else if (i18 == 1) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            hashMap.put("isInLAN", bool2);
            hashMap.put("isLocalHost", bool2);
        } else if (i18 == 2) {
            hashMap.put("isInLAN", java.lang.Boolean.TRUE);
            hashMap.put("isLocalHost", java.lang.Boolean.FALSE);
        }
        lVar.a(i17, p("ok", hashMap));
    }
}
