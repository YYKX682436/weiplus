package ib1;

/* loaded from: classes7.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69907x366c91de = 815;

    /* renamed from: NAME */
    public static final java.lang.String f69908x24728b = "makeBluetoothPair";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        byte[] decode;
        java.lang.String str;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "env is null", new java.lang.Object[0]);
            return;
        }
        if (jSONObject == null || !jSONObject.has("deviceId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "data is null or do not have key: deviceId", new java.lang.Object[0]);
            java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            l17.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l17));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + mo48798x74292566 + ", data: " + jSONObject, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(mo48798x74292566);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "bleWorker is null", new java.lang.Object[0]);
            java.util.Map l18 = kz5.c1.l(new jz5.l("errCode", 10000));
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            l18.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", l18));
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId", null);
        if (optString == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "deviceId is null", new java.lang.Object[0]);
            java.util.Map l19 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            l19.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l19));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("pin", null);
        if (optString2 == null) {
            decode = null;
        } else {
            try {
                decode = android.util.Base64.decode(optString2, 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "decode pin fail since " + e17, new java.lang.Object[0]);
                java.util.Map l27 = kz5.c1.l(new jz5.l("errCode", 10013));
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                l27.put("errno", 101);
                lVar.a(i17, t("fail:invalid data", l27));
                return;
            }
        }
        long optLong = jSONObject.optLong("timeout", 20000L);
        boolean optBoolean = jSONObject.optBoolean("forcePair", false);
        boolean optBoolean2 = jSONObject.optBoolean("useOldImpl", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deviceId: ");
        sb6.append(optString);
        sb6.append(", pin: ");
        if (decode != null) {
            str = java.util.Arrays.toString(decode);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", timeoutMs: ");
        sb6.append(optLong);
        sb6.append(", forcePair: ");
        sb6.append(optBoolean);
        sb6.append(", useOldImpl: ");
        sb6.append(optBoolean2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", sb6.toString(), new java.lang.Object[0]);
        b17.h(optString, new mb1.j(optString, decode, optLong, optBoolean, optBoolean2), new ib1.o(mo48798x74292566, this, i17, lVar));
    }
}
