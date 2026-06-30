package com.qq.taf.jce;

/* loaded from: classes13.dex */
public class HexUtil {
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final byte[] emptybytes = new byte[0];

    public static java.lang.String byte2HexStr(byte b17) {
        char[] cArr = digits;
        return new java.lang.String(new char[]{cArr[((byte) (b17 >>> 4)) & 15], cArr[b17 & 15]});
    }

    public static java.lang.String bytes2HexStr(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            int i18 = i17 * 2;
            char[] cArr2 = digits;
            cArr[i18 + 1] = cArr2[b17 & 15];
            cArr[i18 + 0] = cArr2[((byte) (b17 >>> 4)) & 15];
        }
        return new java.lang.String(cArr);
    }

    public static byte char2Byte(char c17) {
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

    public static byte hexStr2Byte(java.lang.String str) {
        if (str == null || str.length() != 1) {
            return (byte) 0;
        }
        return char2Byte(str.charAt(0));
    }

    public static byte[] hexStr2Bytes(java.lang.String str) {
        if (str == null || str.equals("")) {
            return emptybytes;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) ((char2Byte(str.charAt(i18)) * com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) + char2Byte(str.charAt(i18 + 1)));
        }
        return bArr;
    }

    public static void main(java.lang.String[] strArr) {
        try {
            java.lang.System.out.println(bytes2HexStr("Hello WebSocket World?".getBytes("gbk")));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }
}
