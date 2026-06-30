package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public abstract class zzbj extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.internal.auth.zzbi {
    public zzbj() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzd((com.google.android.gms.auth.api.proxy.ProxyResponse) com.google.android.gms.internal.auth.zzf.zzd(parcel, com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR));
        } else {
            if (i17 != 2) {
                return false;
            }
            zzf(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
