package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/av_device_usage/AVDeviceUsageClientService$MarkInUseParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams */
/* loaded from: classes7.dex */
final class C11718xf656570b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11718xf656570b> f33508x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9 f158206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158207e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f158208f;

    public C11718xf656570b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9 parcelableScene, boolean z17, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcelableScene, "parcelableScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        this.f158206d = parcelableScene;
        this.f158207e = z17;
        this.f158208f = token;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        this.f158206d.writeToParcel(out, i17);
        out.writeInt(this.f158207e ? 1 : 0);
        out.writeString(this.f158208f);
    }
}
