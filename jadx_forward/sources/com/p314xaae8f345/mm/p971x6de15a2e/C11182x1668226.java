package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.ReqToBufRes */
/* loaded from: classes12.dex */
public class C11182x1668226 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.C11182x1668226> f32685x681a0c0c = new com.p314xaae8f345.mm.p971x6de15a2e.e3();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f153484d;

    /* renamed from: e, reason: collision with root package name */
    public final int f153485e;

    public C11182x1668226(byte[] bArr, int i17) {
        this.f153484d = bArr;
        this.f153485e = i17;
    }

    public int a() {
        return this.f153485e;
    }

    public byte[] b() {
        return this.f153484d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f153484d;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.f153485e);
    }

    public C11182x1668226(android.os.Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f153484d = bArr;
        parcel.readByteArray(bArr);
        this.f153485e = parcel.readInt();
    }
}
