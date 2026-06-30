package com.qq.taf.jce;

/* renamed from: com.qq.taf.jce.HexUtil */
/* loaded from: classes13.dex */
public class C2855x93dd899d {

    /* renamed from: digits */
    private static final char[] f9747xb09cace6 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: emptybytes */
    public static final byte[] f9748xc10b833e = new byte[0];

    /* renamed from: byte2HexStr */
    public static java.lang.String m21237x76b77de0(byte b17) {
        char[] cArr = f9747xb09cace6;
        return new java.lang.String(new char[]{cArr[((byte) (b17 >>> 4)) & 15], cArr[b17 & 15]});
    }

    /* renamed from: bytes2HexStr */
    public static java.lang.String m21238x223991d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            int i18 = i17 * 2;
            char[] cArr2 = f9747xb09cace6;
            cArr[i18 + 1] = cArr2[b17 & 15];
            cArr[i18 + 0] = cArr2[((byte) (b17 >>> 4)) & 15];
        }
        return new java.lang.String(cArr);
    }

    /* renamed from: char2Byte */
    public static byte m21239x5a967ec4(char c17) {
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

    /* renamed from: hexStr2Byte */
    public static byte m21240xc9b39104(java.lang.String str) {
        if (str == null || str.length() != 1) {
            return (byte) 0;
        }
        return m21239x5a967ec4(str.charAt(0));
    }

    /* renamed from: hexStr2Bytes */
    public static byte[] m21241x6cbe8fef(java.lang.String str) {
        if (str == null || str.equals("")) {
            return f9748xc10b833e;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) ((m21239x5a967ec4(str.charAt(i18)) * com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) + m21239x5a967ec4(str.charAt(i18 + 1)));
        }
        return bArr;
    }

    /* renamed from: main */
    public static void m21242x3305b9(java.lang.String[] strArr) {
        try {
            java.lang.System.out.println(m21238x223991d("Hello WebSocket World?".getBytes("gbk")));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }
}
