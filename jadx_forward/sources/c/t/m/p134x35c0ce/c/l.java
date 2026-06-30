package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f118437a = {84, 101, 110, 99, 101, 110, 116, 76, 111, 99, 97, 116, 105, 111, 110, 49};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f118438b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f118439c = new byte[0];

    public static java.lang.String a(java.lang.String str) {
        try {
            return new java.lang.String(a(android.util.Base64.decode(str.getBytes(), 2)), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return a(str, str2, 1);
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i17, int i18) {
        byte[] bArr2 = new byte[16];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 16);
        return a(bArr, i17 + 16, i18 - 16, bArr2, bArr2, 2);
    }

    public static byte[] a(byte[] bArr, int i17, int i18, byte[] bArr2, byte[] bArr3, int i19) {
        if (i19 != 1 && i19 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (bArr != null && bArr.length != 0 && i17 >= 0 && i18 > 0) {
            try {
                javax.crypto.Cipher a17 = a(bArr2, bArr3, i19);
                return a17 == null ? f118439c : a17.doFinal(bArr, i17, i18);
            } catch (java.lang.Throwable unused) {
                return f118439c;
            }
        }
        return f118439c;
    }

    public static javax.crypto.Cipher a(byte[] bArr, byte[] bArr2, int i17) {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i17, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
        return cipher;
    }

    public static javax.crypto.Cipher a(java.lang.String str, int i17) {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i17, secretKeySpec, new javax.crypto.spec.IvParameterSpec(f118437a));
        return cipher;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
        byte[] decode;
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (str != null && str.length() != 0) {
            try {
                if (i17 == 1) {
                    decode = str.getBytes();
                } else {
                    decode = i17 == 2 ? android.util.Base64.decode(str.getBytes(), 2) : null;
                }
                if (decode != null && decode.length != 0) {
                    byte[] a17 = a(decode, str2, i17);
                    if (i17 == 1) {
                        return android.util.Base64.encodeToString(a17, 2);
                    }
                    if (i17 == 2) {
                        return new java.lang.String(a17);
                    }
                    return null;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return "";
    }

    public static byte[] a(byte[] bArr, java.lang.String str, int i17) {
        if (i17 != 1 && i17 != 2) {
            throw new java.lang.IllegalArgumentException("wrong mode.");
        }
        if (bArr != null && bArr.length != 0) {
            try {
                javax.crypto.Cipher a17 = a(str, i17);
                if (a17 == null) {
                    return f118438b;
                }
                return a17.doFinal(bArr);
            } catch (java.lang.Throwable unused) {
                return f118438b;
            }
        }
        return f118438b;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return a(str, str2, 2);
    }

    public static byte[] a(byte[] bArr, java.lang.String str) {
        return a(bArr, str, 2);
    }
}
