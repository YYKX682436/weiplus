package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzfw> CREATOR = new com.google.android.gms.wearable.internal.zzfx();
    private final int versionCode;
    private final com.google.android.gms.wearable.internal.zzem zzaz;

    public zzfw(int i17, android.os.IBinder iBinder) {
        this.versionCode = i17;
        if (iBinder == null) {
            this.zzaz = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zzaz = queryLocalInterface instanceof com.google.android.gms.wearable.internal.zzem ? (com.google.android.gms.wearable.internal.zzem) queryLocalInterface : new com.google.android.gms.wearable.internal.zzeo(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.wearable.internal.zzem zzemVar = this.zzaz;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzemVar == null ? null : zzemVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfw(com.google.android.gms.wearable.internal.zzem zzemVar) {
        this.versionCode = 1;
        this.zzaz = zzemVar;
    }
}
