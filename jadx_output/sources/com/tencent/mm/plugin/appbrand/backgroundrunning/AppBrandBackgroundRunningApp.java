package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class AppBrandBackgroundRunningApp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundrunning.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76921d;

    /* renamed from: e, reason: collision with root package name */
    public int f76922e;

    /* renamed from: f, reason: collision with root package name */
    public int f76923f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f76924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f76925h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f76926i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f76927m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f76928n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f76929o;

    public AppBrandBackgroundRunningApp(android.os.Parcel parcel) {
        this.f76921d = parcel.readString();
        this.f76922e = parcel.readInt();
        this.f76923f = parcel.readInt();
        this.f76924g = parcel.readString();
        this.f76925h = parcel.readString();
        this.f76926i = parcel.readString();
        this.f76927m = parcel.readString();
        this.f76928n = parcel.readString();
        this.f76929o = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f76921d, ((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) obj).f76921d);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f76921d);
    }

    public java.lang.String toString() {
        return "AppBrandBackgroundRunningApp{appId='" + this.f76921d + "', versionType=" + this.f76922e + ", usage=" + this.f76923f + ", icon='" + this.f76924g + "', name='" + this.f76925h + "', username='" + this.f76926i + "', uiclass='" + this.f76927m + "', process='" + this.f76928n + "', customNotificationLogicClassName='" + this.f76929o + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76921d);
        parcel.writeInt(this.f76922e);
        parcel.writeInt(this.f76923f);
        parcel.writeString(this.f76924g);
        parcel.writeString(this.f76925h);
        parcel.writeString(this.f76926i);
        parcel.writeString(this.f76927m);
        parcel.writeString(this.f76928n);
        parcel.writeString(this.f76929o);
    }
}
