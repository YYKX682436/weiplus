package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzah {
    public static java.lang.Object[] zza(java.lang.Object[] objArr, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            if (objArr[i18] == null) {
                throw new java.lang.NullPointerException("at index " + i18);
            }
        }
        return objArr;
    }
}
