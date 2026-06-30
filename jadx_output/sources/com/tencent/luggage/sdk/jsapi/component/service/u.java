package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class u implements com.tencent.mm.plugin.appbrand.utils.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f47542b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47543c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.y f47544d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.n f47545e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47547g;

    /* renamed from: h, reason: collision with root package name */
    public cl.k1 f47548h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f47549i;

    /* renamed from: j, reason: collision with root package name */
    public final long f47550j;

    /* renamed from: k, reason: collision with root package name */
    public final int f47551k;

    public u(java.lang.String str, java.lang.String str2, com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.luggage.sdk.jsapi.component.service.n nVar, boolean z17, com.tencent.luggage.sdk.jsapi.component.service.o oVar) {
        this.f47547g = false;
        this.f47548h = null;
        this.f47549i = new java.util.concurrent.atomic.AtomicInteger(2);
        this.f47541a = str;
        this.f47542b = str2;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f47543c = (str2 == null ? "" : str2).length();
        this.f47544d = yVar;
        this.f47545e = nVar;
        this.f47546f = z17;
        this.f47550j = java.lang.System.currentTimeMillis();
        this.f47551k = sj1.l.f(yVar.getComponentId() + "", "public:inject", "代码注入-" + str);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        this.f47548h = k1Var;
        c();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        this.f47547g = false;
        c();
    }

    public final void c() {
        if (this.f47549i.decrementAndGet() == 0) {
            cl.k1 k1Var = this.f47548h;
            long j17 = k1Var == null ? this.f47550j : k1Var.f42675a;
            long currentTimeMillis = k1Var == null ? java.lang.System.currentTimeMillis() : k1Var.f42676b;
            com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
            java.lang.String str = this.f47541a;
            nVar.f47352i = str;
            nVar.f47353j = this.f47542b;
            nVar.f47354k = this.f47543c;
            this.f47544d.H1(nVar, this.f47547g, j17, currentTimeMillis, this.f47548h);
            this.f47545e.I0(this.f47547g, str, this.f47548h);
            sj1.l.h(this.f47544d.getAppId(), this.f47551k);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f47547g = true;
        c();
        if (this.f47541a.equals("WAServiceMainContext.js")) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f47550j;
            boolean z17 = this.f47546f;
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f47544d;
            cl.r3.c(2, currentTimeMillis, z17 ? 1 : 0, yVar.getAppId(), -1, 0, yVar.x().i());
        }
    }

    public u(java.lang.String str, android.content.res.AssetFileDescriptor assetFileDescriptor, com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.luggage.sdk.jsapi.component.service.n nVar, boolean z17, com.tencent.luggage.sdk.jsapi.component.service.o oVar) {
        this.f47547g = false;
        this.f47548h = null;
        this.f47549i = new java.util.concurrent.atomic.AtomicInteger(2);
        this.f47541a = str;
        this.f47542b = null;
        this.f47543c = assetFileDescriptor.getLength();
        this.f47544d = yVar;
        this.f47545e = nVar;
        this.f47546f = z17;
        this.f47550j = java.lang.System.currentTimeMillis();
        this.f47551k = sj1.l.f(yVar.getComponentId() + "", "public:inject", "代码注入-" + str);
    }
}
