package com.tencent.mapsdk.internal;

/* loaded from: classes7.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f50283a = "AESCrypt";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50284b = "AES/CBC/PKCS7Padding";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f50285c = "UTF-8";

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f50286d = "SHA-256";

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f50287e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private lc() {
    }

    public static java.lang.String a(java.lang.String str) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(f50286d);
        byte[] bytes = str.getBytes("UTF-8");
        messageDigest.update(bytes, 0, bytes.length);
        return android.util.Base64.encodeToString(messageDigest.digest(), 2);
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(android.util.Base64.decode(str, 2), "AES");
            byte[] decode = android.util.Base64.decode(str2, 2);
            byte[] bArr = f50287e;
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f50284b);
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr));
            return new java.lang.String(cipher.doFinal(decode), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.security.GeneralSecurityException(e17);
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(android.util.Base64.decode(str, 2), "AES");
            byte[] bArr = f50287e;
            byte[] bytes = str2.getBytes("UTF-8");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f50284b);
            cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr));
            return android.util.Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.security.GeneralSecurityException(e17);
        }
    }

    private static byte[] b(javax.crypto.spec.SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f50284b);
        cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    private static byte[] a(javax.crypto.spec.SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f50284b);
        cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    private static java.lang.String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            cArr2[i19] = cArr[i18 >>> 4];
            cArr2[i19 + 1] = cArr[i18 & 15];
        }
        return new java.lang.String(cArr2);
    }
}
