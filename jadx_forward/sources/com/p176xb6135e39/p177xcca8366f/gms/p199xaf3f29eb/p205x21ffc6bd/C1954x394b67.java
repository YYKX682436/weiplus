package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.zzah */
/* loaded from: classes13.dex */
public final class C1954x394b67 {
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
                bundle = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18636x9a0587e8(context.getPackageName(), 128).metaData;
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
