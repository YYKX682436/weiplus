package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f281688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f281689f;

    public w6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        this.f281689f = f7Var;
        this.f281687d = f9Var;
        this.f281688e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f281689f.f280548e.contains(java.lang.Long.valueOf(this.f281687d.I0()))) {
            return;
        }
        this.f281689f.f280548e.add(java.lang.Long.valueOf(this.f281687d.I0()));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v6(this));
    }
}
