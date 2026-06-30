package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask f83413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f83417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f83418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f83419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.p f83420n;

    public o(com.tencent.mm.plugin.appbrand.jsapi.storage.p pVar, com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask jsApiGetStorageTask, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, long j17, k91.z0 z0Var, long j18) {
        this.f83420n = pVar;
        this.f83413d = jsApiGetStorageTask;
        this.f83414e = lVar;
        this.f83415f = i17;
        this.f83416g = str;
        this.f83417h = j17;
        this.f83418i = z0Var;
        this.f83419m = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask jsApiGetStorageTask = this.f83413d;
        java.lang.String str = jsApiGetStorageTask.f83359q;
        com.tencent.mm.plugin.appbrand.jsapi.storage.p.C(this.f83420n, str == null ? "fail:data not found" : "ok", str, jsApiGetStorageTask.f83360r, this.f83414e, this.f83415f);
        int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(this.f83416g, jsApiGetStorageTask.f83359q);
        k91.z0 z0Var = this.f83418i;
        this.f83420n.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(1, 2, b17, 1, java.lang.System.currentTimeMillis() - this.f83417h, z0Var);
        jsApiGetStorageTask.x();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetStorage", "getStorage: %s, time: %d", jsApiGetStorageTask.f83358p, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f83419m));
    }
}
