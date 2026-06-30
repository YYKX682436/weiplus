package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APMD5 */
/* loaded from: classes5.dex */
public class C4758x3b97eef {
    /* renamed from: parseByte2HexStr */
    public static java.lang.String m41649x58cb6d2d(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    /* renamed from: toMd5 */
    public static java.lang.String m41650x6964903(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return m41649x58cb6d2d(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
