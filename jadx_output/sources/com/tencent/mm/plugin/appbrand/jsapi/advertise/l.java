package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class l implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f78759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78760b;

    public l(yz5.a aVar, yz5.l lVar) {
        this.f78759a = aVar;
        this.f78760b = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate result: " + z17 + ", " + str);
        if (z17) {
            this.f78759a.invoke();
            return;
        }
        if (str == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        this.f78760b.invoke("navigate_failed:".concat(str));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig targetInitConfig) {
        kotlin.jvm.internal.o.g(targetInitConfig, "targetInitConfig");
    }
}
