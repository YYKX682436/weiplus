package wo;

/* loaded from: classes13.dex */
public class m1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p661xcdc6dad4.p662x2e996804.C10398x7154d5de> f27789x681a0c0c = new wo.m1();

            /* renamed from: d, reason: collision with root package name */
            public final java.util.List f146301d;

            {
                this.f146301d = parcel.createTypedArrayList(com.p314xaae8f345.mm.p661xcdc6dad4.p662x2e996804.C10397xc18e38f5.f27788x681a0c0c);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeTypedList(this.f146301d);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p661xcdc6dad4.p662x2e996804.C10398x7154d5de[i17];
    }
}
