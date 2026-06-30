package bt3;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w2 {
    public static /* synthetic */ java.lang.String a(long j17) {
        if (j17 == 0) {
            return "0";
        }
        if (j17 > 0) {
            return java.lang.Long.toString(j17, 10);
        }
        char[] cArr = new char[64];
        long j18 = (j17 >>> 1) / 5;
        long j19 = 10;
        int i17 = 63;
        cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
        while (j18 > 0) {
            i17--;
            cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
            j18 /= j19;
        }
        return new java.lang.String(cArr, i17, 64 - i17);
    }
}
