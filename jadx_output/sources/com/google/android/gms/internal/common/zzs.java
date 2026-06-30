package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzs {
    public static int zza(int i17, int i18, java.lang.String str) {
        java.lang.String zza;
        if (i17 >= 0 && i17 < i18) {
            return i17;
        }
        if (i17 < 0) {
            zza = com.google.android.gms.internal.common.zzy.zza("%s (%s) must not be negative", ya.b.INDEX, java.lang.Integer.valueOf(i17));
        } else {
            if (i18 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i18);
            }
            zza = com.google.android.gms.internal.common.zzy.zza("%s (%s) must be less than size (%s)", ya.b.INDEX, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        throw new java.lang.IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i17, int i18, java.lang.String str) {
        if (i17 < 0 || i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(zzd(i17, i18, ya.b.INDEX));
        }
        return i17;
    }

    public static void zzc(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < i17 || i18 > i19) {
            throw new java.lang.IndexOutOfBoundsException((i17 < 0 || i17 > i19) ? zzd(i17, i19, "start index") : (i18 < 0 || i18 > i19) ? zzd(i18, i19, "end index") : com.google.android.gms.internal.common.zzy.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)));
        }
    }

    private static java.lang.String zzd(int i17, int i18, java.lang.String str) {
        if (i17 < 0) {
            return com.google.android.gms.internal.common.zzy.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i17));
        }
        if (i18 >= 0) {
            return com.google.android.gms.internal.common.zzy.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i18);
    }
}
