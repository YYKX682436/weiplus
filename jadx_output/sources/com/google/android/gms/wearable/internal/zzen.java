package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public abstract class zzen extends com.google.android.gms.internal.wearable.zzb implements com.google.android.gms.wearable.internal.zzem {
    public zzen() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        switch (i17) {
            case 1:
                zza((com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR));
                return true;
            case 2:
                zza((com.google.android.gms.wearable.internal.zzfe) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfe.CREATOR));
                return true;
            case 3:
                zza((com.google.android.gms.wearable.internal.zzfo) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfo.CREATOR));
                return true;
            case 4:
                zzb((com.google.android.gms.wearable.internal.zzfo) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfo.CREATOR));
                return true;
            case 5:
                onConnectedNodes(parcel.createTypedArrayList(com.google.android.gms.wearable.internal.zzfo.CREATOR));
                return true;
            case 6:
                zza((com.google.android.gms.wearable.internal.zzl) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzl.CREATOR));
                return true;
            case 7:
                zza((com.google.android.gms.wearable.internal.zzaw) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzaw.CREATOR));
                return true;
            case 8:
                zza((com.google.android.gms.wearable.internal.zzah) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzah.CREATOR));
                return true;
            case 9:
                zza((com.google.android.gms.wearable.internal.zzi) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzi.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
