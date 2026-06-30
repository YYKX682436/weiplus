package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
    public zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
        android.os.Parcel zzB = zzB(2, zza());
        android.accounts.Account account = (android.accounts.Account) com.google.android.gms.internal.common.zzc.zza(zzB, android.accounts.Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
