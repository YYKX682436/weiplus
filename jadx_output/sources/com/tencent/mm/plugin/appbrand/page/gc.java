package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f86647f;

    public gc(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2, boolean z17) {
        this.f86645d = mcVar;
        this.f86646e = mcVar2;
        this.f86647f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86645d;
        if (mcVar.f86885a.isRunning()) {
            this.f86646e.f86886b.requestDisallowInterceptTouchEvent(this.f86647f);
        } else {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
