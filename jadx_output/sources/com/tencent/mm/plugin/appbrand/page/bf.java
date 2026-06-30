package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class bf implements com.tencent.mm.plugin.appbrand.page.u4, com.tencent.mm.plugin.appbrand.ca {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.u4 f86453a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.n f86454b;

    /* renamed from: c, reason: collision with root package name */
    public final cf.d f86455c;

    public bf(com.tencent.mm.plugin.appbrand.page.u4 origin, ze.n runtime) {
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f86453a = origin;
        this.f86454b = runtime;
        this.f86455c = new cf.d(new com.tencent.mm.plugin.appbrand.page.af(this), 2);
        com.tencent.mm.plugin.appbrand.da.c(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void a() {
        this.f86455c.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void b() {
        this.f86455c.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f86453a.c(str, obj);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void cancel() {
        this.f86453a.cancel();
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void d() {
        this.f86455c.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void setAnimationEnabled(boolean z17) {
        this.f86453a.setAnimationEnabled(z17);
    }
}
