package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand */
/* loaded from: classes13.dex */
public final class C1615xeb7a7468 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.AbstractC1616xa2fa5d0f {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1615xeb7a7468> f5318x681a0c0c = new c9.a();

    /* renamed from: d, reason: collision with root package name */
    public final long f125674d;

    /* renamed from: e, reason: collision with root package name */
    public final long f125675e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f125676f;

    public C1615xeb7a7468(long j17, byte[] bArr, long j18) {
        this.f125674d = j18;
        this.f125675e = j17;
        this.f125676f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f125674d);
        parcel.writeLong(this.f125675e);
        byte[] bArr = this.f125676f;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public C1615xeb7a7468(android.os.Parcel parcel, c9.a aVar) {
        this.f125674d = parcel.readLong();
        this.f125675e = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f125676f = bArr;
        parcel.readByteArray(bArr);
    }
}
