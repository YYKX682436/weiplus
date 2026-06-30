package com.google.android.gms.auth.account;

/* loaded from: classes13.dex */
public final class zzh extends com.google.android.gms.internal.auth.zzd implements com.google.android.gms.auth.account.zzf {
    public zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zzf
    public final void zzd(com.google.android.gms.auth.account.zzd zzdVar, android.accounts.Account account) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzdVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, account);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzf
    public final void zze(boolean z17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, z17);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzf
    public final void zzd(com.google.android.gms.auth.account.zzd zzdVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzdVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
