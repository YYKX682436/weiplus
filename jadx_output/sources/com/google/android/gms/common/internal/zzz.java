package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzaa {
    public zzz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static com.google.android.gms.common.internal.zzaa zzg(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zzaa ? (com.google.android.gms.common.internal.zzaa) queryLocalInterface : new com.google.android.gms.common.internal.zzy(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            com.google.android.gms.dynamic.IObjectWrapper zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, zzd);
        } else {
            if (i17 != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
