package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.e7 f86832d;

    public k7(com.tencent.mm.plugin.appbrand.page.e7 e7Var) {
        this.f86832d = e7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.e7 e7Var = this.f86832d;
        com.tencent.mm.plugin.appbrand.performance.m.e(e7Var.H(), "Native", "WebViewInit+PageFrameLoad", "X", e7Var.H, java.lang.System.currentTimeMillis(), "");
    }
}
