package bu5;

/* loaded from: classes5.dex */
public class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.soter.soterserver.SoterDeviceResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.soter.soterserver.SoterDeviceResult[i17];
    }
}
