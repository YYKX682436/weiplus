package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f88647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f88648e;

    public d(java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        this.f88647d = runnable;
        this.f88648e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.f88647d;
        if (runnable != null) {
            runnable.run();
        }
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.service.c(this.f88648e));
    }
}
