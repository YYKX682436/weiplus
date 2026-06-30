package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzbl extends com.google.android.gms.internal.auth.zzd implements com.google.android.gms.internal.auth.zzbk {
    public zzbl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    @Override // com.google.android.gms.internal.auth.zzbk
    public final void zzd(com.google.android.gms.internal.auth.zzbi zzbiVar, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, zzbiVar);
        com.google.android.gms.internal.auth.zzf.zzd(obtainAndWriteInterfaceToken, proxyRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
