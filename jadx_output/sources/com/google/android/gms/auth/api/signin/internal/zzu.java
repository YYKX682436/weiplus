package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public abstract class zzu extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.auth.api.signin.internal.zzt {
    public zzu() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        switch (i17) {
            case 101:
                zzd((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR), (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 102:
                zzg((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 103:
                zzh((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
