package ko3;

/* loaded from: classes.dex */
public class n0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.plugin.normsg.utils.ScreenRecordDetector$ScreenRecordInfo

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.p1935x6a710b1.C16754x566c5dec> f37713x681a0c0c = new ko3.n0();

            /* renamed from: d, reason: collision with root package name */
            public final int f233956d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f233957e;

            /* renamed from: f, reason: collision with root package name */
            public final long f233958f;

            {
                this.f233956d = parcel.readInt();
                this.f233957e = parcel.readString();
                this.f233958f = parcel.readLong();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f233956d);
                parcel2.writeString(this.f233957e);
                parcel2.writeLong(this.f233958f);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.p1935x6a710b1.C16754x566c5dec[i17];
    }
}
