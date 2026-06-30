package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzw extends com.google.android.gms.internal.auth.zzd implements com.google.android.gms.auth.api.signin.internal.zzv {
    public zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzd(com.google.android.gms.auth.api.signin.internal.zzt zztVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zztVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zze(com.google.android.gms.auth.api.signin.internal.zzt zztVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zztVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzv
    public final void zzf(com.google.android.gms.auth.api.signin.internal.zzt zztVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zztVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, obtainAndWriteInterfaceToken);
    }
}
