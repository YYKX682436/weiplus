package qy5;

/* loaded from: classes9.dex */
public abstract class a {
    public static java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b17 : bArr) {
            int i17 = b17 & 255;
            sb6.append("0123456789abcdef".charAt(i17 >> 4));
            sb6.append("0123456789abcdef".charAt(i17 & 15));
        }
        return sb6.toString();
    }

    public static byte[] b(java.lang.String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            int digit = java.lang.Character.digit(charArray[i18 + 1], 16) | (java.lang.Character.digit(charArray[i18], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i17] = (byte) digit;
        }
        return bArr;
    }
}
