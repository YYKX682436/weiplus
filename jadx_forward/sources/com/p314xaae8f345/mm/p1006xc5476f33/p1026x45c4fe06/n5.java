package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f167557d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.n f167558e;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb, ze.n nVar) {
        this.f167558e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f167557d.getAndSet(true)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) this.f167558e).j3();
    }
}
