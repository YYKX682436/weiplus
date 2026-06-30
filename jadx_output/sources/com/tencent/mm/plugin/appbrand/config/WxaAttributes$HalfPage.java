package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public final class WxaAttributes$HalfPage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$HalfPage> CREATOR = new k91.i5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77402d;

    public WxaAttributes$HalfPage(android.os.Parcel parcel) {
        this.f77402d = "default";
        this.f77402d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77402d);
    }

    public WxaAttributes$HalfPage() {
        this.f77402d = "default";
    }
}
