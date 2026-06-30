package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f83421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f83425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f83426i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f83427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.s f83428n;

    public q(com.tencent.mm.plugin.appbrand.jsapi.storage.s sVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.String str, int i18, int i19, long j17, k91.z0 z0Var) {
        this.f83428n = sVar;
        this.f83421d = weakReference;
        this.f83422e = i17;
        this.f83423f = str;
        this.f83424g = i18;
        this.f83425h = i19;
        this.f83426i = j17;
        this.f83427m = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f83421d.get();
        if (lVar == null) {
            return;
        }
        oe.a aVar = (oe.a) nd.f.a(oe.a.class);
        com.tencent.mm.plugin.appbrand.jsapi.storage.s sVar = this.f83428n;
        java.lang.Object[] t17 = ((com.tencent.mm.plugin.appbrand.luggage.customize.b) aVar).b(sVar.D(lVar), this.f83422e, this.f83423f).t(this.f83424g, sVar.D(lVar));
        java.util.List list = (java.util.List) t17[0];
        int ceil = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
        com.tencent.mm.plugin.appbrand.jsapi.storage.s.C(this.f83428n, list, ceil, (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d), lVar, this.f83425h);
        int i17 = ceil * 1000;
        k91.z0 z0Var = this.f83427m;
        sVar.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(2, 3, i17, list != null ? list.size() : 0, java.lang.System.currentTimeMillis() - this.f83426i, z0Var);
    }
}
