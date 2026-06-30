package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.MD5JNI */
/* loaded from: classes7.dex */
public class C11706x873c9d47 {

    /* renamed from: HEX_ARRAY */
    private static final byte[] f33491x87eb8bf5 = "0123456789abcdef".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    /* renamed from: bytesToHexStringFast */
    public static java.lang.String m49644x88773ae2(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            byte[] bArr3 = f33491x87eb8bf5;
            bArr2[i19] = bArr3[i18 >>> 4];
            bArr2[i19 + 1] = bArr3[i18 & 15];
        }
        return new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: getMD5String */
    public static native int m49645x40453099(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: getMD5StringLegacy */
    public static native int m49646x88aa79c2(java.lang.String str, java.lang.String[] strArr);

    /* renamed from: getMD5Wrap */
    public static java.lang.String m49647x3af222d2(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        m49645x40453099(str, strArr);
        return strArr[0];
    }

    /* renamed from: getMD5WrapLegacy */
    public static java.lang.String m49648x3d9d1d3b(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[1];
        m49646x88aa79c2(str, strArr);
        return strArr[0];
    }
}
