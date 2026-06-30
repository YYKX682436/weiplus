package bu5;

/* loaded from: classes11.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.soter.soterserver.SoterExtraParam(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.soter.soterserver.SoterExtraParam[i17];
    }
}
