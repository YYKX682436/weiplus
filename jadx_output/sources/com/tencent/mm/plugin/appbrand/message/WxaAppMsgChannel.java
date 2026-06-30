package com.tencent.mm.plugin.appbrand.message;

/* loaded from: classes7.dex */
public class WxaAppMsgChannel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel> CREATOR = new oh1.g1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f86008d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f86009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f86010f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f86011g;

    /* renamed from: h, reason: collision with root package name */
    public int f86012h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f86013i;

    /* renamed from: m, reason: collision with root package name */
    public long f86014m;

    public WxaAppMsgChannel(android.os.Parcel parcel) {
        this.f86008d = parcel.readString();
        this.f86009e = parcel.readString();
        this.f86010f = parcel.readString();
        this.f86011g = parcel.readString();
        this.f86012h = parcel.readInt();
        this.f86013i = parcel.readString();
        this.f86014m = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f86008d);
        parcel.writeString(this.f86009e);
        parcel.writeString(this.f86010f);
        parcel.writeString(this.f86011g);
        parcel.writeInt(this.f86012h);
        parcel.writeString(this.f86013i);
        parcel.writeLong(this.f86014m);
    }
}
