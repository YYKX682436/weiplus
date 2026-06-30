package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public abstract class zzs extends com.google.android.gms.internal.measurement.zzo implements com.google.android.gms.internal.measurement.zzr {
    public static com.google.android.gms.internal.measurement.zzr zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzr ? (com.google.android.gms.internal.measurement.zzr) queryLocalInterface : new com.google.android.gms.internal.measurement.zzt(iBinder);
    }
}
