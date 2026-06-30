package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo */
/* loaded from: classes4.dex */
public final class C11826x30fe0b2d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d> f33603x681a0c0c = new k91.p5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158963e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158964f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158965g;

    public C11826x30fe0b2d(android.os.Parcel parcel) {
        this.f158962d = parcel.readString();
        this.f158963e = parcel.readString();
        this.f158964f = parcel.readString();
        this.f158965g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158962d);
        parcel.writeString(this.f158963e);
        parcel.writeString(this.f158964f);
        parcel.writeString(this.f158965g);
    }
}
