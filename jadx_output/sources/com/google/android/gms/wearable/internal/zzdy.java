package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdy> CREATOR = new com.google.android.gms.wearable.internal.zzdz();
    private final int statusCode;
    private final com.google.android.gms.wearable.ConnectionConfiguration[] zzdw;

    public zzdy(int i17, com.google.android.gms.wearable.ConnectionConfiguration[] connectionConfigurationArr) {
        this.statusCode = i17;
        this.zzdw = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zzdw, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
