package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nz extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.ob> {
    public nz(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> a(com.tencent.mapsdk.internal.ob obVar) {
        return new com.tencent.mapsdk.internal.oa(this, obVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        ngVar.a(((java.lang.Long) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass84>) new com.tencent.mapsdk.internal.tk.AnonymousClass84(ngVar.f50567d), (com.tencent.mapsdk.internal.tk.AnonymousClass84) 0L)).longValue());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> ngVar) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass85(ngVar.e_(), ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> ngVar) {
        this.f50568a.b(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.oa b(com.tencent.mapsdk.internal.ob obVar) {
        return (com.tencent.mapsdk.internal.oa) super.b((com.tencent.mapsdk.internal.nz) obVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.oa a2(com.tencent.mapsdk.internal.ob obVar) {
        return new com.tencent.mapsdk.internal.oa(this, obVar);
    }

    public final int a(long j17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        if (tkVar == null || j17 == 0) {
            return 0;
        }
        return tkVar.a(j17);
    }
}
