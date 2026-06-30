package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public abstract class zzbb extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.internal.auth.zzba {
    public zzbb() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.credentials.Credential.CREATOR));
        } else if (i17 == 2) {
            zze((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
        } else {
            if (i17 != 3) {
                return false;
            }
            zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
