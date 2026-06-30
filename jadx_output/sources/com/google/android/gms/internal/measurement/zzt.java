package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzt extends com.google.android.gms.internal.measurement.zzn implements com.google.android.gms.internal.measurement.zzr {
    public zzt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final android.os.Bundle zza(android.os.Bundle bundle) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, bundle);
        android.os.Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzp.zza(transactAndReadException, android.os.Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }
}
