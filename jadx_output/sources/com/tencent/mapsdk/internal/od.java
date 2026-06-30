package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class od extends com.tencent.mapsdk.internal.nh<com.tencent.mapsdk.internal.oe> {
    public od(com.tencent.mapsdk.internal.tk tkVar) {
        super(tkVar);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void c(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oe> ngVar) {
        ngVar.a(this.f50568a.a(ngVar.f50567d));
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void d(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oe> ngVar) {
        this.f50568a.a(ngVar.e_(), ngVar.f50567d);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void e(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oe> ngVar) {
        this.f50568a.b(ngVar.e_());
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final void f(com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oe> ngVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized com.tencent.mapsdk.internal.oc a(int i17) {
        return (com.tencent.mapsdk.internal.oc) super.a(i17);
    }

    @Override // com.tencent.mapsdk.internal.nh
    public final /* synthetic */ com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.oe> a(com.tencent.mapsdk.internal.oe oeVar) {
        return new com.tencent.mapsdk.internal.oc(this, oeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.nh
    public synchronized com.tencent.mapsdk.internal.oc b(com.tencent.mapsdk.internal.oe oeVar) {
        return (com.tencent.mapsdk.internal.oc) super.b((com.tencent.mapsdk.internal.od) oeVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private com.tencent.mapsdk.internal.oc a2(com.tencent.mapsdk.internal.oe oeVar) {
        return new com.tencent.mapsdk.internal.oc(this, oeVar);
    }

    public final int a(long j17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f50568a;
        if (tkVar == null || j17 == 0) {
            return 0;
        }
        return tkVar.a(j17);
    }
}
