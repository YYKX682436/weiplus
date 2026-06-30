package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class PendingCallback implements android.os.Parcelable, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.gcm.PendingCallback> CREATOR = new com.google.android.gms.gcm.zzj();
    final android.os.IBinder zzal;

    public PendingCallback(android.os.Parcel parcel) {
        this.zzal = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStrongBinder(this.zzal);
    }
}
