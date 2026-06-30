package ve1;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f517602a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f517603b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static byte[] a(java.lang.String str) {
        byte[] bArr = new byte[str.length() / 2];
        int length = (str.length() / 2) * 2;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            byte[] bArr2 = f517603b;
            int i19 = i17 + 1;
            bArr[i18] = (byte) ((bArr2[str.charAt(i17)] << 4) | bArr2[str.charAt(i19)]);
            i18++;
            i17 = i19 + 1;
        }
        return bArr;
    }

    public static java.lang.String b(byte[] bArr) {
        int length = bArr.length;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length * 2);
        int i17 = length + 0;
        for (int i18 = 0; i18 < i17; i18++) {
            char[] cArr = f517602a;
            sb6.append(cArr[(bArr[i18] & 240) >> 4]);
            sb6.append(cArr[bArr[i18] & 15]);
        }
        return sb6.toString();
    }
}
