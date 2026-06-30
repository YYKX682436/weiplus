package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzs {
    public static int zza(int i17, int i18, java.lang.String str) {
        java.lang.String zza;
        if (i17 >= 0 && i17 < i18) {
            return i17;
        }
        if (i17 < 0) {
            zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzy.zza("%s (%s) must not be negative", ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
        } else {
            if (i18 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i18);
            }
            zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzy.zza("%s (%s) must be less than size (%s)", ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        throw new java.lang.IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i17, int i18, java.lang.String str) {
        if (i17 < 0 || i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(zzd(i17, i18, ya.b.f77479x42930b2));
        }
        return i17;
    }

    public static void zzc(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < i17 || i18 > i19) {
            throw new java.lang.IndexOutOfBoundsException((i17 < 0 || i17 > i19) ? zzd(i17, i19, "start index") : (i18 < 0 || i18 > i19) ? zzd(i18, i19, "end index") : com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzy.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)));
        }
    }

    private static java.lang.String zzd(int i17, int i18, java.lang.String str) {
        if (i17 < 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzy.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i17));
        }
        if (i18 >= 0) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzy.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i18);
    }
}
