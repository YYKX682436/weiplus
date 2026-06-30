package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes4.dex */
class OpenBusinessViewUtil$BusinessAppInfoParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f80894d;

    /* renamed from: e, reason: collision with root package name */
    public long f80895e;

    /* renamed from: f, reason: collision with root package name */
    public long f80896f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f80897g;

    public OpenBusinessViewUtil$BusinessAppInfoParcel() {
        this.f80895e = 0L;
        this.f80896f = 0L;
        this.f80897g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80894d);
        parcel.writeLong(this.f80895e);
        parcel.writeLong(this.f80896f);
        byte[] bArr = this.f80897g;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f80897g);
        }
    }

    public OpenBusinessViewUtil$BusinessAppInfoParcel(android.os.Parcel parcel) {
        this.f80895e = 0L;
        this.f80896f = 0L;
        this.f80897g = null;
        this.f80894d = parcel.readString();
        this.f80895e = parcel.readLong();
        this.f80896f = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f80897g = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
