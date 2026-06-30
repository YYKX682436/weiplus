package com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8;

/* renamed from: com.tencent.soter.soterserver.SoterExportResult */
/* loaded from: classes13.dex */
public class C25621xd3c649b6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25621xd3c649b6> f47018x681a0c0c = new bu5.e();

    /* renamed from: d, reason: collision with root package name */
    public final int f296858d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f296859e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296860f;

    public C25621xd3c649b6(android.os.Parcel parcel) {
        this.f296858d = parcel.readInt();
        this.f296859e = parcel.createByteArray();
        this.f296860f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f296858d);
        parcel.writeByteArray(this.f296859e);
        parcel.writeInt(this.f296860f);
    }
}
