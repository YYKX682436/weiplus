package kk;

/* loaded from: classes7.dex */
public abstract class r {
    public static java.lang.String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i17 = 0;
        for (byte b17 : bArr) {
            int i18 = i17 + 1;
            cArr2[i17] = cArr[(b17 >>> 4) & 15];
            i17 = i18 + 1;
            cArr2[i18] = cArr[b17 & 15];
        }
        return new java.lang.String(cArr2);
    }

    public static java.lang.String b(java.lang.String str) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        return a(messageDigest.digest(byteArrayOutputStream.toByteArray()));
    }
}
