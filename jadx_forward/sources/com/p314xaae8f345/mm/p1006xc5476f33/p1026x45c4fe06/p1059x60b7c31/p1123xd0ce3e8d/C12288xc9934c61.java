package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo */
/* loaded from: classes7.dex */
public final class C12288xc9934c61 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.C12288xc9934c61> f34960x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165325d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165326e;

    public C12288xc9934c61(java.lang.String cdnUrl, java.lang.String fileMd5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUrl, "cdnUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileMd5, "fileMd5");
        this.f165325d = cdnUrl;
        this.f165326e = fileMd5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165325d);
        out.writeString(this.f165326e);
    }
}
