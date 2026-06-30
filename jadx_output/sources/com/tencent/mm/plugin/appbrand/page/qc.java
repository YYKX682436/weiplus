package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class qc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.uc f87042a;

    public qc(com.tencent.mm.plugin.appbrand.page.uc ucVar) {
        this.f87042a = ucVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.appbrand.page.uc ucVar = this.f87042a;
        if (ucVar.f87150d.Q()) {
            if (!"undefined".equals(str)) {
                float L = com.tencent.mm.sdk.platformtools.t8.L(str, -1.0f);
                if (L > 0.0f) {
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "[%s] update density with window.devicePixelRatio = %s", ucVar.a(), str);
                    float pixelRatio = ucVar.f87150d.f86381s.getPixelRatio();
                    if (L != pixelRatio) {
                        com.tencent.mars.xlog.Log.w("Luggage.MPPageViewRenderer", "[%s] mismatch devicePixelRatio!!! interface[%f], WebView[%f]", ucVar.a(), java.lang.Float.valueOf(pixelRatio), java.lang.Float.valueOf(L));
                    }
                    if (L > 0.0f) {
                        ik1.w.f291843b = java.lang.Float.valueOf(L);
                        return;
                    } else {
                        android.util.DisplayMetrics displayMetrics = ik1.w.f291842a;
                        return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("Luggage.MPPageViewRenderer", "[%s] invalid window.devicePixelRatio %s", ucVar.a(), str);
        }
    }
}
