package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiStartBindPhone$BindPhoneResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/biz/i1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiStartBindPhone$BindPhoneResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.biz.i1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.biz.i1(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f79949d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79950e;

    public JsApiStartBindPhone$BindPhoneResult(int i17, int i18) {
        this.f79949d = i17;
        this.f79950e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f79949d);
        dest.writeInt(this.f79950e);
    }
}
