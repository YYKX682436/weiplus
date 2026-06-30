package com.tencent.mm.plugin.appbrand.jsapi.media;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/media/JSApiBizChooseImage$ChooseResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/media/a2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JSApiBizChooseImage$ChooseResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.media.a2 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.a2(null);

    /* renamed from: d, reason: collision with root package name */
    public int f81618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f81619e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f81620f;

    public JSApiBizChooseImage$ChooseResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f81618d = in6.readInt();
        this.f81619e = in6.readString();
        this.f81620f = in6.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f81618d);
        dest.writeString(this.f81619e);
        dest.writeString(this.f81620f);
    }

    public JSApiBizChooseImage$ChooseResult(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        readParcel(in6);
    }
}
