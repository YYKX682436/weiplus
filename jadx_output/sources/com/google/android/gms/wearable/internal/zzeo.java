package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzeo extends com.google.android.gms.internal.wearable.zza implements com.google.android.gms.wearable.internal.zzem {
    public zzeo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void onConnectedNodes(java.util.List<com.google.android.gms.wearable.internal.zzfo> list) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeTypedList(list);
        transactOneway(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.common.data.DataHolder dataHolder) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, dataHolder);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zzb(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzfoVar);
        transactOneway(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzah zzahVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzahVar);
        transactOneway(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzaw zzawVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzawVar);
        transactOneway(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzfe zzfeVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzfeVar);
        transactOneway(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzfo zzfoVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzfoVar);
        transactOneway(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzi zziVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zziVar);
        transactOneway(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.wearable.internal.zzem
    public final void zza(com.google.android.gms.wearable.internal.zzl zzlVar) {
        android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.wearable.zzc.zza(obtainAndWriteInterfaceToken, zzlVar);
        transactOneway(6, obtainAndWriteInterfaceToken);
    }
}
