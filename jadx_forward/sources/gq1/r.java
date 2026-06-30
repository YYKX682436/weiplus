package gq1;

/* loaded from: classes13.dex */
public abstract class r {
    public static double a(int[] iArr, int i17) {
        if (iArr == null || iArr.length == 0) {
            throw new java.lang.NullPointerException("null == dataGroup || 0 == dataGroup.length");
        }
        int i18 = 0;
        for (int i19 : iArr) {
            i18 += i19;
        }
        return new java.math.BigDecimal(i18).divide(new java.math.BigDecimal(iArr.length), i17, 4).doubleValue();
    }
}
