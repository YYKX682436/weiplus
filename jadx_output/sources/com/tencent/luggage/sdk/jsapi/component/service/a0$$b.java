package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final /* synthetic */ class a0$$b implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((com.tencent.luggage.sdk.jsapi.component.service.z) obj);
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", "dispatchDestroy " + appServiceSkylineExtensionImpl.hashCode());
        appServiceSkylineExtensionImpl.f47712h = true;
        com.tencent.skyline.SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl.f47708d;
        com.tencent.skyline.SkylineLog.i("SkylinePreloader", "destroySkylineRuntime skylineRuntime:" + skylineRuntime + " preloadSkylineRuntime:" + df.c1.f229437c);
        if (skylineRuntime == null || !kotlin.jvm.internal.o.b(skylineRuntime, df.c1.f229437c)) {
            return;
        }
        com.tencent.skyline.SkylineLog.i("SkylinePreloader", "reset");
        df.c1.f229437c = null;
        df.c1.f229438d = false;
        df.c1.f229439e = 0;
    }
}
