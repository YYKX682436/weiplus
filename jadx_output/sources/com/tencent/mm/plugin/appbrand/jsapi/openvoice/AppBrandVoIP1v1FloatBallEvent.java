package com.tencent.mm.plugin.appbrand.jsapi.openvoice;

/* loaded from: classes7.dex */
public class AppBrandVoIP1v1FloatBallEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent> CREATOR = new md1.a();

    /* renamed from: d, reason: collision with root package name */
    public int f82474d;

    public AppBrandVoIP1v1FloatBallEvent() {
        this.f82474d = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f82474d);
    }

    public AppBrandVoIP1v1FloatBallEvent(android.os.Parcel parcel) {
        this.f82474d = 0;
        this.f82474d = parcel.readInt();
    }
}
