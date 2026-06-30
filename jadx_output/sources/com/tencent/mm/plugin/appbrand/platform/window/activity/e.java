package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.g f87578d;

    public e(com.tencent.mm.plugin.appbrand.platform.window.activity.g gVar) {
        this.f87578d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.g gVar = this.f87578d;
        if (gVar.f87593i.getAndSet(true)) {
            return;
        }
        gVar.f87589e.run();
    }
}
