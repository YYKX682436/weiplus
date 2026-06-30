package ko3;

/* loaded from: classes8.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f391482a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static java.lang.String a(byte[] bArr, int i17, int i18) {
        char[] cArr = new char[(i18 - i17) * 2];
        int i19 = 0;
        while (i17 < i18) {
            byte b17 = bArr[i17];
            int i27 = i19 + 1;
            char[] cArr2 = f391482a;
            cArr[i19] = cArr2[(b17 >>> 4) & 15];
            i19 = i27 + 1;
            cArr[i27] = cArr2[b17 & 15];
            i17++;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int i17 = 1;
        while (true) {
            int i18 = 0;
            try {
                try {
                    i18 = str.charAt(i17 - 1) ^ str.charAt(i17);
                    i17++;
                    if (i17 == str.length()) {
                        sb6.append((char) i18);
                        return sb6.toString();
                    }
                    sb6.append((char) i18);
                    return sb6.toString();
                } catch (java.lang.Throwable th6) {
                    sb6.append((char) i18);
                    throw th6;
                }
            }
        }
    }
}
