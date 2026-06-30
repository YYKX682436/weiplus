package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public abstract class zzab extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.internal.auth.zzaa {
    public zzab() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        switch (i17) {
            case 1:
                zze((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 2:
                zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR));
                return true;
            case 3:
                zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzo) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR));
                return true;
            case 4:
                zzi();
                return true;
            case 5:
                onFailure((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 6:
                zzd(parcel.createByteArray());
                return true;
            case 7:
                zzd((com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
