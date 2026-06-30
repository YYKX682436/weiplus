package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class og extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.oh> {
    public og(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> a(com.tencent.mapsdk.internal.oh ohVar) {
        return new com.tencent.mapsdk.internal.of(this, ohVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass76>) new com.tencent.mapsdk.internal.tk.AnonymousClass76(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass76) 0L)).longValue());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass77(ngVar.e_(), ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> ngVar) {
        this.f50568a.c(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.of b(com.tencent.mapsdk.internal.oh ohVar) {
        return (com.tencent.mapsdk.internal.of) super.b((com.tencent.mapsdk.internal.og) ohVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e() {
        if (this.f50568a.y()) {
            this.f50568a.f51666j.f50522v = true;
        }
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oh> a2(com.tencent.mapsdk.internal.oh ohVar) {
        return new com.tencent.mapsdk.internal.of(this, ohVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c() {
        boolean n17 = this.f50568a.n();
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            n17 |= ((com.tencent.mapsdk.internal.oh) ((com.tencent.mapsdk.internal.of) ((java.util.Map.Entry) it.next()).getValue()).f50567d).isAnimate();
        }
        if (n17) {
            this.f50568a.f51666j.f50522v = true;
        }
    }
}
