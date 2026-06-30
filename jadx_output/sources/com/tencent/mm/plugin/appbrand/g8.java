package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class g8 implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f78190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f78191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78192c;

    public g8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, long j17) {
        this.f78192c = o6Var;
        this.f78190a = n7Var;
        this.f78191b = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public void onReady() {
        this.f78190a.G(this);
        ((com.tencent.mm.plugin.appbrand.launching.rc) this.f78192c.P2.b()).b(com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO, this.f78191b);
    }
}
