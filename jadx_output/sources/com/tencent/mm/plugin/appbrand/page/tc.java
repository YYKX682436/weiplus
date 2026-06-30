package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class tc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.uc f87128d;

    public tc(com.tencent.mm.plugin.appbrand.page.uc ucVar) {
        this.f87128d = ucVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f87128d.f87150d.H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAPageFrameHtml);
    }
}
