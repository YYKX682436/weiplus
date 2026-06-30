package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 f283960e;

    public q0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var, int i17) {
        this.f283960e = z0Var;
        this.f283959d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var = this.f283960e;
        if (z0Var.f284076f == null || z0Var.f284105s.get()) {
            return;
        }
        z0Var.f284076f.A(false, this.f283959d);
    }
}
