package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.ZIDL_flS4gctrKE */
/* loaded from: classes11.dex */
class C27580xe81f2cc3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299203a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_HI */
    private void m117782x1964d249(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299203a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("WebSearchPlatformManagerKE", "onNativeEventsEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("WebSearchPlatformManagerKE", "onNativeEventsEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.NativeEventsEvent) entry.getValue()).m117734x5c6729a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
        }
    }
}
