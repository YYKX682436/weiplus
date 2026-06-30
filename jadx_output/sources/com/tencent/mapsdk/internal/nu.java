package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nu extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.nv> {
    public nu(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> a(com.tencent.mapsdk.internal.nv nvVar) {
        return new com.tencent.mapsdk.internal.nt(this, nvVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass82>) new com.tencent.mapsdk.internal.tk.AnonymousClass82(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass82) 0L)).longValue());
        ngVar.f50567d.setBitmap(null);
        ngVar.f50567d.setLatLngBounds(null);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass83(ngVar.e_(), ngVar.f50567d));
        ngVar.f50567d.setBitmap(null);
        ngVar.f50567d.setLatLngBounds(null);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> ngVar) {
        this.f50568a.c(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.nt b(com.tencent.mapsdk.internal.nv nvVar) {
        return (com.tencent.mapsdk.internal.nt) super.b((com.tencent.mapsdk.internal.nu) nvVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> a2(com.tencent.mapsdk.internal.nv nvVar) {
        return new com.tencent.mapsdk.internal.nt(this, nvVar);
    }
}
