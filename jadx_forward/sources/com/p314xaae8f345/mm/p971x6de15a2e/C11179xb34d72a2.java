package com.p314xaae8f345.mm.p971x6de15a2e;

/* renamed from: com.tencent.mm.network.BufToRespRes */
/* loaded from: classes12.dex */
public class C11179xb34d72a2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p971x6de15a2e.C11179xb34d72a2> f32588x681a0c0c = new com.p314xaae8f345.mm.p971x6de15a2e.h();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f153457d;

    /* renamed from: e, reason: collision with root package name */
    public final int f153458e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153459f;

    /* renamed from: g, reason: collision with root package name */
    public final int f153460g;

    /* renamed from: h, reason: collision with root package name */
    public final int f153461h;

    /* renamed from: i, reason: collision with root package name */
    public final int f153462i;

    /* renamed from: m, reason: collision with root package name */
    public final int f153463m;

    /* renamed from: n, reason: collision with root package name */
    public final int f153464n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f153465o;

    public C11179xb34d72a2(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, java.lang.String str) {
        this.f153457d = bArr;
        this.f153458e = i17;
        this.f153459f = i18;
        this.f153460g = i19;
        this.f153461h = i27;
        this.f153462i = i28;
        this.f153463m = i29;
        this.f153464n = i37;
        this.f153465o = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr = this.f153457d;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f153458e);
        parcel.writeInt(this.f153459f);
        parcel.writeInt(this.f153460g);
        parcel.writeInt(this.f153461h);
        parcel.writeInt(this.f153462i);
        parcel.writeInt(this.f153463m);
        parcel.writeInt(this.f153464n);
        parcel.writeString(this.f153465o);
    }

    public C11179xb34d72a2(android.os.Parcel parcel) {
        if (parcel.readInt() == 1) {
            byte[] bArr = new byte[parcel.readInt()];
            this.f153457d = bArr;
            parcel.readByteArray(bArr);
        }
        this.f153458e = parcel.readInt();
        this.f153459f = parcel.readInt();
        this.f153460g = parcel.readInt();
        this.f153461h = parcel.readInt();
        this.f153462i = parcel.readInt();
        this.f153463m = parcel.readInt();
        this.f153464n = parcel.readInt();
        this.f153465o = parcel.readString();
    }
}
