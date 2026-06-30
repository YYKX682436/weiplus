package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
public abstract class zzg extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.auth.account.zzf {
    public static com.google.android.gms.auth.account.zzf zzf(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof com.google.android.gms.auth.account.zzf ? (com.google.android.gms.auth.account.zzf) queryLocalInterface : new com.google.android.gms.auth.account.zzh(iBinder);
    }
}
