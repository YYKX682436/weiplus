package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m0 f280923f;

    public l0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m0 m0Var, boolean z17, java.lang.String str) {
        this.f280923f = m0Var;
        this.f280921d = z17;
        this.f280922e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m0 m0Var = this.f280923f;
        java.lang.String x17 = m0Var.f281004a.f280113d.x();
        m0Var.f281004a.f280862e = this.f280921d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (x17.equals(this.f280922e)) {
            m0Var.f281004a.n0();
        }
    }
}
