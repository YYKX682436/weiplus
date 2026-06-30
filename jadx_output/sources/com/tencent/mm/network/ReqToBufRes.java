package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class ReqToBufRes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.ReqToBufRes> CREATOR = new com.tencent.mm.network.e3();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f71951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71952e;

    public ReqToBufRes(byte[] bArr, int i17) {
        this.f71951d = bArr;
        this.f71952e = i17;
    }

    public int a() {
        return this.f71952e;
    }

    public byte[] b() {
        return this.f71951d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f71951d;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.f71952e);
    }

    public ReqToBufRes(android.os.Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f71951d = bArr;
        parcel.readByteArray(bArr);
        this.f71952e = parcel.readInt();
    }
}
