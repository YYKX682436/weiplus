package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class AppBrandLaunchFromNotifyReferrer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer> CREATOR = new k91.j0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77314d;

    /* renamed from: e, reason: collision with root package name */
    public int f77315e;

    /* renamed from: f, reason: collision with root package name */
    public int f77316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77317g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f77318h;

    /* renamed from: i, reason: collision with root package name */
    public int f77319i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f77320m;

    public AppBrandLaunchFromNotifyReferrer(android.os.Parcel parcel, k91.j0 j0Var) {
        this.f77314d = parcel.readString();
        this.f77315e = parcel.readInt();
        this.f77316f = parcel.readInt();
        this.f77317g = parcel.readString();
        this.f77318h = parcel.readString();
        this.f77319i = parcel.readInt();
        this.f77320m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "AppBrandLaunchFromNotifyReferrer{appId=" + this.f77314d + ", uin='" + this.f77315e + "', readscene='" + this.f77316f + "', appbrandPushMsgId='" + this.f77317g + "', content='" + this.f77318h + "', opLocation='" + this.f77319i + "', reportSessionId='" + this.f77320m + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77314d);
        parcel.writeInt(this.f77315e);
        parcel.writeInt(this.f77316f);
        parcel.writeString(this.f77317g);
        parcel.writeString(this.f77318h);
        parcel.writeInt(this.f77319i);
        parcel.writeString(this.f77320m);
    }
}
