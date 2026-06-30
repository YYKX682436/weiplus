package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class AppBrandLaunchErrorAction implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84341e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.launching.p[] f84339f = {com.tencent.luggage.sdk.launching.p.HEADLESS, com.tencent.luggage.sdk.launching.p.PRE_RENDER};
    public static final com.tencent.mm.plugin.appbrand.launching.a0 CREATOR = new com.tencent.mm.plugin.appbrand.launching.a0();

    public AppBrandLaunchErrorAction(android.os.Parcel parcel) {
        this.f84340d = parcel.readString();
        this.f84341e = parcel.readInt();
    }

    public abstract void a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(getClass().getName());
        parcel.writeString(this.f84340d);
        parcel.writeInt(this.f84341e);
    }

    public AppBrandLaunchErrorAction(java.lang.String str, int i17) {
        this.f84340d = str;
        this.f84341e = i17;
    }
}
