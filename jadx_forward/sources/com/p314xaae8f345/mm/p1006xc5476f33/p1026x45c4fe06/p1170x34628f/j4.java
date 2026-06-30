package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class j4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f168320d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f168321e;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.Runnable runnable) {
        this.f168321e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f168320d.getAndSet(true)) {
            return;
        }
        this.f168321e.run();
    }
}
