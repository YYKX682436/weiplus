package x;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f532351a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object[] f532352b = new java.lang.Object[0];

    public static int a(int[] iArr, int i17, int i18) {
        int i19 = i17 - 1;
        int i27 = 0;
        while (i27 <= i19) {
            int i28 = (i27 + i19) >>> 1;
            int i29 = iArr[i28];
            if (i29 < i18) {
                i27 = i28 + 1;
            } else {
                if (i29 <= i18) {
                    return i28;
                }
                i19 = i28 - 1;
            }
        }
        return ~i27;
    }

    public static int b(long[] jArr, int i17, long j17) {
        int i18 = i17 - 1;
        int i19 = 0;
        while (i19 <= i18) {
            int i27 = (i19 + i18) >>> 1;
            long j18 = jArr[i27];
            if (j18 < j17) {
                i19 = i27 + 1;
            } else {
                if (j18 <= j17) {
                    return i27;
                }
                i18 = i27 - 1;
            }
        }
        return ~i19;
    }
}
