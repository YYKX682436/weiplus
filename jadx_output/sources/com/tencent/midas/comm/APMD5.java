package com.tencent.midas.comm;

/* loaded from: classes5.dex */
public class APMD5 {
    public static java.lang.String parseByte2HexStr(byte[] bArr) {
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

    public static java.lang.String toMd5(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return parseByte2HexStr(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
