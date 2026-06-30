package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class bm implements com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component {

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<com.tencent.mapsdk.internal.bn, java.lang.Boolean> f48991a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.bn f48992b;

    private int e() {
        return this.f48991a.size();
    }

    public void a(android.content.Context context) {
    }

    public void b(com.tencent.mapsdk.internal.bn bnVar) {
    }

    public final void b_() {
        c_();
        if (this.f48991a.size() <= 0) {
            this.f48992b = null;
        }
    }

    public void c(com.tencent.mapsdk.internal.bn bnVar) {
    }

    public synchronized void c_() {
    }

    public synchronized void d(com.tencent.mapsdk.internal.bn bnVar) {
        if (bnVar != null) {
            this.f48991a.remove(bnVar);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component
    /* renamed from: n_, reason: merged with bridge method [inline-methods] */
    public final synchronized com.tencent.mapsdk.internal.bn getMapContext() {
        return this.f48992b;
    }

    public synchronized void a(com.tencent.mapsdk.internal.bn bnVar) {
        if (bnVar != null) {
            this.f48991a.put(bnVar, java.lang.Boolean.TRUE);
        }
        a(bnVar, null);
    }

    public final android.content.Context c() {
        com.tencent.mapsdk.internal.bn mapContext = getMapContext();
        if (mapContext != null) {
            return mapContext.getContext();
        }
        return null;
    }

    public synchronized void a(com.tencent.mapsdk.internal.bn bnVar, android.os.Bundle bundle) {
        if (this.f48991a.size() == 0) {
            return;
        }
        this.f48992b = bnVar;
    }
}
