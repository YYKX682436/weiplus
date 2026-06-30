package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f49868b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f49867a = new byte[0];

    private static byte a(char c17) {
        int i17;
        if (c17 < '0' || c17 > '9') {
            char c18 = 'a';
            if (c17 < 'a' || c17 > 'f') {
                c18 = 'A';
                if (c17 < 'A' || c17 > 'F') {
                    return (byte) 0;
                }
            }
            i17 = (c17 - c18) + 10;
        } else {
            i17 = c17 - '0';
        }
        return (byte) i17;
    }

    private static byte b(java.lang.String str) {
        if (str == null || str.length() != 1) {
            return (byte) 0;
        }
        return a(str.charAt(0));
    }

    private static java.lang.String a(byte b17) {
        char[] cArr = f49868b;
        return new java.lang.String(new char[]{cArr[((byte) (b17 >>> 4)) & 15], cArr[b17 & 15]});
    }

    private static java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.flip();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return a(bArr);
    }

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            int i18 = i17 * 2;
            char[] cArr2 = f49868b;
            cArr[i18 + 1] = cArr2[b17 & 15];
            cArr[i18 + 0] = cArr2[((byte) (b17 >>> 4)) & 15];
        }
        return new java.lang.String(cArr);
    }

    public static byte[] a(java.lang.String str) {
        if (str != null && !str.equals("")) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = i17 * 2;
                bArr[i17] = (byte) ((a(str.charAt(i18)) * com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) + a(str.charAt(i18 + 1)));
            }
            return bArr;
        }
        return f49867a;
    }
}
