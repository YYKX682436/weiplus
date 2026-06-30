package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzm extends com.google.android.gms.internal.gcm.zzd implements com.google.android.gms.iid.zzl {
    public zzm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // com.google.android.gms.iid.zzl
    public final void send(android.os.Message message) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.gcm.zze.zzd(obtainAndWriteInterfaceToken, message);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
