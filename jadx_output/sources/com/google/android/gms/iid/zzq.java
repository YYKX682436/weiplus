package com.google.android.gms.iid;

/* loaded from: classes13.dex */
final class zzq implements android.os.Parcelable.Creator<com.google.android.gms.iid.MessengerCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.iid.MessengerCompat createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new com.google.android.gms.iid.MessengerCompat(readStrongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.iid.MessengerCompat[] newArray(int i17) {
        return new com.google.android.gms.iid.MessengerCompat[i17];
    }
}
