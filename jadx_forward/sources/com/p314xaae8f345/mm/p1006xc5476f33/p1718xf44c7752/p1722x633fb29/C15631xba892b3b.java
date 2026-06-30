package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29;

/* renamed from: com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem */
/* loaded from: classes10.dex */
public class C15631xba892b3b extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> f36410x681a0c0c = new t23.a1();

    /* renamed from: v, reason: collision with root package name */
    public int f219957v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f219958w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f219959x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f219960y;

    public C15631xba892b3b() {
        this.f219957v = 0;
        this.f219958w = false;
        this.f219959x = "";
        this.f219960y = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    /* renamed from: getType */
    public int mo63659xfb85f7b0() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public java.lang.String o() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219966h) ? this.f219966h : this.f219963e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078
    public boolean r() {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f219963e);
        parcel.writeString(this.f219966h);
        parcel.writeLong(this.f219967i);
        parcel.writeLong(this.f219968m);
        parcel.writeString(this.f219969n);
        parcel.writeString(this.f219971p);
        parcel.writeSerializable(this.f219976u);
        parcel.writeInt(this.f219957v);
        parcel.writeInt(this.f219958w ? 1 : 0);
        parcel.writeString(this.f219959x);
        parcel.writeString(this.f219960y);
    }

    public C15631xba892b3b(long j17) {
        super(j17);
        this.f219957v = 0;
        this.f219958w = false;
        this.f219959x = "";
        this.f219960y = "";
    }

    public C15631xba892b3b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f219957v = 0;
        this.f219958w = false;
        this.f219959x = "";
        this.f219960y = "";
    }
}
