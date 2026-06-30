package id;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final id.g f371986a = new id.g();

    public final boolean a(javax.crypto.SecretKey secretKey) {
        try {
            java.security.spec.KeySpec keySpec = javax.crypto.SecretKeyFactory.getInstance(secretKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(secretKey, android.security.keystore.KeyInfo.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(keySpec, "null cannot be cast to non-null type android.security.keystore.KeyInfo");
            return ((android.security.keystore.KeyInfo) keySpec).isInsideSecureHardware();
        } catch (java.security.spec.InvalidKeySpecException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWxPayUtil", "invalid key spec");
            return false;
        }
    }

    public final byte[] b(java.lang.String keyId, byte[] encrypted) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyId, "keyId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encrypted, "encrypted");
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        d(keyStore, keyId);
        java.security.Key key = keyStore.getKey(keyId, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
        if (!a((javax.crypto.SecretKey) key)) {
            throw new id.a("outside hardware keystore");
        }
        if (encrypted.length < 12) {
            throw new java.lang.Exception("Encrypted data too short");
        }
        byte[] q17 = kz5.v.q(encrypted, 0, 12);
        byte[] q18 = kz5.v.q(encrypted, 12, encrypted.length);
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, new javax.crypto.spec.GCMParameterSpec(128, q17));
            byte[] doFinal = cipher.doFinal(q18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(doFinal, "doFinal(...)");
            return doFinal;
        } catch (javax.crypto.AEADBadTagException e17) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.Throwable cause = e17.getCause();
            objArr[0] = cause != null ? cause.getMessage() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWxPayUtil", "decryptData error, invalid encrypted data：%s", objArr);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.Throwable cause2 = e17.getCause();
            objArr2[0] = cause2 != null ? cause2.getMessage() : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppWxPayUtil", e17, "decryptData error:", objArr2);
            throw e17;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWxPayUtil", "decryptData error: " + e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppWxPayUtil", e18, "decryptData error:", e18.getMessage());
            throw e18;
        }
    }

    public final byte[] c(java.lang.String keyId, byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyId, "keyId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        d(keyStore, keyId);
        java.security.Key key = keyStore.getKey(keyId, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
        if (!a((javax.crypto.SecretKey) key)) {
            throw new id.a("outside hardware keystore");
        }
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, key);
        byte[] iv6 = cipher.getIV();
        byte[] doFinal = cipher.doFinal(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iv6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(doFinal);
        return kz5.v.x(iv6, doFinal);
    }

    public final void d(java.security.KeyStore keyStore, java.lang.String str) {
        if (keyStore.containsAlias(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWxPayUtil", "The keyId is not exist: " + str);
        throw new java.lang.IllegalArgumentException("The KeyId is not exist");
    }
}
