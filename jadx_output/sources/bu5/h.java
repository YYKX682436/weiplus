package bu5;

/* loaded from: classes13.dex */
public class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.soter.soterserver.SoterSignResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.soter.soterserver.SoterSignResult[i17];
    }
}
