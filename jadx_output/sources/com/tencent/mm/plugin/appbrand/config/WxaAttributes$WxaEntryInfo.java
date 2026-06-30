package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes4.dex */
public final class WxaAttributes$WxaEntryInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> CREATOR = new k91.p5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77429d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77432g;

    public WxaAttributes$WxaEntryInfo(android.os.Parcel parcel) {
        this.f77429d = parcel.readString();
        this.f77430e = parcel.readString();
        this.f77431f = parcel.readString();
        this.f77432g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77429d);
        parcel.writeString(this.f77430e);
        parcel.writeString(this.f77431f);
        parcel.writeString(this.f77432g);
    }
}
