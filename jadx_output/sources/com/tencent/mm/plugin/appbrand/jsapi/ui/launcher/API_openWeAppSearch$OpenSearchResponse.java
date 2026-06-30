package com.tencent.mm.plugin.appbrand.jsapi.ui.launcher;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/ui/launcher/API_openWeAppSearch$OpenSearchResponse", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$DefaultProcessResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class API_openWeAppSearch$OpenSearchResponse extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse> CREATOR = new me1.e();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83505d;

    public API_openWeAppSearch$OpenSearchResponse(boolean z17) {
        this.f83505d = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f83505d ? 1 : 0);
    }
}
