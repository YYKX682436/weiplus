package com.tencent.mm.feature.lite;

/* loaded from: classes10.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f67311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f67313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f67314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f67315h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67316i;

    public z0(com.tencent.mm.feature.lite.i iVar, long j17, java.lang.String str, long j18, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f67316i = iVar;
        this.f67311d = j17;
        this.f67312e = str;
        this.f67313f = j18;
        this.f67314g = map;
        this.f67315h = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f67316i.f67179q) {
            if (!this.f67316i.f67179q.containsKey(java.lang.Long.valueOf(this.f67311d))) {
                if (this.f67315h != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("error", "camera has not init");
                    this.f67315h.b(hashMap);
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera callCameraMethod %s", this.f67312e);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.HashMap hashMap3 = (java.util.HashMap) this.f67316i.f67179q.get(java.lang.Long.valueOf(this.f67311d));
            if (this.f67312e.equals("releaseLiteApp")) {
                java.util.Iterator it = hashMap3.keySet().iterator();
                while (it.hasNext()) {
                    fa3.a aVar = (fa3.a) hashMap3.get(java.lang.Long.valueOf(((java.lang.Long) it.next()).longValue()));
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                hashMap3.clear();
                this.f67316i.f67179q.remove(java.lang.Long.valueOf(this.f67311d));
            }
            if (hashMap3.containsKey(java.lang.Long.valueOf(this.f67313f))) {
                fa3.a aVar2 = (fa3.a) hashMap3.get(java.lang.Long.valueOf(this.f67313f));
                if (this.f67312e.equals("takePhoto")) {
                    aVar2.d(this.f67314g, this.f67315h);
                } else if (this.f67312e.equals("setZoom")) {
                    aVar2.c(this.f67314g, this.f67315h);
                } else if (this.f67312e.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME)) {
                    java.util.Map map = this.f67314g;
                    com.tencent.mm.plugin.lite.api.g gVar = this.f67315h;
                    aVar2.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper startRecord");
                    fa3.b.e().j(map, gVar);
                } else if (this.f67312e.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME)) {
                    java.util.Map map2 = this.f67314g;
                    com.tencent.mm.plugin.lite.api.g gVar2 = this.f67315h;
                    aVar2.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper stopRecord");
                    fa3.b.e().k(map2, gVar2);
                } else if (this.f67312e.equals("destroyCamera")) {
                    aVar2.a(false);
                    java.util.Map map3 = this.f67314g;
                    if (map3 != null && map3.containsKey("releaseSelf")) {
                        hashMap3.remove(java.lang.Long.valueOf(this.f67313f));
                    }
                } else if (this.f67312e.equals(tb1.t0.NAME)) {
                    aVar2.e(this.f67314g);
                } else if (this.f67315h != null) {
                    hashMap2.put("error", "invalid method");
                    this.f67315h.b(hashMap2);
                }
            }
        }
    }
}
