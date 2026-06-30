package com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8;

/* renamed from: com.tencent.soter.soterserver.SoterSignResult */
/* loaded from: classes13.dex */
public class C25624x97b5163f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25624x97b5163f> f47021x681a0c0c = new bu5.h();

    /* renamed from: d, reason: collision with root package name */
    public final int f296864d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f296865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296866f;

    public C25624x97b5163f(android.os.Parcel parcel) {
        this.f296864d = parcel.readInt();
        this.f296865e = parcel.createByteArray();
        this.f296866f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f296864d);
        parcel.writeByteArray(this.f296865e);
        parcel.writeInt(this.f296866f);
    }
}
