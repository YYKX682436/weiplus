package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData */
/* loaded from: classes7.dex */
public class C11710x63f82843 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843> f33503x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f157874d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f157875e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f157878h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 f157879i;

    public C11710x63f82843() {
        this.f157874d = false;
        this.f157875e = false;
        this.f157876f = "";
        this.f157877g = "";
        this.f157878h = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f157874d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f157875e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f157876f);
        parcel.writeString(this.f157877g);
        parcel.writeString(this.f157878h);
        parcel.writeParcelable(this.f157879i, i17);
    }

    public C11710x63f82843(android.os.Parcel parcel) {
        this.f157874d = false;
        this.f157875e = false;
        this.f157876f = "";
        this.f157877g = "";
        this.f157878h = "";
        this.f157874d = parcel.readByte() != 0;
        this.f157875e = parcel.readByte() != 0;
        this.f157876f = parcel.readString();
        this.f157877g = parcel.readString();
        this.f157878h = parcel.readString();
        this.f157879i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329.class.getClassLoader());
    }
}
