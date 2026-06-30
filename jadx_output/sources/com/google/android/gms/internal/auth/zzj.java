package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzj extends com.google.android.gms.internal.auth.zzd implements com.google.android.gms.internal.auth.zzh {
    public zzj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzh
    public final android.os.Bundle zzd(android.accounts.Account account) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, account);
        android.os.Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzf.zzd(transactAndReadException, android.os.Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzh
    public final android.os.Bundle zzd(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, account);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, bundle);
        android.os.Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzf.zzd(transactAndReadException, android.os.Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzh
    public final android.os.Bundle zzd(java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        android.os.Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzf.zzd(transactAndReadException, android.os.Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzh
    public final android.os.Bundle zzd(java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, bundle);
        android.os.Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzf.zzd(transactAndReadException, android.os.Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzh
    public final com.google.android.gms.auth.AccountChangeEventsResponse zzd(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, accountChangeEventsRequest);
        android.os.Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse = (com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.internal.auth.zzf.zzd(transactAndReadException, com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR);
        transactAndReadException.recycle();
        return accountChangeEventsResponse;
    }
}
