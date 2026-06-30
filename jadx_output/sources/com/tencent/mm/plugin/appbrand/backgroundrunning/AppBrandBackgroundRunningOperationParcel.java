package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class AppBrandBackgroundRunningOperationParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel> CREATOR = new com.tencent.mm.plugin.appbrand.backgroundrunning.u();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f76932d;

    /* renamed from: e, reason: collision with root package name */
    public int f76933e;

    /* renamed from: f, reason: collision with root package name */
    public int f76934f;

    /* renamed from: g, reason: collision with root package name */
    public int f76935g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f76936h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f76937i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f76938m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f76939n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f76940o;

    /* renamed from: p, reason: collision with root package name */
    public int f76941p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f76942q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f76943r;

    public AppBrandBackgroundRunningOperationParcel() {
        this.f76941p = -1;
        this.f76943r = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "operation{appId='" + this.f76932d + "', versionType=" + this.f76933e + ", usage=" + this.f76934f + ", operation=" + this.f76935g + ", uiclass='" + this.f76936h + "', name='" + this.f76937i + "', icon='" + this.f76938m + "', username='" + this.f76939n + "', process='" + this.f76940o + "', customNotificationLogicClassName='" + this.f76942q + "', justNotify=" + this.f76943r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f76932d);
        parcel.writeInt(this.f76933e);
        parcel.writeInt(this.f76934f);
        parcel.writeInt(this.f76935g);
        parcel.writeString(this.f76936h);
        parcel.writeString(this.f76937i);
        parcel.writeString(this.f76938m);
        parcel.writeString(this.f76939n);
        parcel.writeString(this.f76940o);
        parcel.writeString(this.f76942q);
        parcel.writeInt(this.f76941p);
    }

    public AppBrandBackgroundRunningOperationParcel(android.os.Parcel parcel) {
        this.f76941p = -1;
        this.f76943r = false;
        this.f76932d = parcel.readString();
        this.f76933e = parcel.readInt();
        this.f76934f = parcel.readInt();
        this.f76935g = parcel.readInt();
        this.f76936h = parcel.readString();
        this.f76937i = parcel.readString();
        this.f76938m = parcel.readString();
        this.f76939n = parcel.readString();
        this.f76940o = parcel.readString();
        this.f76942q = parcel.readString();
        this.f76941p = parcel.readInt();
    }
}
