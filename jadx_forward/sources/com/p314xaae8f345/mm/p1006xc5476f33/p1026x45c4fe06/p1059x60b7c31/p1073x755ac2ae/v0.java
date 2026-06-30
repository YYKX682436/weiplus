package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 f161649d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var) {
        this.f161649d = w0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161649d.f161657e, "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s.n8(this.f161649d, false, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159436b.c(this.f161649d.f161656d.f156336n, this.f161649d.f161656d.f156338p.f158814g, bm5.f1.a());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f161649d.f161657e, "onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w0 w0Var = this.f161649d;
        java.util.concurrent.Future future = w0Var.f161669t;
        if (future == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "consumeDelayDisableOnResume, disableFuture is null");
            return;
        }
        if (future.isDone()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "consumeDelayDisableOnResume, disableFuture is done");
        } else if (future.cancel(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var.f161657e, "consumeDelayDisableOnResume, canceled, do real disable");
            w0Var.b();
        }
    }
}
