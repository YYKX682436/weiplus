package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class WxaPkg$Info implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.x8();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f75388d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f75389e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f75391g;

    public WxaPkg$Info(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f75388d = str;
        this.f75389e = str2;
        this.f75390f = i17;
        this.f75391g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f75388d);
        parcel.writeString(this.f75389e);
        parcel.writeInt(this.f75390f);
        parcel.writeInt(this.f75391g);
    }

    public WxaPkg$Info(android.os.Parcel parcel) {
        this.f75388d = parcel.readString();
        this.f75389e = parcel.readString();
        this.f75390f = parcel.readInt();
        this.f75391g = parcel.readInt();
    }
}
