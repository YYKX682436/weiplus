package ve1;

/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f517618a = {18, 52, 86, 120, -112, -85, -51, -17};

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f517619b = null;

    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str.isEmpty() || !str.equals("des")) {
            return null;
        }
        if (str2 == null || str2.length() < 8) {
            throw new java.lang.Exception("secret key is not available");
        }
        byte[] a17 = ve1.b.a(str3);
        if (a17.length == 0) {
            return null;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ve1.g.p(3, "SecretUtils", "start decode milles time = " + currentTimeMillis, null);
            javax.crypto.SecretKey generateSecret = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(str2.getBytes()));
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, generateSecret, new javax.crypto.spec.IvParameterSpec(f517618a));
            java.lang.String str4 = new java.lang.String(cipher.doFinal(a17));
            ve1.g.p(3, "SecretUtils", "end decode milles time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis), null);
            return str4;
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "SecretUtils", "decode des error" + ve1.g.h(e17, false), null);
            throw e17;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str.isEmpty() || !str.equals("des")) {
            return null;
        }
        if (str2 == null || str2.length() < 8) {
            throw new java.lang.Exception("secret key is not available");
        }
        if (str3 == null || str3.isEmpty()) {
            return null;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ve1.g.p(3, "SecretUtils", "start encode milles time = " + currentTimeMillis, null);
            javax.crypto.SecretKey generateSecret = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(str2.getBytes()));
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, generateSecret, new javax.crypto.spec.IvParameterSpec(f517618a));
            java.lang.String b17 = ve1.b.b(cipher.doFinal(str3.getBytes()));
            ve1.g.p(3, "SecretUtils", "end encode milles time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis), null);
            return b17;
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "SecretUtils", "encode des error" + ve1.g.h(e17, false), null);
            throw e17;
        }
    }

    public static synchronized java.lang.String c() {
        java.lang.String str;
        java.lang.String str2;
        synchronized (ve1.l.class) {
            if (f517619b == null) {
                try {
                    byte[] bArr = new byte[20];
                    java.security.SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(40);
                    for (int i17 = 0; i17 < 20; i17++) {
                        byte b17 = bArr[i17];
                        stringBuffer.append("0123456789ABCDEF".charAt((b17 >> 4) & 15));
                        stringBuffer.append("0123456789ABCDEF".charAt(b17 & 15));
                    }
                    str = stringBuffer.toString();
                } catch (java.lang.Exception unused) {
                    str = null;
                }
                f517619b = str;
            }
            str2 = f517619b;
        }
        return str2;
    }
}
