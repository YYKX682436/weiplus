package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class v9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f87178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f87179e;

    public v9(com.tencent.mm.plugin.appbrand.page.w9 w9Var, java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.page.l9 l9Var) {
        this.f87179e = w9Var;
        this.f87178d = runnable;
        w9Var.D.add(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87179e.D.remove(this);
        this.f87178d.run();
    }
}
