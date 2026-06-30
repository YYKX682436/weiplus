package com.p314xaae8f345.mm.p661xcdc6dad4.p662x2e996804;

/* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo */
/* loaded from: classes13.dex */
public class C10397xc18e38f5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p661xcdc6dad4.p662x2e996804.C10397xc18e38f5> f27788x681a0c0c = new wo.l1();

    /* renamed from: d, reason: collision with root package name */
    public final int f146300d;

    public C10397xc18e38f5(android.os.Parcel parcel) {
        this.f146300d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f146300d);
    }
}
