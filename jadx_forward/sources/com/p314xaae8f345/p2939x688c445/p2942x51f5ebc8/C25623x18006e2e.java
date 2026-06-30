package com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8;

/* renamed from: com.tencent.soter.soterserver.SoterSessionResult */
/* loaded from: classes15.dex */
public class C25623x18006e2e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25623x18006e2e> f47020x681a0c0c = new bu5.g();

    /* renamed from: d, reason: collision with root package name */
    public final long f296862d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296863e;

    public C25623x18006e2e(android.os.Parcel parcel) {
        this.f296862d = parcel.readLong();
        this.f296863e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f296862d);
        parcel.writeInt(this.f296863e);
    }
}
