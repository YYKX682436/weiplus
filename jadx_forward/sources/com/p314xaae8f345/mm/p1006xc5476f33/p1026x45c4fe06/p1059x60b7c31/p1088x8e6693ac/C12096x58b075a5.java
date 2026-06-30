package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel */
/* loaded from: classes4.dex */
class C12096x58b075a5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12096x58b075a5> f34159x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162427d;

    /* renamed from: e, reason: collision with root package name */
    public long f162428e;

    /* renamed from: f, reason: collision with root package name */
    public long f162429f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f162430g;

    public C12096x58b075a5() {
        this.f162428e = 0L;
        this.f162429f = 0L;
        this.f162430g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162427d);
        parcel.writeLong(this.f162428e);
        parcel.writeLong(this.f162429f);
        byte[] bArr = this.f162430g;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f162430g);
        }
    }

    public C12096x58b075a5(android.os.Parcel parcel) {
        this.f162428e = 0L;
        this.f162429f = 0L;
        this.f162430g = null;
        this.f162427d = parcel.readString();
        this.f162428e = parcel.readLong();
        this.f162429f = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f162430g = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
