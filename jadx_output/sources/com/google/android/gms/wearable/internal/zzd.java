package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzd> CREATOR = new com.google.android.gms.wearable.internal.zze();
    private final com.google.android.gms.wearable.internal.zzem zzaz;
    private final android.content.IntentFilter[] zzba;
    private final java.lang.String zzbb;
    private final java.lang.String zzbc;

    public zzd(android.os.IBinder iBinder, android.content.IntentFilter[] intentFilterArr, java.lang.String str, java.lang.String str2) {
        if (iBinder != null) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = queryLocalInterface instanceof com.google.android.gms.wearable.internal.zzem ? (com.google.android.gms.wearable.internal.zzem) queryLocalInterface : new com.google.android.gms.wearable.internal.zzeo(iBinder);
        } else {
            this.zzaz = null;
        }
        this.zzba = intentFilterArr;
        this.zzbb = str;
        this.zzbc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.wearable.internal.zzem zzemVar = this.zzaz;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzemVar == null ? null : zzemVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zzba, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzbb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzd(com.google.android.gms.wearable.internal.zzhk zzhkVar) {
        this.zzaz = zzhkVar;
        this.zzba = zzhkVar.zze();
        this.zzbb = zzhkVar.zzf();
        this.zzbc = null;
    }
}
