package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u7 implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f89272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f89273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89274c;

    public u7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, long j17) {
        this.f89274c = o6Var;
        this.f89272a = n7Var;
        this.f89273b = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public void onReady() {
        this.f89272a.G(this);
        ((com.tencent.mm.plugin.appbrand.launching.rc) this.f89274c.P2.b()).b(com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH, this.f89273b);
    }
}
