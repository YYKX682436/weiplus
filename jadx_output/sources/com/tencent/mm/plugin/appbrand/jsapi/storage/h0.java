package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.i0 f83395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask f83396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83400i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f83401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f83402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.j0 f83403o;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.storage.j0 j0Var, com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var, com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask jsApiSetStorageTask, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, java.lang.String str2, long j17, k91.z0 z0Var) {
        this.f83403o = j0Var;
        this.f83395d = i0Var;
        this.f83396e = jsApiSetStorageTask;
        this.f83397f = lVar;
        this.f83398g = i17;
        this.f83399h = str;
        this.f83400i = str2;
        this.f83401m = j17;
        this.f83402n = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask jsApiSetStorageTask = this.f83396e;
        com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var = this.f83395d;
        if (i0Var != null) {
            this.f83397f.a(this.f83398g, ((com.tencent.mm.plugin.appbrand.jsapi.storage.f0) i0Var).f83382a.o(jsApiSetStorageTask.f83376t));
        }
        int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(this.f83399h, this.f83400i);
        k91.z0 z0Var = this.f83402n;
        this.f83403o.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(1, 1, b17, 1, java.lang.System.currentTimeMillis() - this.f83401m, z0Var);
        jsApiSetStorageTask.x();
    }
}
