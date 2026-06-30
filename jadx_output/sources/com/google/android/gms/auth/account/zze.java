package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
public abstract class zze extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.auth.account.zzd {
    public zze() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzf((android.accounts.Account) com.google.android.gms.internal.auth.zzf.zzd(parcel, android.accounts.Account.CREATOR));
        } else {
            if (i17 != 2) {
                return false;
            }
            zzd(com.google.android.gms.internal.auth.zzf.zzd(parcel));
        }
        return true;
    }
}
