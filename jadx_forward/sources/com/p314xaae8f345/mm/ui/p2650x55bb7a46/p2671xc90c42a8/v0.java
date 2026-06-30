package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f284035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0 f284037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 f284038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 f284039h;

    public v0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var, long j17, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.x0 x0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 w0Var) {
        this.f284039h = z0Var;
        this.f284035d = j17;
        this.f284036e = str;
        this.f284037f = x0Var;
        this.f284038g = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var = this.f284039h;
        if (z0Var.f284105s.get()) {
            return;
        }
        java.lang.String str = z0Var.f284075e;
        long j17 = this.f284035d;
        te5.i a17 = te5.j.f500219a.a(pt0.f0.Li(str, j17), this.f284036e, z0Var.f284074d);
        z0Var.f284106t.put(java.lang.Long.valueOf(j17), a17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.u0(this, a17));
    }
}
