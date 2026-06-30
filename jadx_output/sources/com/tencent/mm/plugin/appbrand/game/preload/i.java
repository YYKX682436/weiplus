package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.o6 f78211a;

    /* renamed from: b, reason: collision with root package name */
    public uh1.x0 f78212b;

    /* renamed from: c, reason: collision with root package name */
    public uh1.a f78213c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.u1 f78214d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.game.preload.f f78215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78216f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f78217g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f78218h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f78219i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f78220j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f78221k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f78222l;

    static {
        int i17 = com.tencent.mm.plugin.appbrand.launching.ka.f84720a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverContract", "<clinit>");
    }

    public i(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78216f = false;
        this.f78218h = false;
        this.f78211a = o6Var;
        com.tencent.mm.plugin.appbrand.game.preload.f fVar = new com.tencent.mm.plugin.appbrand.game.preload.f(o6Var);
        this.f78215e = fVar;
        this.f78216f = true;
        this.f78218h = true;
        this.f78212b = new uh1.x0(fVar, true);
        this.f78219i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f78220j = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f78221k = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f78222l = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static com.tencent.mm.plugin.appbrand.game.preload.i e(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.y)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.y) lVar).t3();
        if (t37 instanceof com.tencent.mm.plugin.appbrand.o6) {
            return ((com.tencent.mm.plugin.appbrand.o6) t37).P2();
        }
        return null;
    }

    public final void a() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f78217g;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() != 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78211a;
        if (o6Var == null || o6Var.m0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "hy: unexpected null app config");
            return;
        }
        k91.r m07 = this.f78211a.m0();
        java.lang.String str = this.f78211a.f74803n;
        java.util.ArrayList arrayList = m07.f305752v;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "predownload subPackage size:%d", objArr);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String pathOrModule = (java.lang.String) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "predownload subPackage name:%s", pathOrModule);
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f78211a;
                if (o6Var2 == null || o6Var2.E0() == null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = o6Var2 == null ? "" : o6Var2.f74803n;
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "runtime(%s) or sysConfig null", objArr2);
                } else if (o6Var2.S || o6Var2.L0()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "runtime(%s) finishing", o6Var2.f74803n);
                } else {
                    com.tencent.mm.plugin.appbrand.appcache.la.o(o6Var2, false).j();
                    java.util.LinkedList linkedList = o6Var2.E0().f305852r.f75402g;
                    kotlin.jvm.internal.o.g(linkedList, "<this>");
                    kotlin.jvm.internal.o.g(pathOrModule, "pathOrModule");
                    com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) ph1.i0.b(linkedList, pathOrModule, null, false, 6, null);
                    if (modulePkgInfo == null || android.text.TextUtils.isEmpty(modulePkgInfo.f75372md5)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "downloadSubPackage with appId:%s, moduleName:%s, get invalid module obj", o6Var2.f74803n, pathOrModule);
                    } else if (ph1.q.f354348a == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "downloadSubPackage fail!");
                    } else {
                        ph1.r b17 = ph1.q.f354348a.b(o6Var2, o6Var2.E0().f305852r.e(o6Var2.f74803n, modulePkgInfo.name), null);
                        b17.b(new com.tencent.mm.plugin.appbrand.game.preload.g(this, pathOrModule));
                        b17.a(ph1.o.f354346b);
                    }
                }
            }
        }
    }

    public void b() {
        uh1.x0 x0Var = this.f78212b;
        if (x0Var != null) {
            synchronized (x0Var.f427929j) {
                java.util.Iterator it = x0Var.f427929j.iterator();
                while (it.hasNext()) {
                    ((vh1.f) it.next()).f437021g = false;
                }
                x0Var.f427929j.clear();
            }
            synchronized (x0Var.f427930k) {
                java.util.Iterator it6 = x0Var.f427930k.iterator();
                while (it6.hasNext()) {
                    ((vh1.f) it6.next()).f437021g = false;
                }
                x0Var.f427930k.clear();
            }
            synchronized (x0Var.f427928i) {
                x0Var.f427928i.clear();
            }
            this.f78212b = null;
            this.f78215e = null;
            this.f78213c = null;
            this.f78214d = null;
            this.f78211a = null;
        }
        this.f78216f = false;
    }

    public final void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.game.preload.h hVar = new com.tencent.mm.plugin.appbrand.game.preload.h(this, str, str2);
        if (this.f78213c.f427748o <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "maxDownloadConcurrent <= 0 ");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f78213c.f427758y;
        uh1.x0 x0Var = this.f78212b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f427798b;
        uh1.h.f427795a.getClass();
        sb6.append(uh1.i.f427798b.incrementAndGet());
        sb6.append("");
        x0Var.b(jSONObject, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, hashMap, null, i17, hVar, sb6.toString(), "test");
    }

    public void d() {
        if (this.f78218h) {
            if (!this.f78216f) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "hasn't init!");
                return;
            }
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78211a;
            if (o6Var == null) {
                return;
            }
            if (o6Var.m0() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles getAppConfig null!");
                return;
            }
            org.json.JSONArray jSONArray = this.f78211a.m0().f305751u;
            if (jSONArray != null) {
                com.tencent.mm.plugin.appbrand.game.preload.j.a().b(3000, jSONArray.length());
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    try {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        if (jSONObject != null) {
                            java.lang.String optString = jSONObject.optString("url");
                            java.lang.String optString2 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                                if (this.f78214d.access(optString2) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePreloadManager", "predownload path %s has exists!", optString2);
                                } else {
                                    this.f78217g.add(optString);
                                    c(jSONObject, optString, optString2);
                                }
                            }
                        }
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGamePreloadManager", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            k91.r m07 = this.f78211a.m0();
            if (m07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles config null！");
                return;
            }
            java.lang.String str = this.f78211a.f74803n;
            java.util.ArrayList arrayList = m07.f305752v;
            if (arrayList != null) {
                com.tencent.mm.plugin.appbrand.game.preload.j.a().b(4000, arrayList.size());
            }
            a();
        }
    }
}
