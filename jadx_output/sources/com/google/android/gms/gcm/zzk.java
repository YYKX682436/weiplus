package com.google.android.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.gcm.PeriodicTask> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.PeriodicTask createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.gcm.PeriodicTask(parcel, (com.google.android.gms.gcm.zzk) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.PeriodicTask[] newArray(int i17) {
        return new com.google.android.gms.gcm.PeriodicTask[i17];
    }
}
