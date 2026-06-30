package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class AppBrandCommUseInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo> CREATOR = new com.tencent.mm.plugin.appbrand.appusage.f0();

    /* renamed from: d, reason: collision with root package name */
    public int f76337d;

    /* renamed from: e, reason: collision with root package name */
    public int f76338e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f76339f;

    /* renamed from: g, reason: collision with root package name */
    public final float f76340g;

    public AppBrandCommUseInfo() {
        this.f76337d = 0;
        this.f76338e = 1;
        this.f76339f = "";
        this.f76340g = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f76337d);
        parcel.writeInt(this.f76338e);
        java.lang.String str = this.f76339f;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeFloat(this.f76340g);
    }

    public AppBrandCommUseInfo(android.os.Parcel parcel) {
        this.f76337d = 0;
        this.f76338e = 1;
        this.f76339f = "";
        this.f76340g = 0.0f;
        this.f76337d = parcel.readInt();
        this.f76338e = parcel.readInt();
        this.f76339f = parcel.readString();
        this.f76340g = parcel.readFloat();
    }
}
