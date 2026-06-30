package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.g0 f88483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.h0 f88484e;

    public f0(com.tencent.mm.plugin.appbrand.screenshot.g0 g0Var, com.tencent.mm.plugin.appbrand.screenshot.h0 h0Var) {
        this.f88483d = g0Var;
        this.f88484e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f88483d.f88486d;
        com.tencent.mm.plugin.appbrand.screenshot.h0 h0Var = this.f88484e;
        if (copyOnWriteArraySet.remove(h0Var)) {
            h0Var.getClass();
            h0Var.a(com.tencent.mm.plugin.appbrand.utils.j1.a("", h0Var.f88490b));
        }
    }
}
