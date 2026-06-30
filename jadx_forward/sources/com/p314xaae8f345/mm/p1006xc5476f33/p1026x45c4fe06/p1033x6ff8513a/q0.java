package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f157839f;

    public q0(java.lang.String str, java.lang.String str2, java.util.concurrent.atomic.AtomicLong atomicLong) {
        this.f157837d = str;
        this.f157838e = str2;
        this.f157839f = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.j.f34556x366c91de, 252);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout! " + this.f157837d + " deletePath " + this.f157838e);
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p0(this.f157838e, this.f157837d, this.f157839f));
    }
}
