package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class l6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f165764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11536xfb63f0bd f165765e;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11536xfb63f0bd c11536xfb63f0bd) {
        this.f165764d = o6Var;
        this.f165765e = c11536xfb63f0bd;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        if (this.f165764d.N.b() == u81.b.SUSPEND && this.f165765e.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onLowMemory(), runtime(" + this.f165764d.f156336n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f165765e.f156393d + ')');
            this.f165764d.l0();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1761, 3);
        }
    }
}
