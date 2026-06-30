package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzea extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzea> CREATOR = new com.google.android.gms.wearable.internal.zzeb();
    public final int statusCode;
    public final java.util.List<com.google.android.gms.wearable.internal.zzfo> zzdx;

    public zzea(int i17, java.util.List<com.google.android.gms.wearable.internal.zzfo> list) {
        this.statusCode = i17;
        this.zzdx = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzdx, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
