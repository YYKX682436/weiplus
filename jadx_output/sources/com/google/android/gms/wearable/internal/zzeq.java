package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzeq extends com.google.android.gms.internal.wearable.zza implements com.google.android.gms.wearable.internal.zzep {
    public zzeq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(com.google.android.gms.wearable.internal.zzek zzekVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzc(com.google.android.gms.wearable.internal.zzek zzekVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(43, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(com.google.android.gms.wearable.internal.zzek zzekVar, android.net.Uri uri, int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, uri);
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(41, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzc(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, android.net.Uri uri) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, uri);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.internal.zzei zzeiVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzeiVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(35, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, android.net.Uri uri, int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, uri);
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(40, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(47, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.Asset asset) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, asset);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zzb(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.PutDataRequest putDataRequest) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, putDataRequest);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.internal.zzd zzdVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzdVar);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.internal.zzei zzeiVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzeiVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(34, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, com.google.android.gms.wearable.internal.zzfw zzfwVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzfwVar);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(46, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, int i17) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i17);
        transactAndReadExceptionReturnVoid(42, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, parcelFileDescriptor);
        transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor, long j17, long j18) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, parcelFileDescriptor);
        obtainAndWriteInterfaceToken.writeLong(j17);
        obtainAndWriteInterfaceToken.writeLong(j18);
        transactAndReadExceptionReturnVoid(39, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, java.lang.String str2) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzep
    public final void zza(com.google.android.gms.wearable.internal.zzek zzekVar, java.lang.String str, java.lang.String str2, byte[] bArr) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzekVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeByteArray(bArr);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }
}
