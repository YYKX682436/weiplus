package com.google.android.gms.internal.ads_identifier;

/* loaded from: classes13.dex */
public final class zzg extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zze {
    public zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final java.lang.String getId() {
        android.os.Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        java.lang.String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean zzb(boolean z17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.ads_identifier.zzc.zza(obtainAndWriteInterfaceToken, true);
        android.os.Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        boolean zza = com.google.android.gms.internal.ads_identifier.zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean zzc() {
        android.os.Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        boolean zza = com.google.android.gms.internal.ads_identifier.zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }
}
