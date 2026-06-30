package com.tencent.mm.plugin.appbrand.jsapi.profile;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/n0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/profile/e0;", "Landroid/content/Context;", "context", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Lab0/f0;", "callback", "Lab0/a;", "b", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class n0 extends com.tencent.mm.plugin.appbrand.jsapi.profile.e0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.profile.e0
    public ab0.a b(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request, ab0.f0 callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
        if (b0Var == null) {
            return null;
        }
        boolean z17 = request instanceof com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest;
        com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest urlJumpToProfileRequest = z17 ? (com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest) request : null;
        java.lang.String dataUrl = urlJumpToProfileRequest != null ? urlJumpToProfileRequest.getDataUrl() : null;
        com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest urlJumpToProfileRequest2 = z17 ? (com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest) request : null;
        int i17 = urlJumpToProfileRequest2 != null ? urlJumpToProfileRequest2.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() : 3;
        com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest urlJumpToProfileRequest3 = z17 ? (com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest) request : null;
        return ((za0.k) b0Var).Di(context, dataUrl, i17, null, urlJumpToProfileRequest3 != null ? urlJumpToProfileRequest3.getBizInfo() : null, false, callback);
    }
}
