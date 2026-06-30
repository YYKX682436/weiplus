package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class h0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.i0 f80238c;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.i0 i0Var) {
        this.f80236a = lVar;
        this.f80237b = i17;
        this.f80238c = i0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String p17;
        com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult reserveChannelsLiveResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveResult) appBrandProxyUIProcessTask$ProcessResult;
        if (reserveChannelsLiveResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiReserveChannelsLive", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        boolean z17 = reserveChannelsLiveResult.f80222d;
        com.tencent.mm.plugin.appbrand.jsapi.channels.i0 i0Var = this.f80238c;
        int i17 = reserveChannelsLiveResult.f80223e;
        if (z17) {
            p17 = i0Var.p("ok", kz5.c1.i(new jz5.l("state", java.lang.Integer.valueOf(i17))));
        } else {
            java.lang.String format = java.lang.String.format("fail:pre check fail, errCode=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            p17 = i0Var.p(format, kz5.c1.i(new jz5.l("state", 0)));
        }
        this.f80236a.a(this.f80237b, p17);
    }
}
