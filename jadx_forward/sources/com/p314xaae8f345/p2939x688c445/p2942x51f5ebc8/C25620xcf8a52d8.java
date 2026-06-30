package com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8;

/* renamed from: com.tencent.soter.soterserver.SoterDeviceResult */
/* loaded from: classes5.dex */
public class C25620xcf8a52d8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25620xcf8a52d8> f47017x681a0c0c = new bu5.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f296855d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f296856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296857f;

    public C25620xcf8a52d8(android.os.Parcel parcel) {
        this.f296855d = parcel.readInt();
        this.f296856e = parcel.createByteArray();
        this.f296857f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f296855d);
        parcel.writeByteArray(this.f296856e);
        parcel.writeInt(this.f296857f);
    }
}
