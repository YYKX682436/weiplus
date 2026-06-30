package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public final class zzh extends com.google.android.gms.internal.gcm.zzd implements com.google.android.gms.gcm.zzg {
    public zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    @Override // com.google.android.gms.gcm.zzg
    public final void zzf(int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
