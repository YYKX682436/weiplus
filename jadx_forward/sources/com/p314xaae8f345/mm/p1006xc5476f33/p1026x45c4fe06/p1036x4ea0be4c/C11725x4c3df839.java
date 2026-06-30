package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel */
/* loaded from: classes4.dex */
public class C11725x4c3df839 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839> f33511x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.i();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158310d;

    /* renamed from: e, reason: collision with root package name */
    public int f158311e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158312f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158313g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158314h;

    /* renamed from: i, reason: collision with root package name */
    public int f158315i;

    /* renamed from: m, reason: collision with root package name */
    public long f158316m;

    /* renamed from: n, reason: collision with root package name */
    public int f158317n;

    public C11725x4c3df839(android.os.Parcel parcel) {
        this.f158310d = parcel.readString();
        this.f158311e = parcel.readInt();
        this.f158312f = parcel.readString();
        this.f158313g = parcel.readString();
        this.f158314h = parcel.readString();
        this.f158315i = parcel.readInt();
        this.f158316m = parcel.readLong();
        this.f158317n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158310d);
        parcel.writeInt(this.f158311e);
        parcel.writeString(this.f158312f);
        parcel.writeString(this.f158313g);
        parcel.writeString(this.f158314h);
        parcel.writeInt(this.f158315i);
        parcel.writeLong(this.f158316m);
        parcel.writeInt(this.f158317n);
    }
}
