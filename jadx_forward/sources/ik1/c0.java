package ik1;

/* loaded from: classes7.dex */
public abstract class c0 {
    public static int[] a(int i17) {
        if (i17 == 0) {
            return new int[0];
        }
        int[] iArr = new int[32];
        int i18 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            int i27 = (1 << i19) & i17;
            if (i27 != 0) {
                iArr[i18] = i27;
                i18++;
            }
        }
        return java.util.Arrays.copyOfRange(iArr, 0, i18);
    }

    public static long b(int i17) {
        return i17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }
}
