package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nx extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.ny> {
    public nx(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> a(com.tencent.mapsdk.internal.ny nyVar) {
        return new com.tencent.mapsdk.internal.nw(this, nyVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass70>) new com.tencent.mapsdk.internal.tk.AnonymousClass70(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass70) 0L)).longValue());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass71(ngVar.e_(), ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> ngVar) {
        this.f50568a.c(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.nw b(com.tencent.mapsdk.internal.ny nyVar) {
        return (com.tencent.mapsdk.internal.nw) super.b((com.tencent.mapsdk.internal.nx) nyVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e() {
        if (this.f50568a.y()) {
            this.f50568a.f51666j.f50522v = true;
        }
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ny> a2(com.tencent.mapsdk.internal.ny nyVar) {
        return new com.tencent.mapsdk.internal.nw(this, nyVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c() {
        boolean n17 = this.f50568a.n();
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            n17 |= ((com.tencent.mapsdk.internal.ny) ((com.tencent.mapsdk.internal.nw) ((java.util.Map.Entry) it.next()).getValue()).f50567d).isAnimate();
        }
        if (n17) {
            this.f50568a.f51666j.f50522v = true;
        }
    }
}
