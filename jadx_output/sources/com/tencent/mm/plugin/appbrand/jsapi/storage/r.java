package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask f83429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f83430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f83432g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.z0 f83433h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.s f83434i;

    public r(com.tencent.mm.plugin.appbrand.jsapi.storage.s sVar, com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask jsApiGetStorageInfoTask, java.lang.ref.WeakReference weakReference, int i17, long j17, k91.z0 z0Var) {
        this.f83434i = sVar;
        this.f83429d = jsApiGetStorageInfoTask;
        this.f83430e = weakReference;
        this.f83431f = i17;
        this.f83432g = j17;
        this.f83433h = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask jsApiGetStorageInfoTask = this.f83429d;
        jsApiGetStorageInfoTask.x();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) this.f83430e.get();
        if (lVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.storage.s.C(this.f83434i, jsApiGetStorageInfoTask.f83347h, jsApiGetStorageInfoTask.f83348i, jsApiGetStorageInfoTask.f83349m, lVar, this.f83431f);
        java.util.ArrayList arrayList = jsApiGetStorageInfoTask.f83347h;
        int i17 = jsApiGetStorageInfoTask.f83348i * 1000;
        k91.z0 z0Var = this.f83433h;
        this.f83434i.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(1, 3, i17, arrayList == null ? 0 : arrayList.size(), java.lang.System.currentTimeMillis() - this.f83432g, z0Var);
        jsApiGetStorageInfoTask.x();
    }
}
