package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final /* synthetic */ class n$$d implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((com.tencent.luggage.sdk.jsapi.component.service.z) obj);
        appServiceSkylineExtensionImpl.f47710f = true;
        synchronized (appServiceSkylineExtensionImpl.f47713i) {
            while (!appServiceSkylineExtensionImpl.f47713i.isEmpty()) {
                java.lang.Runnable runnable = (java.lang.Runnable) appServiceSkylineExtensionImpl.f47713i.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}
