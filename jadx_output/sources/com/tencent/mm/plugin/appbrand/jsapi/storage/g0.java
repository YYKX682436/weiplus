package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class g0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83389h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83390i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.i0 f83391m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f83392n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f83393o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.j0 f83394p;

    public g0(com.tencent.mm.plugin.appbrand.jsapi.storage.j0 j0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var, int i18, long j17) {
        this.f83394p = j0Var;
        this.f83385d = lVar;
        this.f83386e = str;
        this.f83387f = i17;
        this.f83388g = str2;
        this.f83389h = str3;
        this.f83390i = str4;
        this.f83391m = i0Var;
        this.f83392n = i18;
        this.f83393o = j17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "JsApiSetStorage";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f83385d;
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        oe.a aVar = (oe.a) nd.f.a(oe.a.class);
        java.lang.String d17 = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.d(((com.tencent.mm.plugin.appbrand.luggage.customize.b) aVar).b(this.f83386e, z0Var.f305853s, z0Var.f305855u).l(this.f83387f, this.f83386e, this.f83388g, this.f83389h, this.f83390i));
        com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var = this.f83391m;
        if (i0Var != null) {
            lVar.a(this.f83392n, ((com.tencent.mm.plugin.appbrand.jsapi.storage.f0) i0Var).f83382a.o(d17));
        }
        int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(this.f83388g, this.f83389h);
        this.f83394p.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(2, 1, b17, 1, java.lang.System.currentTimeMillis() - this.f83393o, z0Var);
    }
}
