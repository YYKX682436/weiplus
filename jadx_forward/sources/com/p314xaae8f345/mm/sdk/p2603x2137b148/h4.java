package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.k4 f274257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f274258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.j4 f274259f;

    public h4(com.p314xaae8f345.mm.sdk.p2603x2137b148.j4 j4Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.k4 k4Var, java.lang.Runnable runnable) {
        this.f274259f = j4Var;
        this.f274257d = k4Var;
        this.f274258e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f274259f.f274297f.f274367q) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j4.a(this.f274259f, this.f274257d);
        }
        synchronized (this.f274259f.f274297f) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.l4 l4Var = this.f274259f.f274297f;
            l4Var.f274363m--;
        }
        java.lang.Runnable runnable = this.f274258e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
