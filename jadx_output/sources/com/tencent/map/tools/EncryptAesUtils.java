package com.tencent.map.tools;

/* loaded from: classes7.dex */
public class EncryptAesUtils {
    private static final java.lang.String CipherMode = "AES/CBC/PKCS5Padding";
    private static final java.lang.String EMPTY_STRING = "";
    private static final byte[] EMPYT_BYTE_ARR = new byte[0];

    private static byte[] EnDeCrypt(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (bArr == null || bArr.length == 0) {
            return EMPYT_BYTE_ARR;
        }
        try {
            javax.crypto.Cipher cipher = getCipher(str, algorithmParameterSpec, i17);
            return cipher == null ? EMPYT_BYTE_ARR : cipher.doFinal(bArr);
        } catch (java.lang.Throwable unused) {
            return EMPYT_BYTE_ARR;
        }
    }

    private static java.lang.String EnDeCryptBase64(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (str != null && str.length() != 0) {
            try {
                byte[] bytes = i17 == 1 ? str.getBytes() : i17 == 2 ? android.util.Base64.decode(str.getBytes(), 2) : null;
                if (bytes != null && bytes.length != 0) {
                    byte[] EnDeCrypt = EnDeCrypt(bytes, str2, algorithmParameterSpec, i17);
                    if (i17 == 1) {
                        return android.util.Base64.encodeToString(EnDeCrypt, 2);
                    }
                    if (i17 == 2) {
                        return new java.lang.String(EnDeCrypt);
                    }
                    return null;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return "";
    }

    public static byte[] decryptAes256(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 2);
    }

    public static java.lang.String decryptAes256Base64(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 2);
    }

    public static byte[] encryptAes256(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 1);
    }

    public static java.lang.String encryptAes256Base64(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 1);
    }

    private static javax.crypto.Cipher getCipher(java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str.getBytes(com.tencent.mapsdk.internal.rv.f51270c), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(CipherMode);
        cipher.init(i17, secretKeySpec, algorithmParameterSpec);
        return cipher;
    }
}
