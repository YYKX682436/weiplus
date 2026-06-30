package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f178572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f178574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 f178575g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var, long j17, java.lang.String str, boolean z17) {
        this.f178575g = l0Var;
        this.f178572d = j17;
        this.f178573e = str;
        this.f178574f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 g1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.a(this.f178575g)) {
            g1Var.c(this.f178572d, this.f178573e, this.f178574f);
        }
        java.util.Vector vector = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0.f178611a;
    }
}
