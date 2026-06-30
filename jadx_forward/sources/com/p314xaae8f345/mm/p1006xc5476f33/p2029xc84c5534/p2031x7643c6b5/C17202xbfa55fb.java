package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* renamed from: com.tencent.mm.plugin.report.service.StIDKeyDataInfo */
/* loaded from: classes12.dex */
class C17202xbfa55fb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17202xbfa55fb> f37903x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.r0();

    /* renamed from: d, reason: collision with root package name */
    public long f239675d;

    /* renamed from: e, reason: collision with root package name */
    public long f239676e;

    /* renamed from: f, reason: collision with root package name */
    public long f239677f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239678g;

    public C17202xbfa55fb(android.os.Parcel parcel) {
        this.f239675d = parcel.readLong();
        this.f239676e = parcel.readLong();
        this.f239677f = parcel.readLong();
        this.f239678g = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f239675d);
        parcel.writeLong(this.f239676e);
        parcel.writeLong(this.f239677f);
        parcel.writeInt(this.f239678g ? 1 : 0);
    }
}
