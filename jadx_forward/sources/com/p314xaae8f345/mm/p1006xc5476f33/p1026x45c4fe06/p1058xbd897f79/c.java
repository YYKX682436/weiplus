package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f159817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p f159818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.d f159820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f159821h;

    public c(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.d dVar, int i17) {
        this.f159817d = atomicBoolean;
        this.f159818e = pVar;
        this.f159819f = str;
        this.f159820g = dVar;
        this.f159821h = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef c11880x4d2648ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159818e;
        if (c11880x4d2648ef == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCallback with NULL data, id:" + this.f159821h);
            if (pVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p.b(pVar, -4, null, 2, null);
                return;
            }
            return;
        }
        this.f159817d.set(true);
        java.lang.String str = this.f159819f;
        int i17 = c11880x4d2648ef.f159813d;
        if (i17 == 0) {
            if (pVar != null) {
                pVar.mo50232xe05b4124(str);
            }
        } else if (pVar != null) {
            pVar.a(i17, c11880x4d2648ef.f159814e);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(str, this.f159820g);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f159821h + ", exception:" + exc);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159818e;
        if (pVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p.b(pVar, -4, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onBridgeNotFound, id:" + this.f159821h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar = this.f159818e;
        if (pVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p.b(pVar, -4, null, 2, null);
        }
    }
}
