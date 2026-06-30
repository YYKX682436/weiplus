package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.m6 f135039d;

    public l6(com.p314xaae8f345.mm.app.m6 m6Var) {
        this.f135039d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135039d.f135055g.f135076g;
        if (u6Var.D) {
            return;
        }
        u6Var.D = true;
        ((ku5.t0) ku5.t0.f394148d).g(this.f135039d.f135055g.f135076g.K);
    }
}
