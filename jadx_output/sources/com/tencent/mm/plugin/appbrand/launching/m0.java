package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class m0 implements com.tencent.mm.plugin.appbrand.ipc.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f84777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.l0 f84778b;

    public m0(com.tencent.mm.plugin.appbrand.launching.l0 l0Var, java.lang.Runnable runnable) {
        this.f84778b = l0Var;
        this.f84777a = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.n
    public void a() {
        this.f84778b.f84738g.f84375t = false;
        this.f84777a.run();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.n
    public void cancel() {
        com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask = this.f84778b.f84738g;
        appBrandPreInitTask.f84375t = true;
        appBrandPreInitTask.c();
    }
}
