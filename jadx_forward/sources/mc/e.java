package mc;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class e {
    public static int a(int i17) {
        int[] iArr = new int[5];
        java.lang.System.arraycopy(kc.b.f387796a, 0, iArr, 0, 5);
        for (int i18 = 0; i18 < 5; i18++) {
            int i19 = iArr[i18];
            int i27 = 1;
            if (i19 == 1) {
                i27 = -1;
            } else if (i19 == 2) {
                i27 = 0;
            } else if (i19 != 3) {
                if (i19 == 4) {
                    i27 = 2;
                } else {
                    if (i19 != 5) {
                        throw null;
                    }
                    i27 = 3;
                }
            }
            if (i27 == i17) {
                return i19;
            }
        }
        throw new java.lang.IllegalArgumentException("invalid camera param stage value: " + i17);
    }
}
