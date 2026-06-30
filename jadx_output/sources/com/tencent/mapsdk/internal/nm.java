package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nm extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.nl> {
    public nm(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> a(com.tencent.mapsdk.internal.nl nlVar) {
        return new com.tencent.mapsdk.internal.nk(this, nlVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass67>) new com.tencent.mapsdk.internal.tk.AnonymousClass67(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass67) 0L)).longValue());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass69(ngVar.e_(), ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> ngVar) {
        this.f50568a.c(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.nk b(com.tencent.mapsdk.internal.nl nlVar) {
        return (com.tencent.mapsdk.internal.nk) super.b((com.tencent.mapsdk.internal.nm) nlVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e() {
        if (this.f50568a.y()) {
            this.f50568a.f51666j.f50522v = true;
        }
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nl> a2(com.tencent.mapsdk.internal.nl nlVar) {
        return new com.tencent.mapsdk.internal.nk(this, nlVar);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit a(long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        if (tkVar == null) {
            return null;
        }
        return (com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass73(j17, latLng), (com.tencent.mapsdk.internal.tk.AnonymousClass73) null);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c() {
        boolean n17 = this.f50568a.n();
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            n17 |= ((com.tencent.mapsdk.internal.nl) ((com.tencent.mapsdk.internal.nk) ((java.util.Map.Entry) it.next()).getValue()).f50567d).isAnimate();
        }
        if (n17) {
            this.f50568a.f51666j.f50522v = true;
        }
    }
}
