package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiRequestSRFile$GetDownloadInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83792d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f83793e;

    public JsApiRequestSRFile$GetDownloadInfo(java.lang.String cdnUrl, java.lang.String fileMd5) {
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        kotlin.jvm.internal.o.g(fileMd5, "fileMd5");
        this.f83792d = cdnUrl;
        this.f83793e = fileMd5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f83792d);
        out.writeString(this.f83793e);
    }
}
