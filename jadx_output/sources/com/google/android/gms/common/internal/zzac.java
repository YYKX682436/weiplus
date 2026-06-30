package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class zzac extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            int readInt = parcel.readInt();
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            onPostInitComplete(readInt, readStrongBinder, bundle);
        } else if (i17 == 2) {
            int readInt2 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzb(readInt2, bundle2);
        } else {
            if (i17 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.zzk zzkVar = (com.google.android.gms.common.internal.zzk) com.google.android.gms.internal.common.zzc.zza(parcel, com.google.android.gms.common.internal.zzk.CREATOR);
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzc(readInt3, readStrongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
