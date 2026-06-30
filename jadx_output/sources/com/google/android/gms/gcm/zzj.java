package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
final class zzj implements android.os.Parcelable.Creator<com.google.android.gms.gcm.PendingCallback> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.PendingCallback createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.gcm.PendingCallback(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.PendingCallback[] newArray(int i17) {
        return new com.google.android.gms.gcm.PendingCallback[i17];
    }
}
