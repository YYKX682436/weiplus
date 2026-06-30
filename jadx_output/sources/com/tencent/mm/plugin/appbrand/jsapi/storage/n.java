package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f83406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83410i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f83411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.p f83412n;

    public n(com.tencent.mm.plugin.appbrand.jsapi.storage.p pVar, java.lang.String str, k91.z0 z0Var, int i17, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i18, long j17) {
        this.f83412n = pVar;
        this.f83405d = str;
        this.f83406e = z0Var;
        this.f83407f = i17;
        this.f83408g = str2;
        this.f83409h = lVar;
        this.f83410i = i18;
        this.f83411m = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        oe.a aVar = (oe.a) nd.f.a(oe.a.class);
        k91.z0 z0Var = this.f83406e;
        int i17 = z0Var.f305853s;
        java.lang.String str = z0Var.f305855u;
        java.lang.String str2 = this.f83405d;
        com.tencent.mm.plugin.appbrand.appstorage.q1 b17 = ((com.tencent.mm.plugin.appbrand.luggage.customize.b) aVar).b(str2, i17, str);
        int i18 = this.f83407f;
        java.lang.String str3 = this.f83408g;
        java.lang.Object[] o17 = b17.o(i18, str2, str3);
        com.tencent.mm.plugin.appbrand.appstorage.o1 o1Var = (com.tencent.mm.plugin.appbrand.appstorage.o1) o17[0];
        com.tencent.mm.plugin.appbrand.appstorage.o1 o1Var2 = com.tencent.mm.plugin.appbrand.appstorage.o1.NONE;
        java.lang.String str4 = o1Var == o1Var2 ? (java.lang.String) o17[1] : null;
        com.tencent.mm.plugin.appbrand.jsapi.storage.p.C(this.f83412n, str4 == null ? "fail:data not found" : "ok", str4, o1Var == o1Var2 ? (java.lang.String) o17[2] : null, this.f83409h, this.f83410i);
        int b18 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(str3, str4);
        k91.z0 z0Var2 = this.f83406e;
        this.f83412n.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(2, 2, b18, 1, java.lang.System.currentTimeMillis() - this.f83411m, z0Var2);
    }
}
