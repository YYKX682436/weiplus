package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* loaded from: classes12.dex */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: bytesToStringLowercase */
    public static java.lang.String m18572x9601077a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i17 = 0;
        for (byte b17 : bArr) {
            int i18 = b17 & 255;
            int i19 = i17 + 1;
            char[] cArr2 = zzb;
            cArr[i17] = cArr2[i18 >>> 4];
            cArr[i19] = cArr2[i18 & 15];
            i17 = i19 + 1;
        }
        return new java.lang.String(cArr);
    }

    /* renamed from: bytesToStringUppercase */
    public static java.lang.String m18573xc1fe7c9b(byte[] bArr) {
        return m18574xc1fe7c9b(bArr, false);
    }

    /* renamed from: stringToBytes */
    public static byte[] m18575xbf22c95f(java.lang.String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i17 = 0;
        while (i17 < length) {
            int i18 = i17 + 2;
            bArr[i17 / 2] = (byte) java.lang.Integer.parseInt(str.substring(i17, i18), 16);
            i17 = i18;
        }
        return bArr;
    }

    /* renamed from: bytesToStringUppercase */
    public static java.lang.String m18574xc1fe7c9b(byte[] bArr, boolean z17) {
        int length = bArr.length;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length + length);
        for (int i17 = 0; i17 < length && (!z17 || i17 != length - 1 || (bArr[i17] & 255) != 0); i17++) {
            char[] cArr = zza;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }
}
