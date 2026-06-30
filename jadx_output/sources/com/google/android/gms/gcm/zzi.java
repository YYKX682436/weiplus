package com.google.android.gms.gcm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzi implements android.os.Parcelable.Creator<com.google.android.gms.gcm.OneoffTask> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.OneoffTask createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.gcm.OneoffTask(parcel, (com.google.android.gms.gcm.zzi) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.gcm.OneoffTask[] newArray(int i17) {
        return new com.google.android.gms.gcm.OneoffTask[i17];
    }
}
