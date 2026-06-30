package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007;

/* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel */
/* loaded from: classes7.dex */
public class C12429xdd32d5a3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3> f35117x681a0c0c = new oh1.g1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167541d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167542e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167543f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167544g;

    /* renamed from: h, reason: collision with root package name */
    public int f167545h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167546i;

    /* renamed from: m, reason: collision with root package name */
    public long f167547m;

    public C12429xdd32d5a3(android.os.Parcel parcel) {
        this.f167541d = parcel.readString();
        this.f167542e = parcel.readString();
        this.f167543f = parcel.readString();
        this.f167544g = parcel.readString();
        this.f167545h = parcel.readInt();
        this.f167546i = parcel.readString();
        this.f167547m = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167541d);
        parcel.writeString(this.f167542e);
        parcel.writeString(this.f167543f);
        parcel.writeString(this.f167544g);
        parcel.writeInt(this.f167545h);
        parcel.writeString(this.f167546i);
        parcel.writeLong(this.f167547m);
    }
}
