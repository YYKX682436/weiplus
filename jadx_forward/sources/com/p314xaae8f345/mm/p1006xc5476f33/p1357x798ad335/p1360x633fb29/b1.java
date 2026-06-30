package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f178522e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f1 f1Var, long j17) {
        this.f178522e = f1Var;
        this.f178521d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f178521d;
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(c17.f68411x238eb002);
        if (c17.f68441x10a0fed7 != 5) {
            c17.f68441x10a0fed7 = 5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            this.f178522e.f178745a.g(j17);
        }
    }
}
