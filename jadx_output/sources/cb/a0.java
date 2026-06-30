package cb;

/* loaded from: classes13.dex */
public final class a0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new com.google.firebase.iid.zzi(readStrongBinder);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i17) {
        return new com.google.firebase.iid.zzi[i17];
    }
}
