package com.google.android.gms.wearable.internal;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public final class zzdw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdw> CREATOR = new com.google.android.gms.wearable.internal.zzdx();
    private final int statusCode;
    private final com.google.android.gms.wearable.ConnectionConfiguration zzdv;

    public zzdw(int i17, com.google.android.gms.wearable.ConnectionConfiguration connectionConfiguration) {
        this.statusCode = i17;
        this.zzdv = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdv, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
