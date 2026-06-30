package bs5;

/* loaded from: classes13.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f105588a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            int i18 = i17 * 2;
            char[] cArr2 = f105588a;
            cArr[i18 + 1] = cArr2[b17 & 15];
            cArr[i18] = cArr2[((byte) (b17 >>> 4)) & 15];
        }
        return new java.lang.String(cArr);
    }

    public static byte[] b(java.lang.String str) {
        int i17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        while (true) {
            int i18 = i17 + 1;
            if (i18 >= length) {
                return bArr;
            }
            bArr[i17 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i17), 16) << 4) + java.lang.Character.digit(str.charAt(i18), 16));
            i17 += 2;
        }
    }
}
