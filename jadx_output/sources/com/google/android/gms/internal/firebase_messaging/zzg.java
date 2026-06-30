package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
public final class zzg extends com.google.android.gms.internal.firebase_messaging.zza implements com.google.android.gms.internal.firebase_messaging.zze {
    public zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zze
    public final void send(android.os.Message message) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_messaging.zzc.zza(obtainAndWriteInterfaceToken, message);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
