package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzah {
    private static final java.lang.Object zza = new java.lang.Object();
    private static boolean zzb;
    private static java.lang.String zzc;
    private static int zzd;

    public static int zza(android.content.Context context) {
        zzc(context);
        return zzd;
    }

    public static java.lang.String zzb(android.content.Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(android.content.Context context) {
        android.os.Bundle bundle;
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            try {
                bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", e17);
            }
            if (bundle == null) {
                return;
            }
            zzc = bundle.getString("com.google.app.id");
            zzd = bundle.getInt("com.google.android.gms.version");
        }
    }
}
