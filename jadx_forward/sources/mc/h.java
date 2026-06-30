package mc;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class h {
    public static int a(int i17) {
        int[] iArr = new int[2];
        java.lang.System.arraycopy(kc.b.f387796a, 0, iArr, 0, 2);
        for (int i18 = 0; i18 < 2; i18++) {
            int i19 = iArr[i18];
            if (i19 == 0) {
                throw null;
            }
            if (i19 - 1 == i17) {
                return i19;
            }
        }
        throw new java.lang.IllegalArgumentException("invalid camera param state value: " + i17);
    }
}
