package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class AppBrandFloatBallHelper$AppBrandContentFloatBallEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallHelper$AppBrandContentFloatBallEvent> CREATOR = new com.tencent.mm.plugin.appbrand.floatball.k();

    /* renamed from: d, reason: collision with root package name */
    public int f78058d;

    public AppBrandFloatBallHelper$AppBrandContentFloatBallEvent() {
        this.f78058d = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78058d);
    }

    public AppBrandFloatBallHelper$AppBrandContentFloatBallEvent(android.os.Parcel parcel) {
        this.f78058d = 0;
        this.f78058d = parcel.readInt();
    }
}
