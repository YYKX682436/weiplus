package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* renamed from: com.tencent.mm.plugin.report.service.KVReportDataInfo */
/* loaded from: classes12.dex */
class C17197xb3ea717 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717> f37898x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.y();

    /* renamed from: d, reason: collision with root package name */
    public long f239664d;

    /* renamed from: e, reason: collision with root package name */
    public long f239665e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f239666f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239667g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239668h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239669i;

    public C17197xb3ea717() {
        this.f239665e = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f239664d);
        parcel.writeLong(this.f239665e);
        parcel.writeString(this.f239666f);
        parcel.writeInt(this.f239667g ? 1 : 0);
        parcel.writeInt(this.f239668h ? 1 : 0);
        parcel.writeInt(this.f239669i ? 1 : 0);
    }

    public C17197xb3ea717(android.os.Parcel parcel) {
        this.f239665e = 0L;
        this.f239664d = parcel.readLong();
        this.f239665e = parcel.readLong();
        this.f239666f = parcel.readString();
        this.f239667g = parcel.readInt() == 1;
        this.f239668h = parcel.readInt() == 1;
        this.f239669i = parcel.readInt() == 1;
    }
}
