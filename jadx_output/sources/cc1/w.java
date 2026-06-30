package cc1;

/* loaded from: classes7.dex */
public final class w extends cc1.p {
    public static final int CTRL_INDEX = 1285;
    public static final java.lang.String NAME = "cryptoOpen";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0223  */
    @Override // cc1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.l r24, org.json.JSONObject r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc1.w.C(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String D(java.lang.String str) {
        return !r26.n0.D(str, "-", false, 2, null) ? "" : (java.lang.String) r26.n0.f0(str, new java.lang.String[]{"-"}, false, 0, 6, null).get(1);
    }

    public final cc1.g E(com.tencent.mm.plugin.appbrand.jsapi.l env, int i17, org.json.JSONObject jSONObject, java.util.Map map) {
        java.lang.String str;
        java.security.Key f17;
        java.security.Key key;
        javax.crypto.spec.IvParameterSpec ivParameterSpec;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        byte[] bArr;
        java.lang.String optString = jSONObject.optString("algorithm");
        java.lang.String optString2 = jSONObject.optString("keyAlias");
        java.lang.Object opt = jSONObject.opt("key");
        java.lang.Object opt2 = jSONObject.opt("publicKey");
        java.lang.Object opt3 = jSONObject.opt("iv");
        int optInt = jSONObject.optInt("tagLength");
        kotlin.jvm.internal.o.d(optString2);
        boolean z17 = optString2.length() > 0;
        cc1.m mVar = cc1.p.f40444g;
        jc1.d dVar = jc1.f.f298919h;
        if (z17) {
            java.security.KeyStore.Entry c17 = mVar.c(env, optString2);
            if (c17 instanceof java.security.KeyStore.SecretKeyEntry) {
                key = ((java.security.KeyStore.SecretKeyEntry) c17).getSecretKey();
            } else {
                if (!(c17 instanceof java.security.KeyStore.PrivateKeyEntry)) {
                    throw new cc1.n(dVar, "fail:invalid keyAlias");
                }
                key = ((java.security.KeyStore.PrivateKeyEntry) c17).getPrivateKey();
            }
            str = optString2;
        } else {
            boolean z18 = opt2 != null;
            java.lang.String[] strArr = cc1.p.f40447m;
            str = optString2;
            java.lang.String[] strArr2 = cc1.p.f40446i;
            if (!z18) {
                if (!(opt != null)) {
                    throw new cc1.n(dVar, "fail:missing keyAlias or privateKey");
                }
                if (kz5.z.G(strArr2, optString)) {
                    kotlin.jvm.internal.o.d(optString);
                    if (opt instanceof java.nio.ByteBuffer) {
                        f17 = new javax.crypto.spec.SecretKeySpec(ik1.f.a((java.nio.ByteBuffer) opt), optString);
                    } else {
                        if (!(opt instanceof java.lang.String)) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        try {
                            f17 = new javax.crypto.spec.SecretKeySpec(android.util.Base64.decode((java.lang.String) opt, 0), optString);
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new cc1.n(-1, "fail:invalid key");
                        }
                    }
                } else {
                    if (!kz5.z.G(strArr, optString)) {
                        throw new cc1.n(dVar, "fail:invalid algorithm");
                    }
                    kotlin.jvm.internal.o.d(optString);
                    f17 = mVar.f(optString, opt);
                }
                key = f17;
            } else {
                if (kz5.z.G(strArr2, optString)) {
                    throw new cc1.n(dVar, "fail:symmetric algorithm does not support publicKey");
                }
                if (!kz5.z.G(strArr, optString)) {
                    throw new cc1.n(dVar, "fail:invalid algorithm");
                }
                kotlin.jvm.internal.o.d(optString);
                key = mVar.g(optString, opt2);
            }
        }
        try {
            kotlin.jvm.internal.o.d(optString);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(F(optString));
            try {
                if (kz5.z.G(new java.lang.String[]{"CBC", "GCM"}, D(optString))) {
                    if (opt3 instanceof java.nio.ByteBuffer) {
                        bArr = ik1.f.a((java.nio.ByteBuffer) opt3);
                    } else {
                        if (opt3 != null) {
                            throw new cc1.n(dVar, "fail:invalid iv");
                        }
                        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                        java.lang.String D = D(optString);
                        byte[] bArr2 = new byte[kotlin.jvm.internal.o.b(D, "CBC") ? 16 : kotlin.jvm.internal.o.b(D, "GCM") ? 12 : 0];
                        secureRandom.nextBytes(bArr2);
                        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2);
                        kotlin.jvm.internal.o.f(wrap, "wrap(...)");
                        map.put("iv", wrap);
                        bArr = bArr2;
                    }
                    kotlin.jvm.internal.o.d(bArr);
                    java.lang.String D2 = D(optString);
                    if (kotlin.jvm.internal.o.b(D2, "CBC")) {
                        ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
                        algorithmParameterSpec = ivParameterSpec;
                        cipher.init(i17, key, algorithmParameterSpec);
                        return new cc1.c(cipher);
                    }
                    if (kotlin.jvm.internal.o.b(D2, "GCM")) {
                        if (optInt < 0) {
                            throw new cc1.n(dVar, "fail:invalid tagLength");
                        }
                        algorithmParameterSpec = new javax.crypto.spec.GCMParameterSpec(optInt, bArr);
                        cipher.init(i17, key, algorithmParameterSpec);
                        return new cc1.c(cipher);
                    }
                }
                cipher.init(i17, key, algorithmParameterSpec);
                return new cc1.c(cipher);
            } catch (java.security.InvalidAlgorithmParameterException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoOpen", e17, "invalid spec " + algorithmParameterSpec, new java.lang.Object[0]);
                throw new cc1.n(dVar, "fail:invalid iv/tagLength");
            } catch (java.security.InvalidKeyException e18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invalid key ");
                kotlin.jvm.internal.o.g(env, "env");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String appId = env.getAppId();
                kotlin.jvm.internal.o.f(appId, "getAppId(...)");
                sb7.append("com.tencent.mm.plugin.appbrand.jsapi.crypto." + appId + ".key.");
                sb7.append(str);
                sb6.append(sb7.toString());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoOpen", e18, sb6.toString(), new java.lang.Object[0]);
                throw new cc1.n(dVar, "fail:invalid key");
            }
            ivParameterSpec = null;
            algorithmParameterSpec = ivParameterSpec;
        } catch (java.security.NoSuchAlgorithmException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoOpen", e19, "NoSuchAlgorithm", new java.lang.Object[0]);
            throw new cc1.n(dVar, "fail:no such algorithm");
        }
    }

    public final java.lang.String F(java.lang.String str) {
        if (!r26.n0.D(str, "-", false, 2, null)) {
            return str;
        }
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"-"}, false, 0, 6, null);
        if (f07.size() != 2) {
            throw new java.security.NoSuchAlgorithmException("invalid algorithm");
        }
        if (kz5.z.G(cc1.p.f40446i, f07.get(0)) && kz5.z.G(cc1.p.f40445h, f07.get(1))) {
            return ((java.lang.String) f07.get(0)) + '/' + ((java.lang.String) f07.get(1)) + '/' + ((kotlin.jvm.internal.o.b(f07.get(0), "AES") && kotlin.jvm.internal.o.b(f07.get(1), "GCM")) ? "NoPadding" : "PKCS7Padding");
        }
        if (!kotlin.jvm.internal.o.b(f07.get(0), "RSA")) {
            throw new java.security.NoSuchAlgorithmException("invalid algorithm");
        }
        return ((java.lang.String) f07.get(0)) + '/' + ((java.lang.String) f07.get(1)) + "/NoPadding";
    }
}
