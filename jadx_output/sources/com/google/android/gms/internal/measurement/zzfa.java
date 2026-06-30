package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzfa extends com.google.android.gms.internal.measurement.zzn implements com.google.android.gms.internal.measurement.zzey {
    public zzfa(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(com.google.android.gms.internal.measurement.zzdz zzdzVar, boolean z17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, z17);
        android.os.Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        java.util.ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(com.google.android.gms.internal.measurement.zzjx.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzb(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.lang.String zzc(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        android.os.Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        java.lang.String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzd(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zze(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        android.os.Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        java.util.ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(com.google.android.gms.internal.measurement.zzed.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zza(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        android.os.Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
        java.util.ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(com.google.android.gms.internal.measurement.zzed.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zzb(com.google.android.gms.internal.measurement.zzed zzedVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzedVar);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, z17);
        android.os.Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        java.util.ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(com.google.android.gms.internal.measurement.zzjx.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zza(java.lang.String str, java.lang.String str2, boolean z17, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, z17);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        android.os.Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
        java.util.ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(com.google.android.gms.internal.measurement.zzjx.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j17);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzed zzedVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzedVar);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzeuVar);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzeuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final void zza(com.google.android.gms.internal.measurement.zzjx zzjxVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzjxVar);
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzdzVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.measurement.zzey
    public final byte[] zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzp.zza(obtainAndWriteInterfaceToken, zzeuVar);
        obtainAndWriteInterfaceToken.writeString(str);
        android.os.Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        byte[] createByteArray = transactAndReadException.createByteArray();
        transactAndReadException.recycle();
        return createByteArray;
    }
}
