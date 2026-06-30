package cc1;

/* loaded from: classes7.dex */
public final class s extends cc1.p {

    /* renamed from: CTRL_INDEX */
    public static final int f4288x366c91de = 1283;

    /* renamed from: NAME */
    public static final java.lang.String f4289x24728b = "cryptoExchangeKey";

    @Override // cc1.p
    public java.lang.Object C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.security.PrivateKey f17;
        java.lang.String optString = jSONObject.optString("algorithm");
        java.lang.String optString2 = jSONObject.optString("keyAlias");
        java.lang.Object opt = jSONObject.opt("privateKey");
        java.lang.Object opt2 = jSONObject.opt("publicKey");
        java.lang.String str = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "ECDH") ? "EC" : optString;
        cc1.m mVar = cc1.p.f121977g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.security.PublicKey g17 = mVar.g(str, opt2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() > 0) {
            f17 = mVar.e(lVar, optString2).getPrivateKey();
        } else {
            if (!(opt != null)) {
                java.lang.String str2 = android.text.TextUtils.isEmpty("fail:missing keyAlias or privateKey") ? "fail:jsapi invalid request data" : "fail:missing keyAlias or privateKey";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                java.lang.String u17 = u(str2, jSONObject2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "makeReturnJson(...)");
                return u17;
            }
            f17 = mVar.f(str, opt);
        }
        javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance(optString, "AndroidKeyStore");
        try {
            keyAgreement.init(f17);
            keyAgreement.doPhase(g17, true);
            java.lang.String x17 = x(lVar, jc1.f.f380445a, kz5.c1.i(new jz5.l("key", keyAgreement.generateSecret())));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x17, "makeReturnJsonWithNativeBuffer(...)");
            return x17;
        } catch (java.security.InvalidKeyException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiCryptoExchangeKey", "keyAgreement.init fail " + e18.getMessage());
            throw new cc1.n(jc1.f.f380451g, "fail:ecdh not supported");
        }
    }
}
