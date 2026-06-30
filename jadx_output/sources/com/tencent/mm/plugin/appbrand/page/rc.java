package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class rc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.uc f87064a;

    public rc(com.tencent.mm.plugin.appbrand.page.uc ucVar) {
        this.f87064a = ucVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.uc ucVar = this.f87064a;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate assignWxConfig end, hash=%d", java.lang.Integer.valueOf(ucVar.f87150d.hashCode()));
        ucVar.f87150d.D.f87184c = java.lang.System.currentTimeMillis();
    }
}
