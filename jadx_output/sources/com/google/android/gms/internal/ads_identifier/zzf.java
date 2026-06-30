package com.google.android.gms.internal.ads_identifier;

/* loaded from: classes13.dex */
public abstract class zzf extends com.google.android.gms.internal.ads_identifier.zzb implements com.google.android.gms.internal.ads_identifier.zze {
    public static com.google.android.gms.internal.ads_identifier.zze zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads_identifier.zze ? (com.google.android.gms.internal.ads_identifier.zze) queryLocalInterface : new com.google.android.gms.internal.ads_identifier.zzg(iBinder);
    }
}
