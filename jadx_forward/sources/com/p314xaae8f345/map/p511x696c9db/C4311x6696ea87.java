package com.p314xaae8f345.map.p511x696c9db;

/* renamed from: com.tencent.map.tools.EncryptAesUtils */
/* loaded from: classes7.dex */
public class C4311x6696ea87 {

    /* renamed from: CipherMode */
    private static final java.lang.String f16896x621a726e = "AES/CBC/PKCS5Padding";

    /* renamed from: EMPTY_STRING */
    private static final java.lang.String f16897x2a340763 = "";

    /* renamed from: EMPYT_BYTE_ARR */
    private static final byte[] f16898xb61c3186 = new byte[0];

    /* renamed from: EnDeCrypt */
    private static byte[] m35810x569a3464(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (bArr == null || bArr.length == 0) {
            return f16898xb61c3186;
        }
        try {
            javax.crypto.Cipher m35816x14030901 = m35816x14030901(str, algorithmParameterSpec, i17);
            return m35816x14030901 == null ? f16898xb61c3186 : m35816x14030901.doFinal(bArr);
        } catch (java.lang.Throwable unused) {
            return f16898xb61c3186;
        }
    }

    /* renamed from: EnDeCryptBase64 */
    private static java.lang.String m35811x5f3ee2d3(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (str != null && str.length() != 0) {
            try {
                byte[] bytes = i17 == 1 ? str.getBytes() : i17 == 2 ? android.util.Base64.decode(str.getBytes(), 2) : null;
                if (bytes != null && bytes.length != 0) {
                    byte[] m35810x569a3464 = m35810x569a3464(bytes, str2, algorithmParameterSpec, i17);
                    if (i17 == 1) {
                        return android.util.Base64.encodeToString(m35810x569a3464, 2);
                    }
                    if (i17 == 2) {
                        return new java.lang.String(m35810x569a3464);
                    }
                    return null;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return "";
    }

    /* renamed from: decryptAes256 */
    public static byte[] m35812x85488b11(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return m35810x569a3464(bArr, str, algorithmParameterSpec, 2);
    }

    /* renamed from: decryptAes256Base64 */
    public static java.lang.String m35813x6aeac3c0(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return m35811x5f3ee2d3(str, str2, algorithmParameterSpec, 2);
    }

    /* renamed from: encryptAes256 */
    public static byte[] m35814xb90a61e9(byte[] bArr, java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return m35810x569a3464(bArr, str, algorithmParameterSpec, 1);
    }

    /* renamed from: encryptAes256Base64 */
    public static java.lang.String m35815x21b61898(java.lang.String str, java.lang.String str2, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        return m35811x5f3ee2d3(str, str2, algorithmParameterSpec, 1);
    }

    /* renamed from: getCipher */
    private static javax.crypto.Cipher m35816x14030901(java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i17) {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f16896x621a726e);
        cipher.init(i17, secretKeySpec, algorithmParameterSpec);
        return cipher;
    }
}
