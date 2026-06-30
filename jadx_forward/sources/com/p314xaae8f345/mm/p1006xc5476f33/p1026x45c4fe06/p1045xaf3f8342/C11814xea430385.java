package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* renamed from: com.tencent.mm.plugin.appbrand.config.AppBrandWeishiParams */
/* loaded from: classes7.dex */
public class C11814xea430385 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385> f33589x681a0c0c = new k91.c1();

    /* renamed from: d, reason: collision with root package name */
    public int f158877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158879f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158880g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158881h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f158882i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f158883m;

    public C11814xea430385(android.os.Parcel parcel) {
        a(parcel);
    }

    public void a(android.os.Parcel parcel) {
        this.f158877d = parcel.readInt();
        this.f158878e = parcel.readString();
        this.f158879f = parcel.readString();
        this.f158880g = parcel.readString();
        this.f158881h = parcel.readString();
        this.f158882i = parcel.readString();
        this.f158883m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m50103x9616526c() {
        return "AppBrandWeishiParams{fromOpenSdk=" + this.f158877d + ", thumbUrl='" + this.f158878e + "', thumbFullPath='" + this.f158879f + "', msgImgPath='" + this.f158880g + "', appId='" + this.f158881h + "', appName='" + this.f158882i + "', sourceUserName='" + this.f158883m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f158877d);
        parcel.writeString(this.f158878e);
        parcel.writeString(this.f158879f);
        parcel.writeString(this.f158880g);
        parcel.writeString(this.f158881h);
        parcel.writeString(this.f158882i);
        parcel.writeString(this.f158883m);
    }
}
