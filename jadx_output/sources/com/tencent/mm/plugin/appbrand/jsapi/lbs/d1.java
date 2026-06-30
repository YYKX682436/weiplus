package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class d1 implements lk1.b, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f81404d;

    /* renamed from: e, reason: collision with root package name */
    public lk1.b f81405e;

    public d1(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, lk1.b delegate) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f81404d = runtime;
        this.f81405e = delegate;
        runtime.keep(this);
    }

    @Override // im5.a
    public void dead() {
        this.f81405e = null;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f81404d;
        if (appBrandRuntime != null) {
            appBrandRuntime.n2(this);
        }
        this.f81404d = null;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        lk1.b bVar = this.f81405e;
        if (bVar != null) {
            bVar.j(i17, str, aVar);
        }
        dead();
    }
}
