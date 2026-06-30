package com.google.android.gms.common;

/* loaded from: classes13.dex */
public final class zzd {
    public static int zza(int i17) {
        int[] iArr = {1, 2, 3};
        for (int i18 = 0; i18 < 3; i18++) {
            int i19 = iArr[i18];
            int i27 = i19 - 1;
            if (i19 == 0) {
                throw null;
            }
            if (i27 == i17) {
                return i19;
            }
        }
        return 1;
    }
}
