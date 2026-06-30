package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f92373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y3 f92374e;

    public x3(com.tencent.mm.plugin.appbrand.y3 y3Var, km5.b bVar) {
        this.f92374e = y3Var;
        this.f92373d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f92374e.f92409b.f78452d) {
            this.f92373d.c(null);
            this.f92374e.f92409b.g("before doAheadPreloadPageView INTERRUPTED by runtime destroyed", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f92374e.f92409b;
        j3Var.h("doAheadPreloadPageView START", new java.lang.Object[0]);
        java.lang.String str = j3Var.f78450b.f74803n;
        com.tencent.mm.plugin.appbrand.keylogger.w.g(str, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
        ((km5.q) j3Var.i("doAheadPreloadPageView").h(new com.tencent.mm.plugin.appbrand.e4(j3Var, str)).a(new com.tencent.mm.plugin.appbrand.w3(this))).s(new com.tencent.mm.plugin.appbrand.v3(this));
    }
}
