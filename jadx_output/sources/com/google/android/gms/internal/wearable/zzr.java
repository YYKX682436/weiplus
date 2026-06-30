package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzr {
    protected static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
    private static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
    public static final java.lang.Object zzhk = new java.lang.Object();

    public static boolean equals(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : java.util.Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(fArr);
    }

    public static void zza(com.google.android.gms.internal.wearable.zzn zznVar, com.google.android.gms.internal.wearable.zzn zznVar2) {
        com.google.android.gms.internal.wearable.zzp zzpVar = zznVar.zzhc;
        if (zzpVar != null) {
            zznVar2.zzhc = (com.google.android.gms.internal.wearable.zzp) zzpVar.clone();
        }
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : java.util.Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return java.util.Arrays.hashCode(jArr);
    }

    public static boolean equals(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i17 >= length || objArr[i17] != null) {
                while (i18 < length2 && objArr2[i18] == null) {
                    i18++;
                }
                boolean z17 = i17 >= length;
                boolean z18 = i18 >= length2;
                if (z17 && z18) {
                    return true;
                }
                if (z17 != z18 || !objArr[i17].equals(objArr2[i18])) {
                    return false;
                }
                i17++;
                i18++;
            } else {
                i17++;
            }
        }
    }

    public static int hashCode(java.lang.Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.Object obj = objArr[i18];
            if (obj != null) {
                i17 = (i17 * 31) + obj.hashCode();
            }
        }
        return i17;
    }
}
