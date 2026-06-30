package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.v f77705d;

    public q(com.tencent.mm.plugin.appbrand.debugger.console.v vVar) {
        this.f77705d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.debugger.console.v vVar = this.f77705d;
        int measuredHeight = vVar.getMeasuredHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "<init>, measured, measuredHeight: " + measuredHeight);
        vVar.setTranslationY((float) measuredHeight);
        vVar.setVisibility(0);
        vVar.b();
    }
}
