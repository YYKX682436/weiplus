package cc1;

/* loaded from: classes7.dex */
public final class t extends cc1.p {
    public static final int CTRL_INDEX = 1282;
    public static final java.lang.String NAME = "cryptoGenerateKey";

    @Override // cc1.p
    public java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        boolean z17;
        java.lang.Integer[] numArr;
        if (((java.util.ArrayList) cc1.p.f40444g.d(lVar)).size() > 20) {
            throw new cc1.n(jc1.i.f298945b);
        }
        java.lang.String optString = jSONObject.optString("algorithm");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        int optInt = jSONObject.optInt("keySize", 256);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("blockModes");
        if (optJSONArray != null) {
            arrayList = new java.util.ArrayList();
            c75.b bVar = new c75.b(optJSONArray);
            while (bVar.hasNext()) {
                java.lang.Object next = bVar.next();
                if (next instanceof java.lang.String) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.jvm.internal.o.d(optString);
        if (r26.n0.D(optString, "-", false, 2, null)) {
            java.util.List f07 = r26.n0.f0(optString, new java.lang.String[]{"-"}, false, 0, 6, null);
            arrayList2.addAll(f07.subList(1, f07.size()));
            optString = (java.lang.String) f07.get(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCryptoGenerateKey", "genkey alg=" + optString + " blockModes=" + arrayList2 + " keyAlias=" + uuid + " keySize=" + optInt);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("com.tencent.mm.plugin.appbrand.jsapi.crypto.");
        sb7.append(appId);
        sb7.append(".key.");
        sb6.append(sb7.toString());
        sb6.append(uuid);
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.d(optString);
        java.lang.String str2 = "doPerform, isInsideSecureHardware: ";
        if (kz5.z.G(cc1.p.f40446i, optString)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = it;
                java.lang.String str3 = (java.lang.String) it.next();
                java.lang.String str4 = str2;
                if (!kz5.z.G(cc1.p.f40445h, str3)) {
                    java.lang.String str5 = "fail:invalid block mode " + str3;
                    str = android.text.TextUtils.isEmpty(str5) ? "fail:jsapi invalid request data" : str5;
                    java.lang.String str6 = str == null ? "" : str;
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 101);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    java.lang.String u17 = u(str6, jSONObject2);
                    kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
                    return u17;
                }
                it = it6;
                str2 = str4;
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(optString, "AndroidKeyStore");
            keyGenerator.init(new android.security.keystore.KeyGenParameterSpec.Builder(sb8, 15).setKeySize(optInt).setBlockModes((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)).setRandomizedEncryptionRequired(false).setEncryptionPaddings("NoPadding", "PKCS7Padding").build());
            java.security.spec.KeySpec keySpec = javax.crypto.SecretKeyFactory.getInstance(optString).getKeySpec(keyGenerator.generateKey(), android.security.keystore.KeyInfo.class);
            kotlin.jvm.internal.o.e(keySpec, "null cannot be cast to non-null type android.security.keystore.KeyInfo");
            boolean isInsideSecureHardware = ((android.security.keystore.KeyInfo) keySpec).isInsideSecureHardware();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCryptoGenerateKey", str2 + isInsideSecureHardware);
            java.util.HashMap i17 = kz5.c1.i(new jz5.l("keyAlias", uuid), new jz5.l("inSecureHardware", java.lang.Boolean.valueOf(isInsideSecureHardware)));
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            i17.put("errno", 0);
            java.lang.String t17 = t("ok", i17);
            kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
            return t17;
        }
        if (!kz5.z.G(cc1.p.f40447m, optString)) {
            java.lang.String concat = "fail:invalid algorithm ".concat(optString);
            str = android.text.TextUtils.isEmpty(concat) ? "fail:jsapi invalid request data" : concat;
            java.lang.String str9 = str == null ? "" : str;
            java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str9, jSONObject3);
            kotlin.jvm.internal.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        if (kotlin.jvm.internal.o.b(optString, "EC")) {
            numArr = new java.lang.Integer[]{224, 256, 384, 521};
            z17 = false;
        } else if (kotlin.jvm.internal.o.b(optString, "RSA")) {
            z17 = false;
            numArr = new java.lang.Integer[]{512, 1024, 2048, 4096};
        } else {
            z17 = false;
            numArr = new java.lang.Integer[0];
        }
        if (!kz5.z.G(numArr, java.lang.Integer.valueOf(optInt))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCryptoGenerateKey", "invalid keysize " + optInt);
            throw new cc1.n(-1, "fail:invalid keysize");
        }
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance(optString, "AndroidKeyStore");
        android.security.keystore.KeyGenParameterSpec.Builder digests = new android.security.keystore.KeyGenParameterSpec.Builder(sb8, 15).setKeySize(optInt).setRandomizedEncryptionRequired(z17).setEncryptionPaddings("NoPadding", "PKCS7Padding", "PKCS1Padding", "OAEPPadding").setSignaturePaddings("PKCS1", "PSS").setDigests("MD5", "SHA-1", "SHA-224", "SHA-256", "SHA-384", "SHA-512");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 28) {
            digests.setIsStrongBoxBacked(false);
        }
        if (i18 >= 31) {
            digests.setMaxUsageCount(-1);
        }
        keyPairGenerator.initialize(digests.build());
        java.security.KeyPair genKeyPair = keyPairGenerator.genKeyPair();
        java.security.spec.KeySpec keySpec2 = java.security.KeyFactory.getInstance(optString).getKeySpec(genKeyPair.getPrivate(), android.security.keystore.KeyInfo.class);
        kotlin.jvm.internal.o.e(keySpec2, "null cannot be cast to non-null type android.security.keystore.KeyInfo");
        boolean isInsideSecureHardware2 = ((android.security.keystore.KeyInfo) keySpec2).isInsideSecureHardware();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCryptoGenerateKey", "doPerform, isInsideSecureHardware: " + isInsideSecureHardware2);
        java.lang.String x17 = x(lVar, jc1.f.f298912a, kz5.c1.i(new jz5.l("publicKey", java.nio.ByteBuffer.wrap(genKeyPair.getPublic().getEncoded())), new jz5.l("keyAlias", uuid), new jz5.l("inSecureHardware", java.lang.Boolean.valueOf(isInsideSecureHardware2))));
        kotlin.jvm.internal.o.f(x17, "makeReturnJsonWithNativeBuffer(...)");
        return x17;
    }
}
