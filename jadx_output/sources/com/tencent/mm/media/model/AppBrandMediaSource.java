package com.tencent.mm.media.model;

/* loaded from: classes7.dex */
public class AppBrandMediaSource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.media.model.AppBrandMediaSource> CREATOR = new ks0.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f68932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f68933e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f68934f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f68935g;

    public AppBrandMediaSource() {
        this.f68932d = "";
        this.f68933e = "";
        this.f68934f = "";
        this.f68935g = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f68932d);
        parcel.writeString(this.f68933e);
        parcel.writeString(this.f68934f);
        parcel.writeString(this.f68935g);
    }

    public AppBrandMediaSource(android.os.Parcel parcel) {
        this.f68932d = "";
        this.f68933e = "";
        this.f68934f = "";
        this.f68935g = "";
        this.f68932d = parcel.readString();
        this.f68933e = parcel.readString();
        this.f68934f = parcel.readString();
        this.f68935g = parcel.readString();
    }
}
