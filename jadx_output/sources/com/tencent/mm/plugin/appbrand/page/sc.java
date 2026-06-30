package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class sc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f87095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.uc f87096b;

    public sc(com.tencent.mm.plugin.appbrand.page.uc ucVar, long j17) {
        this.f87096b = ucVar;
        this.f87095a = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) obj);
        com.tencent.mm.plugin.appbrand.page.uc ucVar = this.f87096b;
        if (parseBoolean) {
            com.tencent.mm.plugin.appbrand.page.vc vcVar = ucVar.f87150d.D;
            vcVar.f87183b = this.f87095a;
            vcVar.f87184c = java.lang.System.currentTimeMillis();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ucVar.f87150d.hashCode());
        com.tencent.mm.plugin.appbrand.page.wc wcVar = ucVar.f87150d;
        com.tencent.mm.plugin.appbrand.page.vc vcVar2 = wcVar.D;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady end, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(vcVar2.f87184c - vcVar2.f87183b));
        com.tencent.mm.plugin.appbrand.page.vc vcVar3 = wcVar.D;
        wcVar.d0(vcVar3.f87182a, vcVar3.f87183b, vcVar3.f87184c);
    }
}
