package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class no extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.np> {
    public no(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> a(com.tencent.mapsdk.internal.np npVar) {
        return new com.tencent.mapsdk.internal.nn(this, npVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass74>) new com.tencent.mapsdk.internal.tk.AnonymousClass74(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass74) 0L)).longValue());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass75(ngVar.e_(), ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> ngVar) {
        this.f50568a.c(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.nn b(com.tencent.mapsdk.internal.np npVar) {
        return (com.tencent.mapsdk.internal.nn) super.b((com.tencent.mapsdk.internal.no) npVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e() {
        if (this.f50568a.y()) {
            this.f50568a.f51666j.f50522v = true;
        }
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.np> a2(com.tencent.mapsdk.internal.np npVar) {
        return new com.tencent.mapsdk.internal.nn(this, npVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c() {
        boolean n17 = this.f50568a.n();
        java.util.Iterator it = this.f50569b.entrySet().iterator();
        while (it.hasNext()) {
            n17 |= ((com.tencent.mapsdk.internal.np) ((com.tencent.mapsdk.internal.nn) ((java.util.Map.Entry) it.next()).getValue()).f50567d).getIsAnimate();
        }
        if (n17) {
            this.f50568a.f51666j.f50522v = true;
        }
    }
}
