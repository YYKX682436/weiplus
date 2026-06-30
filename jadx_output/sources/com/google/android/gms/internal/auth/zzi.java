package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public abstract class zzi extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.internal.auth.zzh {
    public static com.google.android.gms.internal.auth.zzh zzd(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.auth.zzh ? (com.google.android.gms.internal.auth.zzh) queryLocalInterface : new com.google.android.gms.internal.auth.zzj(iBinder);
    }
}
