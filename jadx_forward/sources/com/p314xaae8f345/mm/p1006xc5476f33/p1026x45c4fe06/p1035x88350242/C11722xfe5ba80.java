package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceStatus;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus */
/* loaded from: classes7.dex */
public final class C11722xfe5ba80 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80> f33509x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.i0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f158212d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158213e;

    /* renamed from: f, reason: collision with root package name */
    public final fb1.c f158214f;

    public C11722xfe5ba80(boolean z17, java.lang.String str) {
        this.f158212d = z17;
        this.f158213e = str;
        this.f158214f = z17 ? fb1.b.f342361a : new fb1.a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f158212d ? 1 : 0);
        out.writeString(this.f158213e);
    }
}
