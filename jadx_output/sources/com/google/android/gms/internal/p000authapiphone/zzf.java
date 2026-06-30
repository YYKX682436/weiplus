package com.google.android.gms.internal.p000authapiphone;

/* loaded from: classes13.dex */
public final class zzf extends com.google.android.gms.internal.p000authapiphone.zza implements com.google.android.gms.internal.p000authapiphone.zze {
    public zzf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zze
    public final void zza(com.google.android.gms.internal.p000authapiphone.zzg zzgVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapiphone.zzc.zza(obtainAndWriteInterfaceToken, zzgVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
