package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class MD5JNI {
    private static final byte[] HEX_ARRAY = "0123456789abcdef".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    public static java.lang.String bytesToHexStringFast(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            byte[] bArr3 = HEX_ARRAY;
            bArr2[i19] = bArr3[i18 >>> 4];
            bArr2[i19 + 1] = bArr3[i18 & 15];
        }
        return new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static native int getMD5String(java.lang.String str, java.lang.String[] strArr);

    public static native int getMD5StringLegacy(java.lang.String str, java.lang.String[] strArr);

    public static java.lang.String getMD5Wrap(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        getMD5String(str, strArr);
        return strArr[0];
    }

    public static java.lang.String getMD5WrapLegacy(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[1];
        getMD5StringLegacy(str, strArr);
        return strArr[0];
    }
}
