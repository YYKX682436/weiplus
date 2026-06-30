package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzbd extends com.google.android.gms.internal.auth.zzd implements com.google.android.gms.internal.auth.zzbc {
    public zzbd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.auth.zzbc
    public final void zzd(com.google.android.gms.internal.auth.zzba zzbaVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbaVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth.zzbc
    public final void zzd(com.google.android.gms.internal.auth.zzba zzbaVar, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbaVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth.zzbc
    public final void zzd(com.google.android.gms.internal.auth.zzba zzbaVar, com.google.android.gms.internal.auth.zzay zzayVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbaVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzayVar);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth.zzbc
    public final void zzd(com.google.android.gms.internal.auth.zzba zzbaVar, com.google.android.gms.internal.auth.zzbe zzbeVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbaVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbeVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
