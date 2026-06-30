package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class q1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f169256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f169257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r1 f169259h;

    public q1(int i17, l81.v0 v0Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r1 r1Var) {
        this.f169255d = i17;
        this.f169256e = v0Var;
        this.f169257f = atomicBoolean;
        this.f169258g = str;
        this.f169259h = r1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef c11541x4d2648ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef) obj;
        l81.v0 v0Var = this.f169256e;
        if (c11541x4d2648ef == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCallback with NULL data, id:" + this.f169255d);
            if (v0Var != null) {
                l81.v0.b(v0Var, -4, null, 2, null);
                return;
            }
            return;
        }
        this.f169257f.set(true);
        int i17 = c11541x4d2648ef.f156404d;
        if (i17 == 0) {
            if (v0Var != null) {
                v0Var.mo50385xe05b4124();
            }
        } else if (v0Var != null) {
            v0Var.a(i17, c11541x4d2648ef.f156405e);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.i(this.f169258g, this.f169259h);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f169255d + ", exception:" + exc);
        l81.v0 v0Var = this.f169256e;
        if (v0Var != null) {
            l81.v0.b(v0Var, -4, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onBridgeNotFound, id:" + this.f169255d);
        l81.v0 v0Var = this.f169256e;
        if (v0Var != null) {
            l81.v0.b(v0Var, -4, null, 2, null);
        }
    }
}
