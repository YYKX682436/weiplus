package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes10.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f148844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f148847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f148848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148849i;

    public z0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, long j17, java.lang.String str, long j18, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f148849i = iVar;
        this.f148844d = j17;
        this.f148845e = str;
        this.f148846f = j18;
        this.f148847g = map;
        this.f148848h = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f148849i.f148712q) {
            if (!this.f148849i.f148712q.containsKey(java.lang.Long.valueOf(this.f148844d))) {
                if (this.f148848h != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("error", "camera has not init");
                    this.f148848h.b(hashMap);
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera callCameraMethod %s", this.f148845e);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.HashMap hashMap3 = (java.util.HashMap) this.f148849i.f148712q.get(java.lang.Long.valueOf(this.f148844d));
            if (this.f148845e.equals("releaseLiteApp")) {
                java.util.Iterator it = hashMap3.keySet().iterator();
                while (it.hasNext()) {
                    fa3.a aVar = (fa3.a) hashMap3.get(java.lang.Long.valueOf(((java.lang.Long) it.next()).longValue()));
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                hashMap3.clear();
                this.f148849i.f148712q.remove(java.lang.Long.valueOf(this.f148844d));
            }
            if (hashMap3.containsKey(java.lang.Long.valueOf(this.f148846f))) {
                fa3.a aVar2 = (fa3.a) hashMap3.get(java.lang.Long.valueOf(this.f148846f));
                if (this.f148845e.equals("takePhoto")) {
                    aVar2.d(this.f148847g, this.f148848h);
                } else if (this.f148845e.equals("setZoom")) {
                    aVar2.c(this.f148847g, this.f148848h);
                } else if (this.f148845e.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b)) {
                    java.util.Map map = this.f148847g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar = this.f148848h;
                    aVar2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper startRecord");
                    fa3.b.e().j(map, gVar);
                } else if (this.f148845e.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b)) {
                    java.util.Map map2 = this.f148847g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar2 = this.f148848h;
                    aVar2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraHelper", "LiteAppCameraHelper stopRecord");
                    fa3.b.e().k(map2, gVar2);
                } else if (this.f148845e.equals("destroyCamera")) {
                    aVar2.a(false);
                    java.util.Map map3 = this.f148847g;
                    if (map3 != null && map3.containsKey("releaseSelf")) {
                        hashMap3.remove(java.lang.Long.valueOf(this.f148846f));
                    }
                } else if (this.f148845e.equals(tb1.t0.f76797x24728b)) {
                    aVar2.e(this.f148847g);
                } else if (this.f148848h != null) {
                    hashMap2.put("error", "invalid method");
                    this.f148848h.b(hashMap2);
                }
            }
        }
    }
}
