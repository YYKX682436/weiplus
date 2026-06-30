package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI f90370d;

    public z9(com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI) {
        this.f90370d = appBrandUIMoveTaskToBackStubUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishFallbackTimerTask.run(), isFinishing:");
        com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI = this.f90370d;
        sb6.append(appBrandUIMoveTaskToBackStubUI.isFinishing());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", sb6.toString());
        appBrandUIMoveTaskToBackStubUI.finish();
    }
}
