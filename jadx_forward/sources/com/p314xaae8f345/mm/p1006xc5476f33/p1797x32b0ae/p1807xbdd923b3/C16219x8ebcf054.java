package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1807xbdd923b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/launch/WxaLiteAppLaunchInfo;", "Landroid/os/Parcelable;", "CREATOR", "ba3/a", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo */
/* loaded from: classes15.dex */
public final class C16219x8ebcf054 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final ba3.a f37397x681a0c0c = new ba3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225410g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225411h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f225412i;

    /* renamed from: m, reason: collision with root package name */
    public long f225413m;

    public C16219x8ebcf054() {
        this.f225407d = "";
        this.f225408e = "";
        this.f225409f = "";
        this.f225410g = "";
        this.f225411h = "";
        this.f225412i = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m65741x9616526c() {
        return "appId:" + this.f225407d + " \n pkgPath: " + this.f225408e + " signatureKey :xxx";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f225407d);
        dest.writeString(this.f225408e);
        dest.writeString(this.f225409f);
        dest.writeString(this.f225410g);
        dest.writeString(this.f225411h);
        dest.writeString(this.f225412i);
        dest.writeLong(this.f225413m);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16219x8ebcf054(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f225407d = readString == null ? "" : readString;
        this.f225408e = parcel.readString();
        this.f225409f = parcel.readString();
        this.f225410g = parcel.readString();
        this.f225411h = parcel.readString();
        this.f225412i = parcel.readString();
        this.f225413m = parcel.readLong();
    }
}
