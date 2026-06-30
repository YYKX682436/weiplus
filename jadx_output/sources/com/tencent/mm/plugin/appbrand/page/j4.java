package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class j4 implements com.tencent.mm.plugin.appbrand.page.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86787d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86788e;

    public j4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.Runnable runnable) {
        this.f86788e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f86787d.getAndSet(true)) {
            return;
        }
        this.f86788e.run();
    }
}
